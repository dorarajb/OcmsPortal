'use strict';

/* Controllers */

var eventControllers = angular.module('eventControllers', []);

eventControllers.controller('eventlistCtrl', ['$scope', '$http','$modal', 'Event',
		  function($scope, $http, $modal, Event) {	
		    
			var events;
		  	//$scope.courses = Course.query(); // Get list of courses			
			//$scope.courses = Course.query({id:'courses',mdclass:'pari'});
			//$scope.courses = Course.query({id:'pari'}); get-courses-by-group-id/group-id/0
			$scope.events = Event.query({addevent:'get-event-by-group-id', userid:'group-id', id:'0'});
		 
			
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



eventControllers.controller('eventCtrl', ['$scope', '$http','$modalInstance', 'item', 'Event', 
											function ($scope, $http, $modalInstance, item, Event) {
 
		$scope.fevent = angular.copy(item);
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.location);
        }		
		 
		
		$scope.saveEvent = function (fevent) {			
		 fevent.uid = $scope.uid;
			
			if(fevent.eventId > 0){//// Edit the Course
			 
	/*		 	Event.update({addevent:'update-location', userid:'user-id', id:'10161', locationid:'location-id', locationvid:location.locationId, sName:'name', name:location.name, sCode:'code', code:location.code, sNotes:'notes', notes:location.notes,sAddressLine1:'address-line1', addressLine1:location.addressLine1,
					sAddressLine2:'address-line2',addressLine2:location.addressLine2,sCity:'city',city:location.city,
					sState:'state',state:location.state,sRegion:'region',region:location.region,sCountry:'country',country:location.country,
					sZip:'zip',zip:location.zipcode,sPhone:'phone',phone:location.phone,sFax:'fax',fax:location.fax,sEmail:'email',email:location.email},location);			
				
				var x = angular.copy(fevent);*/
				$modalInstance.close(x);
				
			}
			else{ //// Adding a New Course
				 
				Event.save({addevent:'add-event', userid:'user-id', id:'10161', sEventname:'event-name', eventname:fevent.eventName, sCourseid:'course-id', courseid:fevent.courseId, sCoursecode:'course-code', coursecode:fevent.courseCode, sLocationid:'location-id', locationid:fevent.locationId, sLocationcode:'location-code', locationcode:fevent.locationCode, sStartdate:'start-date', startdate:fevent.startDate, sEnddate:'end-date', enddate:fevent.endDate, sFlag:'flag', flag:'1'},fevent);			
				var x = angular.copy(location);
				$modalInstance.close(x);				
			}
			
		};
        
}]);

 
 


 
