package ferry.dto;

import java.io.Serializable;

/**
 *  Contains all relevant information for representing the vehicles
 *  Extension classes are: CarDTO, LorryDTO, LargeMachineryDTO
 * @author Rick
 */
public abstract class AbstractVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String licensePlate;

    public AbstractVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public AbstractVehicle() {
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
