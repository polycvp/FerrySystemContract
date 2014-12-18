package ferry.dto;

import java.io.Serializable;
import java.util.Collection;


public class TravelDetail extends AbstractTravel implements Serializable {

    private static final long serialVersionUID = 1L;
    private AccountSummary reserver;
    private Collection<PassengerDTO> passengers;
    private Collection<AbstractVehicle> vehicles;
    private TrafficSummary trafficSummary;

    public TravelDetail(long id)
    {
        super(id);
    }

    public TravelDetail(long id, AccountSummary reserver,Collection<PassengerDTO> passengers, Collection<AbstractVehicle> vehicles, TrafficSummary trafficSummary)
    {
        super(id);
        this.reserver = reserver;
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.trafficSummary = trafficSummary;
    }

    public Collection<PassengerDTO> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Collection<PassengerDTO> passengers)
    {
        this.passengers = passengers;
    }

    public Collection<AbstractVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<AbstractVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public TrafficSummary getTrafficSummary() {
        return trafficSummary;
    }

    public void setTrafficSummary(TrafficSummary trafficSummary) {
        this.trafficSummary = trafficSummary;
    }
        
    

    public AccountSummary getReserver()
    {
        return reserver;
    }

    public void setReserver(AccountSummary reserver)
    {
        this.reserver = reserver;
    }
}
