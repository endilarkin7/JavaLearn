package Abstraction.abs;

/**
 * Created by Vitalii_Tyshko on 2/8/2019.
 */
public class Main {
    public static void main(String[] args) {                                  // дочерний клас
        Bird p = new Pinguin();   // наз. полиморфною ссилкою(коли створюємо об'єкт наследника(Pinguin) через родителя(Bird)
        Bird s = new Strauss();

        p.move();
        s.move();
    }
}
