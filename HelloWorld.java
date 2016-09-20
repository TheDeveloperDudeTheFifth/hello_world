public class HelloWorld {

	public HelloWorld() {
		// Just an empty constructor for no obvious reason
	}

	public static void main(String[] args) {
		printMessage("Hello World");
	}

	private void printMessage(String message) {
		System.out.println(message);
	}
}