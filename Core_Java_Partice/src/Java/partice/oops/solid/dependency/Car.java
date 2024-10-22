package Java.partice.oops.solid.dependency;

public class Car {
	   // <write your code here>
	   private Engine engine;
	   
	   public Car(Engine engine){
	       this.engine = engine;
	   }
	   
	   public void start(){
	       engine.start();
	   }
	}
