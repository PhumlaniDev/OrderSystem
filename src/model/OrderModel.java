package model;

import java.util.Scanner;

public class OrderModel {

    public static int again;
    public static int choose,quantity = 0;
    public static double total, pay;

    final static Scanner input = new Scanner(System.in);

    public OrderModel() {

    }

    public static void Menu(){

        System.out.println();
        System.out.println("\t````````````````````````````````````Menu`````````````````````````````````````````");
        System.out.println("\t\t1. Snacks");
        System.out.println("\t\t2. Hot Drinks (Coffee, Hot Chocolates , Tea)");
        System.out.println("\t\t3. Breakfast");
        System.out.println("\t\t4. Lunch");
        System.out.println("\t\t5. Dinner");
        System.out.println("\t\t6. Dessert");
        System.out.println("\t\t7. Adult Drink (Beer, Whisk(e)y, Wine)");
        System.out.println("\t\t8. Cold Drink (Acidic Drink, Juice, Iced Tea, Sparkling & Still Water)");
        System.out.println("\t\t9. Exit");
        System.out.println("\t`````````````````````````````````````````````````````````````````````````````````");
    }

    public static void showSnackMenu(){

        System.out.println();
        System.out.println("\t````````````````````````````````````Snacks```````````````````````````````````````");
        System.out.println("\t\t\t1. Cocktail Sausage                                       R15");
        System.out.println("\t\t\t2. Hot chips                                              R15");
        System.out.println("\t\t\t3. Sandwich                                               R35");
        System.out.println("\t\t\t4. Sweats or Chocolate                                    R12");
        System.out.println("\t\t\t5. Peanuts or Cashews                                     R9");
        System.out.println("\t\t\t6. Cookies                                                R10");
        System.out.println("\t\t\t7. Ice Cream                                              R13");
        System.out.println("\t\t\t8. Fruit Salad                                            R25");
        System.out.println("\t\t\t8. Muffin                                                 R15");
        System.out.println("\t`````````````````````````````````````````````````````````````````````````````````");
    }

    public static void Order() {

        showSnackMenu();

        choose = input.nextInt();

        switch (choose) {
            case 1:
                if (choose == 1) {
                    System.out.println("You Selected Cocktails Sausage");
                    System.out.println("How many you want to order?: ");
                    quantity = input.nextInt();
                    total = total + (quantity * 15);

                    System.out.println("You want to order again?");
                    System.out.println();
                    System.out.println("Press 1 for YES or 2 for NO");

                    again = input.nextInt();

                    if (again == 1) {
                        Menu();
                        if (choose == 1){
                            showSnackMenu();
                        }
                    } else {
                        System.out.println("Total price is: " + total);
                    }
                }
                break;

        }


    }

}
