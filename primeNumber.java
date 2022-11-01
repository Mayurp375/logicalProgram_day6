public class primeNumber {
    public static void chack(){
        System.out.println("_______Prime Number_______");
        int prime = 60;

        for (int j = 2; j <= prime / 2; j++) {
            if (prime % j == 0) {
                System.out.println(j);
            }
        }
    }
}
