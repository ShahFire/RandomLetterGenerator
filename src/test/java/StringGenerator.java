public class StringGenerator {
    private static String latinAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static String generateLatin(int x) {
        String a = "";
        for (int i = 0; i < x; i++)
        {
            char c = latinAlphabet.charAt(randomWithRange(0, 51));
            a += c;
        }
        return a;
    }
}
