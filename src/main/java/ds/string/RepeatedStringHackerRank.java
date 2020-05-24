package ds.string;

public class RepeatedStringHackerRank {
	public static void main(String[] args) {
    String s="epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
    long n=549382313570l;
    System.out.println(repeatedString(s, n));
    		
	}

	static long repeatedString(String s, long n) {
		long out = 0l;
		int count = 0;
		int sLnegth = s.length();
		int[] countArray = new int[sLnegth];
		for (int i = 0; i < sLnegth; i++) {
			if (s.charAt(i) == 'a') {
				count = count + 1;
			}
			countArray[i] = count;
		}

		long repeat = n / sLnegth;

		out = repeat * count;
		int remain = (int) (n % sLnegth);
		if (remain > 0) {
			out = out + countArray[remain - 1];
		}

		return out;

	}
}
