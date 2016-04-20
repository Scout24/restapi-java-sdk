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

/**
 * 
 * @author Martin Fluegge
 *
 */
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
		// your basepath
		// String basePath = "/data/home/mfluegge";

		String sourceBasePath = "C:/svn/int/is24/common/restapi/schema/trunk/";
		String targetBasePath = "C:/git/restapi-java-sdk/";

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

			System.out.println(sourceDir.getAbsolutePath());
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

					Path sourcePath = f.toPath();// Paths.get(URI.create("file:///"
													// + f.getAbsolutePath()));
					Path targetPath = Paths.get(URI.create("file:///" + targetDir.getAbsolutePath().replace("\\", "/") + "/" + fileName));

					System.out.println("destination: " + targetPath);

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
		acceptedFiles.add("premiumplacement-1.0.xsd");
		acceptedFiles.add("showcaseplacement-1.0.xsd");
		acceptedFiles.add("topplacement-1.0.xsd");
		acceptedFiles.add("user-entitlement-1.0.xsd");
	}

	public static List<String> initDirectories() {
		List<String> directories = new ArrayList<String>();
		directories.add("src/main/resources/de/is24/common/webservice/xml");
		directories.add("src/main/resources/de/is24/common/webservice/xml/includes");
		directories.add("src/main/resources/de/is24/offer/productrecommendation/webservice/xml");
		directories.add("src/main/resources/de/is24/offer/webservice/xml");
		directories.add("src/main/resources/de/is24/platform/customer/webservice/xml");
		directories.add("src/main/resources/de/is24/platform/entitlement/webservice/xml");

		return directories;
	}
}
