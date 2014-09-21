package sandbox.maria.entity.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mikola on 21.09.14.
 */

@Entity
public class Love implements Serializable {

    @Id
    private Long id;
    @NotNull
    private Boolean gained;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getGained() {
        return gained;
    }

    public void setGained(Boolean gained) {
        this.gained = gained;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Love)) return false;

        Love love = (Love) o;

        if (!gained.equals(love.gained)) return false;
        if (!id.equals(love.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + gained.hashCode();
        return result;
    }
}
