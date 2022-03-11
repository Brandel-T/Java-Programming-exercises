public class Roman {
	public static void main(String[] args) {
		System.out.println("Bitte tragen Sie erst die numerische Zahl ein, danach die roemische Zahl.");
		System.out.println();

		int n = Integer.parseInt(args[0]);
		String m = args[1];

		if (n > 4999) {
			System.out.println("Bitte geben Sie eine kleinere Zahl ein. Die roemischen Zahlen gehen nur bis 4999.");
		} else {
			System.out.println("Die Zahl lautete: " + n);
			System.out.println("Die roemische Zahl lautet nun: " + numberRoman(n));
			if (n > 3999) {
				System.out.println(
						"Die Zahl ist leider zu gross fuer die Subtraktionsregel. Die Zahl geht hoechstens bis 3999.");
			} else {
				System.out.println("Mit Subtraktionsregel: " + numberRomanSub(n));
				System.out.println();
			}
		}
		if (m.isEmpty()) {
			System.out.println("Bitte geben Sie Ihre roemische Zahl ein.");
		} else {
			System.out.println("Die roemische Zahl lautete: " + m);
			if (romanNumber(m) > 4999) {
				System.out
						.println("Die roemischen Zahlen reichen nur bis 4999. Bitte geben Sie eine kleinere Zahl ein.");
			} else {
				System.out.println("Die Zahl lautet nun ohne Subtratkionsregel: " + romanNumber(m));
			}
			if (romanNumberSub(m) > 3999) {
				System.out.println(
						"Die eingegebene Zahl ist groesser als 3999. Deswegen kann die Zahl nicht mit der Subtraktionsregel angezeigt werden.");
			} else {
				System.out.println("Mit Subtraktionsregel: " + romanNumberSub(m));
			}
		}
	}

	static String numberRoman(int x) {
		String s = "";
		while (x >= 1000) {
			s += toRoman(1000);
			x -= 1000;
		}
		while (x >= 500) {
			s += toRoman(500);
			x -= 500;
		}
		while (x >= 100) {
			s += toRoman(100);
			x -= 100;
		}
		while (x >= 50) {
			s += toRoman(50);
			x -= 50;
		}
		while (x >= 10) {
			s += toRoman(10);
			x -= 10;
		}
		while (x >= 5) {
			s += toRoman(5);
			x -= 5;
		}
		while (x >= 1) {
			s += toRoman(1);
			x -= 1;
		}
		return s;
	}

	static String numberRomanSub(int x) {
		String s = "";
		while (x >= 1000) {
			s += toRomanSub(1000);
			x -= 1000;
		}
		while (x >= 900) {
			s += toRomanSub(900);
			x -= 900;
		}
		while (x >= 500) {
			s += toRomanSub(500);
			x -= 500;
		}
		while (x >= 400) {
			s += toRomanSub(400);
			x -= 400;
		}
		while (x >= 100) {
			s += toRomanSub(100);
			x -= 100;
		}
		while (x >= 90) {
			s += toRomanSub(90);
			x -= 90;
		}
		while (x >= 50) {
			s += toRomanSub(50);
			x -= 50;
		}
		while (x >= 40) {
			s += toRomanSub(40);
			x -= 40;
		}
		while (x >= 10) {
			s += toRomanSub(10);
			x -= 10;
		}
		while (x >= 9) {
			s += toRomanSub(9);
			x -= 9;
		}
		while (x >= 5) {
			s += toRomanSub(5);
			x -= 5;
		}
		while (x >= 4) {
			s += toRomanSub(4);
			x -= 4;
		}
		while (x >= 1) {
			s += toRomanSub(1);
			x -= 1;
		}
		return s;
	}

	static String toRomanSub(int x) {
		String s = "";
		switch (x) {
		case 1000:
			s = "M";
			break;
		case 900:
			s = "CM";
			break;
		case 500:
			s = "D";
			break;
		case 400:
			s = "CD";
			break;
		case 100:
			s = "C";
			break;
		case 90:
			s = "XC";
			break;
		case 50:
			s = "L";
			break;
		case 40:
			s = "XL";
			break;
		case 10:
			s = "X";
			break;
		case 9:
			s = "IX";
			break;
		case 5:
			s = "V";
			break;
		case 4:
			s = "IV";
			break;
		case 1:
			s = "I";
			break;
		}
		return s;
	}

	static String toRoman(int x) {
		String s = "";
		switch (x) {
		case 1000:
			s = "M";
			break;
		case 500:
			s = "D";
			break;
		case 100:
			s = "C";
			break;
		case 50:
			s = "L";
			break;
		case 10:
			s = "X";
			break;
		case 5:
			s = "V";
			break;
		case 1:
			s = "I";
			break;
		}
		return s;
	}

	static int romanNumber(String s) {
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			char x = s.charAt(j);
			i += toNumber(x);
		}
		return i;
	}

	static int romanNumberSub(String s) {
		int i = 0;
		if (s.contains("CM")) {
			i += 900;
			s = s.replace("CM", "");
		}
		if (s.contains("CD")) {
			i += 400;
			s = s.replace("CD", "");
		}
		if (s.contains("XC")) {
			i += 90;
			s = s.replace("XC", "");
		}
		if (s.contains("XL")) {
			i += 40;
			s = s.replace("XL", "");
		}
		if (s.contains("IX")) {
			i += 9;
			s = s.replace("IX", "");
		}
		if (s.contains("IV")) {
			i += 4;
			s = s.replace("IV", "");
		}

		for (int j = 0; j < s.length(); j++) {
			char x = s.charAt(j);
			i += toNumber(x);
		}
		return i;
	}


	static int toNumber(char s) {
		int i = 0;
		switch (s) {
		case 'M':
			i = 1000;
			break;
		case 'D':
			i = 500;
			break;
		case 'C':
			i = 100;
			break;
		case 'L':
			i = 50;
			break;
		case 'X':
			i = 10;
			break;
		case 'V':
			i = 5;
			break;
		case 'I':
			i = 1;
			break;
		}
		return i;
	}

}
