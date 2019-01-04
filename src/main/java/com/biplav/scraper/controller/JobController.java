package com.biplav.scraper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biplav.scraper.model.Job;
import com.biplav.scraper.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	private JobService jobService;
	@GetMapping
	public List<Job> scrapejob()
	{
		return this.jobService.scrapeJobs();
	}
}
