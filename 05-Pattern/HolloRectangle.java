public class HolloRectangle {

    public static void hollw_reactangl( int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows;i++){
            //inner-column
            for(int j=1;j<=totCols; j++){
                if (i==1 || i==totRows || j==1 ||j==totCols) {
                  //boundary  cells
                    System.out.print("*");
                }else{
                     System.out.print(" ");

                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollw_reactangl(4, 5);
    }
}
