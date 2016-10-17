/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellokitty;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class HelloKitty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        int a;
        int b;
//        
//        System.out.print("Введите сторону А: ");
//        a = sn.nextInt();
//        System.out.print("Введите сторону B: ");
//        b = sn.nextInt();
//        int s = a*b;
//        int perimetr = 2*a+2*b; 
//        System.out.println("Perimtr prjamougoljnika  p = "+perimetr);
//        System.out.println("Площадь прямоугольника S = "+s);
//        
        // вводим необходимые для расчетов ширину, длинну, и высоту
        float StripeWidth = 0.55f;
        
        System.out.print("hight room : ");
        float hight = sn.nextFloat();
        System.out.print("length room : ");
        float length= sn.nextFloat();
        System.out.print("width room : ");
        float width= sn.nextFloat();
        
        //расчитываем периметр помещения
        float perimetr = width*2+length*2;
        System.out.println("perimeter"+ perimetr);
        
        // вычисляем количество полосок на данный периметр
        int StripesNumber = (int) Math.ceil(perimetr/StripeWidth);
//        System.out.println(perimetr/StripeWidth);
//        System.out.println(Math.ceil(perimetr/StripeWidth));
        System.out.println(StripesNumber);
        // вычисляем количество полосок в одном рулоне
        int StripesInRoll = (int)(10/hight);
        
        
        
        // вычисляем сколько рулонов у нас уйдет на эту комнату
        int NumberOfRolls =  StripesNumber/StripesInRoll ;
        // выводим результат
        System.out.println("Вам нужно "+NumberOfRolls+" рулонов наших крутых обоев");
        
      //  System.out.println("leght room   = ");
        
        
        
        
        
    }
    
}
