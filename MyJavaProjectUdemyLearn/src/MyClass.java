
public class MyClass {
	// fields-parameters-variables-int, float, double, boolean, String
	// constructor
	// methods
	int i = 5;// default value is 0

	public MyClass() {

	}

	public MyClass(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass(7);
		// myClass.initialize();

		System.out.println(myClass.i);
		String str = "Nariman";
		boolean flag = str.equalsIgnoreCase("Narsim");
	}

	public void initialize() {
		i = 5;
	}

}
//static
//final
