package threading;

public class ThreadSeq123 {
	
	static int n=1;

	public static void main(String[] args) {
        Object lock = new Object();
        
        Thread t1 = new Thread(()->{
        	synchronized (lock) {
        	for(int i=0;i<5;i++) {
        		while(n%3!=1) {
        			try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        		}
        		System.out.println(1);
        		n++;
        		lock.notifyAll();
        	}
           }
        });
        Thread t2 = new Thread(()->{
        	synchronized (lock) {
        	for(int i=0;i<5;i++) {
        		while(n%3!=2) {
        			try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        		}
        		System.out.println(2);
        		n++;
        		lock.notifyAll();
        	}
           }
        });
        Thread t3 = new Thread(()->{
        	synchronized (lock) {
        	for(int i=0;i<5;i++) {
        		while(n%3!=0) {
        			try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
        		}
        		System.out.println(3);
        		n++;
        		lock.notifyAll();
        	}
           }
        });
        t1.start();
        t2.start();
        t3.start();
	}

}
