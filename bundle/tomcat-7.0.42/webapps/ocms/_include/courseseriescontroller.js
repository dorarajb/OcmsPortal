'use strict';

/* Controllers */

var courseseriesControllers = angular.module('courseseriesControllers', []);


courseseriesControllers.controller('seriesCtrl', ['$scope', '$http', '$window','$modal', 'Course',  'Courseseries',
		  function($scope, $http, $window, $modal, Course,  Courseseries) {	
		  
		    $scope.codeList = [];

			var cseries;		  
			$scope.cseries = Courseseries.query({addcourse:'get-course-series-by-flag-to-list-data', userid:'flag-to-list-data', id:1});
			
			var createEventList;
			$scope.createEventList = function() {
					Courseseries.save({addcourse:'create-event-list', Slocationarray:'code-list', locationarrayvalue:$scope.codeList},Courseseries);		
				    console.log($scope.codeList);
				    $window.location.reload();

			};
			
		   var deleteSeries;
		   $scope.deleteSeries = function (vcseries) {
		   Courseseries.delete({addcourse:'delete-course-series-by-course-series-id-code', userid:'course-series-id', id:vcseries.courseSeriesId});
		   $window.location.reload();
			};
        		
			
			/*Open the Course Series Details Form*/			
			$scope.open = function (p) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/form-courseseries.html',
				  controller: 'courseSeriesDetailsCtrl',
				  //windowClass: 'app-modal-window',
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
 
  }])
    .directive("checkboxSeries", function() {
        return {
            restrict: "A",
            link: function(scope, elem, attrs) {
                // Determine initial checked boxes
                if (scope.codeList.indexOf(scope.vcseries.courseSeriesCode) !== -1) {
                    elem[0].checked = true;
                }

                // Update array on click
                elem.bind('click', function() {
                    var index = scope.codeList.indexOf(scope.vcseries.courseSeriesCode);
                    // Add if checked
                    if (elem[0].checked) {
                        if (index === -1) {scope.codeList.push(scope.vcseries.courseSeriesCode);}
                    }
                    // Remove if unchecked
                    else {
                        if (index !== -1) {scope.codeList.splice(index, 1);}
                    }
                    // Sort and update DOM display
                    scope.$apply(scope.codeList.sort(function(a, b) {
                        return a - b
                    }));					
                });
            }
        }
    });
  
courseseriesControllers.controller('courseSeriesDetailsCtrl', ['$scope', '$http', '$window','$modalInstance', 'item', 'Courseseries', 
											function ($scope, $http, $window, $modalInstance, item, Courseseries) {
											
        
		 
		var courseseriesvalue;
		$scope.courseseriesvalue = angular.copy(item);
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.courseseriesvalue);
        }
		
        var courseseriesdetailslist;
		$scope.courseseriesdetailslist = Courseseries.query({addcourse:'get-course-series-by-course-series-code', userid:'course-series-code', id:item.courseSeriesCode});
		$scope.courseseriesdetailslist.forEach(function (event) {
				event.startDate = $filter('date')( event.startDate, "yyyy-MM-dd");
				event.endDate = $filter('date')( event.endDate, "yyyy-MM-dd");
				console.log(event);
			});
		/*$scope.courseseriesdetailslist = function (courseseriesvalue) {
		var loadModal;
		$scope.loadModal = Courseseries.query({addcourse:'get-course-series-by-course-series-code', userid:'course-series-code', id: courseseriesvalue.courseSeriesCode});
		return loadModal;
        }*/
		var createEvent;
        $scope.createEvent = function (courseseriesvalue) {
		   Courseseries.save({addcourse:'create-event', userid:'course-series-code', id:courseseriesvalue.courseSeriesCode});
		   //$modalInstance.close(courseseriesvalue);
		   
		   
        };

		var deleteSeriesEvent;
	    $scope.deleteSeriesEvent = function (vcourseseriesdetailslist) {
	    Courseseries.delete({addcourse:'delete-course-series-event', userid:'course-series-id', id:vcourseseriesdetailslist.courseSeriesId});
		//$modalInstance.close(vcourseseriesdetailslist);
		$window.location.reload();
		$scope.open(courseseriesvalue);
		};
		
		var updateCourseSeriesEventStartDate;
		$scope.updateCourseSeriesEventStartDate = function(courseSeries) {			
		 		  
				 
			Courseseries.update({addcourse:'update-course-series-start-date', Scourseseriesid:'course-series-id', courseseriesidvalue:courseSeries.courseSeriesId, Sstartdate:'start-date', startdatevalue:courseSeries.startDate},Courseseries);

				 //$location.path('/series');
				 console.log(courseSeries);
				 //$window.location.reload();
				
	 
			};
			
		var updateCourseSeriesEventEndDate;
		$scope.updateCourseSeriesEventEndDate = function(courseSeries) {			
		 		  
				 
			Courseseries.update({addcourse:'update-course-series-end-date', Scourseseriesid:'course-series-id', courseseriesidvalue:courseSeries.courseSeriesId, Senddate:'end-date', enddatevalue:courseSeries.endDate},Courseseries);

				 //$location.path('/series');
				 console.log(courseSeries);
				 //$window.location.reload();
				
	 
			};
    
}]);

courseseriesControllers.controller('createcourseseriesCtrl', ['$scope', '$http', '$window','$modal','$location', 'Course', 'Location', 'Courseseries',
		  function($scope, $http, $modal, $window, $location, Course, Location, Courseseries) {	
		    
		 	 $scope.listLocation = [];
			 $scope.listLocationcode = [];
			 $scope.listCourse = [];
			 $scope.listCoursecode = [];
			 
			 
		  
			$scope.courses = Course.query({addcourse:'get-courses-by-group-id', userid:'group-id', id:'0'});
			$scope.locations = Location.query({addlocation:'get-location-by-group-id', userid:'group-id', id:'0'});
 			
			$scope.saveCourseseries = function() {			
		 		  
				 
			Courseseries.save({addcourse:'add-course-series-loop', Slocationarray:'location-list', locationarrayvalue:$scope.listLocation, Scoursearray:'course-list', coursearrayvalue:$scope.listCourse},Courseseries);		

				 $location.path('/series');
				 console.log($scope.listLocation);
				 console.log($scope.listCourse);
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				 $window.location.reload();
				
				
	 
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
                        if (index === -1) {scope.listLocation.push(scope.vlocation.locationId);scope.listLocationcode.push(scope.vlocation.code); }
                    }
                    // Remove if unchecked
                    else {
                        if (index !== -1) {scope.listLocation.splice(index, 1);scope.listLocationcode.splice(index, 1);}
                    }
                    // Sort and update DOM display
                    scope.$apply(scope.listLocation.sort(function(a, b) {
                        return a - b
                    }));
                    scope.$apply(scope.listLocationcode.sort(function(a, b) {
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
                        if (index === -1) {scope.listCourse.push(scope.vcourse.courseId); scope.listCoursecode.push(scope.vcourse.code); }
                    }
                    // Remove if unchecked
                    else {
                        if (index !== -1) {scope.listCourse.splice(index, 1);scope.listCoursecode.splice(index, 1);}
                    }
                    // Sort and update DOM display
                    scope.$apply(scope.listCoursecode.sort(function(a, b) {
                        return a - b
                    }));					
                    scope.$apply(scope.listCourse.sort(function(a, b) {
                        return a - b
                    }));
                });
            }
        }
    });
