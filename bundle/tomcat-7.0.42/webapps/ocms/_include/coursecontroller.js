'use strict';

/* Controllers */

var courseControllers = angular.module('courseControllers', []);

courseControllers.controller('courselistCtrl', ['$scope', '$http', '$window', '$modal', 'Course',
		  function($scope, $http,$window, $modal, Course) {	
		    
			var courses;
		  	//$scope.courses = Course.query(); // Get list of courses			
			//$scope.courses = Course.query({id:'courses',mdclass:'pari'});
			//$scope.courses = Course.query({id:'pari'}); get-courses-by-group-id/group-id/0
			$scope.courses = Course.query({addcourse:'get-courses-by-group-id', userid:'group-id', id:'0'});
			
			var deleteCourse;
		    $scope.deleteCourse = function (vcourse) {
		    Course.delete({addcourse:'delete-course-by-course-id', userid:'course-id', id:vcourse.courseId});
		    $window.location.reload();
			};
		 
			
			/*Open the Course Form*/			
			$scope.open = function (p,size) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/form-course.html',
				  controller: 'courseCtrl',
				  size: size ,
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
			
 
  }]);

 

courseControllers.controller('courseCtrl', ['$scope', '$http', '$window', '$modalInstance', 'item', 'Course', 
											function ($scope, $http,$window ,$modalInstance, item, Course) {
 
		
      
		
		$scope.course = angular.copy(item);
		console.log($scope.course);
		console.log(item);
		
		 
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
        return angular.equals(original, $scope.course);
        }		
		 
		
		$scope.saveCourse = function (course) {			
		 course.uid = $scope.uid;
			
			if(course.courseId > 0){//// Edit the Course
			 
				
				Course.update({addcourse:'update-course', courseid:'course-id', coursevid:course.courseId, sName:'name', name:course.name, sCode:'code', code:course.code, sDuration:'duration', duration:course.duration},course);	
				
				var x = angular.copy(course);
				$modalInstance.close(x);
				$window.location.reload();
				
			}
			else{ //// Adding a New Course
				 
				 
				Course.save({addcourse:'add-course', sName:'name', name:course.name, sCode:'code', code:course.code,
						sDuration:'duration', duration:course.duration},course);	
				 
				var x = angular.copy(course);
				$modalInstance.close(x);
				$window.location.reload();
			}
			
		};
        
}]);

 
 


 
