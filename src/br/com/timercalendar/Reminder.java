package br.com.timercalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
	
	Timer timer;
	Calendar calendar;
	Date data;
	
	public Reminder(int seconds){
		timer=new Timer();
	    calendar = Calendar.getInstance();
	    calendar.set(Calendar.HOUR_OF_DAY, 19);
	    calendar.set(Calendar.MINUTE, 30);
	    calendar.set(Calendar.SECOND, 0);
	    data = calendar.getTime();
		timer.schedule(new RemindTask(),data);
	}
	
	
	public class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Time UP executado as "+ data.getHours()+":"+data.getMinutes()+":"+data.getSeconds()
			);
			
			
		}

	}

}
