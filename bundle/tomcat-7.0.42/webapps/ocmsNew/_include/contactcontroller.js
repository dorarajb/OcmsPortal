'use strict';

/* Controllers */

var contactControllers = angular.module('contactControllers', []);

contactControllers.controller('contactlistCtrl', ['$scope', '$http', '$window', '$modal', 'Contact',
		  function($scope, $http,$window, $modal, Contact) {	
		    
			var contacts;
			$scope.contacts = Contact.query({addcontact:'get-contact-by-group-id', userid:'group-id', id:'0'});
			
			var deleteContact;
		    $scope.deleteContact = function (vcontact) {
		    Contact.delete({addcontact:'delete-contact-by-contact-id', userid:'contact-id', id:vcontact.contactId});
		    $window.location.reload();
			};
		 
			
			/*Open the Course Form*/			
			$scope.open = function (p,size) {	
			
				var modalInstance = $modal.open({
				  templateUrl: 'templates/form-contact.html',
				  controller: 'contactCtrl',
				  size: size ,
				  resolve: {
					item: function () {						 
					  return p;
					}
				  }
				});		
			};/*Open the Course Form*/
			
 
  }]);

 

contactControllers.controller('contactCtrl', ['$scope', '$http', '$window', '$modalInstance', 'item', 'Contact', 
											function ($scope, $http,$window ,$modalInstance, item, Contact) {
 
		
      
		
		$scope.contact = angular.copy(item);
		 
		$scope.cancel = function () {
            $modalInstance.dismiss('Close');
        };		
		 
		
        var original = item;
        $scope.isClean = function() {
        return angular.equals(original, $scope.contact);
        }		
		 
		
		$scope.saveContact = function (contact) {			
		 contact.uid = $scope.uid;
			
			if(contact.contactId > 0){//// Edit the Course
			 
				
				Contact.update({addcontact:'update-contact', contactid:'contact-id', vcontactid:contact.contactId, contactname:'contact-name', vcontactname:contact.contactName, contacttype:'contact-type', vcontacttype:contact.contactType, addressline1:'address-line1', vaddressline1:contact.addressLine1,addressline2:'address-line2', vaddressline2:contact.addressLine2, city:'city', vcity:contact.city, state:'state', vstate:contact.state, region:'region', vregion:contact.region, zip:'zip', vzip:contact.zip, phone:'phone', vphone:contact.phone, fax:'fax', vfax:contact.fax, email:'email', vemail:contact.email},contact);	
				console.log(contact);
				console.log($http.Contact);
				var x = angular.copy(contact);
				$modalInstance.close(x);
				$window.location.reload();
				
			}
			else{ //// Adding a New Course
				 
				 Contact.save({addcontact:'add-contact', contactname:'contact-name', vcontactname:contact.contactName, contacttype:'contact-type', vcontacttype:contact.contactType, addressline1:'address-line1', vaddressline1:contact.addressLine1,addressline2:'address-line2', vaddressline2:contact.addressLine2, city:'city', vcity:contact.city, state:'state', vstate:contact.state, region:'region', vregion:contact.region, zip:'zip', vzip:contact.zip, phone:'phone', vphone:contact.phone, fax:'fax', vfax:contact.fax, email:'email', vemail:contact.email},contact);
				 
				/* $http.post('http://localhost:8080/api/jsonws/ocms-portlet.contact/add-contact', {
    contactType: 'dfsdfsd',
    contactName: 'Vijay',
    addressLine1: 'dfsdf',
    addressLine2: 'dsfsf',
    city: 'dfsfs',
    state: 'sdfsfsd',
    region: 'fdsfsdf',
    zip: 'sdfsdf',
    phone: 'sfsdf',
    fax: 'fsdfdf',
    email: 'fdssdf'
  }, {headers :{'Content-Type': 'text/plain'}})
                 .success(function(){ $scope.uploadFile.grid = false })
                 .error(function(){});*/
				
				console.log(contact);
				var x = angular.copy(contact);
				$modalInstance.close(x);
				$window.location.reload();
				
			}
			
		};
        
}]);

 
 


 
