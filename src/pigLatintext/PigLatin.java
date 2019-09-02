package pigLatintext;

public class PigLatin {
	public StringBuilder pigLatinConverter(String string) {
		String arr[] = string.split(" ");
		StringBuilder piglatin = new StringBuilder();
		for(String a:arr) {
			StringBuilder sb = new StringBuilder();
			System.out.println(a);
			sb.append(a.substring(1, a.length()));
			sb.append(a.charAt(0));
			sb.append("ay");
			piglatin.append(sb+" ");
		}
		return piglatin;
	}
}
