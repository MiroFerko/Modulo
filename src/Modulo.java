public class Modulo {
    //task - find all prime numbers using modulo operator
    public static void main(String[] args) {
        //loop for all numbers up to 50
        for (int i = 1; i <= 50; i++) {
            boolean divisorFound = false;
            //test if i is prime
            for (int j = 2; j <= i / 2; j++) {

                //check for remainder
                if (i % j == 0) {
                    divisorFound = true;
                    break;
                }
            }
            //if theres no more divisor print result
            if (!divisorFound) {
                System.out.println("Found prime number : " + i);
            }
        }
    }
}



