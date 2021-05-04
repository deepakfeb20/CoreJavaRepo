package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->System.out.println(1));
		Thread t2 = new Thread(()->System.out.println(2));
		Thread t3 = new Thread(()->System.out.println(3));
        
		ExecutorService es = Executors.newFixedThreadPool(10);
		for(int i=1;i<=10;i++) {
			es.execute(t1);
			es.execute(t2);
			es.execute(t3);
		}
	}

}
