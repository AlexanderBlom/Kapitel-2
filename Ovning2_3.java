import javax.swing.*;
/*
Program som Frågar efter ditt för och efternamn
Alexander Blom
2017/09/25
*/


public class Ovning2_3{
	public static void main (String[] arg) {
		
		String fornamn;
		String efternamn;

		fornamn = JOptionPane.showInputDialog("Vad är ditt förnamn?");
		efternamn = JOptionPane.showInputDialog("Vad är ditt efternamn?");
		JOptionPane.showMessageDialog(null, fornamn + " " + efternamn);
	}
}