package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Feedback;


public interface FeedbackService {
	public int proposal(Feedback feedback);
	public int update(Feedback feedback);
	public int Fdelete(Feedback feedback);
	public List<Feedback> getSelectfeedback();
}
