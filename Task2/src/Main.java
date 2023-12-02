import java.util.Scanner;

public class Main {
    public static final String RUS_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ-абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        printFIO();
    }

    private static void printFIO() {
        boolean flag = true;
        int countWords = 0;
        System.out.println("Введи ФИО полностью");
        String input = new Scanner(System.in).nextLine().trim();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                countWords++;
            }
            if (!RUS_ALPHABET.contains(String.valueOf(input.charAt(i)))) {
                flag = false;
                break;

            }
        }
        if (flag && countWords == 2) {
//
            System.out.println(input.substring(0,input.indexOf(' ')).trim()+"\n"+input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim() + "\n" + input.substring(input.lastIndexOf(' ')).trim());
        } else System.out.println("Введенная сторока не является ФИО");
    }

}