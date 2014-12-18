package ferry.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rick
 */
public class TrafficSummary extends AbstractTraffic implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ferry;
    private String departurePort;
    private String destinationPort;
    private Date departureTime;
    private Date arrivalTime;
    private PriceDTO price;

    public TrafficSummary(long id, String ferry, String departurePort, String destinationPort, Date departureTime, Date arrivalTime, PriceDTO price) {
        super(id);
        this.ferry = ferry;
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public TrafficSummary(long id) {
        super(id);
    }

    public TrafficSummary() {
    }

    public String getFerry() {
        return ferry;
    }

    public void setFerry(String ferry) {
        this.ferry = ferry;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

}
