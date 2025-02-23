public class StringUtils {

    public static String toCamelCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String toPascalCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String toSnakeCase(String sentence) {
        return sentence.toLowerCase().replaceAll(" ", "_");
    }

    public static String toUpperSnakeCase(String sentence) {
        return sentence.toUpperCase().replaceAll(" ", "_");
    }

    public static String toKebabCase(String sentence) {
        return sentence.toLowerCase().replaceAll(" ", "-");
    }

    public static String toL33tCase(String sentence) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.toLowerCase().charAt(i);
            ch = switch (ch) {
                case 'i' -> '1';
                case 'e' -> '3';
                case 'o' -> '0';
                case 'a' -> '4';
                default -> ch;
            };
            result.append(ch);
        }
        return result.toString();
    }
}
