public class StringGenerator {
    private static String latinAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static String generateRandomString(String line, int counter) {
        String str = "";
        for (int i = 0; i < counter; i++)
        {
            char symbol = line.charAt(randomWithRange(0, line.length() - 1));
            str += symbol;
        }
        return str;
    }
    public static String generateLatin(int counter) {
        return generateRandomString(latinAlphabet, counter);
    }
    public static String generateRussian(int counter) {
        return generateRandomString(russianAlphabet, counter);
    }
}
