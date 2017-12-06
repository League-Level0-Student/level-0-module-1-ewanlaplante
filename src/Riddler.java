import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane
				.showInputDialog("I am never with you but always behide you but never infront of you. What am I?")
				.toLowerCase();
		if (answer.equals("history")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Thats correct. Your score is" + score + "");
		} else {
			JOptionPane.showMessageDialog(null, "Thats incorrect. The correct answer is history.");
		}
		String answer1 = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?").toLowerCase();
		if (answer1.equals("a towel")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Thats correct. Your score is" + score + "");
		} else {
			JOptionPane.showMessageDialog(null, "Thats incorrect. The correct answer is a towel");
		}
		String answer3 = JOptionPane.showInputDialog("What has roots as nobody sees,\r\n" + "Is taller than trees.\r\n"
				+ "Up, up, up it goes,\r\n" + "And yet never grows?").toLowerCase();
		if (answer3.equals("a mountain")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Thats correct. Your score is" + score + "");
		} else {
			JOptionPane.showMessageDialog(null, "Thats incorrect. The correct answer is a mountain");
		}
		String answer4 = JOptionPane.showInputDialog(
				"Voiceless it cries,\r\n" + "Wingless flutters,\r\n" + "Toothless bites,\r\n" + "Mouthless mutters.")
				.toLowerCase();
		if (answer4.equals("wind")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Thats correct. Your score is" + score + "");
		} else {
			JOptionPane.showMessageDialog(null, "Thats incorrect. The correct answer is wind");

		}

	}
}