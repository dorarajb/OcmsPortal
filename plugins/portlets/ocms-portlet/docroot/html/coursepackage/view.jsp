<%@include file="/html/init.jsp"%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addCoursePackageURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/add_coursepackage.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="course-buttons">
    <aui:button onClick="<%=addCoursePackageURL.toString()%>" value="Add Course Package" />
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=CoursePackageLocalServiceUtil.getCoursesPackagesByGroupId(scopeGroupId, 	searchContainer.getStart(),searchContainer.getEnd())%>"
        total="<%=CoursePackageLocalServiceUtil.getCoursePackagesCount()%>" />

    <liferay-ui:search-container-row 
        className="com.ocms.course.model.CoursePackage" modelVar="coursePackage">
        <portlet:renderURL var="selectCoursePackageURL">
        	<portlet:param name="coursePackageId" value="<%=String.valueOf(coursePackage.getCoursePackageId()) %>" />
        	<portlet:param name="mvcPath" value="/html/coursepackage/select_coursepackage.jsp" />
		</portlet:renderURL>
        <liferay-ui:search-container-column-text property="name" href="<%=selectCoursePackageURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="code" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>