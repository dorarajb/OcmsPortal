'use strict';

/* Controllers */

var ocmscontroller = angular.module('ocmsControllers', []);

ocmscontroller.controller('contactCtrl', ['$scope', function($scope){
	$scope.contactType = "Madrone";
}]);