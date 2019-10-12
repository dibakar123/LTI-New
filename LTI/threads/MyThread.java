package pack;

public class MyThread extends Thread {
	
	public MyThread(String a){	super(a);	}
	
	public void run(){
		for( int i=1 ; i<=10; i++){
			System.out.println(i+  "  " + getName() );
			try{ sleep(1000);}  catch(Exception e){}
			
		}
		
	}

	public static void main(String[] args) {
		MyThread th1 = new MyThread("AAAA"); th1.start();
		MyThread th2 = new MyThread("BBBB"); th2.start();

	}

}
