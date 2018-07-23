package jcrystal.local;

import java.io.File;
import java.util.Arrays;

public class LocalPaths {
	public final static File srcFile = getExistingFolder("src/main/java","src/java","src");
	public final static File srcUtils = new File(srcFile.getParentFile(), "utils");
	public final static File webSrcFile = getExistingFolder("src/main/webapp","WebContent","war","web");
	
	private static File getExistingFolder(String...files) {
		for(String f : files)if(new File(f).exists())return new File(f).getAbsoluteFile();
		throw new NullPointerException("Folder not found "+ Arrays.toString(files));
	}
}
