package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {

	public static void main(String[] args) {
      
		ScheduledExecutorService exe = Executors.newScheduledThreadPool(10);
		/*
		 * exe.execute(()->{ System.out.println("hello"); });
		 */
		exe.schedule(()->System.out.println("hello"), 10, TimeUnit.SECONDS);
		exe.scheduleAtFixedRate(()->System.out.println("hello"), 10, 15, TimeUnit.SECONDS);
		exe.scheduleWithFixedDelay(()->System.out.println("hello"), 10, 20, TimeUnit.SECONDS);
	}

}
