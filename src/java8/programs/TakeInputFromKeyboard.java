package java8.programs;

import java.util.Scanner;

public class TakeInputFromKeyboard {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter username: ");
        String username=scanner.nextLine();
        System.out.print("Enter password: ");
        String password=scanner.nextLine();


        System.out.println("You entered username:"+username+" password:"+password);

        System.out.print("Enter username and password: ");
        String uname=scanner.next();
        String pwd=scanner.next();

        System.out.println("You entered username:"+uname+" password:"+pwd);
    }
}
