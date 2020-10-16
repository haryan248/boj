import java.util.Scanner;

public class Main {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();

	static void Hanoi(int N, int from, int temp, int to) {
		count++;
		if (N == 1) {
			sb.append(from + " " + to + "\n");
			return;
		} else {
			Hanoi(N - 1, from, to, temp);
			sb.append(from + " " + to + "\n");
			Hanoi(N - 1, temp, from, to);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Hanoi(N, 1, 2, 3);
		System.out.println(count);
		System.out.print(sb);
		sc.close();
	}

}