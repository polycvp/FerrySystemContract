package ferry.dto;

import java.io.Serializable;

/**
 * Contains relevant travel information for a users journey
 * Extensions for this class are: TravelDetail and TravelSummary
 * @author Paul
 */
public abstract class AbstractTravel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private long id;

    public AbstractTravel()
    {
    }

    public AbstractTravel(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}
