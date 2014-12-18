package ferry.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rick
 */
public class TrafficDetail extends AbstractTraffic implements Serializable {

    private static final long serialVersionUID = 1L;

    private String departurePort;
    private String destinationPort;
    private Date departureTime;

    public TrafficDetail(long id, String departurePort, String destinationPort, Date departureTime) {
        super(id);
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureTime = departureTime;
    }

    public TrafficDetail(long id) {
        super(id);
    }

    public TrafficDetail() {
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

}
