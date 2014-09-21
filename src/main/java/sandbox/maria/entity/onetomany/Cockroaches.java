package sandbox.maria.entity.onetomany;

import sandbox.maria.entity.enums.HierarchyPosition;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mikola on 21.09.14.
 */
@Entity
public class Cockroaches implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @Enumerated
    private HierarchyPosition hierarchyPosition;

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

    public HierarchyPosition getHierarchyPosition() {
        return hierarchyPosition;
    }

    public void setHierarchyPosition(HierarchyPosition hierarchyPosition) {
        this.hierarchyPosition = hierarchyPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cockroaches)) return false;

        Cockroaches that = (Cockroaches) o;

        if (hierarchyPosition != null ? !hierarchyPosition.equals(that.hierarchyPosition) : that.hierarchyPosition != null)
            return false;
        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (hierarchyPosition != null ? hierarchyPosition.hashCode() : 0);
        return result;
    }
}
