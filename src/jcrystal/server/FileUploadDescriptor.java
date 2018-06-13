package jcrystal.server;

public class FileUploadDescriptor {

	public final String bucketName;
	public final String path;
	public FileUploadDescriptor(String bucketName, String path) {
		this.bucketName = bucketName;
		this.path = path;
	}
}
