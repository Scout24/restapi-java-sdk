package de.is24.generation.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Martin Fluegge
 * 
 */
public class GenerationPostProcessor {

	private static final Log LOG = LogFactory.getLog(GenerationPostProcessor.class);

	public static void main(String[] args) {
		new GenerationPostProcessor().run();
	}

	public void run() {

		LOG.info("Starting post processing");
		String targetBasePath = "../../../trunk/maklermanager-common/api/src/main/generated-sources/de/immobilienscout24/rest/schema/common/_1/ObjectFactory.java";

		File resourcesFile = new File(targetBasePath);

		try (BufferedReader br = new BufferedReader(new FileReader(resourcesFile))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {

				if (line.contains("public JAXBElement<RealtorContactDetails> createRealtorContactDetail(RealtorContactDetails value)")) {
					line = line.replace("createRealtorContactDetail", "createRealtorContactDetails");
				}

				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			FileOutputStream fos = new FileOutputStream(resourcesFile);
			fos.write(everything.getBytes());
			fos.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
