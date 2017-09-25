import javax.swing.*;
/*
Program som skriver "ramsa" med bokstäverna från Programspråk.
Alexander Blom
2017/09/25
*/

public class Ovning2_8{
	public static void main(String[] args) {
		
		String a, b;

		a = "Programspråk";
		b = a.substring(4, 8) + a.charAt(5);

		JOptionPane.showMessageDialog(null, b);	
	}
}