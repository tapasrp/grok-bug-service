package com.grok.bug;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bugs-service")
public class BugController {
	
	@CrossOrigin
	@GetMapping(path = "/all", produces = "application/json")
	public List<Bug> getBugs(){

		return Arrays.asList(
				new Bug("firstbug" , "high"),
				new Bug("secondbug" , "medium"),
				new Bug("thirdbug" , "low")
				);
		}

	}


