// import java.util.Arrays;
// import java.util.Random;

// public class program {
//     public static void main(String[] args) {
        
//         Random random = new Random();
//         int randNum = random.nextInt(1,2000);
//         // System.out.println(randNum);

//         // System.out.println(Integer.toBinaryString(randNum));
//         // System.out.println(Integer.toBinaryString(randNum).length());
//         int byteNum = Integer.toBinaryString(randNum).length();
//         // System.out.println(byteNum);
//         // от 0 до max short записать все числа кратные byteNum
//         // в массив, массив не должен превышать кол-во 
//         // записанных в нём элементов
//         int[] arr = new int[1];
//         int arrCount = 0;

//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % byteNum == 0) {
//                 arr[arrCount++] = i;
//                 int[] tempArr = new int [arr.length + 1];
//                 for (int j = 0; j < arr.length; j++) {
//                     tempArr[j] = arr[j];
//                 }
//                 arr = tempArr;
//             }
//         }
//         // System.out.println(Arrays.toString(arr));
//         // SHORT min до 0 сохранить все некратные
//         int overlapCount = 0;
//         for (int i = Short.MIN_VALUE; i < 0; i++) {
//             if (i % byteNum != 0) {
//                 overlapCount++;

//             }
//         }
//         int[] overlapSizeArray = new int[overlapCount];
//         arrCount = 0; // Счетчик индексов массива
//         for (int i = Short.MIN_VALUE; i < 0; i++) {
//             if (i % byteNum != 0) {
//                 overlapSizeArray[arrCount++] = i;
//             }
//         }
//         // System.out.println(Arrays.toString(overlapSizeArray));


//         int sum = 0;
//         for(int i = 0; i < byteNum; sum += i++);
//         // System.out.println(sum);

//         int[] ints = {1,2,3,4,5,6,7,8,9};
//         for (int i = 0, counter = ints.length - 1; i <= ints.length / 2; i++, counter --) {
//             System.out.println(ints[i] + " - " + ints[counter]);
//         }
//     }
// }