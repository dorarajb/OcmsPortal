'use strict';

/* Controllers */

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller('locationlistCtrl', ['$scope', '$http','$modal', 'Location',
		  function($scope, $http, $modal, Location) {	
		    
			var locations;
		  	//$scope.courses = Course.query(); // Get list of courses			
			//$scope.courses = Course.query({id:'courses',mdclass:'pari'});
			//$scope.courses = Course.query({id:'pari'}); get-courses-by-group-id/group-id/0
			$scope.locations = Location.query({addlocation:'get-location-by-group-id', userid:'group-id', id:'0'});
		 
			
			/*Open the Course Form*/			
			$scope.open = function (p,size) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/form-location.html',
				  controller: 'locationCtrl',
				  size: size ,
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
			
 
  }]);



locationControllers.controller('locationCtrl', ['$scope', '$http','$modalInstance', 'item', 'Location', 
											function ($scope, $http, $modalInstance, item, Location) {
 
		$scope.location = angular.copy(item);
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.location);
        }		
		 
		
		$scope.saveLocation = function (location) {			
		 location.uid = $scope.uid;
			
			if(location.locationId > 0){//// Edit the Course
			 
			 	Location.update({addlocation:'update-location', locationid:'location-id', locationvid:location.locationId, sName:'name', name:location.name, sCode:'code', code:location.code, sNotes:'notes', notes:location.notes,sAddressLine1:'address-line1', addressLine1:location.addressLine1,
					sAddressLine2:'address-line2',addressLine2:location.addressLine2,sCity:'city',city:location.city,
					sState:'state',state:location.state,sRegion:'region',region:location.region,sCountry:'country',country:location.country,
					sZip:'zip',zip:location.zipcode,sPhone:'phone',phone:location.phone,sFax:'fax',fax:location.fax,sEmail:'email',email:location.email},location);			
				
				var x = angular.copy(location);
				$modalInstance.close(x);
				
			}
			else{ //// Adding a New Course
				 
				Location.save({addlocation:'add-location', sName:'name', name:location.name, sCode:'code', code:location.code,
						sNotes:'notes', notes:location.notes, sAddressLine1:'address-line1', addressLine1:location.addressLine1,
					sAddressLine2:'address-line2',addressLine2:location.addressLine2,sCity:'city',city:location.city,
					sState:'state',state:location.state,sRegion:'region',region:location.region,sCountry:'country',country:location.country,
					sZip:'zip',zip:location.zipcode,sPhone:'phone',phone:location.phone,sFax:'fax',fax:location.fax,sEmail:'email',email:location.email},location);			
				var x = angular.copy(location);
				$modalInstance.close(x);				
			}
			
		};
        
}]);

 
 


 
