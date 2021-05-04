package threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class PCwithoutBlocking {

	public static void main(String[] args) {

	}

}

class MyBQueue<E> {
	private int size = 16;
	private Queue<E> queue;
	private ReentrantLock lock = new ReentrantLock(true);

	MyBQueue(int size) {
		this.size = size;
		queue = new LinkedList<>();
	}

	public void put(E e) {
		lock.lock();
		try {
			queue.add(e);
		} finally {
			lock.unlock();
		}

	}

	public E get() {
		lock.lock();
		try {
			E e = queue.remove();	
			return e;
		}finally {
			lock.unlock();
		}
	}
}
