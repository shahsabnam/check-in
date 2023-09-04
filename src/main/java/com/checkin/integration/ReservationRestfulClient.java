package com.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.checkin.integration.dto.Reservation;
import com.checkin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(int id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
