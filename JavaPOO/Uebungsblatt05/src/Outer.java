public class Outer {
 public int a;
 public static int b;

 public class Inner1 {
 public int f( ) {
 return a;
 }
 public int g( ) {
 return b;
 }
 public int h( ) {
 return x(2, 3);
 }
 public int i( ) {
 return y( );
 }
 }

 public static class Inner2 {
 public int f( ) {
 return a;
 }
 public int g ( ) {
 return b ;
 }
 public int h ( ) {
 return x ( 2 , 3 ) ;
 }
 public int i ( ) {
 return y ( ) ;
 }
 }
 public int x (int c, final int d ) {
	  class Inner3 {
	  int e;
	  public int f( ) {
	  return a;
	  }
	  public int g( ) {
	  return b;
	  }
	  public int h( ) {
	  return x(2, 3);
	 
	  }
	  public int i( ) {
	  return y( ) ;
	  }
	  public int j( ) {
	  return c;
	  }
	  public int k( ) {
	  return d;
	  }
	  }
	  return e;
	  }
	 
	  public static int y( ) {
	  return new Inner1( ).f( );
	  }
	 }