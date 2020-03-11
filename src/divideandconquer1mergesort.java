import java.util.Arrays;

/**
 *
 * @author YXTing
 */
public class divideandconquer1mergesort {
    public static void main(String[] args) {
        System.out.println("Merge Sort Ascending");
        
        int[] test1 = {4,3,2,1,2,3,4,5,1,5,3,78};
        int[] test2 = {2, 4, 8, 9, 15, 18, 24, 27, 28, 33, 34, 36, 37, 40, 42, 43, 45, 47, 49, 54, 56, 61, 64, 66, 67, 68, 70, 82, 95, 103, 105, 1071, 117, 120, 121, 134, 143, 144, 147, 148, 150, 158, 159, 163, 166, 175, 176, 180, 182, 184, 186, 196, 200};
        
        System.out.println(Arrays.toString(mergeSort(test2)));
    }
    
    static int[] mergeSort(int[] list) {
        int len = list.length;
        if (len == 1) {
            return list;
        } else if (len == 2) {
            return sortPair(list);
        } else {
            int[] sub1 = Arrays.copyOfRange(list, 0, len/2);
            int[] sub2 = Arrays.copyOfRange(list, len/2, len);
            System.out.println(Arrays.toString(sub1));
            System.out.println(Arrays.toString(sub2));
            return merge(mergeSort(sub1), mergeSort(sub2));
        }
    }
    
    static int[] sortPair(int[] list) {
        int[] sorted = new int[2];
        if (list[0] < list[1]) {
            sorted[0] = list[0];
            sorted[1] = list[1];
        } else {
            sorted[0] = list[1];
            sorted[1] = list[0];
        }
        return sorted;
    }
    
    static int[] merge(int[] sub1, int[] sub2) {
        int len1 = sub1.length;
        int len2 = sub2.length;
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int[] merged = new int[len1+len2];
        while (i1<len1 && i2<len2) {
            if (sub1[i1]<sub2[i2]) {
                merged[i] = sub1[i1];
                i1++;
            } else {
                merged[i] = sub2[i2];
                i2++;
            }
            i++;
        }
        while (i1<len1) {
            merged[i] = sub1[i1];
            i1++;
            i++;
        }
        while (i2<len2) {
            merged[i] = sub2[i2];
            i2++;
            i++;
        }
        System.out.println(Arrays.toString(merged));
        return merged;
    }
}
