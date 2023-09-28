package Array;
import java.util.Scanner;  

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];
        //input
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        //output
        System.out.println("Phy: " +marks[0]);
        System.out.println("Che: " +marks[1]);
        System.out.println("Math: " +marks[2]);

        //update
        marks[1]=90;
        System.out.println("Che: "+marks[1]);
        
        //change
        marks[0]=marks[0]+10;
        System.out.println("Phy: "+marks[0]);

    int percentage=(marks[0]+marks[1]+marks[2] /3);
    System.out.println("Percentage =" +percentage+ " % ");

    //final to print length
    System.out.println("length of array is " +marks.length);

    }
}
