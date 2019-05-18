/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.local;

import java.io.File;
import java.util.Arrays;

public class LocalPaths {
	public final static File srcFile = getExistingFolder("src/main/java","src/java","src");
	public final static File srcUtils = new File(srcFile.getParentFile(), "utils");
	public final static File webSrcFile = getExistingFolderNull("src/main/webapp","WebContent","war","web");
	
	private static File getExistingFolder(String...files) {
		for(String f : files)if(new File(f).exists())return new File(f).getAbsoluteFile();
		throw new NullPointerException("Folder not found "+ Arrays.toString(files));
	}
	private static File getExistingFolderNull(String...files) {
		for(String f : files)if(new File(f).exists())return new File(f).getAbsoluteFile();
		return null;
	}
}
