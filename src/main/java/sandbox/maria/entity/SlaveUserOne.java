package sandbox.maria.entity;

import javax.persistence.Entity;

/**
 * Created by Mikola on 20.09.14.
 */
@Entity
public class SlaveUserOne extends User {

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
