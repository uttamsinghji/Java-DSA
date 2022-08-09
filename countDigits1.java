import java.util.Scanner;

public class countDigits1 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int givenNumber = scn.nextInt();
        int theRepeatedNumber = scn.nextInt();
        int getDigitFunction = getDigitFrequency( givenNumber, theRepeatedNumber);
        System.out.println(getDigitFunction);
    }

    public static int getDigitFrequency(int givenNumber, int theRepeatedNumber){
        int returnNumber = 0;

        while(givenNumber > 0){
            int dig = givenNumber % 10;
            givenNumber = givenNumber / 10;

            if( dig == theRepeatedNumber ){
                returnNumber++;
            }

        }
        return returnNumber;

    }
}
