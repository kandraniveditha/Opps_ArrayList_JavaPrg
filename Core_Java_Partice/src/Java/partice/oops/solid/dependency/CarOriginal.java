package Java.partice.oops.solid.dependency;

public class CarOriginal {

	 private EngineOriginal engine;

	    public CarOriginal() {
	        this.engine = new EngineOriginal();
	    }

	    public void start() {
	        engine.start();
	    }
	}

	class EngineOriginal {
	    public void start() {
	        System.out.println("Engine started.");
	    }
}
