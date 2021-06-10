
// Two Pointer swap
public class Method5 {

	public static void main(String[] args) {
		// String to reverse
		String name = "Reverse A String";
		
		// converting to char array
		char[] c = name.toCharArray();
		
		// one pointer at begin
		int begin=0;
		
		// one at end
	    int end=c.length-1;
	    
	    // one to store value and swap
	    char temp;
	    
	    // looping and swapping
	    while(end>begin){
	        temp = c[begin];
	        c[begin]=c[end];
	        c[end] = temp;
	        end--;
	        begin++;
	    }
	    
	    //printing
	    System.out.println(String.valueOf(c));
	}

}
