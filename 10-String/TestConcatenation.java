package String;
import java.util.*;

public class TestConcatenation   {
    public static void main(String[] args) {
        //1 way + sign
        String Firstname="Priyush";
        String Lastname="Khobragade";
        String fullName =Firstname + " " +Lastname;
        System.out.println(fullName);

        //2 way concat()
        String AllName=Firstname.concat(Lastname);
        System.out.println(AllName);
        
    }
}
