//********************************************************************
//  Tunes.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of objects.
//********************************************************************

import java.util.Scanner;

public class Tunes {
    // -----------------------------------------------------------------
    // Creates a CDCollection object and adds some CDs to it. Prints
    // reports on the status of the collection.
    // -----------------------------------------------------------------

    Scanner input = new Scanner(System.in);
    CDCollection music = new CDCollection();

    public static void main(String[] args) {
        new Tunes().menu();

    }

    public void menu() {
        System.out.println("Select Option:");
        System.out.println("1. View Collection");
        System.out.println("2. Add CD");
        System.out.println("3. Quit");
        System.out.println("---");
        String menuOption = input.nextLine();
        System.out.println("---");
        switch (Integer.parseInt("0" + menuOption)) {
            case 1:
                view();
                menu();
                break;
            case 2:
                try {
                    add();
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println(e);
                    add();
                }
                menu();
                break;
            case 3:
                break;
            default:
                menu();
                break;
        }
    }

    public void view() {
        System.out.println(music);
        System.out.println("---");
    }

    public void add() {
        System.out.println("Input Album Name: ");
        String name = input.nextLine();
        System.out.println("Input Album Artist: ");
        String artist = input.nextLine();
        System.out.print("Input Album Cost: $");
        Double cost = input.nextDouble();
        System.out.print("Input Track Count: ");
        int count = input.nextInt();
        music.addCD(name, artist, cost, count);
        System.out.println("---");
    }
}
