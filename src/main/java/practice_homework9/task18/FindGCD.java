package practice_homework9.task18;

public class FindGCD {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
