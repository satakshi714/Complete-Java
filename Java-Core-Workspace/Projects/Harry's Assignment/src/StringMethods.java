
public class StringMethods {
	public int convertToInt(StringPlay sp, String str) {
		int x = Integer.parseInt(str);
		sp.convert = x;
		return sp.convert;
	}
	public int getMax(StringPlay sp, String str, char ch) {
		int total = 0;
		for(int i: str.toCharArray()) {
			if(i == ch) {
				total += 1;
			}
		}
		sp.max = total;
		return sp.max;
	}
}
