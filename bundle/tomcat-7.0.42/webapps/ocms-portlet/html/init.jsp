<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="java.util.List" %>
<%@page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.ocms.course.model.Course" %>
<%@ page import="com.ocms.course.service.CourseLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.Location" %>
<%@ page import="com.ocms.course.service.LocationLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.CourseSeries" %>
<%@ page import="com.ocms.course.service.CourseSeriesLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.ocms.course.model.Contact" %>
<%@ page import="com.ocms.course.service.ContactLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.CoursePackage" %>
<%@ page import="com.ocms.course.service.CoursePackageLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.Pricing" %>
<%@ page import="com.ocms.course.service.PricingLocalServiceUtil" %>


<portlet:defineObjects />
<theme:defineObjects />