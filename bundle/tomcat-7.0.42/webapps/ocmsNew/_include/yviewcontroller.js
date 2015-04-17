'use strict';

/* Controllers */


var yviewControllers = angular.module('yviewControllers', []);

yviewControllers.controller('YearSchedulerCtrl', ['$scope', '$http','$modal', 'Courseseries', 'Location','$window','$route', '$rootScope', '$filter',
		  function($scope, $http, $modal, Courseseries, Location,$window,$route,$rootScope, $filter) {
														  
		$scope.date = new Date();														  
		var DaysList = ['01', '02', '03', '04', '05', '06', '07', '08', '09', 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31];
		var monthList = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug','Sep', 'Oct', 'Nov', 'Dec'];
		$scope.norows = monthList;
		$scope.nocolumns = DaysList;
		var locations;
		$scope.locations = Location.query({addlocation:'get-location-by-group-id', userid:'group-id', id:'0'});

		var courseSeriesEventListFn;
		var courseSeriesEventList;
		
		$scope.getRandomColor = function(){
		   var letters = '0123456789ABCDEF'.split('');
		   var color = '#';
		   for (var i = 0; i < 6; i++ ) {
			   color += letters[Math.floor(Math.random() * 16)];
		   }
		    
		   return color;
		}		
		   
		$scope.courseSeriesEventListFn = function(location) {			

			$scope.courseSeriesEventList = Courseseries.query({addcourse:'get-course-series-by-location-id', slocationid:'location-id', locationidvalue:location.locationId},location);
			$scope.courseSeriesList = Courseseries.query({addcourse:'get-course-series-by-location-id-and-flag-to-list-data', slocationid:'location-id', locationidvalue:location.locationId, userid:'flag-to-list-data', id:1},location);		
			console.log(location);
			console.log(courseSeriesEventList);
			$scope.courseSeriesEventList.forEach(function (event) {
				event.sMonth = $filter('date')( event.startDate, "MMM");
				event.sDay = $filter('date')( event.startDate, "dd");
				event.eMonth = $filter('date')( event.endDate, "MMM");
				event.eDay = $filter('date')( event.endDate, "dd");
				console.log(event);
			});
		};
		
		var courseSeriesEventDateParsing;
		$scope.courseSeriesEventDateParsing = function(event) {
			
			//console.log(event);
			event.sMonth = $filter('date')( event.startDate, "MMM");
			event.sDay = $filter('date')( event.startDate, "dd");
			event.eMonth = $filter('date')( event.endDate, "MMM");
			event.eDay = $filter('date')( event.endDate, "dd");
			//console.log(event);
		
		};



			/*Open the Course Form*/			
			$scope.open = function (p,size) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/course-info.html',
				  controller: 'courseInfoCtrl',
				  size: size ,
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
 
}]);
 

yviewControllers.controller('courseInfoCtrl', ['$scope', '$http','$modalInstance', 'item', 'Location',  'Course',
											function ($scope, $http, $modalInstance, item, Location, Course) {
 
		
		var location;
		$scope.location = Location.query({addlocation:'get-location-by-location-id', locationid:'location-id', locationvid:item.locationId});
		
		var course;
		$scope.course = Course.query({addcourse:'get-courses-by-course-id', courseid:'course-id', coursevid: item.courseId});
		
		$scope.courseinfo = angular.copy(item);
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.courseinfo);
        }	


 }]);
