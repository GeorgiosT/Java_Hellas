package Leapyear;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        boolean leapYear = false;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        if((year >=-9999) && (year <= 9999)){
            if(year % 4 == 0)
                leapYear = true;
            else if((year % 100 == 0) && (year % 400 != 0))
                leapYear = true;
        }
        if(leapYear)
            System.out.println(year +" is a leapyear!");
        else
            System.out.println(year +" is not a leapyear!");
        
        
        
        
    }
}
