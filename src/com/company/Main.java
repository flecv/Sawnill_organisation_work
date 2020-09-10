package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
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
        int first_request = num.nextInt();
        int customer_request = first_customer.request(first_request);

        Woodnum_control controller = new Woodnum_control("Lusia", 22, 3);
        Accountant first_accountant = new Accountant("Mike", 37, 14, 2);
        Director director = new Director("Jozeph", 50, 20);
        Driver first_driver = new Driver("Sam", 30, 10, "Bus");
        Joiner first_joiner = new Joiner("Ken", 60, 40);
        Machine machine = new Machine(20);
        Cleaner cleaner = new Cleaner("Kate", 50, 25);

        int one_zero = controller.control(amount,customer_request);
        machine.Sawing(amount, 20);
        first_joiner.processing(customer_request, 10);
        cleaner.cleaning();
        int distance = 500;
        int speed = 60;

        if (one_zero == 1) {
            amount -= customer_request;
            System.out.println("Now we will deliver this wood to you. Distance between your workplace and sawmill is " + distance + ", driver speed is " + speed + ". Material will be deliver to you in " + first_driver.way_time(distance, speed) + " hours. Wait, please.\n");
            System.out.println("It will cost you " + first_accountant.money_count(customer_request, 400) + ". Please, pay this sum in an hour after wood will be delivered to you.\n");

            Thread.sleep(2000);

            final_money = start_money + first_accountant.money_count(customer_request,400);
            System.out.println("After request, company`s money is " + final_money + "\n");
            director.Corruption_control(start_money + first_accountant.money_count(customer_request,400), final_money);
        }

        System.out.println("After request company has " + amount + " of wood.\n");
        final_money = start_money + first_accountant.money_count(customer_request,400);

        Thread.sleep(2000);

        int money = final_money - first_driver.way_price((int) first_driver.way_time(distance, speed), 200);
        System.out.println("Prise fo the fuel was " + first_driver.way_price((int) first_driver.way_time(distance, speed), 200) + ". Finally we have " + money + " conditional units.\n");

        Thread.sleep(1000);

        director.Wood_amount_controll(amount);
        int supply = director.New_supply();
        System.out.println("Director made an order to " + supply + " amount of wood.\n");
        amount += supply;

        System.out.println("Now company has " + amount + " amount of wood.\n");
        System.out.println("Company is waiting for new offer...\n");
        Thread.sleep(3000);
        System.out.println("Company reseived new offer, director start to work with it.\n");

        Customer second_customer = new Customer("Alisia", 33);
        System.out.print(second_customer.name + " ask for ");
        int second_request = num.nextInt();
        System.out.print("wood.\n");

        one_zero = controller.control(amount, second_request);
        machine.Sawing(amount, 20);
        first_joiner.processing(customer_request, 10);
        cleaner.cleaning();
        distance = 1000;
        speed = 40;

        if (one_zero == 1) {
            amount -= customer_request;
            System.out.println("Now we will deliver this wood to you. Distance between your workplace and sawmill is " + distance + ", driver speed is " + speed + ". Material will be deliver to you in " + first_driver.way_time(distance, speed) + " hours. Wait, please.\n");
            System.out.println("It will cost you " + first_accountant.money_count(second_request, 1000) + ". Please, pay this sum in an hour after wood will be delivered to you.\n");

            Thread.sleep(2000);

            final_money = money + first_accountant.money_count(second_request,1000);
            System.out.println("After request, company`s money is " + final_money + "\n");
            final_money = (int) first_accountant.corruption(final_money, 0.1f);
            director.Corruption_control(money + first_accountant.money_count(second_request,1000), final_money);
        }

    }
}
