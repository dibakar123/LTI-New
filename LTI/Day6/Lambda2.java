package pack3;

import java.util.*;  
public class Lambda2{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("aaa");  
        list.add("mmm");  
        list.add("iii");  
        list.add("jjj");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  