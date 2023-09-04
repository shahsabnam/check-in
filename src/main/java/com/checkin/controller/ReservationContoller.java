package com.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.checkin.integration.dto.ReservationUpdateRequest;
import com.checkin.integration.ReservationRestfulClientImpl;
import com.checkin.integration.dto.Reservation;

@Controller
public class ReservationContoller {
	
	@Autowired
	private ReservationRestfulClientImpl reservationRestfulClientImpl;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id")int id , ModelMap modelMap) {
		Reservation foundReservation = reservationRestfulClientImpl.findReservation(id);
	modelMap.addAttribute("foundReservation", foundReservation);
		return "displayReservation";
	}
	
	@RequestMapping("proceedToCheckIn")
	public String proceedToCheckIn(@RequestParam("id")int id, @RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest request=new ReservationUpdateRequest();
		 request.setId(id);
		 request.setNumberOfBags(numberOfBags);
		 request.setCheckedIn(true);
		 
		  reservationRestfulClientImpl.updateReservation(request) ;
		 
		return "confirmBoarding";
		
	}
}