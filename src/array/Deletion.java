package array;

public class Deletion {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        int newArray[]=new int [array.length-1];
        int indexpos=1;
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==indexpos){
                continue;
            }
            newArray[j]=array[i];
            j++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
