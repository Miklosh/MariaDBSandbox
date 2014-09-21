package sandbox.maria.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mikola on 20.09.14.
 */
@Entity
@Table(name = "USER")
@DiscriminatorValue("U")
public class SlaveUserOne extends User {

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
