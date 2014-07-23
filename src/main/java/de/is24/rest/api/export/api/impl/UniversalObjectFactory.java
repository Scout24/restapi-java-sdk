package de.is24.rest.api.export.api.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.bind.JAXBElement;

/**
 * @author Martin Fluegge
 * 
 */
public class UniversalObjectFactory {

	public Object getObjectFactory(Class<?> clazz) {

		String packageName = clazz.getPackage().getName();

		try {
			return Class.forName(packageName + ".ObjectFactory").newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			return null;
		}
	}

	public <T extends Object> JAXBElement<T> getJaxBElement(T o, Object objectFactory) {

		String className = o.getClass().getSimpleName();

		String methodName = "create" + className;
		try {
			System.out.println(methodName);

			Method method = objectFactory.getClass().getDeclaredMethod(methodName, o.getClass());

			return (JAXBElement<T>) method.invoke(objectFactory, o);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}
