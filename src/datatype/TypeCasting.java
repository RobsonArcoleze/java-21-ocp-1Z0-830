package datatype;

public class TypeCasting {

    public static void main(String[] args) {
        int a = 124;
        long b = a;
        double c = b;

        System.out.println("int value: "+ a);
        System.out.println("long value: "+ b);
        System.out.println("double value: "+ c);

        System.out.println("--------------------------------");

        double d = 200.35;
        long e = (long) d;
        byte f = (byte) e;

        System.out.println("double value: " + d);
        System.out.println("long value: " + e);
        System.out.println("byte value: " + f);
    }
}
