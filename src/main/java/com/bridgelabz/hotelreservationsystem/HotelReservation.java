package com.bridgelabz.hotelreservationsystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotelReservation {

	Map<String, Hotel> hotelReservationList;

	public HotelReservation() {
		hotelReservationList = new HashMap<String, Hotel>();
	}

	/**
	 * Method for adding Hotel to the HotelReservationSystem
	 */
	public void addHotel() {
		Hotel hotel1 = new Hotel("Lakewood", 3, 110, 90, 80, 80);
		Hotel hotel2 = new Hotel("Bridgewood", 4, 150, 50, 110, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 5, 220, 150, 100, 40);

		hotelReservationList.put(hotel1.getHotelName(), hotel1);
		hotelReservationList.put(hotel2.getHotelName(), hotel2);
		hotelReservationList.put(hotel3.getHotelName(), hotel3);

		System.out.println(hotelReservationList);
	}
}
