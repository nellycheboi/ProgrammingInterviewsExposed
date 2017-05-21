package code;

public class WordPermutations {
	public static void main(String[] args) {
		permute("1234");

	}

	static void permute(String str) {
		int length = str.length();
		boolean[] used = new boolean[length];
		StringBuffer out = new StringBuffer();
		char[] in = str.toCharArray();
		doPermute(in, out, used, length, 0);
	}

	static void doPermute(char[] in, StringBuffer out, boolean[] used, int length, int level) {
		if (level == length) {
			System.out.println(out.toString());
			return;
		}
		for (int i = 0; i < length; ++i) {
			if (used[i])
				continue;
			out.append(in[i]);
			// System.out.print(" "+in[i]);
			used[i] = true;
			doPermute(in, out, used, length, level+1);
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}

}
