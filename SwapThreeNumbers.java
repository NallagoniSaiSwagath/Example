public class SwapThreeNumbers {
    static void swapNumbers() {
        int a = 1, b = 2, c = 3;

        a = a + b + c;
        b = a - b - c;  // Now b = original a 1   
        c = a - b - c;  // Now c = original b 2
        a = a - b - c;  // Now a = original c 3

        System.out.println(a + " " + b + " " + c);  // Output: 3 1 2
    }

    public static void main(String[] args) {
        swapNumbers();
    }
}
