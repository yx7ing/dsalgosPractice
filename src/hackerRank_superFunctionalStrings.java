import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YXTing
 */
public class hackerRank_superFunctionalStrings {
    
    public static void main(String[] args) {
        System.out.println(superFunctionalStrings("aabbccddee"));
    }
    
    static int superFunctionalStrings(String s) {
        Set<String> set = new HashSet<>();
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len+1; j++) {
                System.out.println(s.substring(i,j));
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
        for (String sub : set) {
            int d = uniqueChar(sub);
            sum+=customPow(sub.length(),d)%1000000007;
        }
        return sum%1000000007;
    }

    static int customPow(int b, int p) {
        int r = 1;
        for (int i = 0; i < p; i++) {
            r = r*b;
        }
        return r;
    }

    static int uniqueChar(String s) {
        int[] letters = new int[128];
        for (int i = 0; i < 128; i++) {
            letters[i] = 0;
        }
        for (int j = 0; j < s.length(); j++) {
            int x = s.charAt(j);
            letters[x]++;
        }
        int count = 0;
        for (int k = 0; k < 128; k++) {
            if(letters[k] > 0) {
                count++;
            }
        }
        return count;
    }
    
}
