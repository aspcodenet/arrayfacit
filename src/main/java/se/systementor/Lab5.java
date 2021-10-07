package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab5 {
    public void run(){
        ArrayList<Integer> talArrayList1 = 
            new ArrayList<>(Arrays.asList(12,-5,32,-9,34));        
        
        int antalUnserNoll = 0;
        for( int tal : talArrayList1)
            if(tal < 0)
                antalUnserNoll++;
        System.out.printf("Antal under 0 blev %d\n", antalUnserNoll);

    }
}
