package com.checkin.integration.dto;

public class ReservationUpdateRequest {
	
	private int id;
	private	int numberOfBags;
	private boolean checkedIn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkIn) {
		this.checkedIn = checkIn;
	}

}
