package com.tts.mapsapp;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MapController {
	@Autowired
	private MapService mapService;

	@GetMapping("/")
	public String getDefaultMap(Model model) {
		model.addAttribute(new Location());
		return "index";
	}

	@PostMapping("/")
	public String getMapForLocation(@RequestParam String Submit, Location location, Model model) {
		if (Submit.equals("Submit")) {
			mapService.addCoordinates(location);
		} else {
			Random rand = new Random();
			Double lat = (rand.nextDouble() * -120.0) + 60.0;
			Double lng = (rand.nextDouble() * -360.0) + 180.0;
			location.setLat(lat.toString());
			location.setLng(lng.toString());
			mapService.setLocationFromLatLng(location);
		}
		model.addAttribute(location);
		return "index";
	}
}
