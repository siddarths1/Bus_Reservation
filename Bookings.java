import java.util.Scanner;

public class Bookings {
    public static void main(String arg[]){
        int cond=1;
        while(cond==1){
            Scanner s = new Scanner(System.in);
            Bus b = new Bus();
            b.BusDetails();
            System.out.println("Enter 1 to book or 2 to exit");
            cond=s.nextInt();
            if(cond==1){
                System.out.println("booking");
                Passenger p = new Passenger();
                p.gettingPassData();
            }
            else{
                System.out.println("Thank you");
            }
        }
    }
}
