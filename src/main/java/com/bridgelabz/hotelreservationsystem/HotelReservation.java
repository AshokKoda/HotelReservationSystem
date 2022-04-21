package com.bridgelabz.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotelReservation {

	Map<String, Hotel> hotelReservationList;
	static Scanner sc;

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

	/**
	 * Method for inputting the dates from user
	 */
	public void enterDates() {
		sc = new Scanner(System.in);
		System.out.println("Enter the 2 dates in yyyy-mm-dd format: ");
		String date1 = sc.nextLine();
		String date2 = sc.nextLine();
		findCheapestHotel(date1, date2);
	}

	/**
	 * Method for finding the cheapest Hotel for given dates
	 *
	 * @param d1 day1 is passed as String parameter
	 * @param d2 day2 is passed as String parameter
	 * @return returns the cheapest total rates
	 */
	public int findCheapestHotel(String d1, String d2) {
		DayOfWeek day1 = LocalDate.parse(d1).getDayOfWeek();
		DayOfWeek day2 = LocalDate.parse(d2).getDayOfWeek();

		List<Hotel> hotelList = hotelReservationList.values().stream()
				.sorted(Comparator.comparing(Hotel -> Hotel.weekdayRate)).collect(Collectors.toList());
		System.out.println(" The cheapest hotel is " + hotelList.get(0).getHotelName() + ", Rating : "
				+ hotelList.get(0).getRating() + ", Total Rates = $" + hotelList.get(0).getWeekdayRate() * 2);
		return (hotelList.get(0).getWeekdayRate() * 2);
	}
}
