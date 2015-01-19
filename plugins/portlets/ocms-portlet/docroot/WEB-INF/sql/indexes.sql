create index IX_2FDAEE00 on CM_Course (courseId);
create index IX_9C158BF4 on CM_Course (groupId);

create index IX_F196AA17 on CM_CourseSeries (courseId);
create index IX_7FA679AE on CM_CourseSeries (courseSeriesId);
create index IX_267670FD on CM_CourseSeries (groupId);
create index IX_A30C54F1 on CM_CourseSeries (locationId);

create index IX_6C0B415A on CM_Location (groupId);
create index IX_E3AFCB74 on CM_Location (locationId);