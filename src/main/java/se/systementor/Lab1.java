package se.systementor;

public class Lab1 {
    public void run(){
        int []talen = {12 ,55, 32, 9, 34 };   
        int largest = talen[0];
        int smallest = talen[0];

        for(int tal : talen){
            if(tal < smallest)
                smallest  = tal;
            if(tal > largest)
                largest = tal;
        }
        System.out.printf("Största:%d Minsta:%d", largest,
                 smallest);

    }
}
