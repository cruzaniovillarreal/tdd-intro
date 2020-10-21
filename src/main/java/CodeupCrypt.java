import org.apache.commons.lang3.StringUtils;
public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String password) {
        String newStr = "";
        for (char character : password.toCharArray()) {
            switch (character) {
                case 'a':
                case 'A':
                    newStr += 4;
                    break;
                case 'e':
                case 'E':
                    newStr += 3;
                    break;
                case 'i':
                case 'I':
                    newStr += 1;
                    break;
                case 'o':
                case 'O':
                    newStr += 0;
                    break;
                case 'u':
                case 'U':
                    newStr += 9;
                    break;
                default:
                    newStr += character;
                    break;
            }
        }
        return newStr;
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return hashedPassword.equals(hashPassword(password));
    }

}
