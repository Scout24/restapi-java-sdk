package de.is24.maklermanager.api;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import de.immobilienscout24.rest.schema.common._1.ObjectFactory;
import de.immobilienscout24.rest.schema.offer.placement.Placement;
import de.immobilienscout24.rest.schema.offer.premiumplacement._1.Premiumplacement;
import de.immobilienscout24.rest.schema.offer.showcaseplacement._1.Showcaseplacement;
import de.immobilienscout24.rest.schema.offer.topplacement._1.Topplacement;

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

	@Ignore
	@Test
	public void testMethodAccessEntitlement() throws Exception {
		de.immobilienscout24.rest.schema.entitlement._1.ObjectFactory of = new de.immobilienscout24.rest.schema.entitlement._1.ObjectFactory();
		of.createEntitlement(null);
	}

	@Test
	public void testPlacement() throws Exception {
		Assert.assertTrue(new Topplacement() instanceof Placement);
		Assert.assertTrue(new Premiumplacement() instanceof Placement);
		Assert.assertTrue(new Showcaseplacement() instanceof Placement);
	}
}
