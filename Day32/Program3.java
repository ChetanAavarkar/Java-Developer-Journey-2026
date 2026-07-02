package Day32;

public class Program3 {
	
	public static <T> void printData(T data) {
		System.out.println("Data: " + data);
		System.out.println("Type: " + data.getClass().getSimpleName());
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		System.out.println(" Generic Method Demo \n");
		
		printData(100);
		
		printData("Hello Generics!");
		
		printData(99.99);
		
		printData(true);
		printData(new Character('A'));
	}
}
