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
			/*$scope.courseSeriesEventList = [{"EDay":26,"EMonth":"Jun","SDay":24,"SMonth":"Jun","companyId":10157,"courseId":11603,"courseSeriesCode":"ATL 1","courseSeriesEventCode":"Fun.ATL 1","courseSeriesId":23621,"createDate":1427285141000,"endDate":1435276800000,"flagToChkEventCreation":0,"flagToListData":1,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427285141000,"publishingStatus":"Do not publish","seriesCount":1,"startDate":1435104000000,"type":"type","userId":10161,"userName":""},
{"EDay":22,"EMonth":"May","SDay":20,"SMonth":"May","companyId":10157,"courseId":16004,"courseSeriesCode":"ATL 1","courseSeriesEventCode":"Bal.ATL 1","courseSeriesId":23622,"createDate":1427285141000,"endDate":1426982400000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427285141000,"publishingStatus":"Do not publish","seriesCount":1,"startDate":1432080000000,"type":"type","userId":10161,"userName":""},
{"EDay":19,"EMonth":"Apr","SDay":16,"SMonth":"Apr","companyId":10157,"courseId":16006,"courseSeriesCode":"ATL 1","courseSeriesEventCode":"PRO.ATL 1","courseSeriesId":23623,"createDate":1427285141000,"endDate":1429401600000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427285141000,"publishingStatus":"Do not publish","seriesCount":1,"startDate":1429142400000,"type":"type","userId":10161,"userName":""},{"EDay":13,"EMonth":"Feb","SDay":10,"SMonth":"Feb","companyId":10157,"courseId":16103,"courseSeriesCode":"ATL 1","courseSeriesEventCode":"Ful.ATL 1","courseSeriesId":23624,"createDate":1427285141000,"endDate":1426204800000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427285141000,"publishingStatus":"Do not publish","seriesCount":1,"startDate":1423526400000,"type":"type","userId":10161,"userName":""},{"EDay":4,"EMonth":"Mar","SDay":3,"SMonth":"Mar","companyId":10157,"courseId":16104,"courseSeriesCode":"ATL 1","courseSeriesEventCode":"Syn.ATL 1","courseSeriesId":23625,"createDate":1427285141000,"endDate":1425427200000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427285141000,"publishingStatus":"Do not publish","seriesCount":1,"startDate":1425340800000,"type":"type","userId":10161,"userName":""},{"EDay":28,"EMonth":"Aug","SDay":19,"SMonth":"Aug","companyId":10157,"courseId":11603,"courseSeriesCode":"ATL 2","courseSeriesEventCode":"Fun.ATL 2","courseSeriesId":23901,"createDate":1427371446354,"endDate":1440720000000,"flagToChkEventCreation":0,"flagToListData":1,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427371446354,"publishingStatus":"Do not publish","seriesCount":2,"startDate":1439942400000,"type":"type","userId":10161,"userName":""},{"EDay":18,"EMonth":"Jul","SDay":14,"SMonth":"Jul","companyId":10157,"courseId":16004,"courseSeriesCode":"ATL 2","courseSeriesEventCode":"Bal.ATL 2","courseSeriesId":23902,"createDate":1427371446437,"endDate":1437177600000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427371446437,"publishingStatus":"Do not publish","seriesCount":2,"startDate":1436832000000,"type":"type","userId":10161,"userName":""},{"EDay":24,"EMonth":"Jun","SDay":16,"SMonth":"Jun","companyId":10157,"courseId":16006,"courseSeriesCode":"ATL 2","courseSeriesEventCode":"PRO.ATL 2","courseSeriesId":23903,"createDate":1427371446443,"endDate":1435104000000,"flagToChkEventCreation":0,"flagToListData":0,"groupId":0,"locationId":18402,"maxNoStudReg":100,"modifiedDate":1427371446443,"publishingStatus":"Do not publish","seriesCount":2,"startDate":1434412800000,"type":"type","userId":10161,"userName":""}];*/
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


/*$scope.events = [
{ id:1, event_name:"ATL-FUL", s_year:2015, s_month:'Mar', s_day:12, e_year:2015, e_month:'Mar', e_day:16, e_location:'Atlanda' },  
{ id:2, event_name:"ATL-SYN", s_year:2015, s_month:'Apr', s_day:20, e_year:2015, e_month:'Apr', e_day:24, e_location:'Singa'}, 

{ id:3, event_name:"IND-FUN", s_year:2015, s_month:'Sep', s_day:12, e_year:2015, e_month:'Sep', e_day:16, e_location:'NewYork'},
{ id:5, event_name:"IND-FUN", s_year:2015, s_month:'Dec', s_day:26, e_year:2015, e_month:'Dec', e_day:29, e_location:'NH'}
];*/


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
 

yviewControllers.controller('courseInfoCtrl', ['$scope', '$http','$modalInstance', 'item', 'Location', 
											function ($scope, $http, $modalInstance, item, Location) {
 
		
		var location;
		$scope.location = Location.query({addlocation:'get-location-by-location-id', locationid:'location-id', locationvid:item.locationId});
		
		$scope.courseinfo = angular.copy(item);
		 
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
            return angular.equals(original, $scope.courseinfo);
        }	


 }]);
