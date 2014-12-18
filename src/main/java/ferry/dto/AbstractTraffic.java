package ferry.dto;

import java.io.Serializable;

/**
 *  Contains relevant information for representing a single entry in the ferry timetable
 *  Extensions to this class are: TrafficSummary and TrafficDetail
 * @author Rick
 */
public abstract class AbstractTraffic implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    public AbstractTraffic(long id) {
        this.id = id;
    }

    public AbstractTraffic() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
