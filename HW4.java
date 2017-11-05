import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();
        switch (m){
            case 1 :
                if (d<=19)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
                break;
            case 2:
                if (d<=18)
                    System.out.println("Aquarius");
                else
                    System.out.println("Pisces");
                break;
            case 3:
                if (d<=20)
                    System.out.println("Pisces");
                else
                    System.out.println("Aries");
                break;
            case 4:
                if (d<=19)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
                break;
            case 5:
                if (d<=20)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
                break;
            case 6:
                if(d<=21)
                    System.out.printf("Gemini");
                else
                    System.out.printf("Cancer");
                break;
            case 7:
                if(d<=22)
                    System.out.printf("Cancer");
                else
                    System.out.printf("Leo");
                break;
            case 8:
                if(d<=22)
                    System.out.printf("Leo");
                else
                    System.out.printf("Virgo");
                break;
            case 9:
                if(d<=22)
                    System.out.printf("Virgo");
                else
                    System.out.printf("Libra");
                break;
            case 10:
                if(d<=23)
                    System.out.printf("Libra");
                else
                    System.out.printf("Scorpio");
                break;
            case 11:
                if(d<=22)
                    System.out.printf("Scorpio");
                else
                    System.out.printf("Sagittarius");
                break;
            case 12:
                if(d<=21)
                    System.out.printf("Sagittarius");
                else
                    System.out.printf("Capricorn");
                break;

        }
    }

}
