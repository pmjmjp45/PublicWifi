package kr.ac.kopo.ctc.kopo14.domain;

public class WifiItem {

	// make unique list<WifiItem> 
	// 1. specify type and name as global variable 
	private int id;
	private String installationLocationName;
	private String installationLocationDetails;
	private String installationCityName;
	private String installationDistrictName;
	private String installationFacilityType;
	private String serviceProviderName;
	private String wifiSSID;
	private String dateOfInstallation;
	private String roadNameAddress;
	private String lotNumberAddress;
	private String managementAgencyName;
	private String managementAgencyPhoneNumber;
	private double latitude;
	private double longitude;
	private String created;
	
	// 2. make getter and setter
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getinstallationLocationName() {
		return installationLocationName;
	}
	public void setinstallationLocationName(String installationLocationName) {
		this.installationLocationName = installationLocationName;
	}
	public String getinstallationLocationDetails() {
		return installationLocationDetails;
	}
	public void setinstallationLocationDetails(String installationLocationDetails) {
		this.installationLocationDetails = installationLocationDetails;
	}
	public String getinstallationCityName() {
		return installationCityName;
	}
	public void setinstallationCityName(String installationCityName) {
		this.installationCityName = installationCityName;
	}
	public String getinstallationDistrictName() {
		return installationDistrictName;
	}
	public void setinstallationDistrictName(String installationDistrictName) {
		this.installationDistrictName = installationDistrictName;
	}
	public String getinstallationFacilityType() {
		return installationFacilityType;
	}
	public void setinstallationFacilityType(String installationFacilityType) {
		this.installationFacilityType = installationFacilityType;
	}
	public String getserviceProviderName() {
		return serviceProviderName;
	}
	public void setserviceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getwifiSSID() {
		return wifiSSID;
	}
	public void setwifiSSID(String wifiSSID) {
		this.wifiSSID = wifiSSID;
	}
	public String getdateOfInstallation() {
		return dateOfInstallation;
	}
	public void setdateOfInstallation(String dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}
	public String getroadNameAddress() {
		return roadNameAddress;
	}
	public void setroadNameAddress(String roadNameAddress) {
		this.roadNameAddress = roadNameAddress;
	}
	public String getlotNumberAddress() {
		return lotNumberAddress;
	}
	public void setlotNumberAddress(String lotNumberAddress) {
		this.lotNumberAddress = lotNumberAddress;
	}
	public String getmanagementAgencyName() {
		return managementAgencyName;
	}
	public void setmanagementAgencyName(String managementAgencyName) {
		this.managementAgencyName = managementAgencyName;
	}
	public String getmanagementAgencyPhoneNumber() {
		return managementAgencyPhoneNumber;
	}
	public void setmanagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		this.managementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}
	public double getlatitude() {
		return latitude;
	}
	public void setlatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getlongitude() {
		return longitude;
	}
	public void setlongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getcreated() {
		return created;
	}
	public void setcreated(String created) {
		this.created = created;
	}

	
	
}
