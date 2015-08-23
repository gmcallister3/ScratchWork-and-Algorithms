public class StrPermutation {
	
	static boolean permutation(String in1, String in2) {
		int[] a = new int[256];
		int[] b = new int[256];
		String strA = in1.toLowerCase();
		String strB = in2.toLowerCase();
		int lengA = strA.length();
		if (lengA != strB.length()) {
			return false;
		} else {
			for (int i = 0; i < lengA; i++) {
				a[strA.charAt(i)]++;
				b[strB.charAt(i)]++;
			}
			for (int i = 0; i < 256; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "care";
		String s1s = "race";
		String s2 = "graham";
		String s3 = "magarh";
		System.out.println("s1 & s1s: " + permutation(s1,s1s));
		System.out.println("s2 & s1s: " + permutation(s2,s1s));
		System.out.println("s2 & s3: " + permutation(s2,s3));
	}
}