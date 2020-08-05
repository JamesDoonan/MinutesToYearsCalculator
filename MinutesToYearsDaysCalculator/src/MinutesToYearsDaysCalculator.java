public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        long hour = 60 * minutes;
        long day = 24 * hour;
        long year = minutes / ( 60 * 24 * 365);
        long remainingDays = ((minutes) / ( 60 * 24)) % 365;
        if (minutes < 0 ){
            System.out.println( " Invalid Value ");

        }
        else {
        System.out.println( minutes + " min  = " + year + " y and " + remainingDays + " d ");


    }}
}
