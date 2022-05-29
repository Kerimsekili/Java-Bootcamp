public class TypeConvension {
    public static void main(String[] args) {
        byte b;
        int i = 260;
        int j = 21;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

        byte a = 40;
        byte r = 50;
        byte c = 100;
        int ba = a * r / c;


        //Automatic Type Promotion
        /*System.out.println(ba);*/
       /* {
            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;
            double result = (f * b) + (i / c) - (d * s);
            System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
            System.out.println("result = " + result);
        }*/




    }
}
