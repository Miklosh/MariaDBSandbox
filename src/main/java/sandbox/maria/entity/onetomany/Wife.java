package sandbox.maria.entity.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mikola on 21.09.14.
 */

@Entity
public class Wife implements Serializable{

    @Id
    private Long id;
    @NotNull
    private String name;
    private Boolean isSheGoodToMe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsSheGoodToMe() {
        return isSheGoodToMe;
    }

    public void setIsSheGoodToMe(Boolean isSheGoodToMe) {
        this.isSheGoodToMe = isSheGoodToMe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wife)) return false;

        Wife wife = (Wife) o;

        if (!id.equals(wife.id)) return false;
        if (isSheGoodToMe != null ? !isSheGoodToMe.equals(wife.isSheGoodToMe) : wife.isSheGoodToMe != null)
            return false;
        if (!name.equals(wife.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (isSheGoodToMe != null ? isSheGoodToMe.hashCode() : 0);
        return result;
    }
}
