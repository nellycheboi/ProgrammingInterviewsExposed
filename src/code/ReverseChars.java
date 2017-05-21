package code;

public class ReverseChars {

	public static void main(String[] args) {
		puts(reverse("abcd"));

	}

	private static void puts(String str) {
		System.out.println(str);
		
	}

	private static String reverse(String str) {
		if(str.length()==1){
			return str;
		}
		return  reverse(str.substring(1))+str.charAt(0);
	}

}
