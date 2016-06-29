/**
 * Created by boreas320 on 16/6/29.
 */
public class Child extends  Father {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void sayMyName() {
        System.out.println(name);
    }
}
