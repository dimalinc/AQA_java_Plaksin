// TODO: Составить алгоритм: если введенное имя совпадает с Вячеслав,
//  то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

package somePackage;





public class Task2 {

    public static final String nameToPass = "Вячеслав";


    public static void main(String[] args) {

        JFrame2 exe = new JFrame2();
        exe.setVisible(true);

    }

    public static String vyacheslavCheck(String inputString) {

        if (inputString.equals(nameToPass)) {
            inputString = "Привет, Вячеслав";
        } else {
            inputString = "Нет такого имени";
        }
        return inputString;
    }

}
