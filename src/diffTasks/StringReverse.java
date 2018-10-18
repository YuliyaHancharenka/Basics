package diffTasks;

public class StringReverse {

    public static void typeEachCharacterOneByOne(String value) {
        String[] textToType = value.split("");
        for (String letter : textToType) {
            System.out.println(letter);
        }
    }

    public static void typeTextByLetters(String text) {
        char[] textToType = text.toCharArray();
        for (char letter : textToType) {
            String str = Character.toString(letter);
            System.out.println(str);
        }
    }

    public static void typeTextByLettersNew(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "I am the better Automation Tester in EPAM";
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--){
            sb = sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());

        typeEachCharacterOneByOne("text");
        typeTextByLetters("text");
        typeTextByLettersNew("text");
    }
}
