package com.checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.checkin.integration.dto.Reservation;
import com.checkin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient{

	@Override
	public Reservation findReservation(int id) {

		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
	}

	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate1=new RestTemplate();
		Reservation postForObject = restTemplate1.postForObject("http://localhost:8080/flights/reservation", request, Reservation.class);
		return postForObject;
	}
}
