public class dynamicprogramming1interleaving {

    public static void main(String[] args) {
        String X = "ABC";
        String Y = "DEF";
        String S = "ADEBFC";
        System.out.println((checkInterleave(S,X,Y)));
    }

    static boolean checkInterleave(String s, String x, String y) {
        if (s.length()==0 && x.length()==0 && y.length()==0) {
            System.out.println("wow");
            return true;
        } else if (s.length()==0) {
            return false;
        }
        if (x.length()!=0) {
            if (x.charAt(0)==s.charAt(0)) {
                System.out.println(s);
                System.out.println(x);
                System.out.println(y);
                System.out.println("\n");
                checkInterleave(s.substring(1), x.substring(1), y);
            }
        }
        if (y.length()!=0) {
            if (y.charAt(0)==s.charAt(0)) {
                System.out.println(s);
                System.out.println(x);
                System.out.println(y);
                System.out.println("\n");
                checkInterleave(s.substring(1), x, y.substring(1));
            }
        }
        return false;
    }
}
