import javax.swing.*;
/*
Program som plockar ut det första och sista ordet ur en mening.
Alexander Blom
2017/09/27
*/
public class Uppgift2_3{
	public static void main(String[] args) {
		
		String mening, ord1, ord2;
		int meningAntal, ord1Plac, ord2Plac;

		mening = JOptionPane.showInputDialog(null,"Skriv en mening med minst två ord.");
		meningAntal = mening.length();
		mening = mening.trim();
		ord1Plac = mening.indexOf(" ");
		ord2Plac = mening.lastIndexOf(" ") + 1;
		ord1 = mening.substring(0, ord1Plac);
		ord2 = mening.substring(ord2Plac);


		JOptionPane.showMessageDialog(null, "Du skrev en mening med " + meningAntal + " ord." + 
										"\n Det forsta ordet var " + ord1 +
										"\n Det sista ordet var " + ord2 );
	}
}