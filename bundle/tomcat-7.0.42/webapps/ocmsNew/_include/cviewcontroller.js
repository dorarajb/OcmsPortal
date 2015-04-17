'use strict';

/* Controllers */


var cviewControllers = angular.module('cviewControllers', []);

cviewControllers.controller('MainSchedulerCtrl', function($scope) {
  $scope.events = [
    { id:1, text:"Fun.ATL-Airport 1",
      start_date: new Date(2015, 2, 12),
      end_date: new Date(2015, 2, 16) },
    { id:2, text:"Ful.ATL-Airport 1",
      start_date: new Date(2015, 2, 20 ),
      end_date: new Date(2015, 2, 24 ) },
    { id:3, text:"Fun.TOR-WYND 1",
      start_date: new Date(2015, 2, 12 ),
      end_date: new Date(2015, 2, 16 ) }	  
  ];

   $scope.scheduler = { date : new Date(2015,2,1) };

});
 
 


 
