package com.capgemini.dao;

import java.util.HashMap;

import com.capgemini.beans.Trainer;

public class FeedbackDAOImpl implements FeedbackDAO {
	HashMap<Integer,Trainer> feedbackList=new HashMap<>();
	@Override
	public void addFeedback(Trainer trainer) {
		int id=(int)DBUtil.generateID();
		feedbackList.put(id,trainer);
		
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList() {
	
		return feedbackList;
	}

}
