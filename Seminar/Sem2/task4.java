package Seminar.Sem2;

public class task4 {
    public static void main (String[] args) {

        // Измерить скорость добавление к строке 1000 элементов
        // в String and StringBuilder

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += Character.getName(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            string.append(Character.getName(i));
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
}
