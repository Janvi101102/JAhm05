package interthreadcommunication;


class P{
	
	int no;
    boolean valueSet = false;
	public  synchronized void getNo() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get = " + no);
		valueSet=false;
		notify();
	}

	public synchronized void setNo(int no) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("set = " + no);
		this.no = no;
		valueSet=true;
		notify();
	}
	
	
}
class Producer implements Runnable{
P p;

	
	public Producer(P p) {
	
	this.p = p;
	
	Thread th = new Thread(this,"Producer");
	th.start();
}


	@Override
	public void run() {
	int i=0;	
	while(true) {
		p.setNo(i++);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}

class Consumer implements Runnable{
	
	P p;
	
	
	public Consumer(P p) {
		 
		this.p = p;
		
		Thread th = new Thread(this,"Consumer");
		th.start();
	}


	@Override
	public void run() {
		
		int i=0;
		while(true) {
			
			p.getNo();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ProducerConsumerEx {

	public static void main(String[] args) {
		P p = new P();
		new Producer(p);
		new Consumer(p);
		 
	}

}
