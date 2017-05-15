package diffTasks;


public class TasksStrings {
    public static void main(String[] args) {

        // 7. Определить, является ли введенная пользователем строка полиндромом

       /* String s = "acdgdca";
        boolean isPalindrome = true;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.print(s + " is " + (isPalindrome ? "palindrome" : "not palindrome"));*/


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
