package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab4 {
    public void run(){
        ArrayList<String> strings = new ArrayList<>(Arrays.asList( "abc", "xyz", "aba", "1221" ));        
        
        int count = 0;
        for( String txt : strings){
            if(txt.length()>=2 &&  txt.charAt(0) == txt.charAt(txt.length()-1)   ){
                count++;
            }

        }
            
        System.out.printf("Antal blev %d\n", count);
    }
    
}
