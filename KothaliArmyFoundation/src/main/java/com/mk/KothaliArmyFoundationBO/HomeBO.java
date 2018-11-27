package com.mk.KothaliArmyFoundationBO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KF_Home")
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
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Home_FoundationID",nullable=false,unique=true)
	public int getFoundationID() {
		return foundationID;
	}
	public void setFoundationID(int foundationID) {
		this.foundationID = foundationID;
	}
	@Column(name="Home_FoundationName")
	public String getFoundationName() {
		return foundationName;
	}
	public void setFoundationName(String foundationName) {
		this.foundationName = foundationName;
	}
	@Column(name="Home_FoundationType")
	public String getFoundationType() {
		return foundationType;
	}
	public void setFoundationType(String foundationType) {
		this.foundationType = foundationType;
	}
	@Column(name="Home_FoundationAddress")
	public String getFoundationAddress() {
		return foundationAddress;
	}
	public void setFoundationAddress(String foundationAddress) {
		this.foundationAddress = foundationAddress;
	}
	
	

}
