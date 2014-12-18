package ferry.dto;

import java.io.Serializable;
import java.util.Collection;


public class TravelSummary extends AbstractTravel implements Serializable 
{

    private static final long serialVersionUID = 1L;
    
    private AccountSummary reserver;
    private Collection<PassengerDTO> passengers;
    private Collection<AbstractVehicle> vehicles;
    private long trafficSummaryId;
    private PriceDTO price;
    private double totalPrice;

    public TravelSummary(long id)
    {
        super(id);
    }

    public TravelSummary(AccountSummary reserver, Collection<PassengerDTO> passengers, Collection<AbstractVehicle> vehicles, long trafficSummaryId, PriceDTO price, double totalPrice, long id)
    {
        super(id);
        this.reserver = reserver;
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.trafficSummaryId = trafficSummaryId;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public AccountSummary getReserver()
    {
        return reserver;
    }

    public void setReserver(AccountSummary reserver)
    {
        this.reserver = reserver;
    }

    public Collection<PassengerDTO> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(Collection<PassengerDTO> passengers)
    {
        this.passengers = passengers;
    }

    public Collection<AbstractVehicle> getVehicles()
    {
        return vehicles;
    }

    public void setVehicles(Collection<AbstractVehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public long getTrafficSummaryId()
    {
        return trafficSummaryId;
    }

    public void setTrafficSummaryId(long trafficSummaryId)
    {
        this.trafficSummaryId = trafficSummaryId;
    }

    public PriceDTO getPrice()
    {
        return price;
    }

    public void setPrice(PriceDTO price)
    {
        this.price = price;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }


    
}