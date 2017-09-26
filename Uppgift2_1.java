import javax.swing.*;
import java.util.*;

/*
Program som skriver tiden
Alexander Blom
2017/09/26
*/

public class Uppgift2_1{
	public static void main(String[] args) {
		
		String tidDat, Tid;

		tidDat = Calendar.getInstance().getTime().toString();

		Tid = tidDat.substring(11, 20);

		JOptionPane.showMessageDialog(null, "Klockan är: " + Tid);
	}
}