import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class MavenExercise {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        if((!isNumeric(userInput))){
            System.out.println(userInput+": is not a number");
        }else{
            System.out.println(userInput+" is a number");
        }
        String swapReverseInput = swapCase(userInput);
        System.out.println("Flipped Case: "+swapReverseInput);
        String lastTime = reverse(userInput);
        System.out.println("Reversed: "+ lastTime);
    }
}
