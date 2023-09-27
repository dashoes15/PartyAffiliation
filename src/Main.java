import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userParty;
        System.out.println("You will be asked to enter your party affiliation.");
        System.out.println("Enter an R, D, or I based on Republican, Democrat, or Independent:");
        if (scan.hasNext()) {
            userParty = scan.nextLine();
            if (userParty.equals("R")) {
                System.out.println("You get a republican ellephant");
            } else if (userParty.equals("D")){
                System.out.println("You get a democrat donkey.");
            }else if(userParty.equals("I")){
                System.out.println("You get a fence sitter");
            }else{
                System.out.println("You have entered something invalid. Try again.");
            }
        }else{
            System.out.println("You have not entered a string. Try again.");
            System.exit(0);
        }
    }
}