package recursion;

public class Triangle {
//    public static void main(String[] args) {
//        for (int i = 4; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
public static void main(String[] args) {
print(4,0);
}
static void print(int r,int c){
    if(r == 0) {
        return;
    }
    if (c < r){
        System.out.print("*");
        print(r ,c+1);
    }else {
        System.out.println();
        print(r - 1, 0);
    }

}
}
