
public class ProfBuero extends Buero {

	private String profName;
 
	 
	public static int pruefung(Raum[] raeume) {
		int anz = 0;
		for (Raum r : raeume) {
			if ( r instanceof ProfBuero )
				anz++;
		}
		return anz;
	}

}