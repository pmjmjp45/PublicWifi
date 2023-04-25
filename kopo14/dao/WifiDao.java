package kr.ac.kopo.ctc.kopo14.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo14.domain.WifiItem;

public class WifiDao {

	//create
//	public WifiItem create(WifiItem wifiItem) {
//		return null;
//	}
//	//read
//	public WifiItem selectOne(int id) {
//		return null;
//	}
	public List<WifiItem> selectAll() { // data input method
		
		List<WifiItem> ret = new ArrayList<>(); // return ArrayList
		File f = new File("C:\\Users\\kopo14\\Desktop\\PublicWifi.txt"); // connect to txt file
		BufferedReader br; 
		
		try {
			br = new BufferedReader(new FileReader(f)); 
		
		String readtxt= br.readLine(); // read field name line

		while ((readtxt = br.readLine()) != null) { 
			String[] field = readtxt.split("\t");
			WifiItem wifi = new WifiItem(); 
			wifi.setid(Integer.parseInt(field[0]));
			wifi.setinstallationLocationName(field[1]);
			wifi.setinstallationLocationDetails(field[2]);
			wifi.setinstallationCityName(field[3]);
			wifi.setinstallationDistrictName(field[4]);
			wifi.setinstallationFacilityType(field[5]);
			wifi.setserviceProviderName(field[6]);
			wifi.setwifiSSID(field[7]);
			wifi.setdateOfInstallation(field[8]);
			wifi.setroadNameAddress(field[9]);
			wifi.setlotNumberAddress(field[10]);
			wifi.setmanagementAgencyName(field[11]);
			wifi.setmanagementAgencyPhoneNumber(field[12]);
			wifi.setlatitude(Double.parseDouble(field[13]));
			wifi.setlongitude(Double.parseDouble(field[14]));
			wifi.setcreated(field[15]);
			
			ret.add(wifi); // add wifi to return ArrayList
		} 
		br.close(); // close the BufferedReader object

		} catch (IOException e) { 
			System.out.println("error2! IOException");
		} catch (Exception e) {
			System.out.println("error2! general exception");
		}
		return ret; 
	
		
	}
	
//	// update
//	public WifiItem update(WifiItem wifiItem, int id) {
//		return null;
//	}
//	
//	// delete
//	
//	public WifiItem delete(int id) {
//		return null;
//	}
}
