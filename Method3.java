
// Char array

public class Method3 {
	public static void main(String[] args) {
		String name = "Amritanshu";
		char[] charName = name.toCharArray();
		for(int i = charName.length -1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
}
