package com.bridgelabz.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelNamesWhenAddedShouldReturnSize() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(3, hotel.hotelReservationList.size());
	}

	@Test
	public void givenDateRangeShouldReturnTheCheapestHotelRate() {
		HotelReservation obj = new HotelReservation();
		obj.addHotel();
		Assert.assertEquals(200, obj.findCheapestHotel("2020-09-11", "2020-09-12"));
	}

	@Test
	public void givenWeekDayWeekEndRatesShouldReturnThoseRates() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(90, hotel.hotelReservationList.get("Lakewood").getWeekendRate());
		Assert.assertEquals(50, hotel.hotelReservationList.get("Bridgewood").getWeekendRate());
		Assert.assertEquals(150, hotel.hotelReservationList.get("Ridgewood").getWeekendRate());
	}

	@Test
	public void givenWeekDayWeekEndRatesShouldReturnThoseRatings() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(3, hotel.hotelReservationList.get("Lakewood").getRating());
		Assert.assertEquals(4, hotel.hotelReservationList.get("Bridgewood").getRating());
		Assert.assertEquals(5, hotel.hotelReservationList.get("Ridgewood").getRating());
	}

	@Test
	public void givenDateRangeShouldReturnTheCheapestHotelRate1() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(200, hotel.findCheapestHotel("2020-09-11", "2020-09-12"));
	}

	@Test
	public void givenDateRangeShouldReturnTheCheapestHotelRate2() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(370, hotel.findBestRatedHotel("2020-09-11", "2020-09-12"));
	}

	@Test
	public void addSpecialRatesTest() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(80, hotel.hotelReservationList.get("Lakewood").getSpecialWeekdayRate());
		Assert.assertEquals(110, hotel.hotelReservationList.get("Bridgewood").getSpecialWeekdayRate());
		Assert.assertEquals(100, hotel.hotelReservationList.get("Ridgewood").getSpecialWeekdayRate());
	}

	@Test
	public void givenDateRangeShouldReturnTheCheapestBestRatedHotelforRewardCustomer() {
		HotelReservation hotel = new HotelReservation();
		hotel.addHotel();
		Assert.assertEquals(140, hotel.findCheapestHotelForRewardCustomer("2020-09-11", "2020-09-12"));
	}
	
	@Test
    public void givenDateRangeShouldReturnTheCheapestBestRatedHotelforRewardCustomer1() {
        HotelReservation hotel = new HotelReservation();
        hotel.addHotel();
        Assert.assertEquals(200, hotel.findCheapestHotel("2020-09-11", "2020-09-12"));
    }
	
	@Test
    public void givenDateShouldReturnTrueIfDateIsValid() {
        HotelReservation hotel = new HotelReservation();
        hotel.addHotel();
        Assert.assertTrue(hotel.isDateValid("2020-09-11", "2020-09-12"));
    }

}
