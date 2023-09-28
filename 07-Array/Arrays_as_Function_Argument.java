package Array;

public class Arrays_as_Function_Argument {
   
   //define function
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
        
        }
    }

    //Main function
    public static void main(String[] args) {
        int marks[]={80,85,90};

        update(marks);

        //printing our marks
         for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
         }
         System.out.println();

    }
    
}
