import java.util.Scanner;

public class Passenger {
    private String name;
    private int age;
    private String gender;
    private int reqBusNo;
    private int seatsReq;

    public void gettingPassData(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Bus.map);
        System.out.println("Enter bus no");
        this.reqBusNo = sc.nextInt();
        String x = Bus.map.keySet().contains((reqBusNo))?"bus is avail with " + Bus.map.get(reqBusNo).get(2) + "seats":"no such bus no";
        System.out.println(x);
        System.out.println("Enter no seats");
        this.seatsReq = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<seatsReq;i++){
            System.out.print("Enter Name");
            this.name = sc.nextLine();
            System.out.println("Enter age");
            this.age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter gender");
            this.gender = sc.nextLine();
        }
        
        Bus busInstance = new Bus();
        busInstance.UpdateSeats(reqBusNo,seatsReq);
        busInstance.TotalPrice(reqBusNo,seatsReq);

      
}
}

