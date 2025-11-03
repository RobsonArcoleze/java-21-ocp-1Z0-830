package numbers;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numbers {
    public static void main(String[] args) {

        System.out.println("--------------- Octal Numbers -------------");
        //Octal
        //Octal numbers: 0-7

        int octalNumber1 = 015;//this will stored as 13 in decimal
        int octalNumber2 = 0104;//this will stored as 68 in decimal
        int sumOctalNumbers = octalNumber1 + octalNumber2;//81 in decimal

        System.out.println("octalNumber1= " + octalNumber1);
        System.out.println("octalNumber2= " + octalNumber2);
        System.out.println("sumOctalNumbers= " + sumOctalNumbers);
        System.out.println("sumOctalNumbers result em Octal= " + Integer.toOctalString(sumOctalNumbers));

        System.out.println("--------------- Hexadecimal Numbers -------------");
        int hexNumber1 = 0x1B0;//432 in decimal
        int hexNumber2 = 0x2F;//0-9 A-F 47 in decimal
        int sumHexNumbers = hexNumber1 + hexNumber2;// 479 in decimal

        System.out.println("hexNumber1= " + hexNumber1);
        System.out.println("hexNumber2= " + hexNumber2);
        System.out.println("sumHexNumbers= " + sumHexNumbers);
        System.out.println("sumHexNumbers result em Hex= " + Integer.toHexString(sumHexNumbers));

        System.out.println("--------------- Binary Numbers -------------");
        int binNumber1 = 0b1001; //9 in decimal
        int binNumber2 = 0b1011; //20 in decimal
        int sumBinNumbers = binNumber1 + binNumber2; //20 in decimal

        System.out.println("binNumber1= " + binNumber1);
        System.out.println("binNumber2= " + binNumber2);
        System.out.println("sumBinNumbers= " + sumBinNumbers);
        System.out.println("sumBinNumbers result em Hex= " + Integer.toBinaryString(sumBinNumbers));

    }
}