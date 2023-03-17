package OopsConcept;

// Parent/Base/Super class
// Abstraction class created
abstract class Honda{
	// Abstract method
	abstract void run();
	// Non-abstract method
	public void safe() {
		System.out.println("running safely...");
		// Cons
		
	}
	int speed;
	// Creating Constructor of abstract class
	Honda(int speed){
		System.out.println("Parent class Contructor...");
		this.speed = speed;
	}
}
// creating child/Derived/Sub class
//Inheriting abstracted class
public class Activa extends Honda{
	//Child class constructor
	Activa(){
		// Calling Parent class constructor
		super(100);
		System.out.println("Child class Constructor...");
		
	}
	void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		Honda h = new Activa(); 
		//Activa n = new Activa();
		h.run();
		//n.run();
		//n.safe();
		h.safe();

	}

}
