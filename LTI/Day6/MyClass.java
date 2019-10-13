package pack2;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone{
	public int version() default 1;
    public String os();
}


@Smartphone(os = "Android")
class LGSeries{
	public String model;

	public LGSeries(String model) {
		super();
		this.model = model;
	}
	
}

public class MyClass {

	public static void main(String[] args) {
        LGSeries lg = new LGSeries("ABC");
        System.out.println(lg.model);
        Class c = lg.getClass();
        Annotation ano = c.getAnnotation(Smartphone.class);
        Smartphone s =(Smartphone)ano;
        System.out.println(s.os()+" "+s.version());
        
	}
}
