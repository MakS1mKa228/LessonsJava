import java.util.Scanner;
public class main2 extends main1 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Введите кол-во человек: ");
    int n = in.nextInt();
    String name;
    int age;
    String pol;
    System.out.println("Введите их Пол, Возраст и ФИО: ");
    person a [] = new person[n];
    for(int i=0; i<n; i++){
        pol = in.next();
        age = Integer.parseInt(in.next());
        name = in.nextLine();
        a [i] = new person(name, age, pol);
    }
    for(int i=0; i<n; i++ ) {
        a [i].displayInfo();
    }
    in.close();
    }
    static class person{
        String name; //Имя
        int age;	//Возраст
        String pol;   // Пол
        person(){
            name="Не определено";
            age=16;
            pol = "Не определен";
        }
        person(String name){
            this.name=name;
            age=16;
            pol = "Не определен";
        }
        person(String name, int age){
            this.name=name;
            if(age>=0 && age<=110)
                this.age=age;
            else
                this.age=16;
            pol = "Не определен";
        }
        person(String name, int age, String  pol){
            this.name=name;
            if((age>=0 && age<=110) && ((pol=="Женский"|| pol=="Ж" || pol=="Жен") || (pol=="Мужской"|| pol=="М" || pol=="Муж"))) {
                this.age = age;
                this.pol = pol;
            }
            else {
                this.age = 16;
                this.pol ="Не определен";
            }
        }

        void displayInfo() {
           // System. out.printf("Имя: %s\tВозраст: %d\tПол: %s\n", this.name, this.age,this.pol);
            System.out.format("Имя:%-10s %Возраст:-20d Пол:%-10s", this.name, this.age,this.pol);
        }
    }
}
