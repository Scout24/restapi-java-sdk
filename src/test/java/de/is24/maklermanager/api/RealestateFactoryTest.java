package de.is24.maklermanager.api;

import org.junit.Assert;
import org.junit.Test;

import de.immobilienscout24.rest.facades.offer.realestates._1.GarageBuyFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.GarageRentFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.RealestateFacade;
import de.immobilienscout24.rest.facades.offer.realestates._1.RealestateFacadeFactory;
import de.immobilienscout24.rest.schema.offer.realestates._1.GarageBuy;
import de.immobilienscout24.rest.schema.offer.realestates._1.GarageRent;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class RealestateFactoryTest {

	@Test
	public void testFactoryGarageBuy() throws Exception {
		GarageBuy realEstate = new GarageBuy();

		RealestateFacade facade = RealestateFacadeFactory.instance.getFacade(realEstate);
		Assert.assertEquals(facade.getClass(), GarageBuyFacade.class);
		Assert.assertEquals(realEstate, facade.get());
	}

	@Test
	public void testFactoryGarageRent() throws Exception {
		GarageRent realEstate = new GarageRent();

		RealestateFacade facade = RealestateFacadeFactory.instance.getFacade(realEstate);
		Assert.assertEquals(facade.getClass(), GarageRentFacade.class);
		Assert.assertEquals(realEstate, facade.get());
	}
}
