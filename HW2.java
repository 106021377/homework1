import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if ( year % 4 == 0) {
            System.out.println("Bissextile Year");
        }
        else if ( year % 4 != 0 && year % 100 != 0) {
            System.out.println("Common Year");
        }
    }
}
