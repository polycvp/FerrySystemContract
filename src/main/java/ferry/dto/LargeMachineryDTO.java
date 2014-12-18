package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Rick
 */
public class LargeMachineryDTO extends AbstractVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    public LargeMachineryDTO(String licensePlate) {
        super(licensePlate);
    }

    public LargeMachineryDTO() {
    }

}
