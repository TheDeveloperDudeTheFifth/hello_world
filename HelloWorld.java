public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.printMessage("Hello World");
	}

	public HelloWorld() {
		// Just an empty constructor for no obvious reason
		//comment for develop
	}

	public void printMessage(String message) {
		System.out.println(message);
	}
}