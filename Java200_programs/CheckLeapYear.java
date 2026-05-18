package Java200_programs;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year=2023;
        year=2024;
        boolean leap=false;
        // (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            leap=true;
        }
        System.out.println(leap);
    }
    
}
