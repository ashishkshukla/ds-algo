package algo.generic;

public class CloudJumpHackerRank {
	public static void main(String[] args) {
		int clouds[] = { 1, 0, 1, 1, 0, 1, 0, 0, 1, 0 };
		int jump = 2;
		int energy = jumpingOnClouds(clouds, jump);
		System.out.println("Energy left " + energy);
	}

	static int jumpingOnClouds(int[] c, int k) {
		int energy = 100;
		int n = c.length;
		int i = 0;
		while ((i + k) % n != 0) {
			if (c[(i + k) % n] == 1) {
				energy = energy - 3;
			} else {
				energy = energy - 1;
			}
			i = (i + k) % n;
		}
		if (c[0] == 1)
			return energy - 3;
		else
			return energy - 1;
	}
}
