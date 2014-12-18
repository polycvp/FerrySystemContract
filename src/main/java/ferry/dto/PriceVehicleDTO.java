package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class PriceVehicleDTO extends PriceDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private double carPrice,lorryPrice,largeMachineryPrice,personPrice,resindentDiscount;
    
    public PriceVehicleDTO(double personPrice, double residentDiscount) {
        super(personPrice, residentDiscount);
    }
    
    public PriceVehicleDTO(double personPrice, double residentDiscount,double carPrice,double lorryPrice, double largeMachineryPrice) {
        super(personPrice, residentDiscount);
        this.personPrice = personPrice;
        this.resindentDiscount = residentDiscount;
        this.carPrice = carPrice;
        this.lorryPrice = lorryPrice;
        this.largeMachineryPrice = largeMachineryPrice;
    }
    
    
}
