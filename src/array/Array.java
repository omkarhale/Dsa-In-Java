package array;

public class Array {
    public static void main(String[] args) {
        int one[]=new int[3];
        one[0]=11;
        one[1]=12;
        one[2]=13;
        int two[]=one;
        two[0]=21;
        for (int i = 0; i < one.length; i++) {
            System.out.println(two[i]);
        }
    }
}
