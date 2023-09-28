//Question : Print subarrays of an array
package Array;

public class PrintSubArray {
    public static void printSubarrays(int numbers[]) {
        int ts=0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                for(int k=i; k<=j; k++) {//print
                    System.out.print(numbers[k]+" ");//subarray
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array is :"+ts);
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        printSubarrays(numbers);  
      }
}