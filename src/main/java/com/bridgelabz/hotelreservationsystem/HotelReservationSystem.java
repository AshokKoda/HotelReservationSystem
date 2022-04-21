package com.bridgelabz.hotelreservationsystem;

public class HotelReservationSystem {

	public static void main(String[] args) {
		System.out.println("************** Welcome to Hotel Reservation System **************");
		HotelReservation hotel = new HotelReservation();
		System.out.println("<-------------------------- Hotels -------------------------->");
		hotel.addHotel();
		//System.out.println("<-------------------------- Enter Dates -------------------------->");
		//hotel.enterDates();
		System.out.println("<-------------------------- Show Cheapest Hotels -------------------------->");
		hotel.findCheapestHotel("2020-09-11", "2020-09-12");
		System.out.println("<-------------------------- Show Best Hotels -------------------------->");
		hotel.findBestRatedHotel("2020-09-11", "2020-09-12");

	}

}
