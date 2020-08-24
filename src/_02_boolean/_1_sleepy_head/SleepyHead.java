package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************ SLEEPY HEAD **************************/
		boolean isWeekend=false;
		// Write code to ask the user what day it is.
		String day = JOptionPane.showInputDialog("What day of the week is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equals("saturday") || day.equals("sunday")) {
			isWeekend = true;
		}

		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend) {
			JOptionPane.showMessageDialog(null, "You can sleep in.");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
			JOptionPane.showMessageDialog(null, "Go to school.");
		}

		/************************ STAR STUDENT **************************/

		boolean passedExam = false;
		// Write code to ask the user what percentage they scored in their last exam
		String score = JOptionPane.showInputDialog("What did you score on your last exam?");
		int scoreInt = Integer.parseInt(score);
		// If they scored more than 70, they passed the exam.
		if (scoreInt > 70) {
			// Set the boolean passedExam based on their score.
			passedExam = true;
			// If the user passed the exam, congratulate them
		}

		if (passedExam) {
			JOptionPane.showMessageDialog(null, "Congratulations! You didn't fail :D");
		}

		else {

			// otherwise, wish them better luck next time.
			JOptionPane.showMessageDialog(null, "Better luck next time.");
		}
		/************************ GAME OVER **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over.
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;

			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over"
JOptionPane.showMessageDialog(null, "game is over");
		/*********************** RED SQUARE ********************/

		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed
		// variable
String color = JOptionPane.showInputDialog("What color do you want to draw with?");
if (color .equals("red")) {
	isRed = true;
}


		boolean isSquare = false;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare
		// variable
String whatShape = JOptionPane.showInputDialog("What shape do you want to draw with?");
if (whatShape .equals("square")) {
	isSquare = true;
}
		// Now you MUST use the && operator to join the booleans for this code.
if (isSquare && isRed) {
	drawRedSquare();
}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use
		// the method below)
		// otherwise, tell the user you don't know how to draw that shape
else {
	JOptionPane.showMessageDialog(null, "No can do (((:");
}
	}

	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setPenColor(Color.RED);
		rob.penDown();
		for (int i = 0; i<4; i++) {
			rob.move(50);
			rob.turn(90);
		}
		}
		// Complete the rest of this method
	}

