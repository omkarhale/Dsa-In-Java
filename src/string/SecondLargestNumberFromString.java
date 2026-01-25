package string;

public class SecondLargestNumberFromString {
    static int secondLargest(String s){
        int largest = -1;
        int secLargest = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                int digit = ch - '0';
                if (digit > largest){
                    secLargest = largest;
                    largest = digit;
                } else if (digit < largest && digit > secLargest) {
                    secLargest = digit;
                }
            }

        }
        return secLargest;
    }
    public static void main(String[] args) {
        String s = "dfa12321afd";
        int ans = secondLargest(s);
        System.out.println(ans);

    }
}
