package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Feedback;
import edu.swjtuhc.demo.service.FeedbackService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	FeedbackService feedbackservice;
		
	@RequestMapping("/proposal")
	public JSONObject proposal(@RequestBody Feedback feedback) {
		JSONObject result = new JSONObject();
		
		
		int i = feedbackservice.proposal(feedback);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/update")
	public JSONObject update(@RequestBody Feedback feedback) {
		JSONObject result = new JSONObject();
		
		
		int i = feedbackservice.update(feedback);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/Fdelete")
	public JSONObject Fdelete(@RequestBody Feedback feedback) {
		JSONObject result = new JSONObject();
		
		
		int i = feedbackservice.Fdelete(feedback);
		
		result.put("state",i);
		return result;
	}
	@RequestMapping("/get")
	public List<Feedback> get(){
		return feedbackservice.getSelectfeedback();
	}
}
