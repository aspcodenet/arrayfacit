package se.systementor;

public class Lab7 {
    public void run(){
        System.out.print("Skriv in en text:");
        String text = System.console().readLine();

        char mostCommon=' ';
        int mostCommonCount = 0;

        for(int i = 0; i < text.length(); i++){
            char currentToCheck = text.charAt(i);

            int cnt = 0;
            for(int j = 0; j < text.length(); j++){
                if(text.charAt(j) == currentToCheck)                    
                    cnt++;
            }

            if(cnt > mostCommonCount)
            {
                mostCommonCount = cnt;
                mostCommon = currentToCheck;
            }

        }
        System.out.printf("%c   %d gånger\n", mostCommon, mostCommonCount);
    }
}
