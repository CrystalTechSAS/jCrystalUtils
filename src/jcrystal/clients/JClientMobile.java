package jcrystal.clients;

public class JClientMobile extends Client{
	public String outputAndroid;
	public String outputiOS;
	
	public JClientMobile(String id) {
		super(ClientType.MOBILE, id);
	}
	public JClientMobile setOutputAndroid(String outputAndroid) {
		this.outputAndroid = outputAndroid;
		return this;
	}
	public JClientMobile setOutputiOS(String outputiOS) {
		this.outputiOS = outputiOS;
		return this;
	}
	@Override
	public Client setOutput(String output) {
		setOutputAndroid(output+"/android");
		setOutputiOS(output+"/ios");
		return super.setOutput(output);
	}
}
