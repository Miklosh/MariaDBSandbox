package sandbox.maria.entity;

import javax.persistence.Entity;

/**
 * Created by Mikola on 20.09.14.
 */
@Entity
public class SlaveUserTwo extends User {

    private Boolean haveCar;

    public Boolean getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(Boolean haveCar) {
        this.haveCar = haveCar;
    }
}
