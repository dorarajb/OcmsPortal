create index IX_F506837A on CM_Contact (contactId);
create index IX_17B91599 on CM_Contact (groupId);

create index IX_2FDAEE00 on CM_Course (courseId);
create index IX_9C158BF4 on CM_Course (groupId);

create index IX_9D7A329A on CM_CoursePackage (coursePackageId);
create index IX_D222D96E on CM_CoursePackage (groupId);
create index IX_F0C17B on CM_CoursePackage (name);

create index IX_F196AA17 on CM_CourseSeries (courseId);
create index IX_266829C0 on CM_CourseSeries (courseSeriesCode);
create index IX_7FA679AE on CM_CourseSeries (courseSeriesId);
create index IX_2BDC0B90 on CM_CourseSeries (flagToListData);
create index IX_267670FD on CM_CourseSeries (groupId);
create index IX_2B15D240 on CM_CourseSeries (groupId, flagToListData);
create index IX_A30C54F1 on CM_CourseSeries (locationId);
create index IX_5F6D4E34 on CM_CourseSeries (locationId, flagToListData);

create index IX_AA6BB6AD on CM_Discount (active_);
create index IX_AC72CAE6 on CM_Discount (code_);
create index IX_A82B86E3 on CM_Discount (code_, active_);
create index IX_C8492B8C on CM_Discount (discountId);
create index IX_6F2080FD on CM_Discount (discountId, active_);
create index IX_45D1BC4E on CM_Discount (groupId);
create index IX_19E1AA7B on CM_Discount (groupId, active_);
create index IX_EE601578 on CM_Discount (id_);
create index IX_CD740091 on CM_Discount (id_, active_);

create index IX_F92C4EBA on CM_Event (eventId);
create index IX_8FC4F90B on CM_Event (flag);
create index IX_9EE8581F on CM_Event (groupId);
create index IX_34A7E2C5 on CM_Event (userId, flag);
create index IX_8C1FDF85 on CM_Event (userId, flag, groupId);

create index IX_6C0B415A on CM_Location (groupId);
create index IX_E3AFCB74 on CM_Location (locationId);

create index IX_622BFE4A on CM_OffersAndDeductions (active_);
create index IX_63EA55C3 on CM_OffersAndDeductions (code_);
create index IX_E0F5E4A6 on CM_OffersAndDeductions (code_, active_);
create index IX_FD9203EB on CM_OffersAndDeductions (groupId);
create index IX_498BA37E on CM_OffersAndDeductions (groupId, active_);
create index IX_48204A8A on CM_OffersAndDeductions (groupId, type_, id_);
create index IX_B506B395 on CM_OffersAndDeductions (id_);
create index IX_21B0F314 on CM_OffersAndDeductions (id_, active_);
create index IX_F8EDD556 on CM_OffersAndDeductions (type_);

create index IX_C0BFCBA1 on CM_Pricing (courseId);
create index IX_903DF633 on CM_Pricing (groupId);
create index IX_4C733BFB on CM_Pricing (locationId);
create index IX_939332BA on CM_Pricing (packageId);
create index IX_9E60AD8F on CM_Pricing (packageId, active_);
create index IX_2BD401DE on CM_Pricing (packageId, locationId);
create index IX_AECA6EB on CM_Pricing (packageId, locationId, active_);
create index IX_61136982 on CM_Pricing (price);
create index IX_BA44DE3A on CM_Pricing (pricingId);

create index IX_3F34F50 on CM_RegistrationDetails (groupId);
create index IX_FBF0041A on CM_RegistrationDetails (registrationDetailsId);

create index IX_B403325 on CM_StudentRegistration (groupId);
create index IX_AFF811AA on CM_StudentRegistration (studRegId);

create index IX_57A0CF57 on CM_TaxDetails (active_);
create index IX_F306D4F8 on CM_TaxDetails (groupId);
create index IX_93ACB111 on CM_TaxDetails (groupId, active_);
create index IX_96AEB178 on CM_TaxDetails (taxDetailsId);
create index IX_5DD4E491 on CM_TaxDetails (taxDetailsId, active_);
create index IX_94857DFE on CM_TaxDetails (taxTypeId);
create index IX_F554CECB on CM_TaxDetails (taxTypeId, active_);

create index IX_69E73E1 on CM_TaxTypes (groupId);
create index IX_F7B43EE6 on CM_TaxTypes (taxTypesId);