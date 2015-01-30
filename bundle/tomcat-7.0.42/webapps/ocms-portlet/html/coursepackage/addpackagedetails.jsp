<%@include file = "/html/init.jsp" %>
<% CoursePackage coursePackageDetails = (CoursePackage)session.getAttribute("coursePackage");%>
<portlet:renderURL var="viewURL">
    <portlet:param name="coursePackageId" value="<%=String.valueOf(coursePackageDetails.getCoursePackageId()) %>" />
    <portlet:param name="mvcPath" value="/html/coursepackage/select_coursepackage.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addPackageDetails" var="addPackageDetailsURL"></portlet:actionURL>

<% String packageCode = String.valueOf(coursePackageDetails.getCode());%>
<% long packageId = coursePackageDetails.getCoursePackageId();%>
<% List<Course> courseList = (List<Course>)request.getAttribute("courseList");%>
<% List<Location> locationList = (List<Location>)request.getAttribute("locationList");%>

<aui:form action="<%= addPackageDetailsURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
        <aui:input name="packageCode" id="packageCode" value= "<%=packageCode %>"/>
        <aui:input name="packageId" id="packageId" value= "<%=packageId %>" type="hidden"/>
            <aui:select name="courseId" id="courseId" label="Course" inlineField="true" >
                <c:forEach items="${courseList}" var="course">
                 
                     <aui:option value="${course.courseId}-:${course.code}" selected="true"> ${course.name} </aui:option>
                  
                 </c:forEach>
            </aui:select>
            <aui:select name="locationId" id="locationId" label="Location" inlineField="true" >
                <c:forEach items="${locationList}" var="location">
                 
                     <aui:option value="${location.locationId}-:${location.code}" selected="true"> ${location.name} </aui:option>
                  
                 </c:forEach>
            </aui:select>
            <aui:input name="deposit" />
            <aui:input name="price" />
            <aui:input name="currency" />
            <aui:input name="effectiveDate" />
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
