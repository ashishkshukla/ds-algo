package ds.array;

public class AngryProfessorHackerRank {
	public static void main(String[] args) {
		int[] studentTimings = { 2, 4, -2, -1, 2, 3, 11, -4, 1, 5 };
		int minimumStudent = 3;
		String classReopen = angryProfessor(minimumStudent, studentTimings);
		System.out.println("Professor ,Has Today's class been cancelled ? - " + classReopen);
	}

	static String angryProfessor(int k, int[] a) {
		int totalStudent = a.length;
		int lateStudent = 0;
		for (int arrivalTime : a) {
			if (arrivalTime > 0)
				lateStudent += 1;
			if (lateStudent > (totalStudent - k)) {
				return "YES";
			}
		}
		return "NO";
	}
}
