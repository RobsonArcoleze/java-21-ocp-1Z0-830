package inputoutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InputOutput {
    public static void main(String[] args) {

        System.out.printf("%S", "hello");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        var number = sc.nextInt();
        System.out.println("You entered " + number);
        sc.close();
    }
}