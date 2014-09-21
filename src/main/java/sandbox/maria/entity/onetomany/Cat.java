package sandbox.maria.entity.onetomany;

import sandbox.maria.entity.enums.CatType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mikola on 21.09.14.
 */
@Entity
public class Cat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @Enumerated
    private CatType catType;

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

    public CatType getCatType() {
        return catType;
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (catType != cat.catType) return false;
        if (!id.equals(cat.id)) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (catType != null ? catType.hashCode() : 0);
        return result;
    }
}
