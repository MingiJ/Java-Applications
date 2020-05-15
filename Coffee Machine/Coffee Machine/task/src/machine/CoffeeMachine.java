package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: \n" +
                "\n" +
                "Write how many ml of milk the coffee machine has: \n" +
                "\n" +
                "Write how many grams of coffee beans the coffee machine has:\n");
        int waterAvailable = scanner.nextInt();
        int milkAvailable = scanner.nextInt();
        int beansAvailable = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");

        int cupsOfCoffee = scanner.nextInt();
        int amountWater = cupsOfCoffee*200;
        int amountMilk = cupsOfCoffee*50;
        int amountCoffeeBeans = cupsOfCoffee*15;
        int[]requestedCoffee = {amountWater,amountMilk,amountCoffeeBeans};
        int[]feasibleCoffee = {waterAvailable,milkAvailable,beansAvailable};
        canMakeCoffee(requestedCoffee,feasibleCoffee,cupsOfCoffee);


    }

    private static void canMakeCoffee(int[]requestedCoffee,int[]feasibleCoffee, int cups) {
        if(feasibleCoffee[0]==200&&feasibleCoffee[1]==50&&feasibleCoffee[2]==15) {
            int numberOfCups = howManyCups(requestedCoffee,feasibleCoffee);
            String output = String.format("Yes I can make that amount of coffee");
        }
        else if (feasibleCoffee[0]>requestedCoffee[0]&&feasibleCoffee[1]>requestedCoffee[1]&&feasibleCoffee[2]>requestedCoffee[2])
        {
            int numberOfCups = howManyCups(requestedCoffee,feasibleCoffee);
            String output2 = String.format("No I can make only %d cup(s) of coffee", numberOfCups);

            if (numberOfCups>cups) {
                numberOfCups -= cups;
                String output = String.format("Yes I can make that amount of coffee(and even %d more than that)", numberOfCups);
                System.out.println(output);

            }
            else if(numberOfCups<cups)
                System.out.println(output2);

        }
        else
            System.out.println("No, I can make only 0 cup(s) of coffee");
    }

    private static int howManyCups(int[]requestedCoffee,int[]feasibleCoffee) {
        return feasibleCoffee[1]/requestedCoffee[1];

    }
}
