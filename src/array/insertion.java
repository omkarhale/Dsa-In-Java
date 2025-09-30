package array;

public class insertion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int indexpos=2;
        int element=55;
        int [] newArray=new int[arr.length+1];
        for (int i = 0; i < indexpos; i++) {
            newArray[i]=arr[i];
        }
        newArray[indexpos]=element;
        for (int i = indexpos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        for (int no:newArray){
            System.out.print(no + " ");
        }


}}
