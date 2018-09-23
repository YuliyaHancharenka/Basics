package diffTasks;


public class FindMostLongWordTask {
    public static void main(String[] args) {
//9. Есть предложение как строка, найти в нем самое длинное слово. Подсказка: у класса String есть метод split
        String s = "So, in order to keep consistency and not depend on character positioning, you might want to escape " +
                "all those characters that have a special meaning in regular expressions (the following list is not complete, " +
                "so be aware of other characters like";

        String s2 = s.replaceAll("[.:,!?]", "");
        String[] parts = s2.split(" ");

        int max = parts[0].length();
        String maxStr = parts[0];

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() > max) {
                max = parts[i].length();
                maxStr = parts[i];
            }
        }
        System.out.println(maxStr);
    }
}
