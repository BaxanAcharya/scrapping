package com.biplav.scraper.model;

import java.util.List;

public class Job {
	
	private String title;
	private String company;
	private String location;
	private List<String> skills;
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Job(String title, String company, String location, List<String> skills, String url) {
		super();
		this.title = title;
		this.company = company;
		this.location = location;
		this.skills = skills;
		this.url = url;
	}
	
	public Job() {
		super();
	}
	
	

}
