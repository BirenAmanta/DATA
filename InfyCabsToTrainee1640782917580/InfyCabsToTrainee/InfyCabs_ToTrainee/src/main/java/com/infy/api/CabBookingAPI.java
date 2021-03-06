package com.infy.api;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.infy.dto.CabBookingDTO;
import com.infy.exception.InfyCabException;
import com.infy.service.BookingService;

public class CabBookingAPI {

	private BookingService bookingService;

	private Environment environment;

/*This is a REST controller method to book a cab. It accepts booking details as part of HTTP request body.
It invokes the bookCab() method of BookingServiceImpl, which returns a booking id.
It returns an object of ResponseEntity created using success message and HTTP status code as CREATED.
If any exception occurs its catch them and throw ResponseStatusException with HTTP status code as BAD_REQUEST along with message and the exception. */
	public ResponseEntity<String> bookCab(@RequestBody CabBookingDTO cabBookingDTO) throws InfyCabException {
		return null;
	}

/*This is a REST controller method to get cab booking details based on mobile number of user. 
It accepts mobileNo as path variable.
It invokes the getDetails() methods of BookingService which returns a List<CabBooking>.
It returns an object of ResponseEntity created using List<CabBooking> and HTTP status code as OK.
If any exception occurs it catches them and throw ResponseStatusException with HTTP status code as BAD_REQUEST along with message and the exception. */
	public ResponseEntity<List<CabBookingDTO>> getBookingDetails(@PathVariable Long mobileNo) throws InfyCabException {
		return null;
	}

/*This is a REST controller method to cancel cab booking based on bookingId. 
It accepts bookingId as path variable.
It invokes cancelBooking() method of BookingService.
It returns an object of ResponseEntity created using success message and HTTP status code as OK. 
If any exception occurs it catches them and throw ResponseStatusException with HTTP status code as BAD_REQUEST along with message and the exception.*/
	public ResponseEntity<String> cancelBooking(@PathVariable Integer bookingId) throws InfyCabException {
		return null;
	}

}
