package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.beans.Trainer;

public interface FeedbackService {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rating);
}
