import javax.swing.*;
/*
Skriver stora och lilla danska Ö
Alexander Blom
2017/09/25
*/

public class Ovning2_6{
	public static void main (String[] arg) {

		char c1;
		char c2;
		String s;

		c1 = '\u00D8';
		c2 = '\u00F8';
		s = "" + c1 + c2;

		JOptionPane.showMessageDialog(null, s);
	}
}