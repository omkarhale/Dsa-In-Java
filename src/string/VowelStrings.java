package string;

public class VowelStrings {
    public static void main(String[] args) {
      String words[] = {"are","amy","u"};
      int left = 0;
      int right = 2;
        System.out.println(vowelStrings(words,left,right));
    }
    static int vowelStrings(String words[],int start,int end){
        int count = 0;
        for (int i = start; i <=end ; i++) {
            int s = words[i].charAt(0);
            int e = words[i].charAt(words[i].length()-1);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
                if(e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u'){
                    count++;

                }
            }

        }
        return count;
    }

}
