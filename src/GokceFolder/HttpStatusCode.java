package GokceFolder;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HttpStatusCode {
    public static void main(String[] args) {
        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();

        switch (status){
            case 201:
                System.out.println("created");
                break;
            case 400:
                System.out.println("bad request");
                break;
            case 999:
                System.out.println("invalid status code");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 404:
                System.out.println("Not found");
                break;
            default:

        }







    }
}
