public class HelloWorld {
        //psvm-Creating main method Shortcut
        public static void main(String[] args) {
            double d = 9.5;
            //sout println

            System.out.println(Double.MAX_VALUE);
            System.out.println(Float.MAX_VALUE);
            //Lokal methodlarda primitiv tiplerde tip ve değer stackte durur. ama objelerde(localde) değişken stackte ama
            //obje heapte durur.
            int number1 = 10;
            int number2 = 20;
            number1 = number2;
            System.out.println("number1=" + number1);

            double a = 3.0, b = 4.0;
            // c is dynamically initialized
            double c = Math.sqrt(a * a + b * b);
            System.out.println("Hypotenuse is " + c);


            int x;
            for(x = 0; x < 3; x++) {
                int y = -1; // y is initialized each time block is entered
                System.out.println("y is: " + y); // this always prints -1
                y = 100;
                System.out.println("y is now: " + y);
            }



            // int[] numbers1 = {1, 2, 3};
            // int[] numbers2 = {10, 20, 30};
            // numbers1 = numbers2;
            // numbers2[0] = 100;
            // System.out.println("numbers1[0]=?" + numbers1[0]);
//
//
            // String city1 = "Los Angeles";
            // String city2 = "New York";
            // city1 = city2;
            // city2 = "London";
            // System.out.println(city1);

        }
        //strictfp !



}
