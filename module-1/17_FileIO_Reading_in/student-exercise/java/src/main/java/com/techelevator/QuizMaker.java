package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class QuizMaker {
//test_quiz.txt
	public static void main(String[] args) {
		System.out.print("Wheres yo quizzzzzzzzzzz at boi?");
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();
		File quiz = new File(path);
		int count = 0;
		int totalCount = 0;
		int answerToQuestion = 0;

		try (Scanner fileScan = new Scanner(quiz)) {
			while (fileScan.hasNextLine()) {
				totalCount++;
				String line = fileScan.nextLine();
				String[] breakpoints = line.split("\\|");
				for (int i = 0; i < breakpoints.length; i++) {
					if (breakpoints[i].contains("*")) {
						System.out.println(i + ". " + breakpoints[i].substring(0, breakpoints[i].length() - 1));
						answerToQuestion = i;
					} else if (i == 0)
						System.out.println(breakpoints[i]);
					else
						System.out.println(i + ". " + breakpoints[i]);

				}
				System.out.println("What is your answer?");

				String answer = input.next();
				if (Integer.parseInt(answer) == answerToQuestion) {

					System.out.println("Correct!");
					count++;
				} else {
					System.out.println("NOT CORRECT!");
				}

			}
		}

		catch (Exception e) {
			System.out.print("How did you break this quiz?!");
		}
		System.out.println(
				"You were right: " + count + " times! That's " + count + " out of " + totalCount + " correct!");
	}
}
