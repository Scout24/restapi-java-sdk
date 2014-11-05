TODO:

To generate the classes from the given xsd:

1.) before generating be sure to have to latest version of all xsd files !
	- checkout(or update!) https://subversion.iscout.local/int/is24/common/restapi/schema/trunk
		 into the same directory like mmm project itself and put it into folder "rest-api"
		 
	--> copying from rest-api all relevant files into mmm/common/api/... with CopyApiXsdFiles.java

2.) run generateSources.sh