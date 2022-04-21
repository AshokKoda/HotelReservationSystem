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
        Assert.assertEquals(220, obj.findCheapestHotel("2020-09-10", "2020-09-11"));
    }
}
