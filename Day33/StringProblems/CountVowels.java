package Day33.StringProblems;

public class CountVowels {
	
	public static int countVowels(String s) {
		int count = 0;
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
		int result = countVowels(input);
		System.out.println("Number of vowels: " + result);
	}
}
