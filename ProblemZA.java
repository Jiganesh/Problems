import java.util.Scanner;

class ProblemZA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        while (n != 0) {

            String s = scan.nextLine().toLowerCase();
        
            if (s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u")) {
                System.out.println("lovely string");
            } else {
                System.out.println("ugly string");
            }

            n--;

        }
        scan.close();
    }
}