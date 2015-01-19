create table CM_Contact (
	contactId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	contactType VARCHAR(75) null,
	contactName VARCHAR(75) null,
	addressLine1 VARCHAR(75) null,
	addressLine2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	region VARCHAR(75) null,
	zip VARCHAR(75) null,
	phone VARCHAR(75) null,
	fax VARCHAR(75) null,
	email VARCHAR(75) null
);

create table CM_Course (
	courseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	duration VARCHAR(75) null
);

create table CM_CourseSeries (
	courseSeriesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	courseId LONG,
	locationId LONG,
	type_ VARCHAR(75) null,
	start_date DATE null,
	end_date DATE null,
	publishing_status VARCHAR(75) null,
	max_no_of_stud_reg LONG
);

create table CM_Location (
	locationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	notes VARCHAR(75) null,
	addressLine1 VARCHAR(75) null,
	addressLine2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	country VARCHAR(75) null,
	region VARCHAR(75) null,
	zipcode VARCHAR(75) null,
	phone VARCHAR(75) null,
	fax VARCHAR(75) null,
	email VARCHAR(75) null,
	siteUrl VARCHAR(75) null
);