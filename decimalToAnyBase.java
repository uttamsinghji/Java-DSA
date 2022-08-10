import java.util.Scanner;

public class decimalToAnyBase {
    
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int decimalNumber = scn.nextInt();
    int givenBase = scn.nextInt();
    int convertBaseNumber = getValueInBase(decimalNumber, givenBase);
    System.out.println(convertBaseNumber);
 }
//input deccimalNumber634 ,givenBase8 , 8 divided by 634 ,returnNumber = returnNumber+(remainder*power)

public static int getValueInBase(int decimalNumber, int givenBase)
{
    int returnNumber = 0;
    int pow = 0;

    while(decimalNumber>0){
        int remdr = decimalNumber % givenBase; // get the remainder
        decimalNumber = decimalNumber / givenBase; //divide and decrease the decimalNumber and get a new decimalNumber to again find or get the remainder of decreased number.
        
        returnNumber += remdr*Math.pow(10,pow);
        pow++;

    }
    return returnNumber;
}
}
