// TODO: Составить алгоритм: если введенное число больше 7, то вывести “Привет”


package somePackage;



import org.apache.commons.lang3.math.NumberUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class Task1 {


    public static final int checkNumber = 7;

    public static void main(String[] args) {



        String inputString = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("tested with float 0x1.fffffep127   and 3.40282346638528860e+38 and long 8223372036854775808.0\n" +
                "  and with 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\n" +
                "  need more detailed task for other numeric notations" +
                "  dot is considered decimal separator, coma will not work");
        System.out.println();
        System.out.println("Please enter number: ");

        // Read line
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("You have entered " + inputString);

        // Print
        // tested with float 0x1.fffffep127   and 3.40282346638528860e+38 and long 8223372036854775808.0
        // and with 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
        // need more detailed task for other numeric notations
        // dot is considered decimal separator, coma will not work
        if ( /*( NumberUtils.isParsable(inputString)  ) &*/ (isGreaterThanCheck(inputString))) {
            System.out.println("Привет");
        }

    }


    public static boolean isGreaterThanCheck(String inputString) {
        return (checkInteger(inputString)) ||
                (checkFloat(inputString)) ||
                (checkDouble(inputString)) ||
                (checkLong(inputString)) ||
                (checkBigInteger(inputString));
    }

    public static boolean isNumeric(String strNum) {
        //      if (isInteger(strNum) || isFloat(strNum) || isDouble(strNum) || isLong(strNum) || isBigInteger(strNum)  )
        //          return true;

        return false;
    }

    public static boolean checkInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        int i;
        try {
            i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return i > checkNumber;
    }

    public static boolean checkFloat(String strNum) {
        if (strNum == null) {
            return false;
        }
        float f;
        try {
            f = Float.parseFloat(strNum);

        } catch (NumberFormatException nfe) {
            return false;
        }
        return f > checkNumber;
    }


    public static boolean checkDouble(String strNum) {
        if (strNum == null) {
            return false;
        }
        double d;
        try {
            d = Double.parseDouble(strNum);


        } catch (NumberFormatException nfe) {
            return false;
        }
        return d > checkNumber;
    }


    public static boolean checkLong(String strNum) {
        if (strNum == null) {
            return false;
        }
        long l;
        try {
            l = Long.parseLong(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return l > checkNumber;
    }


    public static boolean checkBigInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        BigInteger bigInteger;
        try {
            bigInteger = new BigInteger(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return BigInteger.valueOf(checkNumber).compareTo(bigInteger) < 0;
    }


}
