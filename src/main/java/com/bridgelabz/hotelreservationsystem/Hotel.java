package com.bridgelabz.hotelreservationsystem;

public class Hotel {

	String hotelName;
	int rating;
	int weekdayRate;
	int weekendRate;
	int specialWeekdayRate;
	int specialWeekendRate;

	public Hotel(String hotelName, int rating, int weekdayRate, int weekendRate, int specialWeekdayRate,
			int specialWeekendRate) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRate = weekdayRate;
		this.weekendRate = weekendRate;
		this.specialWeekdayRate = specialWeekdayRate;
		this.specialWeekendRate = specialWeekendRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getWeekdayRate() {
		return weekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	public int getSpecialWeekdayRate() {
		return specialWeekdayRate;
	}

	public void setSpecialWeekdayRate(int specialWeekdayRate) {
		this.specialWeekdayRate = specialWeekdayRate;
	}

	public int getSpecialWeekendRate() {
		return specialWeekendRate;
	}

	public void setSpecialWeekendRate(int specialWeekendRate) {
		this.specialWeekendRate = specialWeekendRate;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekdayRate=" + weekdayRate
				+ ", weekendRate=" + weekendRate + ", specialWeekdayRate=" + specialWeekdayRate
				+ ", specialWeekendRate=" + specialWeekendRate + "]";
	}

}
