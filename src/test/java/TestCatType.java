import org.junit.Test;
import sandbox.maria.entity.enums.CatType;

/**
 * Created by Mikola on 21.09.14.
 */
public class TestCatType {

    @Test
    public void catTypeTest() {
        for (CatType cat : CatType.values()) {
            System.out.println(cat.name());
        }
    }
}
