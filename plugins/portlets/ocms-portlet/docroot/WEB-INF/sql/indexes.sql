create index IX_F506837A on CM_Contact (contactId);
create index IX_17B91599 on CM_Contact (groupId);

create index IX_2FDAEE00 on CM_Course (courseId);
create index IX_9C158BF4 on CM_Course (groupId);

create index IX_9D7A329A on CM_CoursePackage (coursePackageId);
create index IX_D222D96E on CM_CoursePackage (groupId);
create index IX_F0C17B on CM_CoursePackage (name);

create index IX_F196AA17 on CM_CourseSeries (courseId);
create index IX_7FA679AE on CM_CourseSeries (courseSeriesId);
create index IX_267670FD on CM_CourseSeries (groupId);
create index IX_A30C54F1 on CM_CourseSeries (locationId);

create index IX_6C0B415A on CM_Location (groupId);
create index IX_E3AFCB74 on CM_Location (locationId);

create index IX_C0BFCBA1 on CM_Pricing (courseId);
create index IX_903DF633 on CM_Pricing (groupId);
create index IX_4C733BFB on CM_Pricing (locationId);
create index IX_939332BA on CM_Pricing (packageId);
create index IX_61136982 on CM_Pricing (price);
create index IX_BA44DE3A on CM_Pricing (pricingId);