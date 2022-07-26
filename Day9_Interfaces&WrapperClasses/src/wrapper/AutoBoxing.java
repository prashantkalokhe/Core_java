package wrapper;

//converting primitive types to its respective wrapper class objects : Autoboxing
public class AutoBoxing {

	public static void main(String[] args) {

		float x= 15.3f; //primitive type
		Float a = x; //converting primitive type to wrapper class
		Float f = new Float(10);
		System.out.println(x+ "  " +a+ "  " +f);
	}

}