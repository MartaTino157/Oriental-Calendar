/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientalcalendar;

import java.util.Scanner;

/**
 *
 * @author Alice
 */
public class App {
    public void run() {
        System.out.println(" ------- Восточный календарь ------- ");
        System.out.print("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        
        /*создали переменную начала 60-ти летнего цикла. По условию, 1984 - это отправная точка*/
        int beginOfChircle = 1984; 
       
        /*теперь вичисляем год начала ближайшего цикла к введенному году */
        if (year < 1984) {
            beginOfChircle = year-(60-((1984-year)%60));
        }
        if (year > 1984) {
            beginOfChircle = year-((year-1984)%60);
        }
        
        int k = year-beginOfChircle; /*k - коэффициент, вычисляем сколько лет прошло от начала цикла*/
        int colrNum = k/12; /*вычисляем номер цвета*/
        int animalNum = k%12; /*вычисляем номер животного*/
        
        /*создали текстовые переменные*/
        String colr = ""; 
        String animal = "";
        
        /*перечисляем соответствия*/
       switch(colrNum) {
            case 0: case 5:
                colr = "зеленый";
                break;
            case 1:
                colr = "красный";
                break;
            case 2:
                colr = "желтый";
                break;
            case 3:
                colr = "белый";
                break;
            case 4:
                colr = "черный";
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
        
        switch(animalNum){
            case 0: 
                animal = "крыса";
                break;
            case 1: 
                animal = "корова";
                break;
            case 2: 
                animal = "тигр";
                break;
            case 3: 
                animal = "заяц";
                break;
            case 4: 
                animal = "дракон";
                break;
            case 5: 
                animal = "змея";
                break;
            case 6: 
                animal = "лошадь";
                break;
            case 7: 
                animal = "овца";
                break;
            case 8: 
                animal = "обезьяна";
                break;
            case 9: 
                animal = "курица";
                break;
            case 10: 
                animal = "собака";
                break;
            case 11: 
                animal = "свинья";
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
        
        System.out.println("Цвет года - "+ colr +". Животное - "+ animal);
    }
}
