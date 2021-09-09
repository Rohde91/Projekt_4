import java.time.LocalDate;
import java.time.Month;

public class main {

    public static void printAmerica(String day, int date, String month, int year){
        System.out.println(day + date + month + year);
    }

    public static void printEurope(String day, int date, String month, int year){
        System.out.println(day + date + month + year);
    }

    public static void main(String[] args) {

        printAmerica("Thursday, ", 8, ", Sep, ", 2021);
        printEurope("Thursday, ", 8, ", Sep, ", 2021);
    }

    //Assignment 2
    /*
    public static void main(String[] args) {
        zippo("rattle", 13);
    }
    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        }
        else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }
    //Answers here!
    // 4.2.1/   First executed line = line 30
    // 4.2.2/   Second line = line 33
                Third line = line 23
    //4.2.3/    Pas
    //4.2.4     Pas
    */

    //Assignment 3
    /*
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }
    //4.3.1/    Cant draw
    //4.3.2/    No, I wug.
    //          You wugga wug.
    //          I wug.
    */
}
