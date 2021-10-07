package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab2 {
    public void run(){
        ArrayList<Integer> talArrayList1 = new ArrayList<>(Arrays.asList( 12,55,32,9,34));        
        ArrayList<Integer> talArrayList2 = new ArrayList<>(Arrays.asList( 72,55, 32,4,88));        

        ArrayList<Integer> commonArrayList = new ArrayList<>();        

        for(int i : talArrayList1){
            if(talArrayList2.contains(i))
                commonArrayList.add(i);
        }

        for(int tal : commonArrayList){
            System.out.println(tal);            
        }

        
    }
}
