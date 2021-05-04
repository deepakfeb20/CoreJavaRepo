package threading;

public class printSeq2 implements Runnable{
		 
	    public int PRINT_NUMBERS_UPTO=10;
	    static int  number=1;
	    int print = 0;
	    int remainder;
	    static Object lock=new Object();
	 
	    printSeq2(int remainder)
	    {
	        this.remainder=remainder;
	    }
	 
	    @Override
	    public void run() {
	        while (number < PRINT_NUMBERS_UPTO-1) {
	            synchronized (lock) {
	                while (number % 3 != remainder) { // wait for numbers other than remainder
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	                if(Thread.currentThread().getName().equals("T1") ) {
	                   print = 1;         	
	                }else if(Thread.currentThread().getName().equals("T2") ) {
		                   print = 2;         	
		                }else {
			                   print = 3;         	
		                }
	                
	                System.out.println(Thread.currentThread().getName() + " " + print);
	                number++;
	                lock.notifyAll();
	            }
	        }
	    }
	}

