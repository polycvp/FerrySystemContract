package ferry.dto;

import java.io.Serializable;

/**
 * Contains information relevant to a users account. 
 * Extensions for this class are: PassangerDTO, AccountDetail and AccountSummary
 * @author Paul
 */
public abstract class AbstractAccount implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private long id;
    
    public AbstractAccount() {}
    
    public AbstractAccount(long id)
    {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
