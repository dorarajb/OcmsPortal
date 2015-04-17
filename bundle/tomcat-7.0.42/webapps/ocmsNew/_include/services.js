
'use strict';

/* Services */

var contactServices = angular.module('contactServices', ['ngResource']);

contactServices.factory('Contact', ['$resource','$http',
  function($resource){
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.contact/:addcontact/:userid/:id/:contactid/:vcontactid/:contactname/:vcontactname/:contacttype/:vcontacttype/:addressline1/:vaddressline1/:addressline2/:city/:vcity/:state/:vstate/:region/:vregion/:zip/:vzip/:phone/:vphone/:fax/:vfax/:email/:vemail', 
					{addcontact:'@addcontact', userid:'@userid', id:'@id',contactid:'@contactid', vcontactid:'@vcontactid', contactname:'@contactname',vcontactname:'@vcontactname', contacttype:'@contacttype',vcontacttype:'@vcontacttype', addressline1:'@addressline1', vaddressline1:'@vaddressline1',addressline2:'@addressline2', vaddressline2:'@vaddressline2', city:'@city',vcity:'@vcity', state:'@state', vstate:'@vstate',region:'@region', vregion:'@vregion', zip:'@zip',vzip:'@vzip', phone:'@phone', vphone:'@vphone',fax:'@fax', vfax:'@vfax', email:'@email', vemail:'@vemail'}, {
      query: {method:'GET', isArray:true},
	  update: {method:'PUT'},
	  save:{method:'POST'},
	  delete:{method:'DELETE'}
    });
   
  }]);
  
  
var courseServices = angular.module('courseServices', ['ngResource']);

courseServices.factory('Course', ['$resource','$http',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.course/:addcourse/:userid/:id/:courseid/:coursevid/:sName/:name/:sCode/:code/:sDuration/:duration', 
					{addcourse:'@addcourse', userid:'@userid', id:'@id', courseid:'@courseid', coursevid:'@coursevid', sName:'@sName', name:'@name', sCode:'@sCode', code:'@code',
					sDuration:'@sDuration', duration:'@duration'}, {
      query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	  update: {method:'PUT'},
	  save:{method:'POST'},
	  delete:{method:'DELETE'}
    });

  }]);



var locationServices = angular.module('locationServices', ['ngResource']);

locationServices.factory('Location', ['$resource','$http',
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
	  save:{method:'POST'},
	  delete:{method:'DELETE'}
    });

  }]);


var courseseriesServices = angular.module('courseseriesServices', ['ngResource']);

courseseriesServices.factory('Courseseries', ['$resource','$http',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.course-series/:addcourse/:userid/:id/:slocationid/:locationidvalue/:Slocationarray/:locationarrayvalue/:Scoursearray/:coursearrayvalue/:Scourseseries/:courseseriesvalue/:Scourseseriesid/:courseseriesidvalue/:Sstartdate/:startdatevalue/:Senddate/:enddatevalue', 
					{addcourse:'@addcourse', userid:'@userid', id:'@id', slocationid:'@slocationid', locationidvalue:'@locationidvalue', Slocationarray:'@Slocationarray', locationarrayvalue:'@locationarrayvalue', Scoursearray:'@Scoursearray', coursearrayvalue:'@coursearrayvalue',Scourseseries:'@Scourseseries', courseseriesvalue:'@courseseriesvalue',Scourseseriesid:'@Scourseseriesid', courseseriesidvalue:'@courseseriesidvalue', Sstartdate:'@Sstartdate', startdatevalue:'@startdatevalue',Senddate:'@Senddate', enddatevalue:'@enddatevalue'}, {
       query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	 update: {method:'PUT'},
	  save:{method:'POST'},
	  delete:{method:'DELETE'}
    });

  }]);
  

var eventServices = angular.module('eventServices', ['ngResource']);

eventServices.factory('Event', ['$resource','$http',
  function($resource){	  
    return $resource('http://localhost:8080/api/jsonws/ocms-portlet.event/:addevent/:userid/:id/:eventid/:eventvid/:sEventname/:eventname/:sCourseid/:courseid/:sCoursecode/:coursecode/:sLocationid/:locationid/:sLocationcode/:locationcode/:sStartdate/:startdate/:sEnddate/:enddate/:sFlag/:flag', 
					{addevent:'@addevent', userid:'@userid', id:'@id', eventid:'@eventid', eventvid:'@eventvid', sEventname:'@sEventname', eventname:'@eventname', sCourseid:'@sCourseid', courseid:'@courseid', sCoursecode:'@sCoursecode', coursecode:'@coursecode', sLocationid:'@sLocationid', locationid:'@locationid', sLocationcode:'@sLocationcode', locationcode:'@locationcode', sStartdate:'@sStartdate', startdate:'@startdate', sEnddate:'@sEnddate', enddate:'@enddate', sFlag:'@sFlag', flag:'@flag'}, {
      query: {method:'GET', isArray:true},
	  //save:{method:'POST', params:{id:''}}
	  //mdclass
	  update: {method:'PUT'},
	  save:{method:'POST'},
	  delete:{method:'DELETE'}
    });

  }]);
  


