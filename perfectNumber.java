public class perfectNumber {
     static void check(){
        int num = 28;
        int i = 1;
        int sum = 0;
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum = sum + i;

            }
        }

        if (sum == num) {
            System.out.println("ths is perfect number");
        } else {
            System.out.println("not a perfect number");
        }
    }
}
