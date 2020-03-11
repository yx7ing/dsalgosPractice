public class dynamicprogramming0fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(560));
    }

    static int fibonacci(int n) {
        int result;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int[] temp = {0, 1};
            for (int i = 2; i <= n; i++) {
                int next = temp[0] + temp[1];
                temp[0] = temp[1];
                temp[1] = next;
            }
            result = temp[1];
        }
        return result;
    }
}
