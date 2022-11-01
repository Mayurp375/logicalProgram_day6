public class reverseNumber {
    public static void check(){
        int number = 10;
        int i = 0;
        while (i >= 0)
        {
            for (i = 10; i >= number; i--) ;
            System.out.println(i);
            number--;

            //reminder calculator by modulo
            System.out.println("_____reminder calculator by modulo_____");
            int reminder = number % i;
            System.out.println(reminder);

            System.out.println("______multiply the reverse by 10 adding reminder into it_______");
            int multiplayer = number * 10 * reminder;
            System.out.println(multiplayer);
        }
        System.out.println(number);
    }
}
