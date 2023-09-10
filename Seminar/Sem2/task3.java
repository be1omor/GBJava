package Seminar.Sem2;

public class task3 {
    public static void main (String[] args) {
        // в строке 3 + 56 = 59 заменить = на равно средствами String and StringBuilder

        String qwe = "3 + 56 = 59";
        System.out.println(qwe);
        qwe = qwe.replace("=", "равно");
        System.out.println(qwe);

        StringBuilder qw = new StringBuilder("3 + 56 = 59");
        qw.replace(qw.indexOf("="), qw.indexOf("=") + 1, "PAVHO");
        System.out.println(qw);

    }
}
