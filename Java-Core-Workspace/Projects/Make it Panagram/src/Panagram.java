
public class Panagram {
	public int minimumAlphabet(String str) {
		boolean check[] = new boolean[26];
		int trs = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch >= 'a' && ch <= 'z') 
				check[ch-'a'] = true;
		}for(int i = 0; i < 26; i++) {
			if(check[i] == false) {
				trs++;
			}
		}
		return trs;
		
	}
}
