//Compresses a string in the following format
// aaaddddcttttiiaa --> a3d4c1t4i2a2
//Or doesn't compress if the would-be output is longer than the input


public class compressString {
	
	static String compress(String in) {
		int count = 1;
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < in.length(); i++) {
			char cur = in.charAt(i);
			char next = in.charAt(i + 1);
			if (i + 2 == in.length()) {
				if (cur == next) {
					count++;
					out.append(Character.toString(cur) + count);
					break;
				} else {
					out.append(Character.toString(cur) + count);
					out.append(cur + "1");
					break;
				}
			} else {
				if (cur == next) {
					count++;
				} else {
					out.append(Character.toString(cur) + count);
					count = 1;
				}
			}
		}
		if (out.length() <= in.length()) {
			return out.toString();
		} else {
			return in;
		}
	}

	public static void main(String[] args) {
		String a = "aaaddddcttttiiaa";
		String b = "abcdefg";
		String c = "ttttuuuuiiiiiiiggiiii";
		String aSoln = "a3d4c1t4i2a2";
		String bSoln = "abcdefg";
		String cSoln = "t4u4i7g2i4";
		System.out.println(aSoln.equals(compress(a)));
		System.out.println(bSoln.equals(compress(b)));
		System.out.println(cSoln.equals(compress(c)));
	}
} 