package String;

public class CharAt {
    public static void  PrintLetter(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name="Priyush Khobragade";
        //System.out.println(name.charAt(2));
        PrintLetter(name);
    }
}
