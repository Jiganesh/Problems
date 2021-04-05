import java.util.Scanner;

public class ProblemX {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int n = scan.nextInt();

		while(n-- > 0){

			int pi = scan.nextInt();
			int qi = scan.nextInt();

			if (pi+2<=qi){
				count++;
			}

		}
		System.out.println(count);
		scan.close();


	}
}
