// Intro to switch cases and statement in java
import java.util.Scanner;

class Day {

    public static void main(String args[]){
        System.out.println("welcome to Faculty of Technology \n kindly type your dept ");
        Scanner word = new Scanner(System.in); 
        String Dept = word.next();

// writing the enhance format of the switch cases
    //   switch(Dept){
    //         case "Csc" -> {
    //             System.out.println("Department of Computer science and technology \n what level list you want to check ? :");
    //             Scanner level = new Scanner(System.in);
    //             int lev = level.nextInt();
    //                 switch (lev){
    //                     case 1 -> System.out.println("120 Students in first year");
    //                     case 2 -> System.out.println("117 students in sophomore");
    //                     case 3 -> System.out.println("212 Students available");
    //                 }
    //         }
    //         case "Orange" -> System.out.println("Testing layout");
    //         case "Guava" -> System.out.println("layout"); 
    //         default -> System.out.println("nothing is given");
    //     }

        switch(Dept){
            case "Csc":{
                System.out.println("Department of Computer science and technology \n what level list you want to check ? :");
                Scanner level = new Scanner(System.in);
                int lev = level.nextInt();
                    switch (lev){
                        case 1:
                            System.out.println("120 Students in first year");
                        break;
                        case 2:
                            System.out.println("117 students in sophomore");
                        break;
                        case 3:
                            System.out.println("212 Students available");
                        break;
                    }
            }
                break;
            case "Orange":
                System.out.println("Testing layout");
                break;
            case "Guava":
                System.out.println("layout");
                break;
            default:
                System.out.println("nothing is given");
        }

    }
}