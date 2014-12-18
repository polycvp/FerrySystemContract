package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Rick
 */
public class CarDTO extends AbstractVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    public CarDTO(String licensePlate) {
        super(licensePlate);
    }

    public CarDTO() {
    }

}
