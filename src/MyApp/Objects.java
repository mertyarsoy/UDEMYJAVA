package MyApp;

import java.util.Scanner;

class Methods {
    String animal;
    int value;
    int month;

    void run() {
        System.out.println("Running");
        for (int i = 0; i < 4; i++) {
            System.out.println("My " + animal + " is " + value + " years old");
            value++;
        }
    }

    void calculateMonthsToBirthday(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your month: ");
        int input = scanner.nextInt();
        int monthsLeft = input - month;
        System.out.println("Month left: "+monthsLeft);
    }
}



public class Objects {
    public static void main(String[] args) {

        Methods name = new Methods();
        name.animal = "Cat";
        name.value = 9;
        name.run();
        name.month = 8;
        name.calculateMonthsToBirthday();


    }
}
