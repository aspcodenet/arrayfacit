package se.systementor;

import java.util.ArrayList;

public class Lab6 {
    public void run(){
        ArrayList<String> listaMedNamn = new ArrayList<>();
        while(true){
            System.out.print("Skriv in ett namn:");
            String namn = System.console().readLine();
            if(namn.equalsIgnoreCase("EXIT")){
                if(listaMedNamn.size() >= 5)                    
                    break;
                System.out.println("Nej nej fortsätt mata in några till!");
            }
            else{
                listaMedNamn.add(namn);

            }
        }

        String longest = "";
        for(String s : listaMedNamn){
            if(s.length() > longest.length())
                longest = s;
        }
        System.out.println("Längst var " + longest);

    }
}
