public class ReverseString {
	

	public static void main(String[] args) {
		String test1 = "cat";
		String test2 = "Tiger Woods";
		String test3 = "Mendacium";
		System.out.println(reverse(test1));
		System.out.println(reverse(test2));
		System.out.println(reverse(test3));
	}

	public static String reverse(String in) {
		//System.out.println(in.length());
		if (in.length() <= 1) {
			return in;
		} else {
			//System.out.println(in.substring(i));
			return reverse(in.substring(1)) + in.charAt(0);
		}
	}
}