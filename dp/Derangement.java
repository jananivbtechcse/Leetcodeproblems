import java.util.*;

public class Main {
    static final int MOD = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(derangement(n));
    }

    static int derangement(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        if (n == 2) return 1;

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = ((i - 1) * (dp[i - 1] + dp[i - 2])) % MOD;
        }

        return (int) dp[n];
    }
}
