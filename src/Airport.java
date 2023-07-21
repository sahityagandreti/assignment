import java.util.ArrayList;


public class Airport {
	private static final String SeatNumber = null;


	Address address;
	
	
	ArrayList<Flight> flights;
	ArrayList<Flight> flist= new ArrayList<>();
	ArrayList<Traveller> travellers;
	ArrayList<Flight> tlist= new ArrayList<>();
	
	public boolean addFlight(Flight flight)
        { 
        	flights.add(flight);

            return true;

        }
   
    public boolean searchFlightBySourceAndDestination(String Source,String Destination)
    {

      if(flights.contains(Source) && flights.contains(Destination)) {

    	  	return true;
      }
      return false;

    }
    public void bookTicket(String flightId,Flight traveller)
    {
    	
      for(int i=0;i<flist.size();i++)
      {
    	  
    	 if((flist.get(i)).getId()==Traveller.getFlightId() &&((flist.get(i)).getAvailableSeats()!=0))

          {
    	  		tlist.add(traveller);
                flist.get(i).setAvailableSeats((flist.get(i)).getAvailableSeats()-1);
                System.out.println(true);

                 }

            

      System.out.println(false);

            

        }
    }
}
    
    
    
		



