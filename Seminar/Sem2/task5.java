package Seminar.Sem2;

public class task5 {
    public static void main(String[] args) {
        // Сравнить время replace String and StringBuilder

        String string = "";
        for (int i = 0; i < 100000; i++) {
            string += "a";
        }
        long start = System.currentTimeMillis();
        string.replace('a', 's');
        long end = System.currentTimeMillis();
        System.out.println("String");
        System.out.println(end - start);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            str.append("a");
        }
        start = System.currentTimeMillis();
        while (str.toString().contains("a")) {
            str.replace(str.indexOf("a"), str.indexOf("a") + 1, "s");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder");
        System.out.println(end - start);
    }
}
