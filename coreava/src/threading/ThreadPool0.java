package threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool0 {

	public static void main(String[] args) {
         int count = Runtime.getRuntime().availableProcessors();
         System.out.println(count);
         ExecutorService executor = Executors.newFixedThreadPool(count);
         for(int i=0; i< 10; i++) {
        	 executor.execute(()->{
        		 System.out.println("hello");
        	 });
         }
	}

}
