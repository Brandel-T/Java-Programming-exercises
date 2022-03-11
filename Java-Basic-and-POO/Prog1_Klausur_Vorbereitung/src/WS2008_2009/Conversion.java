package WS2008_2009;

public class Conversion {

	Object o; Object[] oa;
	A a; B b; C c; D d;
	J j; I i;
	A[] aa; B[] ba;
	void f() {  
//	oa = (Object[]) a;
	oa = (Object[]) aa;
	oa = (Object[]) o;
	d = (D) a;
//	d = (D) b;
	d = (D) j;
	d = (D) o;
//	b = (B) aa;
	b = (B)(aa[0]);
	b = (B) c;
	j = (J) a;
//	j = (J) ba;
	j = (J) (ba[0]);
	j = (J) c;
	j = (J) i;
	}
	
}
