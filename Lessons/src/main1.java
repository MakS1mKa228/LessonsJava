import java.util.Scanner;
public class main1  {
  public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        float n = 0;
        int b = 1;
        System.out.println("Сиглал окончания программы -- 0");
        System.out.println("Введите выражение(я): ");
        while(n != 0 || b==1) {
            b = 0;
            n = in.nextFloat();
            if(n==0) return;
            Calc calculator = new Calc(n, in.next(), in.nextFloat());


        }
  }
         static class Calc{
        void okay(){
            System.out.println("Все выпольнилось без ошибок!");
            return;
        }
        Calc(float peremens, String deist, float peremens2){
            switch (deist){
               case "+":  // Сложение
               if(peremens+peremens2 == (int)(peremens+peremens2))
                   System.out.println((int)(peremens + peremens2));

               else
                   System.out.println(peremens + peremens2);
               okay();
               break;
               case "-": // Вычитание
                   if(peremens-peremens2 == (int)(peremens-peremens2))
                   System.out.println((int)(peremens + peremens2));

               else
                    System.out.println(peremens - peremens2);
                    okay();
               break;
               case "*" : // Умножение
                   if(peremens*peremens2 == (int)(peremens*peremens2))
                       System.out.println((int)(peremens * peremens2));
                   else
                       System.out.println(peremens * peremens2);
                   okay();
               break;
               case "/": // Деление
                   if(peremens2 == 0){ System.out.println("На нуль делить нельзя!"); return;}
                   if(peremens/peremens2 == (int)(peremens/peremens2))
                       System.out.println((int)(peremens / peremens2));
                   else
                       System.out.println(peremens / peremens2);
                   okay();
               break;
               case "%": // Остаток от деления
               if(peremens == (int)peremens && peremens2 == (int)peremens2 && peremens2!=0)
                   System.out.println((int)peremens % (int)peremens2);

               else{ System.out.println("Опереция не может быть выполнена!"); return;}
               okay();
               break;
           }
    }
}
}