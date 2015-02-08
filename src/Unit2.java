/**
 *
 * @author Matthew Adkisson
 * @date   January 14, 2015
 */

import java.io.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Unit2 {
    
    static String MoneyFormat (double date, int width){
       final String BLANKS = "              ";
       NumberFormat money = NumberFormat.getCurrencyInstance();
       String result = money.format(date);
       return (BLANKS.substring(0, width - result.length()) + result);
    }
    
    static String DecimalFormat (double date, int width){
        final String BLANKS = "              ";
        NumberFormat decimal = new DecimalFormat("###,##0.00");
        String result = decimal.format(date);
        return (BLANKS.substring(0, width - result.length()) + result);
    }
    
    public static void main(String[] args) {
        double[] amount = new double[]{567.21, 23.45, 1209.34, 923.33, 29.01, 34.56, 214.54};
        String[] days = new String[]{"Sunday    ", "Monday    ", "Tuesday   ", "Wednesday ", "Thurday   ", "Friday    ", "Saturday  "};
        System.out.println("   Day     Spent");
        System.out.println("-------   --------");
        int w = 9;
        double sum = 0;
        for(int i = 0; i < 7; ++i){
            sum = sum + amount[i];
            System.out.println(days[i]+MoneyFormat(amount[i],w));
        }
        System.out.println("-------   --------");
        System.out.println("Total     "+MoneyFormat(sum,w));
        System.out.println();
     /***************************************************************************/
        
        
        System.out.println("   Day     Spent");
        System.out.println("-------   --------");
        int w2 = 9;
        double sum2 = 0;
        for(int i = 0; i < 7; ++i){
            sum2 = sum2 + amount[i];
            System.out.println(days[i]+DecimalFormat(amount[i],w));
        }
        System.out.println("-------   --------");
        System.out.println("Total     "+DecimalFormat(sum2,w));
    }
    
}