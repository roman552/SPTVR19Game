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
        int min = 0;
        int max = 10;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;
        System.out.println("Задумано число от "+min+" до " +max+ ".Угадай!");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do{
            int gamerNumber = scanner.nextInt();
            if (myNumber == gamerNumber) {
                System.out.println("Ты выйграл!");
                break;
            } else {
                if(attempt < 3) {
                   if(myNumber < gamerNumber){
                       System.out.println("Не угадал, заданое число меньше. Попробуй еще: "); 
                   } else{
                       System.out.println("Не угадал, заданое число больше. Попробуй еще: "); 
                   }
                }else {
                    System.out.println("Ты проиграл. Задумано число: "+myNumber);
                    break;
                }
            }
            attempt++;
        }while(true);
    }
}
