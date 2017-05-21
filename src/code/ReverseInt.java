package code;

public class ReverseInt {

	public int reverseInt(int fwd) {
		return reverseInt(fwd, 0);
	}

	private int reverseInt(int fwd, int bwd) {
		if (fwd / 10 == 0) {
			return fwd + bwd * 10;
		}

		return reverseInt(fwd / 10, (bwd * 10 + fwd % 10));
	}

	private void puts(int n) {
		System.out.println(n);
	}

	public boolean isAllOdd(int n) {
		while ((n % 10) % 2 != 0) {
			puts(n);
			n = n / 10;
		}
		return (n == 0 );
	}
}
