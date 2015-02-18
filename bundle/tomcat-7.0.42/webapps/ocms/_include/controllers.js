'use strict';

/* Controllers */

var myControllers = angular.module('myControllers', []);

myControllers.controller('courselistCtrl', ['$scope', '$http','$modal',
		  function($scope, $http, $modal) {
		  
		  
    $scope.open = function (p,size) {
        var modalInstance = $modal.open({
          templateUrl: 'templates/form-course.html',
          controller: 'productEditCtrl',
          size: size 
        });
        
    };

  }]);

myControllers.controller('productEditCtrl', function ($scope, $modalInstance) {

        $scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };
        
});

 
 


 
