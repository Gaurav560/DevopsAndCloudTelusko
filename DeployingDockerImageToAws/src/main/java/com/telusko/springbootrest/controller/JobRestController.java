package com.telusko.springbootrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.service.JobService;

@RestController	
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	
	

	@GetMapping("Jobs")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
		
	}
	
	
	
	@GetMapping("/Job/{postId}")
	public JobPost getJob(@PathVariable int postId) {
		return service.getJob(postId);
	}
	
	
	@GetMapping("Job/keyword/{keyword}")
	public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
		return service.search(keyword);
		
	}
	

	@PostMapping("Job")
	public JobPost addJob(@RequestBody JobPost jobPost) {
		service.addJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
		
	@PutMapping("Job")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		service.updateJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
	
	
	
	@DeleteMapping("Job/{postId}")
	public String deleteJob(@PathVariable int postId)
	{
		service.deleteJob(postId);
		return "Deleted";
	}
	
	
	@GetMapping("load")
	public String loadData() {
		service.load();
		return "success";
	}


}
