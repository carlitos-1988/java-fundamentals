import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting); 

    // pluralize("cat", 1);
    // flipHeads(2);
    // clock();

    int[] simpleArray = {1,2,3};
    int[] longerArray = {1,2,3,4,0,6,7,8,9};
    int[] modifiedSimple = arrayInsert(simpleArray,5);
    int[] modifiedLonger = arrayInsert(longerArray, 5);
    
    for (int i : modifiedLonger) {
        System.out.print(i);
    }

    System.out.println();
    
    for (int i : modifiedSimple) {
        System.out.print(i);
    }

    }

    public static void pluralize(String animal, int amount ){
        String own = "I own ";

        if ( amount <= 1){
            System.out.println(own +  amount + " " + animal);
        }else{
            System.out.println(own + amount + " "+ animal+"'s");
        }
    }

    public static void flipHeads(int times){
        Random myRand = new Random();
        int counter = 0;
        int desired = 0;

        do{
            double flip = myRand.nextDouble(1); 
            // if(desired == times){
            //     System.out.println("It took " + counter+ " flips to flip "+ times+ " in a row");
            //     break; 
            // }else{
                if(flip < 0.5){
                    System.out.println("tails");
                    counter++;
                }else{
                    System.out.println("heads");
                    counter++;
                    desired++;
                }
            //}
        }while(desired<=times);

        System.out.println("It took "+ counter+ " flip(s) to flip "+ times + " in a row");
    }

    public static void clock(){
        
        int notWorkingInt = 10;

        do{
            try {
                LocalDateTime now = LocalDateTime.now();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                Thread.sleep(1000);
                System.out.println(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }while (notWorkingInt > 1);

    }

    public static int[] arrayInsert(int[] inputArray, int newNumber){
        int theMiddle = inputArray.length/2;
        int[] modifiedArray = inputArray;
        modifiedArray[theMiddle] = newNumber;

        return modifiedArray;
    }
}