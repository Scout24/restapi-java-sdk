TODO:

To generate the classes from the given xsd:

- before generating be sure to have to latest version of all xsd files 
	--> copying possible with CopyApiXsdFiles.java(update api project before :-) )

- remove all binding files 
- remove the realestate definition from the realestates.xsd
- run "mvn clean install -P generateSources"
- refresh your project
- de.immobilienscout24.rest.schema.common._1.ObjectFactory.createRealtorContactDetail -->de.immobilienscout24.rest.schema.common._1.ObjectFactory.createRealtorContactDetails umbennen
	public JAXBElement<RealtorContactDetails> createRealtorContactDetails(RealtorContactDetails value)


- //run "mvn clean generate-sources" 