import java.util.ArrayList;
import java.util.HashMap;

public class Bus {
    static HashMap<Integer, ArrayList<String>> map = new HashMap<>();
    static ArrayList<String> values = new ArrayList<>();
    static  ArrayList<String> values2 = new ArrayList<>();
    public void BusDetails(){
	    
	    values.add("Cbe to bang");
        values.add("Ac");
        values.add("30");
        values.add("02/10/2023");
        values.add("500");
        map.put(1, values);
       
	    values2.add("chennai to bang");
        values2.add("Ac");
        values2.add("20");
        values2.add("03/10/2023");
        values2.add("800");
        map.put(2, values2);
        System.out.println(map); 
       
    }
   
    public void UpdateSeats(int busNo,int seatsReq){
        String seat = map.get(busNo).get(2);
        int updatedseat = Integer.valueOf(seat)-seatsReq;  
        if(busNo==1){
        values.set(2,String.valueOf(updatedseat));
        }
        else{
            values2.set(2,String.valueOf(updatedseat));
        }
        // System.out.println("updated map");
        // System.out.println(map);
    }
    public void TotalPrice(int reqBusNo,int seatsReq){
        String SeatPrice = map.get(reqBusNo).get(4);
        int TicketPrice = Integer.valueOf(SeatPrice)*seatsReq;
        System.out.println("Ticket Price is :" +TicketPrice);
    }
}
