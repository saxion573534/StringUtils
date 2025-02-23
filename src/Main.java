public class Main {
    public static void main(String[] args) {
        String example = "This is my first name";

        String camelCase = StringUtils.toCamelCase(example);
        System.out.println("camelCase: " + camelCase);

        String pascalCase = StringUtils.toPascalCase(example);
        System.out.println("PascalCase: " + pascalCase);

        String snakeCase = StringUtils.toSnakeCase(example);
        System.out.println("snake_case: " + snakeCase);

        String upperSnakeCase = StringUtils.toUpperSnakeCase(example);
        System.out.println("UPPER_SNAKE_CASE: " + upperSnakeCase);

        String kebabCase = StringUtils.toKebabCase(example);
        System.out.println("kebab-case: " + kebabCase);

        String leetCase = StringUtils.toL33tCase(example);
        System.out.println("l33t-case: " + leetCase);
    }
}