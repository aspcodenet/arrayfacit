package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;


public class Lab3 {
    public void run(){
        ArrayList<Integer> talArrayList1 = new ArrayList<>(Arrays.asList( 12,55,32,9,34));        
        
        int sum = 0;
        for( int tal : talArrayList1)
            sum += tal;
        System.out.printf("Summan blev %d\n", sum);
    }
}
