package h_springinjectspel;

/**
 *
 * @author AMV
 */
public class MainConfig {
    
    private String name = "André Vala";
    private int age = 28;
    private float height = 1.70f;
    private boolean programmer = true;
    private long ageinseconds = 100000L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public long getAgeinseconds() {
        return ageinseconds;
    }

    public void setAgeinseconds(long ageinseconds) {
        this.ageinseconds = ageinseconds;
    }
}
