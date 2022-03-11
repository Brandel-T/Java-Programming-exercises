
public class NegativNumberException extends Exception
{ 
	/**
	 * la_classe Exception a un constructeur_prennant un
	 * string en parametre_permettant d'afficher un message
	 * 
	 * --> la_classe "NegativNumberException" va_donc hériter_de ce_constructeur
	 */
	
	private String message;
	
	public NegativNumberException()
	{ 
	}
	
	public NegativNumberException(String message)
	{
		this.message = message;  
	}
	
	public String getMessage() {
		return message;
	}
	
}
