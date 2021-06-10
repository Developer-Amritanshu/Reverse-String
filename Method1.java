
// Using String builder and String buffer

public class Method1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Amritanshu");
		StringBuffer sbf = new StringBuffer("Rawat");
		System.out.println("String Builder: "+ sb.reverse().toString());
		System.out.println("String Buffer: " + sbf.reverse().toString());
	}
}
