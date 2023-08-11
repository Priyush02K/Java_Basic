//product of two interger
//find factorial
public class Main {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public  static int  facorial (int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;

        }            return  f;

    }

    public static void main(String[] args) {
       // int a = 5;
        //int b = 4;
       // int prod = multiply(a, b);
        //System.out.println("a*b= " + prod);
        System.out.println(facorial(7));
    }
}