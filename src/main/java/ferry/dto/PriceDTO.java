package ferry.dto;

import java.io.Serializable;

/**
 * Contains all the prices for each ferry trip plus the resident discount
 * Extension classes are: PriceVehicleDTO
 * @author Paul
 */
public class PriceDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private double personPrice;
    private double residentDiscount;

    public PriceDTO(double personPrice, double residentDiscount) {
        this.personPrice = personPrice;
        this.residentDiscount = residentDiscount;
    }

    public double getPersonPrice() {
        return personPrice;
    }

    public void setPersonPrice(double personPrice) {
        this.personPrice = personPrice;
    }

    public double getResidentDiscount() {
        return residentDiscount;
    }

    public void setResidentDiscount(double residentDiscount) {
        this.residentDiscount = residentDiscount;
    }

}
