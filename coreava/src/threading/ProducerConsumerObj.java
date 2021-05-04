package threading;

import java.util.LinkedList;
import java.util.Queue;


public class ProducerConsumerObj<E> {
	Queue<Integer> q;
	int max;
	
	Object lock = new Object();
	Object even = new Object();
	Object odd = new Object();
	ProducerConsumerObj(int max){
		this.max = max;
		this.q = new LinkedList<Integer>();
	}
	
	public void produce(Integer e) {
	   synchronized (lock) {	
		while(q.size() == max) {
			try {
				lock.wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		q.add(e);
		lock.notifyAll();
	  }	
	}
	
	public void consumeOdd() {
		synchronized (lock) {
		while(q.size() == 0) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Integer e = q.peek();
		if(e%2!=0) {
			System.out.println(q.remove());
		}
		//E e = q.remove();
		//System.out.println(e);
		lock.notifyAll();
	}
   }
	
	public void consumeEven() {
		synchronized (lock) {
		while(q.size() == 0) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(q.peek()%2==0) {
			System.out.println(q.remove());
		}
		//Integer e = q.remove();
		//System.out.println(e);
		lock.notifyAll();
	}
   }
}
