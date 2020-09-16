/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("Угадай задуманное число");
        System.out.println("-------------------------");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Задумано число от 0 до 5. Угадай!");
        Scanner scanner = new Scanner(System.in);
        int gamerNumber = scanner.nextInt();
        if (myNumber == gamerNumber) {
            System.out.println("Ты выйграл!");
        } else {
            System.out.println("Ты проиграл. Задумано число: "+myNumber);
        }
    }
}
