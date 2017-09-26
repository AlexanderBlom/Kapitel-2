import javax.swing.*;
/*
Program som frågar efter namn och sedan skriver förnamnet i stora bokstäver.
Alexander Blom
2017/09/26
*/

public class Uppgift2_2{
	public static void main(String[] args) {
		
		String fNamn, namn;

		namn = JOptionPane.showInputDialog(null, 
											"Skriv först ditt efternamn och sen ditt förnamn");
		int fNamnPlac = namn.lastIndexOf(' ') + 1;
		fNamn = namn.substring(fNamnPlac);
		fNamn = fNamn.toUpperCase();

		JOptionPane.showMessageDialog(null, "Hej " + fNamn);
	}
}