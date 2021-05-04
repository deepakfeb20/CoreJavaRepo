package threading;

public class ProducerConsumerObjDemo {

	public static void main(String[] args) {
		ProducerConsumerObj<Integer> obj = new ProducerConsumerObj<Integer>(10);
		Runnable p = ()->{
			for(int i=0;i<10;i++) {
			   obj.produce(i);	
			}
		};
		
		new Thread(p).start();
		new Thread(p).start();
		
		Runnable c = ()->{
			for(int i=0;i<10;i++) {
				obj.consumeOdd();	
			}
		};
		new Thread(c).start();
		new Thread(c).start();
	}
	
	public static int getItem() {
		return (int) Math.random();
	}

}
