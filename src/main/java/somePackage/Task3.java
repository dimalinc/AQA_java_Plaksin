// TODO: Составить алгоритм: на входе есть числовой массив,
//  необходимо вывести элементы массива кратные 3


package somePackage;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) {

        String inputString;
        int arrayLength = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println();
        System.out.println("Please enter the quantity of digits you are going to enter");

        while (arrayLength == 0)
            try {
                System.out.println("Please enter positive integer greater than 0 for numbers array size");
                inputString = br.readLine();
                arrayLength = Integer.parseInt(inputString);
                if (arrayLength<=0) arrayLength=0;
            } catch (Exception e) {
             //   e.printStackTrace();
              //  System.out.println("Please enter positive integer greater than 0 for numbers array size");
            }

        int[] integerArray = new int[arrayLength];

        System.out.println("Please enter " + arrayLength + " numbers");

        for (int i = 0; i < arrayLength; i++) {
            try {
            inputString = br.readLine();
            integerArray[i]=Integer.parseInt(inputString);
            } catch (Exception e) {
             //   e.printStackTrace();
                System.out.println("Please enter integer");
            }
        }

        System.out.println("Array entering finished");

        System.out.println("You've entered that array:"  );
        for (int i:integerArray) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("The array elements divisible by 3 are: ");
        for (int i:integerArray) {
            if (i % 3 == 0)
            System.out.print(i+" ");
        }
        System.out.println();

        try{
            Thread.sleep(19000);
        } catch (Exception e) {e.printStackTrace(); }


    }


}
