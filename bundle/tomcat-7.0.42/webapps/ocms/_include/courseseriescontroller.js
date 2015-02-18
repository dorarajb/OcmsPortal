'use strict';

/* Controllers */

var courseseriesControllers = angular.module('courseseriesControllers', []);


courseseriesControllers.controller('seriesCtrl', ['$scope', '$http','$modal', 'Course', 'Location', 'Courseseries',
		  function($scope, $http, $modal, Course, Location, Courseseries) {	 
			$scope.cseries = Courseseries.query({addcourse:'get-course-series-by-group-id', userid:'group-id', id:'0'}); 
 
  }]);

courseseriesControllers.controller('createcourseseriesCtrl', ['$scope', '$http','$modal', 'Course', 'Location', 'Courseseries',
		  function($scope, $http, $modal, Course, Location, Courseseries) {	
		    
		 	 $scope.listLocation = [];
			 $scope.listCourse = [];
			 
		  
			$scope.courses = Course.query({addcourse:'get-courses-by-group-id', userid:'group-id', id:'0'});
			$scope.locations = Location.query({addlocation:'get-location-by-group-id', userid:'group-id', id:'0'});
 			
			$scope.saveCourseseries = function() {			
		 		  
				 
			Courseseries.save({addcourse:'add-course-series-loop', Slocationarray:'location-list', locationarrayvalue:$scope.listLocation, Scoursearray:'course-list', coursearrayvalue:$scope.listCourse},Courseseries);		

				 console.log($scope.listLocation);
				 console.log($scope.listCourse);
				
	 
			};
			
 
  }])
	.directive("checkboxGroup", function() {
        return {
            restrict: "A",
            link: function(scope, elem, attrs) {
                // Determine initial checked boxes
                if (scope.listLocation.indexOf(scope.vlocation.locationId) !== -1) {
                    elem[0].checked = true;
                }

                // Update array on click
                elem.bind('click', function() {
                    var index = scope.listLocation.indexOf(scope.vlocation.locationId);
                    // Add if checked
                    if (elem[0].checked) {
                        if (index === -1) scope.listLocation.push(scope.vlocation.locationId);
                    }
                    // Remove if unchecked
                    else {
                        if (index !== -1) scope.listLocation.splice(index, 1);
                    }
                    // Sort and update DOM display
                    scope.$apply(scope.listLocation.sort(function(a, b) {
                        return a - b
                    }));
                });
            }
        }
    })
	.directive("checkboxGroup1", function() {
        return {
            restrict: "A",
            link: function(scope, elem, attrs) {
                // Determine initial checked boxes
                if (scope.listCourse.indexOf(scope.vcourse.courseId) !== -1) {
                    elem[0].checked = true;
                }

                // Update array on click
                elem.bind('click', function() {
                    var index = scope.listCourse.indexOf(scope.vcourse.courseId);
                    // Add if checked
                    if (elem[0].checked) {
                        if (index === -1) scope.listCourse.push(scope.vcourse.courseId);
                    }
                    // Remove if unchecked
                    else {
                        if (index !== -1) scope.listCourse.splice(index, 1);
                    }
                    // Sort and update DOM display
                    scope.$apply(scope.listCourse.sort(function(a, b) {
                        return a - b
                    }));
                });
            }
        }
    });
	
	



 

 
 


 
