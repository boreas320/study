import org.junit.Test;

/**
 * Created by boreas320 on 16/6/29.
 */
public class InheritanceTest {
    @Test
    public void testInheritanceField() throws Exception {
        Child child = new Child();
        child.setName("haha");
        child.sayMyName();
        child.sayFamilyName();
    }
}
