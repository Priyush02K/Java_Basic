public class InvertedAndRotatedHalfPyramidWithNo {

public static void inverted_And_Rotated_Half_PyramidWithNo(int n) {
    //outer 
    for(int i=1; i<=n;i++){
        //inner number
        for(int j=1;j<=n-i+1;j++){
          System.out.print(j+ " ");  
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
      inverted_And_Rotated_Half_PyramidWithNo(5);  
    }
}


//12345
//1234
//123
//12
//1