package WS2008_2009;

public class MailAccount {

	private String[ ][ ] messages = new String[250][2];
	private int count = 0;
	private String password = null;
	
	public MailAccount( String password ) {
		this.password = password;
	}
	
	public void newMessage( String subject, String content ) throws MailboxOverflowException {
		
		if ( count >= 250 )
			throw new MailboxOverflowException();
		messages[count][0] = subject;
		messages[count][1] = content;
		count++;
	}
	
	public void printMessage( String password, int nr ) throws WrongPasswordException, NotAvailableException {
		if ( ! this.password.equals(password) )
			throw new WrongPasswordException();
		
		if ( messages[nr][0]==null || messages[nr][1] == null )
			throw new NotAvailableException("Mail existiert nicht");
		System.out.println( "Subject: "+messages[nr][0] );
		System.out.println( "Content: "+messages[nr][1] );
	}
	
	public static void main(String[] args) {
		MailAccount ma = new MailAccount("Pain"); 
		try {
			ma.printMessage("pain", 1);
			ma.newMessage("m1", "first msg"); 
		} catch (WrongPasswordException | NotAvailableException e) { 
			e.printStackTrace();
		} catch ( MailboxOverflowException e ) {
			e.printStackTrace();
		}
	}
}
