'use strict';

/* Services */

var courseServices = angular.module('courseServices', ['ngResource']);

courseServices.factory('Course', ['$resource','$http', '$location',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.course/:addcourse/:userid/:id/:courseid/:coursevid/:sName/:name/:sCode/:code/:sDuration/:duration', 
					{addcourse:'@addcourse', userid:'@userid', id:'@id', courseid:'@courseid', coursevid:'@coursevid', sName:'@sName', name:'@name', sCode:'@sCode', code:'@code',
					sDuration:'@sDuration', duration:'@duration'}, {
      query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	  update: {method:'PUT'},
	  save:{method:'POST'}
    });

  }]);



var locationServices = angular.module('locationServices', ['ngResource']);

locationServices.factory('Location', ['$resource','$http', '$location',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.location/:addlocation/:userid/:id/:locationid/:locationvid/:sName/:name/:sCode/:code/:sNotes/:notes/:sAddressLine1/:addressLine1/:sAddressLine2/:addressLine2/:sCity/:city/:sState/:state/:sRegion/:region/:sCountry/:country/:sZip/:zip/:sPhone/:phone/:sFax/:fax/:sEmail/:email', 
					{addlocation:'@addlocation', userid:'@userid', id:'@id', locationid:'@locationid', locationvid:'@locationvid', sName:'@sName', name:'@name', sCode:'@sCode', code:'@code',sNotes:'@sNotes', notes:'@notes',sAddressLine1:'@sAddressLine1', addressLine1:'@addressLine1',
					sAddressLine2:'@sAddressLine2',addressLine2:'@addressLine2',sCity:'@sCity',city:'@city',
					sState:'@sState',state:'@state',sRegion:'@sRegion',region:'@region',sCountry:'@sCountry',country:'@country',
					sZip:'@sZip',zip:'@zip',sPhone:'@sPhone',phone:'@phone',sFax:'@sFax',fax:'@fax',sEmail:'@sEmail',email:'@email'}, {
      query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	  update: {method:'PUT'},
	  save:{method:'POST'}
    });

  }]);


var courseseriesServices = angular.module('courseseriesServices', ['ngResource']);

courseseriesServices.factory('Courseseries', ['$resource','$http', '$location',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.course-series/:addcourse/:userid/:id/:Slocationarray/:locationarrayvalue/:Scoursearray/:coursearrayvalue', 
					{addcourse:'@addcourse', userid:'@userid', id:'@id', Slocationarray:'@Slocationarray', locationarrayvalue:'@locationarrayvalue', Scoursearray:'@Scoursearray', coursearrayvalue:'@coursearrayvalue'}, {
       query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	 // update: {method:'PUT'},
	  save:{method:'POST'}
    });

  }]);


var eventServices = angular.module('eventServices', ['ngResource']);

eventServices.factory('Event', ['$resource','$http', '$location',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.event/:addevent/:userid/:id/:eventid/:eventvid/:sEventname/:eventname/:sCourseid/:courseid/:sCoursecode/:coursecode/:sLocationid/:locationid/:sLocationcode/:locationcode/:sStartdate/:startdate/:sEnddate/:enddate/:sFlag/:flag', 
					{addevent:'@addevent', userid:'@userid', id:'@id', eventid:'@eventid', eventvid:'@eventvid', sEventname:'@sEventname', eventname:'@eventname', sCourseid:'@sCourseid', courseid:'@courseid', sCoursecode:'@sCoursecode', coursecode:'@coursecode', sLocationid:'@sLocationid', locationid:'@locationid', sLocationcode:'@sLocationcode', locationcode:'@locationcode', sStartdate:'@sStartdate', startdate:'@startdate', sEnddate:'@sEnddate', enddate:'@enddate', sFlag:'@sFlag', flag:'@flag'}, {
      query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	  update: {method:'PUT'},
	  save:{method:'POST'}
    });

  }]);


