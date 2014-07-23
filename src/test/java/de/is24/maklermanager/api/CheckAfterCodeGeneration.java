package de.is24.maklermanager.api;

import org.junit.Ignore;
import org.junit.Test;

import de.immobilienscout24.rest.schema.common._1.ObjectFactory;

/**
 * 
 * @author Rene Boettge
 * 
 *         This class contains tests which are used to check if code generation
 *         (based on xsd files from is24 rest api) works fine because there is
 *         one manual step after code generation. These steps are described
 *         inside README.txt
 * 
 *         You can update the xsd files after updating your checkout directory
 *         with api-schema.
 * 
 */
public class CheckAfterCodeGeneration {

	/**
	 * As you can read inside README.txt this method has to updated manuelly
	 * because the method name is wrong.
	 * 
	 * In case of compile errors go to
	 * de.immobilienscout24.rest.schema.common._1.ObjectFactory and correct the
	 * method
	 * 
	 * JAXBElement<RealtorContactDetails>
	 * createRealtorContactDetails(RealtorContactDetails value)
	 * 
	 * ... it MUST have an "s"(after code generation its name is
	 * createRealtorContactDetail(...) without "s") in the end!
	 * 
	 * It is a little hack to have the IGNORE annotation because we just want to
	 * check if it's compilable!
	 * 
	 * @throws Exception
	 */
	@Ignore
	@Test
	public void testMethodAccess() throws Exception {
		ObjectFactory of = new ObjectFactory();
		of.createRealtorContactDetails(null);
	}
}
