package operator;

public class UnaryOperator {

    public static void main(String[] args) {
        double number = 7.6;
        boolean ischeck = true;

        System.out.println("+number: " + +number);
        System.out.println("-number: " + -number);
        System.out.println("++number: " + ++number);
        System.out.println("--number: " + --number);
        System.out.println("!ischeck: " + !ischeck);

        System.out.println("-------------------------------------");

        double result = 4.6;
/*
result++ → pós-incremento → usa o valor atual, depois soma +1

++result → pré-incremento → soma +1 primeiro, depois usa o valor atualizado

result-- → pós-decremento → usa o valor atual, depois subtrai 1
 */
        System.out.println("result = " + result);
        System.out.println("result++ = " + result++);
        System.out.println("result-- = " + result--);
        System.out.println("result = " + result);
        System.out.println("++result = " + ++result);
        System.out.println("result = " + result);
    }
}
