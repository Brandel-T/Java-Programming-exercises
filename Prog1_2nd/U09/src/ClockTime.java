
public class ClockTime {

	int hour;
	int minute;
	int second;

	ClockTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	ClockTime(int h) {
		if ( h > 0 )
			while (h > 23) 
				h = h - 24;
		else
			while (h < 0)
				h = h + 24;
		
		hour = h;
		minute = 0;
		second = 0;
	}

	ClockTime(int h, int m) 
	{			 
		if ( m == 0 ) 
			minute = m; 
		else if ( m > 59 ) {
			hour = hour + m / 60;
			minute = m % 60; 
		} 
		else if ( m < 0 ) {
			int count = 0;
			while ( m >= 0 ) {
				m = m + 60;
				count++;
			}
			minute = m;
			hour = hour - count;
		}
		
		while ( h < 0 )  
			h = h + 60;  
		while ( h > 59 )  
			h = h - 60;  
		hour = h;
		
		second = 0;
	}

	ClockTime(int h, int m, int s) 
	{
		this( h , m ); /***/
		add ( s );
		
//		if ( s > 59 ) 
//		{			
//			int minUeberlauf = s / 60;
//			second = s % 60;  
//			
//			if ( minute + minUeberlauf > 59 ) 
//			{
//				int stdUeberlauf = (minute + minUeberlauf) / 60;
//				minute = (minute + minUeberlauf) % 60; 
//				
//				if ( h  + stdUeberlauf > 23 ) 
//				{
//					int hs = h  + stdUeberlauf;
//					while ( hs > 23 )
//						hs = hs - 24;
//					hour = hs; 				
//				} else 
//					hour = hour + stdUeberlauf;
//			} else
//				minute = minute + minUeberlauf;
//		} else
//			second = s;
		
	}

	ClockTime(ClockTime ct) {
		hour = ct.getHours();
		minute = ct.getMinutes();
		second = ct.getSeconds();
	}
	
	boolean same(ClockTime ct) {
		return getHours() == ct.getHours() && 
			   getMinutes() == ct.getMinutes() && 
			   getSeconds() == ct.getSeconds();
	}

	void add(int s) {
		/*
		 * second = (second + s) % 60;
				int min  = minute + (second + s) / 60;
				minute = min % 60;
				int hr = minute / 60;
				hour = hour + hr;
		 */
		if ( s > 0 )  
			if ( second + s > 59 ) {
//				second = (second + s) - 60;
				int min = minute + (second + s) / 60; 
				second = (second + s) % 60;  
				
				if ( min > 59 ) { // for minute == 59
					int hr = hour + (min/60);
					minute = min % 60;
					
					if ( hr > 23 ) // for hour == 23
						hour = 0;
					else  
						hour = hr;  
				} else 
					minute = min; 
			} else 
				second += s; 

		if ( s < 0 )
			if ( second + s < 0 ) {
				
				second = 60 + second + (s%60);  
				int min = minute + (s/60);
				minute = 60 + minute + s/60; 
				
				if (min < 0) { 
					int hr = hour + (min/60);
//					minute = 60 + (min%60);
					
					if (hr < 0)
						hour = 0;
					else
						hour = hr;
				} else
					minute = min;
//				second = (second + 60) - s; 
//				if ( minute > 0 )
//					minute -= 1;
//				else if ( minute == 0 ) {
//					minute = 59;
//					if ( hour == 0 )
//						hour = 23;
//					else if ( hour > 0 )
//						hour -= 1;
//				}
			} else
				second -= s;
	}
	
	int diff(ClockTime ct) 
	{		
		if ( this.same(ct) )
			return 0;
		else 
		{
			int sec = 0, min = 0, hr = 0;
			
			if ( ct.second - second < 0 ) {
				sec = 60 - (ct.second + second);
				
				min = minute + 1; // 1 = Ueberlauf von Sekunden
				if ( ct.minute - min < 0 ) {
					min = 60 -( ct.minute + min );
					
					hr = hour + 1; // 1 = Ueberlauf von Minuten
					if ( ct.hour - hr < 0 )
						hr = 24 - (ct.hour + hr);
					else
						hr = ct.hour - hour;
				} else 
					min = ct.minute - minute; 
			} else
				sec = ct.second - second;

			return hr*60*60 + min*60 + sec;
		}
		
	}
	
	int getSeconds() {
		return second;
	}
	
	int getMinutes() {
		return minute;
	}
	
	int getHours() {
		return hour;
	}
	
	void output() {
		if (getHours() >= 0 && getHours() < 10)
			System.out.print("0"+getHours());
		else if (getHours() >= 0 && getHours() > 9)
			System.out.print( getHours() );

		if (getMinutes() >= 0 && getMinutes() < 10)
			System.out.print(":0" + getMinutes() + ":");
		else if (getMinutes() >= 0 && getMinutes() > 9)
			System.out.print(":" + getMinutes() + ":");


		if (getSeconds() >= 0 && getSeconds() < 10)
			System.out.print("0" + getSeconds());
		else if (getSeconds() >= 0 && getSeconds() > 9)
			System.out.print(getSeconds());
		System.out.println();
	} 



	
	public static void main(String[] args) { 
		ClockTime time1 = new ClockTime();
		time1.output();
		time1.add(-56);
		time1.output();
		System.out.println( (-38%4) );
	}
}














