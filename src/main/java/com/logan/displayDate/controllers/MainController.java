package com.logan.displayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class MainController {

	private Date date = new Date();
	private String[] getDate() { return date.toString().split( " " ); }
	
	@SuppressWarnings("deprecation")
	private String getTime() {
		String formattedTime = "";
		
		if ( date.getHours() > 12 ) {
			formattedTime += date.getHours() - 12;
			formattedTime += ":" + date.getMinutes() + " PM";
		} else {
			formattedTime += date.getHours();
			formattedTime += ":" + date.getMinutes() + " AM";
		}

		return formattedTime;
	}
	
	@RequestMapping( "/date" )
    public String date( Model model ) {
		model.addAttribute( "day", getDate()[ 0 ] );
		model.addAttribute( "month", getDate()[ 1 ] );
		model.addAttribute( "date", getDate()[ 2 ] );
		model.addAttribute( "year", getDate()[ 5 ] );

        return "date.jsp";
    }
	
	@RequestMapping( "/time" )
	public String time( Model model ) {
		model.addAttribute( "time", getTime() );
		
		return "time.jsp";
	}

}
