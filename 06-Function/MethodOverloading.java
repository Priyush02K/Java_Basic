
public class MethodOverloading{
//    using parameter
//     public static int sum (int a,int b){
//         return a+b;
//     }
//     public static int sum(int a, int b, int c){
//         return  a+b+c;
//     }

    // using data type
public static int sum(int a,int b){
    return a+b;
}

public static float sum(float a,float b){
    return a+b;
}
    public static void main(String[] args) {
        System.out.println(sum(20,25));
        System.out.println(sum(3.5f,4.5f));

    }
}