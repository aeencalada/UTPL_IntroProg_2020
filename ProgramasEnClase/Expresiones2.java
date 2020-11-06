public class Expresiones1 {
	public static void main(String[] args) {
		int r = (int) (2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / Math.pow(5,2));
		//int r = 2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 25;
		System.out.println(r);
		boolean x = 12 >= 12 || 8 > 4 && 22 < 21;
		System.out.println(x);
		boolean y = true || false && (true || !(false || true && true));
		System.out.println(y);
		boolean z = 'G' < 'B';
		System.out.println(z);
	}
}