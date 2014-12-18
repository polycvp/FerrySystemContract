package ferry.dto;

import java.io.Serializable;

public class ReservationSummary extends AbstractReservation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private TravelSummary travelSummary;
    private String receipt;

    public ReservationSummary(String reservationSerialNumber)
    {
        super(reservationSerialNumber);
    }

    public ReservationSummary(String reservationSerialNumber, TravelSummary travelSummary, String receipt)
    {
        super(reservationSerialNumber);
        this.travelSummary = travelSummary;
        this.receipt = receipt;
    }

    public TravelSummary getTravelSummary() {
        return travelSummary;
    }

    public void setTravelSummary(TravelSummary travelSummary) {
        this.travelSummary = travelSummary;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
    
    
}
