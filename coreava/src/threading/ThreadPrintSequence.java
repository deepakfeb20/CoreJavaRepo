package threading;

public class ThreadPrintSequence {

	public static void main(String[] args) {
        
		printSeq2 runnable1=new printSeq2(1);
		printSeq2 runnable2=new printSeq2(2);
		printSeq2 runnable3=new printSeq2(0);
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");
 
        t1.start();
        t2.start();
        t3.start(); 
	}

}

class PrintNumber implements Runnable{
	
	static int number =1;
    int maxNo = 10;
    int ThreadNo;
	
	static Object lock = new Object();
	
	PrintNumber(int ThreadNo){
		this.ThreadNo = ThreadNo;
	}

	@Override
	public void run() {
		while(number<=maxNo-1) {
			synchronized (lock) {
				while(number%3!=ThreadNo) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
		
	}
}
