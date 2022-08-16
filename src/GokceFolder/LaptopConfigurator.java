package GokceFolder;

import java.util.Scanner;

public class LaptopConfigurator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size, cpu, storage, resolution;
        int ram, memory;
        double price=0;

        System.out.println("Select screen size:");
        size=scan.nextLine();

        if(size.equals("13.3"))
        {
            price+=200;
        }
        else if(size.equals("15.0"))
        {
            price+=300;
        }
        else if(size.equals("17.3"))
        {
            price+=400;
        }

        System.out.println("Select CPU type:");
        cpu=scan.nextLine();
        if(cpu.equals("i3"))
        {
            price+=150;
        }
        else if(cpu.equals("i5"))
        {
            price+=250;
        }
        else if(cpu.equals("i7"))
        {
            price+=350;
        }

        System.out.println("Select RAM size:");
        ram=scan.nextInt();
        price+=(ram/4)*50;

        scan.nextLine();

        System.out.println("Select storage type:");
        storage=scan.nextLine();

        System.out.println("Enter memory size:");
        memory=scan.nextInt();

        if(storage.equals("HDD"))
        {
            price+=(memory/500)*50;
        }
        else if(storage.equals("SSD"))
        {
            price+=(memory/500)*100;
        }

        scan.nextLine();

        System.out.println("Enter screen resolution:");
        resolution=scan.nextLine();
        if(resolution.equals("FULLHD"))
        {
            price+=100;
        }
        else if(resolution.equals("4K"))
        {
            price+=200;
        }

        System.out.println("Laptop price is: $"+price);



    }
}
