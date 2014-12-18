package ferry.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class ReservationDetail extends AbstractReservation implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private AccountSummary reserver;
    private Collection<PassengerDTO> passengers;
    private Collection<AbstractVehicle> vehicles;
    private String departurePort;
    private String destinationPort;
    private Date departureTime;
    private Date arrivalTime;
    private double totalPrice;

    public ReservationDetail(String reservationSerialNumber)
    {
        super(reservationSerialNumber);
    }

    public ReservationDetail(AccountSummary reserver, Collection<PassengerDTO> passengers, Collection<AbstractVehicle> vehicles, String departurePort, String destinationPort, Date departureTime, Date arrivalTime, double totalPrice, String reservationSerialNumber)
    {
        super(reservationSerialNumber);
        this.reserver = reserver;
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
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

    public String getDeparturePort()
    {
        return departurePort;
    }

    public void setDeparturePort(String departurePort)
    {
        this.departurePort = departurePort;
    }

    public String getDestinationPort()
    {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort)
    {
        this.destinationPort = destinationPort;
    }

    public Date getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime)
    {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime)
    {
        this.arrivalTime = arrivalTime;
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
