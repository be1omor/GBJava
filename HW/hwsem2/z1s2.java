// class Answer {  
//     public static StringBuilder answer(String QUERY, String PARAMS){
//         // Напишите свое решение ниже
//       PARAMS = PARAMS.replace(":","=");
//       PARAMS = PARAMS.replace('"', '\'');
//       PARAMS = PARAMS.replace('{', ' ');
//       PARAMS = PARAMS.replace('}', ' ');
//       PARAMS = PARAMS.trim();
//       PARAMS = PARAMS.replace("'name'", "name");
//       PARAMS = PARAMS.replace("'country'","country");
//       PARAMS = PARAMS.replace("'city'","city");
//       PARAMS = PARAMS.replace("'age'","age");
//       PARAMS = PARAMS.replace(" "," and ");
//       String arr[];
//       StringBuilder newParams = new StringBuilder();
//       arr = PARAMS.split(",");
//       for (int i = 0; i < arr.length; i++) {
//         if(arr[i].toString().contains("null")) {
//           arr[i] = null;
//         }
//         else {
//           newParams.append(arr[i]);
//         }
//       }
//       StringBuilder newString = new StringBuilder(QUERY + newParams);
//       return newString;

//     }
// }


// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
// 	public static void main(String[] args) { 
//       String QUERY = "";
//       String PARAMS = "";
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         QUERY = "select * from students where ";
// 	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//       }
//       else{
//         QUERY = args[0];
//         PARAMS = args[1];
//       }     
      
//       Answer ans = new Answer();      
//       System.out.println(ans.answer(QUERY, PARAMS));
// 	}
// }