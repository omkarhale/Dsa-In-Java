package string;

public class ReverseString {
    public static void reverseString(char s[]){
        int start = 0;
        int end = s.length-1;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String s = "hello";
        char[] charArray = s.toCharArray();
        reverseString(charArray);
        System.out.println(new String(charArray)); // Convert char[] back to String and print
    }
}
