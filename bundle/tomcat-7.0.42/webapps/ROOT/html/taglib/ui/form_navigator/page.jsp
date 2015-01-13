<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/taglib/init.jsp" %>

<portlet:defineObjects />

<%
String backURL = (String)request.getAttribute("liferay-ui:form-navigator:backURL");
String[][] categorySections = (String[][])request.getAttribute("liferay-ui:form-navigator:categorySections");
String[] categoryNames = (String[])request.getAttribute("liferay-ui:form-navigator:categoryNames");
String displayStyle = (String)request.getAttribute("liferay-ui:form-navigator:displayStyle");
String formName = GetterUtil.getString((String)request.getAttribute("liferay-ui:form-navigator:formName"));
String htmlBottom = (String)request.getAttribute("liferay-ui:form-navigator:htmlBottom");
String htmlTop = (String)request.getAttribute("liferay-ui:form-navigator:htmlTop");
String jspPath = (String)request.getAttribute("liferay-ui:form-navigator:jspPath");
boolean showButtons = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:form-navigator:showButtons"));

if (Validator.isNull(backURL)) {
	String redirect = ParamUtil.getString(request, "redirect");

	backURL = redirect;
}

if (Validator.isNull(backURL)) {
	PortletURL portletURL = liferayPortletResponse.createRenderURL();

	backURL = portletURL.toString();
}

String[] allSections = new String[0];

for (String[] categorySection : categorySections) {
	allSections = ArrayUtil.append(allSections, categorySection);
}

String curSection = StringPool.BLANK;

if (categorySections[0].length > 0) {
	curSection = categorySections[0][0];
}

String historyKey = ParamUtil.getString(request, "historyKey");

if (Validator.isNotNull(historyKey)) {
	curSection = historyKey;
}
%>

<div class="taglib-form-navigator" id="<portlet:namespace />tabsBoundingBox">
	<aui:input name="modifiedSections" type="hidden" />

	<c:choose>
		<c:when test='<%= displayStyle.equals("panel") %>'>
			<liferay-ui:panel-container accordion="<%= true %>" extended="<%= true %>" id="tabs" persistState="<%= true %>">
				<%@ include file="/html/taglib/ui/form_navigator/sections.jspf" %>
			</liferay-ui:panel-container>

			<aui:button-row>
				<aui:button cssClass="btn-primary pull-right" type="submit" />
			</aui:button-row>
		</c:when>
		<c:otherwise>
			<div class="taglib-form-navigator row-fluid" id="<portlet:namespace />tabs">
				<liferay-util:buffer var="formSectionsBuffer">
					<div class="form-navigator-content span8">
						<%@ include file="/html/taglib/ui/form_navigator/sections.jspf" %>
					</div>
				</liferay-util:buffer>

				<ul class="form-navigator nav nav-list span4 well">
					<%= Validator.isNotNull(htmlTop) ? htmlTop : StringPool.BLANK %>

					<%
					String[] modifiedSections = StringUtil.split(ParamUtil.getString(request, "modifiedSections"));

					String errorSection = (String)request.getAttribute("errorSection");

					if (Validator.isNull(errorSection)) {
						modifiedSections = null;
					}

					boolean error = false;

					for (int i = 0; i < categoryNames.length; i++) {
						String category = categoryNames[i];
						String[] sections = categorySections[i];

						if (sections.length > 0) {
					%>

							<c:if test="<%= Validator.isNotNull(category) %>">
								<li class="nav-header"><liferay-ui:message key="<%= category %>" /></li>
							</c:if>

							<%
							if (Validator.isNotNull(errorSection)) {
								curSection = StringPool.BLANK;

								error = true;
							}

							for (String section : sections) {
								String sectionId = namespace + _getSectionId(section);

								Boolean show = (Boolean)request.getAttribute(WebKeys.FORM_NAVIGATOR_SECTION_SHOW + sectionId);

								if ((show != null) && !show.booleanValue()) {
									continue;
								}

								String cssClass = StringPool.BLANK;

								if (sectionId.equals(namespace + errorSection)) {
									cssClass += "section-error";

									curSection = section;
								}

								if (curSection.equals(section) || curSection.equals(sectionId)) {
									cssClass += " active";
								}

								if (ArrayUtil.contains(modifiedSections, sectionId)) {
									cssClass += " section-modified";
								}
							%>

								<li class="<%= cssClass %>" data-sectionId="<%= sectionId %>" id="<%= sectionId %>Tab">
									<a href="#<%= sectionId %>" id="<%= sectionId %>Link">
										<span class="badge badge-important error-notice">!</span>

										<liferay-ui:message key="<%= section %>" />

										<span class="modified-notice"> (<liferay-ui:message key="modified" />) </span>
									</a>
								</li>

							<%
							}
							%>

					<%
						}
					}
					%>

					<c:if test="<%= showButtons %>">
						<aui:button-row>
							<aui:button primary="<%= true %>" type="submit" />

							<aui:button href="<%= backURL %>" type="cancel" />
						</aui:button-row>
					</c:if>

					<%= Validator.isNotNull(htmlBottom) ? htmlBottom : StringPool.BLANK %>
				</ul>

				<%= formSectionsBuffer %>
			</div>

			<aui:script use="aui-event-input,aui-tabview,aui-url,history,io-form">
				var formNode = A.one('#<portlet:namespace /><%= formName %>');

				var tabview = new A.TabView(
					{
						boundingBox: '#<portlet:namespace />tabsBoundingBox',
						srcNode: '#<portlet:namespace />tabs',
						type: 'list'
					}
				).render();

				var history = new A.HistoryHash();

				function selectTabBySectionId(sectionId) {
					var instance = this;

					var tab = A.Widget.getByNode('#' + sectionId + 'Tab');

					var tabIndex = tabview.indexOf(tab);

					if (tab && (tabIndex > -1)) {
						tabview.selectChild(tabIndex);
					}

					updateRedirectForSectionId(sectionId);

					Liferay.fire('formNavigator:reveal' + sectionId);
				};

				function updateSectionError() {
					var tabNode = tabview.get('selection').get('boundingBox');

					var sectionId = tabNode.getData('sectionId');

					tabNode.toggleClass(
						'section-error',
						A.one('#' + sectionId).one('.error-field')
					);
				}

				function updateSectionStatus() {
					var tabNode = tabview.get('selection').get('boundingBox');

					var sectionId = tabNode.getData('sectionId');

					var modifiedSectionsNode = A.one('#<portlet:namespace/>modifiedSections');

					var modifiedSections = modifiedSectionsNode.val().split(',');

					modifiedSections.push(sectionId);
					modifiedSections = A.Array.dedupe(modifiedSections);
					modifiedSectionsNode.val(modifiedSections.join());

					tabNode.addClass('section-modified');
				}

				function updateRedirectForSectionId(sectionId) {
					var redirect = A.one('#<portlet:namespace />redirect');

					if (redirect) {
						var url = new A.Url(redirect.val() || location.href);

						url.setAnchor(null);
						url.setParameter('<portlet:namespace />historyKey', sectionId);

						redirect.val(url.toString());
					}
				}

				tabview.after(
					'selectionChange',
					function(event) {
						var tab = event.newVal

						var boundingBox = tab.get('boundingBox');

						var sectionId = boundingBox.getData('sectionId');

						history.addValue('<portlet:namespace />tab', sectionId);
					}
				);

				A.on(
					'history:change',
					function(event) {
						var state = event.newVal;

						var changed = event.changed.<portlet:namespace />tab;

						var removed = event.removed.<portlet:namespace />tab;

						if (event.src === A.HistoryHash.SRC_HASH || event.src === A.HistoryBase.SRC_ADD) {
							if (changed) {
								selectTabBySectionId(changed.newVal);
							}
							else if (removed) {
								tabview.selectChild(0);
							}
							else if (state) {
								var sectionId = state.<portlet:namespace />tab;

								if (!sectionId) {
									sectionId = '<portlet:namespace />' + state.tab;
								}

								selectTabBySectionId(sectionId);
							}
						}
					}
				);

				var currentUrl = new A.Url(location.href);

				var currentAnchor = currentUrl.getAnchor();

				if (!currentAnchor) {
					currentAnchor = currentUrl.getParameter('<portlet:namespace />historyKey');
				}

				if (currentAnchor) {
					var locationSectionId = currentAnchor.substring(currentAnchor.indexOf('=') + 1);

					if (locationSectionId.indexOf('<portlet:namespace />') === -1) {
						locationSectionId = '<portlet:namespace />' + locationSectionId;
					}

					selectTabBySectionId(locationSectionId);
				}

				if (<%= error %>) {
					Liferay.fire('formNavigator:reveal<portlet:namespace /><%= errorSection %>');
				}

				if (formNode) {

					<%
					String focusField = (String)request.getAttribute("liferay-ui:error:focusField");
					%>

					<c:choose>
						<c:when test="<%= Validator.isNotNull(focusField) %>">
							var focusField = formNode.one('#<portlet:namespace /><%= focusField %>');
						</c:when>
						<c:otherwise>
							var focusField = formNode.one('.form-section.active input:not([type="hidden"]).field');
						</c:otherwise>
					</c:choose>

					if (focusField) {
						Liferay.Util.focusFormField(focusField);
					}

					formNode.all('.modify-link').on('click', updateSectionStatus);

					formNode.delegate('change', updateSectionStatus, 'input, select, textarea');

					formNode.on('blur', updateSectionError, 'input, select, textarea');

					formNode.on('autofields:update', updateSectionError);
				}
			</aui:script>
		</c:otherwise>
	</c:choose>
</div>

<%!
private String _getSectionId(String name) {
	return TextFormatter.format(name, TextFormatter.M);
}

private String _getSectionJsp(String name) {
	return TextFormatter.format(name, TextFormatter.N);
}
%>