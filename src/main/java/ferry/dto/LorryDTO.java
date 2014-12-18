package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Rick
 */
public class LorryDTO extends AbstractVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    public LorryDTO(String licensePlate) {
        super(licensePlate);
    }

    public LorryDTO() {
    }

}
