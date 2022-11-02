package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String result="";
        while(stop>start){
            if(start%2==1){
                String str = String.valueOf(start);
                result+=str;
            }
            start++;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {

        String result="";
        while(stop>start){
            if(start%2==0){
                String str = String.valueOf(start);
                result+=str;
            }
            start++;
        }
        return result;
    }

    public static String getRange(int stop) {
        String result="";
        for(int i=0; i<stop; i++){
            String str = String.valueOf(i);
            result+=str;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result ="";
        while(stop>start){
            String str = String.valueOf(start);
            result+=str;
            start++;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
       /* String result ="";
        while(stop>start){
            String str = String.valueOf(start);
            result+=str;
            start+=step;
        }
        return result;*/
        StringBuilder sb = new StringBuilder();

        for(int i=start; i<stop; i+=step){
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result ="";
        while(stop>start){
            int power =(int)Math.pow(start,exponent);
            String str = String.valueOf(power);
            result+=str;
            start+=step;
        }
        return result;
    }
    public static String getSquareNumbers(int start, int stop, int step) {
        /*String result="";
        while(stop>start){
            int square= ((int)Math.pow(start,2));
            String str = String.valueOf(square);
            result+=str;
            start+=step;
        }
        return result;*/
        return getExponentiations(start, stop, step,2);
    }
}

