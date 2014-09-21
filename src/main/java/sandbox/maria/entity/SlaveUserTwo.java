package sandbox.maria.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mikola on 20.09.14.
 */
@Entity
@Table(name = "USER")
@DiscriminatorValue("S")
public class SlaveUserTwo extends User {

    private Boolean haveCar;

    public Boolean getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(Boolean haveCar) {
        this.haveCar = haveCar;
    }
}
