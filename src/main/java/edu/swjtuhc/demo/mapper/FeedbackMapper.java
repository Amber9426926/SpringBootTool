package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Feedback;


@Mapper
public interface FeedbackMapper {
	public Feedback selectfeedbackByuName(String uName);
	public int insertFeedback(Feedback feedback);
	public int updateFeedbackByuName(Feedback feedback);
	public int deleteFeedbackByuName(Feedback feedback);
	public List<Feedback>selectAllFeedback();
}
