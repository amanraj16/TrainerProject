package com.capgemini.view;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.beans.Trainer;
import com.capgemini.service.FeedbackServiceImpl;

public class Client {
	static FeedbackServiceImpl feedbackServiceImpl=new FeedbackServiceImpl();
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		showMenu();

		
	}
	private static void showMenu() {
		while(true)
		{
			System.out.println("Please select your choice from below");
			System.out.println("Press 1 to enter trainer details");
			System.out.println("Press 2 to show trainers details by entering trainer rating");
			System.out.println("Press 3 to exit system");
			System.out.println("Enter your choice");
			int ch=scanner.nextInt();
			switch(ch)
			{
			case 1:addTrainer();
				   break;
			case 2:showTrainerDetails();
				   break;
			case 3:System.exit(0);
			default:System.out.println("Invalid choice entered");
			}
		
	}

}
	private static void showTrainerDetails() {
		System.out.println("Enter rating value greater than 0 and less than equal to 5");
		int rating=scanner.nextInt();
		HashMap<Integer,Trainer> list=feedbackServiceImpl.getTrainerList(rating);
		for(Map.Entry<Integer,Trainer>i:list.entrySet())
		{
			System.out.println("Trainer Details");
			System.out.println("NAME: "+i.getValue().getName());
			System.out.println("COURSE NAME: "+i.getValue().getCourseName());
			System.out.println("START DATE: "+i.getValue().getStartDate());
			System.out.println("END DATE: "+i.getValue().getEndDate());
			System.out.println("RATING: "+i.getValue().getRating());
			System.out.println();
		}
		
	}
	private static void addTrainer() {
		System.out.println("Enter Trainer Details");
		System.out.println("Enter Trainer name");
		String name=scanner.next();
		System.out.println("Enter Trainer's Course Name");
		String course=scanner.next();
		System.out.println("Enter START DATE");
		System.out.println("Enter day of month");
		int sDay=scanner.nextInt();
		System.out.println("Enter month");
		int sMonth=scanner.nextInt();
		System.out.println("Enter year");
		int sYear=scanner.nextInt();
		System.out.println("Enter END DATE");
		System.out.println("Enter day of month");
		int eDay=scanner.nextInt();
		System.out.println("Enter month");
		int eMonth=scanner.nextInt();
		System.out.println("Enter year");
		int eYear=scanner.nextInt();
		System.out.println("Enter Trainer Rating");
		int rating=scanner.nextInt();
		Trainer trainer=new Trainer(name,course,LocalDate.of(sYear, sMonth, sDay),LocalDate.of(eYear, eMonth, eDay),rating);
		feedbackServiceImpl.addFeedback(trainer);
		System.out.println("Trainer details added successfully");
	}
}
