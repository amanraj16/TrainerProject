package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.beans.Trainer;
import com.capgemini.dao.FeedbackDAO;
import com.capgemini.dao.FeedbackDAOImpl;

public class FeedbackServiceImpl implements FeedbackService {
	FeedbackDAO feedbackDAO=new FeedbackDAOImpl();
	@Override
	public void addFeedback(Trainer trainer) {
		feedbackDAO.addFeedback(trainer);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) {
		
		return feedbackDAO.getTrainerList();
	}

}
