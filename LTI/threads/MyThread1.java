package pack;

public class MyThread1 implements Runnable{  Thread t;
	
   public MyThread1(String a){	t = new Thread(this,a); 	t.start(); }
   
   
	public void run(){
		for( int i=1 ; i<=10; i++){
			System.out.println(i+  "  " + t.getName() );
			try{ t.sleep(1000);}  catch(Exception e){}
			
		}
		
	}
	
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1("AAAA"); 
		MyThread1 th2 = new MyThread1("BBBB"); 
	}

}
