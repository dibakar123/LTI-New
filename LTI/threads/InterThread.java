package pack;
class Factory {

int num=0;
boolean value = false;
		
synchronized void get() {
	if (value==false) 
	    try {  wait(); }
	    catch (InterruptedException e) {}
        
        System.out.println("Accept Product: " + num);
        value=false;
        notify();
  }

synchronized void put(int a) {
	if (value==true) 
	    try { wait(); }
    	    catch (Exception e) {}
        
	num=a;
	System.out.println("Produce Product: " + num);
	value=true;
	notify();
   }
}

class Producer extends Thread {
	Factory s;
	
	Producer(Factory a) { s=a; start(); }

	public void run() {
 		int i=0;
                while(true){ s.put(++i); }
        }
  }

class Consumer extends Thread{
	Factory s;
	
	Consumer(Factory a) { s=a; start(); }

	public void run() {
		while(true){ s.get(); }
             }
}

public class InterThread{
	public static void main(String[] args) 	{
		Factory s=new Factory();
		new Producer(s);
		new Consumer(s);  }
}
