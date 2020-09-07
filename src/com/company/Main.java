package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int start_money = 1000;
        int final_money;
        System.out.println("Enter start amount of wood in sawmill");
        int amount = num.nextInt();
        System.out.println("Enter name of the customer");
        String name = str.nextLine();
        System.out.println("and his/her age");
        int age = num.nextInt();
        Customer first_customer = new Customer(name, age);
        System.out.println("Enter amount of wood customer`s want");
        int request = num.nextInt();
        int customer_request = first_customer.request(request);
        Woodnum_control controller = new Woodnum_control("Lusia", 22, 3);
        Accountant first_accountant = new Accountant("Mike", 37, 14, 2);
        int one_zero = controller.control(amount,customer_request);
        if (one_zero == 1) {
            amount -= customer_request;
            int distance = 500;
            int speed = 60;
            Driver first_driver = new Driver("Sam", 30, 10, "Bus");
            System.out.println("Now we will deliver this wood to you. Distance between your workplace and sawmill is " + distance + ", driver speed is " + speed + ". Material will be deliver to you in " + first_driver.way_time(distance, speed) + " hours. Wait, please.");
            System.out.println("It will cost you " + first_accountant.money_count(customer_request, 400) + ". Please, pay this sum in an hour after wood will be delivered to you.");

        }
        Director director = new Director("Jozeph", 50, 20);
        final_money = start_money + first_accountant.money_count(customer_request,400);
        director.Corruption_control(start_money + first_accountant.money_count(customer_request,400), final_money);
        director.Wood_amount_controll(amount);

    }
}
