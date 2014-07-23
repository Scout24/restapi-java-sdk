package de.immobilienscout24.rest.facades.offer.realestates._1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import de.immobilienscout24.rest.schema.offer.realestates._1.RealEstate;

/**
 * @author Martin Fluegge
 * 
 */
public class RealestateFacadeFactory {

	public static RealestateFacadeFactory instance = new RealestateFacadeFactory();

	public RealestateFacade getFacade(RealEstate realEstate) {

		Class<? extends RealEstate> realestateClass = realEstate.getClass();
		String className = realestateClass.getSimpleName();
		String facadeName = this.getClass().getPackage().getName() + "." + className + "Facade";

		try {
			Class<?> facadeClass = Class.forName(facadeName);

			Constructor<?> ctor = facadeClass.getDeclaredConstructor(realestateClass);
			ctor.setAccessible(true);
			return (RealestateFacade) ctor.newInstance(realEstate);
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}
}
