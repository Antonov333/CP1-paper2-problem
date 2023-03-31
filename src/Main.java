public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Билет 2\nЗадача: напишите программу, которая проверяет, " +
                        "является ли строка палиндромом.\n");
        //    число, буквосочетание, слово или текст, одинаково читающееся
        //    в обоих направлениях

        String string = "11210";
        int offset = 0;
        int l = string.length() - 1;
        boolean palindrome = true;

        while (offset * 2 <= l && palindrome) {
            palindrome = string.charAt(offset) == string.charAt(l - offset);
            offset++;
        }

        System.out.print("String " + string + " is ");
        if (!palindrome) System.out.print("NOT ");
        System.out.println("a palindrome");
    }
}