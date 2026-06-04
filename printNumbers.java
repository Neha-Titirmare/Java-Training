public class printNumbers {

    static void printNumber(int n) {

        // Base 
        if (n == 0) {
            return;
        }

        // Recursive 
        printNumber(n - 1);

        
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
}