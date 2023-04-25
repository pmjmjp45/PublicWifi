package kr.ac.kopo.ctc.kopo14.service;

import kr.ac.kopo.ctc.kopo14.domain.WifiItem;

public class WifiItemService {

	public double getDistance(WifiItem item1, WifiItem item2) { // method to calculate distance
		/*
		 *  Pythagorean theorem
		 *  Math.pow(2,3) = 2^3 = 8
		 *  Math.sqrt(4) = root 4 = 2
		 */
		double dist = Math.sqrt(Math.pow(item1.getlatitude() - item2.getlatitude(), 2)  
				+ Math.pow(item1.getlongitude() - item2.getlongitude(), 2));
		
		return dist;
	}
}
