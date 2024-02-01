package String;
import java.util.*;


public class SubString {
    public static String substring (String str, int si, int ei){
          String substr=" ";
          for(int i=si;i<ei;i++){
             substr+=str.charAt(i);
          } 
          return substr;
    }

    public static void main(String[] args) {
        String  Str="HelloWorld";
        System.out.println(Str.substring(0,4));
        System.out.println(Str.substring(2, 3));
        System.out.println(substring(Str, 0, 5));

    }
}
