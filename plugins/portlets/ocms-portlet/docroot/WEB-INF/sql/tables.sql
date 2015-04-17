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

create table CM_CoursePackage (
	coursePackageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null
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
	startDate DATE null,
	endDate DATE null,
	publishingStatus VARCHAR(75) null,
	maxNoStudReg LONG,
	seriesCount LONG,
	courseSeriesCode VARCHAR(75) null,
	courseSeriesEventCode VARCHAR(75) null,
	flagToListData INTEGER,
	flagToChkEventCreation INTEGER,
	sMonth VARCHAR(75) null,
	sDay INTEGER,
	eMonth VARCHAR(75) null,
	eDay INTEGER
);

create table CM_Discount (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	description VARCHAR(75) null,
	amount LONG,
	active_ INTEGER,
	effectiveFromDate DATE null,
	effectivetoDate DATE null
);

create table CM_Event (
	eventId LONG not null primary key,
	eventName VARCHAR(75) null,
	courseCode VARCHAR(75) null,
	locationCode VARCHAR(75) null,
	startDate DATE null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	endDate DATE null,
	flag INTEGER,
	courseId LONG,
	locationId LONG
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

create table CM_OffersAndDeductions (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	description VARCHAR(75) null,
	amount LONG,
	active_ INTEGER,
	effectiveFromDate DATE null,
	effectivetoDate DATE null,
	type_ VARCHAR(75) null
);

create table CM_Pricing (
	pricingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	locationId INTEGER,
	courseId INTEGER,
	packageId INTEGER,
	deposit INTEGER,
	price INTEGER,
	currency_ VARCHAR(75) null,
	effectiveFromDate DATE null,
	courseCode VARCHAR(75) null,
	locationCode VARCHAR(75) null,
	effectiveToDate DATE null,
	active_ INTEGER,
	balanceDueParDate INTEGER
);

create table CM_RegistrationDetails (
	studRegId LONG,
	contactId LONG,
	eventId LONG,
	price DOUBLE,
	discount DOUBLE,
	fee DOUBLE,
	credit DOUBLE,
	registrationDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table CM_StudentRegistration (
	studRegId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	memo VARCHAR(75) null,
	studRegStatus VARCHAR(75) null,
	advisorOrig VARCHAR(75) null,
	advisorReg VARCHAR(75) null,
	coursePackageId LONG,
	discountId LONG,
	commMethod VARCHAR(75) null,
	notes VARCHAR(75) null,
	currency_ VARCHAR(75) null,
	tax LONG,
	autoCharge VARCHAR(75) null,
	currencyPaid VARCHAR(75) null,
	exchangeRate LONG,
	contactId LONG
);

create table CM_TaxDetails (
	taxDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	country VARCHAR(75) null,
	taxTypeId LONG,
	effectiveFromDate DATE null,
	effectiveToDate DATE null,
	active_ INTEGER,
	taxPercent INTEGER
);

create table CM_TaxTypes (
	taxTypesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	taxName VARCHAR(75) null
);