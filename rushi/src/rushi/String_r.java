package rushi;

public class String_r {
public static void main(String args[]) {
	String s4= "I am rushikesh";
	String s1 = s4.toUpperCase();
	System.out.println(s1.toUpperCase());
	String s2[] = s1.split(" ");
	for(int i=0;i<s2.length;i++) {
		
		String s = s2[i];
		char s3= s.charAt(0);
		System.out.print(" "+ s3);
		
	}
	
	
}
}
