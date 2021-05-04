package threading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerCondsumerProblem {

	static int i=0;
	public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
        Runnable p = ()->{
        	while(true) {
        		try {
					q.put(getItem());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        };
        new Thread(p).start();
        new Thread(p).start();
        
        Runnable c = ()->{
        	while(true) {
        		int itm;
				try {
					itm = q.take();
					System.out.println(itm);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        };
        
        new Thread(c).start();
        new Thread(c).start();
        
       Thread.sleep(2000);
	}
	
	static int getItem() {
		return i++;
	}

}
