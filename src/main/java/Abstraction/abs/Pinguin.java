package Abstraction.abs;

/**
 * Created by Vitalii_Tyshko on 2/8/2019.
 */
public class Pinguin extends Bird {
    public void move() {                // переопреділяю метод в Bird(виникає поліморфизм)
        System.out.println("пігнвікаю");
    }
    }
