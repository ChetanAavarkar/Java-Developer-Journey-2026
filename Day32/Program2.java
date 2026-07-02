package Day32;

class Box<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Generic Box Demo \n");
		
		Box<Integer> intBox = new Box<>();
		intBox.setItem(500);
		
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Java Programming");
		
		System.out.println("Integer Values: " + intBox.getItem());
		System.out.println("String Values: " + stringBox.getItem());

		System.out.println("\n Type of Integer Box: " + intBox.getItem().getClass().getSimpleName());
		System.out.println("\n Type of String Box: " + stringBox.getItem().getClass().getSimpleName());
	}
}
