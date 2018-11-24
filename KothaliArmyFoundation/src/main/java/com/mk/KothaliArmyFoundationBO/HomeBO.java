package com.mk.KothaliArmyFoundationBO;

public class HomeBO {
	private int foundationID;
	private String foundationName;
	private String foundationType;
	private String foundationAddress;
	
	
	public HomeBO() {
		super();
	}
	public HomeBO(int foundationID, String foundationName, String foundationType, String foundationAddress) {
		super();
		this.foundationID = foundationID;
		this.foundationName = foundationName;
		this.foundationType = foundationType;
		this.foundationAddress = foundationAddress;
	}
	public int getFoundationID() {
		return foundationID;
	}
	public void setFoundationID(int foundationID) {
		this.foundationID = foundationID;
	}
	public String getFoundationName() {
		return foundationName;
	}
	public void setFoundationName(String foundationName) {
		this.foundationName = foundationName;
	}
	public String getFoundationType() {
		return foundationType;
	}
	public void setFoundationType(String foundationType) {
		this.foundationType = foundationType;
	}
	public String getFoundationAddress() {
		return foundationAddress;
	}
	public void setFoundationAddress(String foundationAddress) {
		this.foundationAddress = foundationAddress;
	}
	
	

}
