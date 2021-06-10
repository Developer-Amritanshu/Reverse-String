
// String Concatenation

public class Method2 {
	public static void main(String[] args) {
		String name = "Amritanshu Dev Rawat";
		String rev = "";
		for(int i = name.length()-1;i>=0;i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
	}
}
