package model;

import java.util.Scanner;

public class OrderModel {

    public static int again;
    public static int choose,quantity = 0;
    public static double total, pay;

    final static Scanner input = new Scanner(System.in);

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
        System.out.println("\t\t\t9. Muffin                                                 R15");
        System.out.println("\t`````````````````````````````````````````````````````````````````````````````````");
    }

    public static void Order() {

        showSnackMenu();

        choose = input.nextInt();

        /*
        *Using switch statement since a user will be choosing from different options
        *
        *All of the case have similar code for different product with different prices
        * */
        switch (choose) {
            case 1:
                System.out.println("You Selected Cocktails Sausage");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 15);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                   showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 2:
                System.out.println("You Selected Hot chips");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 15);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 3:
                System.out.println("You Selected Sandwich");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 35);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 4:
                System.out.println("You Selected Sweats or Chocolate");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 12);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 5:
                System.out.println("You Selected Peanuts or Cashews  ");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 9);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 6:
                System.out.println("You Selected Cookies");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 10);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 7:
                System.out.println("You Selected Ice Cream");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 13);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 8:
                System.out.println("You Selected Fruit Salad");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 25);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                if (again == 1) {
                    showSnackMenu();
                } else {
                    System.out.println("Total price is: " + total);
                }
                break;

            case 9:
                System.out.println("You Selected Muffin");
                System.out.println("How many you want to order?: ");
                quantity = input.nextInt();
                total = total + (quantity * 15);

                System.out.println("You want to order again?");
                System.out.println();
                System.out.println("Press 1 for YES or 2 for NO");

                again = input.nextInt();

                    if (again == 1){
                        showSnackMenu();
                    }
                    else {
                        System.out.println("Total price is: " + total);
                    }
                    break;
        }
    }
}
