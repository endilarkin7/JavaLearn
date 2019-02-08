import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class lesson3 {




        public static void main(String[] args) {
            int a = 10;
            int b = 5;


            /** Compile Error
             byte c = (byte) a + b;

             Runtime Error
             System.out.println(10 / 0); */

            Scanner sc = new Scanner(System.in);
            //Вводим предложение в консоль
            System.out.println("Введите слова одной строкой через пробел");
            String input = sc.nextLine();

            int count = 0;  //Начальное количество слов равно 0

            //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
            if(input.length() != 0){
                count++;
                //Проверяем каждый символ, не пробел ли это
                for (int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) == ' '){
                        //Если пробел - увеличиваем количество слов на 1
                        count++;
                    }
                }
            }

            System.out.println("Вы ввели "+count+"слов");
        }
}