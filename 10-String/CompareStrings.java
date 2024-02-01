package String;
import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1="Tony";
        String name2="Tony";

        if(name1.equals(name2)){
            System.out.println("They are the same string");
        }else{
            System.out.println("They are different string");
        }

        //do not use == to check String equality
        //Given correct answer here

        if(name1==name2){
            System.out.println("They are the same string");
        }
        else {
            System.out.println("They are different strings");
        }

    }
}
