import java.util.Arrays;

public class divideandconquer0 {
    
    public static void main(String[] args) {
        System.out.println("Find Max D&C");
        int[] test1 = {1,2,3,4,5,6,7,8,9,10};
        int[] test2 = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,11,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        int[] test3 = {2, 4, 8, 9, 15, 18, 24, 27, 28, 33, 34, 36, 37, 40, 42, 43, 45, 47, 49, 54, 56, 61, 64, 66, 67, 68, 70, 82, 95, 103, 105, 1071, 117, 120, 121, 134, 143, 144, 147, 148, 150, 158, 159, 163, 166, 175, 176, 180, 182, 184, 186, 196, 200};
        int[] test4 = {0};
        int[] test5 = {1,3};
        int[] test6 = {2,5,1};
        int[] test7 = {11111,2,67,1010};
        System.out.println(findMax(test7));
    }
    
    static int findMax(int[] sub) {
        int len = sub.length;
        if(len==1) {
            return sub[0];
        } else if (len==2) {
            return getLarger(sub[0], sub[1]);
        } else {
                int[] sub1 = Arrays.copyOfRange(sub, 0, len/2);
                int[] sub2 = Arrays.copyOfRange(sub, len/2, len);
            System.out.println(Arrays.toString(sub1));
            System.out.println(Arrays.toString(sub2));
            return getLarger(findMax(sub1), findMax(sub2));
        }        
    }

    static int getLarger(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}