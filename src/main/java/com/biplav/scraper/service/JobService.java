package com.biplav.scraper.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.biplav.scraper.model.Job;

public class JobService {

	public static List<Job> scrapeJobs() {
		Document document=null;
		try {
			document=Jsoup.connect("https://merojob.com/search/?q=java&page=1").timeout(0).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = document.select(".row .job-card");
		List<Job> listJob=new ArrayList<>();
		
		for (Element element : elements) {
			String title=element.select("h1 a").text();
			String company=element.select("h3 a").text();
			String location=element.select("span[itemprop*=addressLocality]").text();
			String url="https://merojob.com"+element.select("h1 a").attr("href");
			String skills=element.select("span[itemprop*=skills]").text();
			String[] skillArray=skills.split(" ");
			
			System.out.println("Job: "+title);
			System.out.println("Company: "+company);
			System.out.println("Location: "+location);
			System.out.println("Url: "+url);
			
			List<String> skillsList=new ArrayList<>(); 
			for (String skill : skillArray) {
				skillsList.add(skill);
			}
			System.out.println("Skills: "+skillsList);
			System.out.println("---------------------------");
			Job job=new Job(title, company, location, skillsList, url);
			listJob.add(job);
		}
		
		System.out.println(listJob);
		
		return listJob;
	}
	
	public static void main(String[] args) {
		scrapeJobs();
	}

}
