'use strict';

/* App Module */

var ocmsApp = angular.module('ocmsApp', ['ngRoute','courseControllers','ui.bootstrap', 'ngAnimate','courseServices', 'locationServices', 'locationControllers', 'eventServices', 'eventControllers','courseseriesControllers', 'courseseriesServices',]);

ocmsApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
       when('/courses', {
        templateUrl: 'templates/courses.html',
        controller: 'courselistCtrl'	
      }).
      when('/locations', {
        templateUrl: 'templates/locations.html',
        controller: 'locationlistCtrl'
      }).
      when('/events', {
        templateUrl: 'templates/events.html',
        controller: 'eventlistCtrl'
      }).
	  
      when('/series', {
        templateUrl: 'templates/series.html',
        controller: 'seriesCtrl'
      }).	  
      when('/createcourseseries', {
        templateUrl: 'templates/createcourseseries.html',
        controller: 'createcourseseriesCtrl'
      }).		  
	  
     otherwise({
        redirectTo: '/courses'
      });
  }]);
