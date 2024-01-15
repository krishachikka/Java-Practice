// Create a Java class as shown in the example and change the program to use compound assignments like "+="

public class CalculateWithOperators {
    public static void main (String[] args) {
        int res = 1 + 2; // result is now 3
        System.out.println (res);
        res -= 1; // result is now 2
        System.out.println (res);
        res *= 2; // result is now 4
        System.out.println(res);
        res /= 2; // result is now 2
        System.out.println(res);
        res += 8; // result is now 10
        res %= 7; // result is now 3
        System.out.println(res);
      }
}

// OUTPUT
// 3
// 2
// 4
// 2
// 3