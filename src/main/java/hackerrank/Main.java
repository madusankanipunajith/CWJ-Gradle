package hackerrank;


import java.util.*;

public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//
//        System.out.println(A.length() + B.length());
//        if (A.compareTo(B) > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//        System.out.println(String.valueOf(A.charAt(0)).toUpperCase()+A.substring(1)+" "+
//                String.valueOf(B.charAt(0)).toUpperCase()+B.substring(1));
//
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(
//                S.substring(start,end)
//        );
//    }
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            Set<String> set = new TreeSet<>();
            for (int index=0; index <= s.length() - k; index++){
                String subString = s.substring(index, index + k);
                set.add(subString);
            }

            List<String> list = new ArrayList<>(set);
            smallest = list.get(0);
            largest = list.get(list.size()-1);
            return smallest + "\n" + largest;
        }


//            public static void main(String[] args) {
//                Scanner scan = new Scanner(System.in);
//                String s = scan.next();
//                int k = scan.nextInt();
//                scan.close();
//
//                System.out.println(getSmallestAndLargest(s, k));
//            }

//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//
//        boolean isPalindrome = true;
//        for (int index = 0 ; index < A.length()/2; index++){
//            if (A.charAt(index) != A.charAt(A.length()-1-index)){
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }

//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int count = 0;
//            List<Integer> list = new ArrayList<>();
//            while (n > 0){
//                list.add(sc.nextInt());
//                n--;
//            }
//
//            for (int len = 1; len <= list.size(); len++){
//                int from = 0;
//                int to = len;
//                while (to <= list.size()){
//                    List<Integer> subList = list.subList(from, to);
//                    if(subList.stream().reduce(0, Integer::sum) < 0){
//                        count++;
//                    }
//                    from++;
//                    to = from + len;
//
//                }
//            }
//
//            System.out.println(count);
//    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int terminalIndex = game.length;
        int lastIndex = terminalIndex - leap;
        int currentIndex = 0;

        while (currentIndex < lastIndex){
            if (game[currentIndex] == 0 && game[currentIndex+1] == 0){
                currentIndex++;
            }else if(currentIndex+leap < terminalIndex){
                if (game[currentIndex+leap] == 0){
                    currentIndex+= leap;
                }else{
                    boolean isTerminate = true;
                    for(int index = leap-1; index > currentIndex; index--){
                        if (game[currentIndex+index] == 0){
                            currentIndex+= index;
                            isTerminate = false;
                            break;
                        }
                    }
                    if (isTerminate){
                        return false;
                    }
                }

            }
            else{
                return true;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int x = 10;
        char[] xx = {'A','B'};
        int[] xxx = {4};
        System.out.println(Arrays.stream(xxx).min().getAsInt());
    }

}
