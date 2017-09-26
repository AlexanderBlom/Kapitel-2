import javax.swing.*;
/*
Skriver 03/14
Alexander Blom
2017/09/26
*/
public class Ovning2_9{
	public static void main(String[] args) {

		String a, b, c, d;


		a = " Erik Andersson 860314-2714 ";

		a = a.trim();
		int i = a.lastIndexOf(' ') + 1;
		int j = a.indexOf('-');
		b = a.substring(i, j);
		c = b.substring(4, 6);
		d = b.substring(2,4);

		JOptionPane.showMessageDialog(null,c + "/" + d);
	}
}
