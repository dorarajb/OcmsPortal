'use strict';

/* Controllers */

var datepickerCtrls = angular.module('datepickerCtrls', []);

datepickerCtrls.controller('datepickerCtrl', function ($scope) {
        var self = this;
        $('.date').datepicker({ autoclose: true, todayHighlight: true });
        $scope.$watch('value', function (oldVal, newVal) {
                        console.log("Value: "+ $scope.value);
        });
} );