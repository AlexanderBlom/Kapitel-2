import javax.swing.*;
/*
Program som skriver Namn, adress och Nummer
Alexander Blom
2017/09/25
*/

public class Ovning2_1{
	public static void main(String[] args) {
		
		String Namn;
			Namn = "Alexander Blom";
		
		String Adress;
			Adress = "N Drottninggatan 40";
		
		String Nummer;
			Nummer = "076 779 75 33";
		
		String PersonligInfo;
			PersonligInfo = Namn+" "+Adress+" "+Nummer;
	
	JOptionPane.showMessageDialog(null, Namn+" "+Adress+" "+Nummer+" "+PersonligInfo);
	}
}