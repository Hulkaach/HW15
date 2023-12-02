public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    private static final String RUS_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        printCodeChar(RUS_ALPHABET);
        //todo код писать тут
    }

    private static void printCodeChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i)+" - "+(int) string.charAt(i));
        }
    }
}