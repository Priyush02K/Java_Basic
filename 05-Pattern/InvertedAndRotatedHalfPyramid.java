public class  InvertedAndRotatedHalfPyramid {

    public static void inverted_Rotated_Half_Pyramid(int n) {
        //outer
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_Rotated_Half_Pyramid(5);
    }
}
