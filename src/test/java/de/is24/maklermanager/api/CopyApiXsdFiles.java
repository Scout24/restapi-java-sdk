package de.is24.maklermanager.api;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CopyApiXsdFiles {

	public static Set<String> acceptedFiles = new HashSet<String>();

	/**
	 * 
	 * copy the needed xsd files for generation
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		initAcceptedFileList();

		/**
		 * Convention: checkout
		 * https://subversion.iscout.local/int/is24/common/restapi/schema/trunk
		 * into the same directory like mmm project itself and put into folder
		 * rest-api
		 * 
		 * otherwise you cannot use this copy script!!
		 */

		// String sourceBasePath =
		// "/data/home/rboettge/ImmoScout24/MMM/rest-api/schema/trunk/";
		// String targetBasePath =
		// "/data/home/rboettge/ImmoScout24/MMM/trunk/common/api/";

		String sourceBasePath = "../../../rest-api/schema/trunk/";
		String targetBasePath = "../../../trunk/common/api/";

		File f1 = new File(sourceBasePath);
		System.out.println(f1.getAbsolutePath());

		List<String> directories = initDirectories();

		for (String dir : directories) {
			System.out.println("I will copy from: " + dir);
			File targetDir = new File(targetBasePath + dir);
			if (!targetDir.exists() || !targetDir.isDirectory()) {
				targetDir.mkdirs();
			}

			File sourceDir = new File(sourceBasePath + dir);
			if (!sourceDir.exists()) {
				System.out.println("**** skipping directory: " + dir);
				continue;
			}

			FileFilter filter = new FileFilter() {

				@Override
				public boolean accept(File file) {

					if (file.isDirectory()) {
						return false;
					}

					String name = file.getName();
					if (name.contains("common")) {
						System.out.println("gefunden");
					}
					if (acceptedFiles.contains(name)) {
						return true;
					}
					return false;
				}
			};

			File[] listFiles = sourceDir.listFiles(filter);
			for (File f : listFiles) {
				if (f.isFile()) {
					System.out.println("sourceFile: " + f.getAbsolutePath());
					String fileName = f.getName();
					Path sourcePath = Paths.get(URI.create("file://" + f.getAbsolutePath()));
					Path targetPath = Paths.get(URI.create("file://" + targetDir.getAbsolutePath() + "/" + fileName));

					Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}

	}

	public static void initAcceptedFileList() {
		acceptedFiles.add("alterationdate-1.0.xsd");
		acceptedFiles.add("attachmentsorder-1.0.xsd");
		acceptedFiles.add("common-1.0.xsd");
		acceptedFiles.add("common-account-1.0.xsd");
		acceptedFiles.add("customer-1.0.xsd");
		acceptedFiles.add("messages-1.0.xsd");
		acceptedFiles.add("offerListElement-1.0.xsd");
		acceptedFiles.add("offerUser-1.0.xsd");
		acceptedFiles.add("productrecommendation-1.0.xsd");
		acceptedFiles.add("realestates-1.0.xsd");
		acceptedFiles.add("realEstateCounts-1.0.xsd");
		acceptedFiles.add("realestatestock-1.0.xsd");
		acceptedFiles.add("realtor-1.0.xsd");
		acceptedFiles.add("toplisting-1.0.xsd");
		acceptedFiles.add("videoupload-1.0.xsd");
		acceptedFiles.add("xlink.xsd");
		acceptedFiles.add("zipandlocationtoregion-1.0.xsd");
	}

	public static List<String> initDirectories() {
		List<String> directories = new ArrayList<String>();
		directories.add("src/main/resources/de/is24/common/webservice/xml");
		directories.add("src/main/resources/de/is24/common/webservice/xml/includes");
		directories.add("src/main/resources/de/is24/offer/productrecommendation/webservice/xml");
		directories.add("src/main/resources/de/is24/offer/webservice/xml");
		directories.add("src/main/resources/de/is24/platform/customer/webservice/xml");

		return directories;
	}

}
