package ds.string;

public class StringCopy {
	public static void main(String[] args) {
		String source = "Hello";
		String target = "dsd";
		target = strcpy(source, target);
		System.out.println(target);
	}

	public static String strcpy(String source, String target) {
        if(!target.isEmpty()) target="";
		return strcpy(source, target, 0);

	}

	public static String strcpy(String source, String target, int charIndex) {
		if (charIndex == source.length())
			return target;
		else {
			target = target + source.charAt(charIndex);
			charIndex++;
			return strcpy(source, target, charIndex);
		}
	}

}
