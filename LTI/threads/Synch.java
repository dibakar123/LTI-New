package pack;
class Printer {
   synchronized void job(String user) {
      System.out.print("[" + user +" starts printing ");
           try {  Thread.sleep(2000);  } 
           catch (Exception e) { }
      System.out.println("]");
   }
}

class Caller extends Thread {
   String user;   Printer p;  //Thread th;

   public Caller(Printer t, String s) {
      p = t;    user = s;
      this.start(); }
   
    public void run() { 
       //synchronized(p) { p.job(msg); }
    	 { p.job(user); }
   }
}


class Synch {
   public static void main(String args[]) {
      Printer x = new Printer();
     // Printer y = new Printer();
      Caller ob1 = new Caller(x, "Ram");
      Caller ob2 = new Caller(x, "Shyam");
      Caller ob3 = new Caller(x, "Jadu");
    }
}