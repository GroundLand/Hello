package importJAVASE.lang;

/**
 * Created by evel on 2017/7/18.
 */
public class CharacterTest {
    public static void main(String[] args){
        String str = "Aa";
        char c = str.charAt(0);
        System.out.println(Character.isUpperCase(c));
        System.out.println(toDotName("BaSeHttpService"));
    }

    private static String toDotName(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean nextUpperCase = true;

            if (i < (s.length() - 1)) {
                nextUpperCase = Character.isUpperCase(s.charAt(i + 1));
            }

            if ((i >= 0) && Character.isUpperCase(c)) {
                if (!upperCase || !nextUpperCase) {
                    if (i > 0)
                        sb.append(".");
                }
                upperCase = true;
            } else {
                upperCase = false;
            }

            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }
}
