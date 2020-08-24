package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	double scoreDouble=Double.parseDouble(score);
	if (scoreDouble > 90) {
		JOptionPane.showMessageDialog(null, "You did really great!");
	}
	
	else if (scoreDouble > 70) {
		JOptionPane.showMessageDialog(null, "Great job, although you didn't quite show your full potential on this test!");
		
	}
	else if (scoreDouble > 50) {
		JOptionPane.showMessageDialog(null, "You didn't seem very prepared for this test");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Yikes");
	}
}
}
