package Inheritance_and_polymorphism;

import java.util.Arrays;

                  /** Сортировка пузирьком */
public class A {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 5, 0};

        boolean isSorted = false;                       //  Просортировно невірно
        int buf;                                        //  Буффер обміну

        while(!isSorted) {                              //  Предпологаємо що масив відсортований
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {    //  Пробігаємось по масиву всьому
                if(arr[i] > arr[i+1]){                  // Якщо зліва число > праве число то відсортовуємо
                    isSorted = false;

                    buf = arr[i];        // В буффер обміну індекс що зліва був присвоюємо число
                    arr[i] = arr[i+1];   // Присвоюємо зліва індекс = правому індексу
                    arr[i+1] = buf;      // Так як ми змінили правий індекс на лівий,
                                         // То індексу що справа присвоюємо що був зліва..., міняємо місцями
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

