package kr.ac.kopo.ctc.kopo14;

import java.io.IOException;
import java.util.List;
import kr.ac.kopo.ctc.kopo14.dao.WifiDao;
import kr.ac.kopo.ctc.kopo14.domain.WifiItem;
import kr.ac.kopo.ctc.kopo14.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WifiItemService wifiItemSevice = new WifiItemService(); 
		WifiDao wifiDao = new WifiDao(); 
		List<WifiItem> wifiItems; 
		
		try {
			wifiItems = wifiDao.selectAll(); // return ArrayList from WifiDao Class 
	
		WifiItem me = new WifiItem(); 
		
		me.setlatitude(37.3860521); // kopo
		me.setlongitude(127.1214038);
		
		double maxDist = Double.MIN_VALUE; // to save max distance
		double minDist = Double.MAX_VALUE; // to save min distance
		
		WifiItem max = null; // to save list of max distance
		WifiItem min = null; // to save list of min distance
		
		for (WifiItem target: wifiItems) {
			
			double dist = wifiItemSevice.getDistance(me, target); // get distance using WifiItemService Class
			
			if (dist > maxDist) { // if further than maxDistance, change values
				maxDist = dist;
				max = target;
			}
			if (dist < minDist) { // if nearer than minDistance, change values
				minDist = dist;
				min = target;
			}
		}		
		System.out.println("******The furthest wifi*****");
		System.out.printf(" Distance: %f\n", maxDist); 
		System.out.printf(" Installation Location Name : %s\n", max.getinstallationLocationName()); 
		System.out.printf(" Lot Number Address: %s\n", max.getlotNumberAddress()); 
		System.out.printf(" Latitude : %f\n", max.getlatitude());
		System.out.printf(" Longitude : %f\n", max.getlongitude()); 
		System.out.println("******The nearest wifi*****");
		System.out.printf(" Distance: %f\n", minDist); 
		System.out.printf(" Installation Location Name : %s\n", min.getinstallationLocationName()); 
		System.out.printf(" Lot Number Address: %s\n", min.getlotNumberAddress()); 
		System.out.printf(" Latitude : %f\n", min.getlatitude());
		System.out.printf(" Longitude : %f\n", min.getlongitude()); 
	
	} catch (Exception e) { 
		System.out.println("error1! general exception");
	}
	}
}
