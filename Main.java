import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        String str = "inside";
        double r =Math.sqrt((a-0)*(a-0)+(b-0)*(b-0));
        if (r>100){
            str = "outside";}
        System.out.println(str);
        }
    }
