package operator;

public class BitwiseBitshiftOperator {

    public static void main(String[] args) {
        System.out.println("------------------------ Bitwise AND (&) Operator ----------------------------");
        int number1 = 8; //1000
        int number2 = 9; //1001
        System.out.println("num1 in binary: " + Integer.toBinaryString(number1));
        System.out.println("num2 in binary: " + Integer.toBinaryString(number2));
        /*
           1000   (8)
        &  1001   (9)
        ---------
           1000   (resultado = 8)

           | Bit A | Bit B | A & B |
            | ----- | ----- | ----- |
            | 1     | 1     | 1     |
            | 1     | 0     | 0     |
            | 0     | 1     | 0     |
            | 0     | 0     | 0     |

         */
        System.out.println("num1 & num2 in binary: " + Integer.toBinaryString(number1 & number2));
        System.out.println("num1 & num2 in decimal: " + (number1 & number2));

        System.out.println("------------------------ Bitwise inclusive OR (|) Operator ----------------------------");
        int numberOR1 = 8; //1000
        int numberOR2 = 9; //1001
        System.out.println("numberOR1 in binary: " + Integer.toBinaryString(numberOR1));
        System.out.println("numberOR2 in binary: " + Integer.toBinaryString(numberOR2));
        System.out.println("numberOR1 | numberOR2 in binary: " + Integer.toBinaryString(numberOR1 | numberOR2));
        System.out.println("num1 | numberOR2 in decimal: " + (numberOR1 | numberOR2));

        System.out.println("------------------------ Bitwise exclusive OR (^) Operator ----------------------------");
        int numberORexc1 = 8; //1000
        int numberORexc2 = 9; //1001
                                //0001
        System.out.println("numberORexc1 in binary: " + Integer.toBinaryString(numberORexc1));
        System.out.println("numberORexc2 in binary: " + Integer.toBinaryString(numberORexc2));
        /*
        Retorna 1 quando os bits forem diferentes
         */
        System.out.println("numberORexc1 ^ numberORexc2 in binary: " + Integer.toBinaryString(numberORexc1 ^ numberORexc2));
        System.out.println("num1 ^ numberOR2 in decimal: " + (numberORexc1 ^ numberORexc2));


        System.out.println("------------------------ Signed Left Shift (<<) Operator ----------------------------");
        int number3 = 8; //1000 << 2 = 100000 = 32 decimal
        System.out.println("number3 in binary: " + Integer.toBinaryString(number3));
        /*
        << Move os bits para a esquerda
        ex: 8 = 1000 / 1000 << 2 = 32 em decimal por que moviementou os bits para a esquerda = 100000
         */
        System.out.println("number3 << 2 in binary: " + Integer.toBinaryString(number3 << 2));
        System.out.println("number3 << 2 in decimal: " + (number3 << 2));

        System.out.println("------------------------ Signed Right Shift (>>) Operator ----------------------------");
        int number4 = 8; //1000 >> 2 = 0010 = 2 decimal
        System.out.println("number4 in binary: " + Integer.toBinaryString(number4));
        /*
        << Move os bits para a Direita
         */
        System.out.println("number4 >> 2 in binary: " + Integer.toBinaryString(number4 >> 2));
        System.out.println("number4 >> 2 in decimal: " + (number4 >> 2));

        System.out.println("------------------------ Unary Bitwise Complement (~) Operator ----------------------------");
        int number5 = 8; //~1000 = 11111111 11111111 11111111 11110111 = -9
        System.out.println("number5 in binary: " + Integer.toBinaryString(number5));
        /*
        << Inverte os valores dos bits ~x = -(x + 1) / OBS: O int possue 32 bits
        então o 8 tipado com inteiro seria = 00000000 00000000 00000000 00001000
         */
        System.out.println("~number5 in binary: " + Integer.toBinaryString(~number5));
        System.out.println("~number5  in decimal: " + (~number5)); //~x = -(x + 1) // ~8 = -(8 + 1) = -9

    }
}
