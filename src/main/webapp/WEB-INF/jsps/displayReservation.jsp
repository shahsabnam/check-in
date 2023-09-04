<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
<script>
        function toggleCustomInput() {
        	const dropdown = document.getElementById("bagOptions");
        	const customInput = document.getElementById("customBagInput");

            const selectedValue = bagOptions.value;

            if (dropdown.value === "custom") {
                customInput.style.display = "block";
            } else {
                customInput.style.display = "none";
            }
        }
    </script>
</head>
<body>
	<h2> Details of your Reservation</h2>
	Reservation Id:${foundReservation.getId()}<br/>
	Passenger Name: ${foundReservation.getPassenger().getFirstName()}<br/>
	Phone: ${foundReservation.getPassenger().getPhone()}<br/>
	Email: ${foundReservation.getPassenger().getEmail()}<br/>
	No Of Bags: ${foundReservation.getNumberOfBags()}<br/>
	Operating Airlines: ${foundReservation.getFlight().getOperatingAirlines()}<br/>
	 Departure City: ${foundReservation.getFlight().getDepartureCity()}<br/>
	Arrival City: ${foundReservation.getFlight().getArrivalCity()}<br/>
	  Date Of Departure ${foundReservation.getFlight().getDateOfDeparture()}<br/>
	  
	  <h2>Update No. of Bags</h2>
	  <form action="proceedToCheckIn" method="post">
	
	Reservation Id: <input type="text" name="id" value="${foundReservation.getId()}" readonly />
    No. of Bags:  <select name="numberOfBags" id="bagOptions" onchange="toggleCustomInput()">
    		<option >Select</option>
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="custom">Custom</option>
        </select>
        <input type="number" name="customNumberOfBags" id="customBagInput" style="display: none" placeholder="Enter custom value">
  <br/>
  
     
        
	  <button type="submit">Update</button>
	 
	  </form>
	   
	

</body>

</html>