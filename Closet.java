// Java implementation to find the number closest to n
// and divisible by m
class Main {
    
    public static void main(String[] args) {
        int n = 13, m = 4;
        System.out.println(closestNumber(n, m));
    }
    static int closestNumber(int n, int m) {
        // find the quotient
        int closestNumbe = 0;//12
        int minDifference = Integer.MAX_VALUE;//1

        // Check numbers around n
        for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
            if (i % m == 0) {//9,10,11,12(.),13,14,15,16(.),17,18
                int difference = Math.abs(n - i);//13-12=1(1)//13-16=3

                if (difference < minDifference || 
                   (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
                    closest = i;//12
                    minDifference = difference;//1
                }
            }
        }
        return closestNumbe;
    }

    
}