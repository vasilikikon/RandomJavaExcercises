
public class exactlyDivededByAll {

	public static void main(String[] args) {
		int result = 2520;
		for (int i = 1; i < 1000000000; i++) {
			result = i;
			if (result % 9 == 0 && result % 8 == 0 && result % 7 == 0 && result % 6 == 0 && result % 5 == 0 &&
					result % 10 == 0 && result % 11 == 0 && result % 12 == 0 && result % 4 == 0 && result % 3 == 0
					&& result % 13 == 0 && result % 14 == 0 && result % 15 == 0 && result % 2 == 0
					&& result % 16 == 0 && result % 17 == 0 && result % 18 == 0 && result % 19 == 0 && result % 20 == 0) {
				System.out.println(result);

			}
		}
	}
}