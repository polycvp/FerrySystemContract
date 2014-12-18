package ferry.dto;

import java.io.Serializable;

/**
 * Contains relevant information for making a reservation. 
 * Extensions for this class are: ReservationDetail and ReservationSummary
 * @author Paul
 */
public abstract class AbstractReservation implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private String reservationSerialNumber;      

    public AbstractReservation()
    {
    }

    public AbstractReservation(String reservationSerialNumber)
    {
        this.reservationSerialNumber = reservationSerialNumber;
    }

    public String getReservationSerialNumber()
    {
        return reservationSerialNumber;
    }

    public void setReservationSerialNumber(String reservationSerialNumber)
    {
        this.reservationSerialNumber = reservationSerialNumber;
    }
}
