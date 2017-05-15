package diffTasks;

//Имеется фрагмент программы, определяющий, есть ли в строке пять одинаковых знаков подряд, и распечатывающий ответ.

public class EqualsChars {
    public static void main(String[] args) {
        String s = "test 11111 string";
        int n = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                n++;
            }
        }
        if (n >= 4) {
            System.out.println("Есть 5 одинаковых знаков подряд");
        } else {
            System.out.println("Нет 5 одинаковых знаков подряд");
        }
    }
}

