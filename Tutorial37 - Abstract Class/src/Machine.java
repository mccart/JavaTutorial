
// abstract prevents Machine being instantiated / declared
public abstract class Machine {
	
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// forces subclass to implement method start()
	// similar to interface...
	public abstract void start(); 
	public abstract void doStuff(); 
	public abstract void shutdown(); 

	public void run() {
		start();
		doStuff();
		shutdown();
	}
}


// abstract class (identity) vs interface (functionality)

// only one parent allowed, multiple implements interface allowed

// abstract class can have code, interface no.



