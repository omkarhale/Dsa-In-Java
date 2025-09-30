package binarySearch;

public class NestGreatestLetter {
    public static void main(String[] args) {
        char letters[]={'a','b','f','g'};
        char target='a';
        char result = greatestLetter(letters, target);
        System.out.println("Next greatest letter: " + result);
    }
    public static char greatestLetter(char letters[],char target){
        char res=letters[0];
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid=start + (end-start)/2;
            if (letters[mid] == target){
                start = mid +1;
            } else if (letters[mid]> target) {
                 res=letters[mid];
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return res;
    }
}
