// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.Writer;

// /**
// * main
// */
// public class main {

// /**
// * @param args
// */
// public static void main(String[] args) {
// String s = "Hello my World!";
// byte[]b = s.getBytes();
// String[] sa = s.split("");
// System.out.println(s.replace("!", "?"));
// s += "!";
// s.lastIndexOf("l");
// System.out.println(s.substring(s.indexOf(" ", s.lastIndexOf(" "))));
// System.out.println(s);
// StringBuilder builder = new StringBuilder(s);
// builder.append("1").append("Hello World!").reverse();
// s = builder.toString();
// System.out.println(s);

// try {
// float i = 12/0f;
// } catch (Exception e) {
// System.out.println(e.getMessage());
// }

// try {
// FileWriter writer = new FileWriter("file.txt");
// writer.write(s + "\n" + "Вот!");
// writer.close();

// FileReader reader = new FileReader("file.txt");
// int c;
// while ((c = reader.read())!=-1) {
// System.out.print((char)c);
// };

// } catch (Exception e) {
// System.out.println(e.getMessage());
// }
// }
// }




package Seminar.Sem2;

public class task1 {
    public static void main (String[] args) {

        // создать две строки, если в первой строке 
        // содержится вторая строка вывести её индекс, 
        // если содержится несколько раз вывести индекс каждой

        String stringForFind = "qwe";
        String mainString = "asd asd qwe asd as";

        String[] stringArray = mainString.split(" ");

        int temp = 0;

        // do {
        // System.out.println(mainString.indexOf(stringForFind, temp));
        // temp = mainString.indexOf(stringForFind, temp) + 1;
        // } while (temp < mainString.lastIndexOf(stringForFind));


        while(mainString.indexOf(stringForFind, temp) != -1){
        System.out.println(mainString.indexOf(stringForFind, temp));
        temp = mainString.indexOf(stringForFind, temp) + 1;
        }

        // Создать 2 строки, если 2 является реверсом 1, вывести ок


        // StringBuilder str1 = new StringBuilder("qwe");
        // StringBuilder str2 = new StringBuilder("ewq");

        // if (str1.reverse().toString().equals(str2.toString())) {
        // System.out.println("OK");
        // }
        // else {
        // System.out.println("NOT OK");
        // }

        // variant 2

        String str1 = "ewq";
        String str2 = "qwe";

        if (new StringBuilder(str1).reverse().toString().equals(str2)) {
        System.out.println("OK");
        }
        else {
        System.out.println("NOT OK");
        }



    }
}
