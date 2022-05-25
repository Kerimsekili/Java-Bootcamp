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
