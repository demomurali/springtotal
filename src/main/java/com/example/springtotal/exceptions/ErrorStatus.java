package com.example.springtotal.exceptions;

import java.util.Date;

public class ErrorStatus {

	  private Date timestamp;
	  private String message;
	  private String details;
	  
	  public ErrorStatus(java.util.Date date, String message, String details) {
	    super();
	    this.timestamp = date;
	    this.message = message;
	    this.details = details;
	  }
}
