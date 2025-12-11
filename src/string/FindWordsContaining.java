package string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
       String [] words ={"leet","code"};
        System.out.println(findWordsContaining(words,'e'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x ){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }
        return result;

    }

}
