'use strict';

/* Controllers */

var eventControllers = angular.module('eventControllers', []);

eventControllers.controller('eventlistCtrl', ['$scope', '$filter','$http','$window','$modal', 'Event', 'Course', 'Location',
		  function($scope, $filter, $http, $window, $modal, Event, Course, Location) {	
		    
			var events;
			$scope.events = Event.query({addevent:'get-event-by-group-id', userid:'group-id', id:'0'});
			
			var deleteEvent;
		    $scope.deleteEvent = function (vevent) {
		    Event.delete({addevent:'delete-event-by-event-id', userid:'event-id', id:vevent.eventId});
			$window.location.reload();
			};
		    
			
			/*Open the Course Form*/			
			$scope.open = function (p,size) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/form-event.html',
				  controller: 'eventCtrl',
				  size: size ,
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
			
 
  }]);



eventControllers.controller('eventCtrl', ['$scope','$filter', '$http','$window','$modalInstance', 'item', 'Event', 'Course', 'Location',
											function ($scope, $filter, $http, $window, $modalInstance, item, Event, Course, Location) {
        var courses;
		$scope.courses = Course.query({addcourse:'get-courses-by-group-id', userid:'group-id', id:'0'});
		var locations
		$scope.locations = Location.query({addlocation:'get-location-by-group-id', userid:'group-id', id:'0'});
		
		$scope.fevent = angular.copy(item);
		//fevent.endDate = $filter('date')(date[ fevent.endDate, "dd/MM/yyyy"]);
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.location);
        }		
		 
		
		$scope.saveEvent = function (fevent) {			
		fevent.uid = $scope.uid;
		    
			
			fevent.startDate = $filter('date')( fevent.startDate, "yyyy-MM-dd");
			//fevent.startDateAsDate = new Date(fevent.startDate);
			fevent.endDate = $filter('date')( fevent.endDate, "yyyy-MM-dd");
			//fevent.endDateAsDate = new Date(fevent.endDate);
			$scope.fevent = fevent;
			
			if(fevent.eventId > 0){//// Edit the Course
			 
				Event.update({addevent:'update-event', eventid:'event-id', eventvid:fevent.eventId, sEventname:'event-name', eventname:fevent.eventName, sCourseid:'course-id', courseid:fevent.courseId, sCoursecode:'course-code', coursecode:fevent.courseCode, sLocationid:'location-id', locationid:fevent.locationId, sLocationcode:'location-code', locationcode:fevent.locationCode, sStartdate:'start-date', startdate:fevent.startDate, sEnddate:'end-date', enddate:fevent.endDate, sFlag:'flag', flag:'1'},fevent);
				var x = angular.copy(location);
				$modalInstance.close(x);
                $window.location.reload();	
				
			}
			else{ //// Adding a New Course
				 
				Event.save({addevent:'add-event', sEventname:'event-name', eventname:fevent.eventName, sCourseid:'course-id', courseid:fevent.courseId, sLocationid:'location-id', locationid:fevent.locationId, sStartdate:'start-date', startdate:fevent.startDate, sEnddate:'end-date', enddate:fevent.endDate, sFlag:'flag', flag:'1'},fevent);			
				var x = angular.copy(location);
				$modalInstance.close(x);
                $window.location.reload();				
			}
			
		};
        
}]);

 
 


 
