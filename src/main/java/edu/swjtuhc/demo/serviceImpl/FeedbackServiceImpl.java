package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.FeedbackMapper;
import edu.swjtuhc.demo.model.Feedback;

import edu.swjtuhc.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired
	FeedbackMapper feedbackmapper;
	
	@Override
	public int proposal(Feedback feedback) {
		// TODO Auto-generated method stub
		Feedback f = feedbackmapper.selectfeedbackByuName(feedback.getuName());
		
		int i = -1;
		if(f==null) {
			i=feedbackmapper.insertFeedback(feedback);
		}else {
			i=2;
		}
		return i;
	}
	public int update(Feedback feedback) {
		//TODO Auto-generated method stub
		Feedback user2 = feedbackmapper.selectfeedbackByuName(feedback.getuName());
		
		int i = -1;
		if(user2!=null) {
				i= feedbackmapper.updateFeedbackByuName(feedback);
		}else {
			i=2;
		}
		return i;
	}
	public int Fdelete(Feedback feedback) {
		//TODO Auto-generated method stub
		Feedback user2 = feedbackmapper.selectfeedbackByuName(feedback.getuName());
		
		int i = -1;
		if(user2!=null) {
				i= feedbackmapper.deleteFeedbackByuName(feedback);
		}else {
			i=2;
		}
		return i;
	}
	public List<Feedback> getSelectfeedback() {
		// TODO Auto-generated method stub
		return feedbackmapper.selectAllFeedback();
	}
	
}
