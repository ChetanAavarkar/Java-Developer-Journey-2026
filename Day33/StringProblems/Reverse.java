package Day33.StringProblems;

public class Reverse {
	public static String reverse(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	public static void main(String[] args) {
		String input = "Hello";
		String output = reverse(input);
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + output);
	}
}
