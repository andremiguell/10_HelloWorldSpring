package i_springinjectconstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
@Service("main")
public class Main {
    
    @Value("André Vala")
    private String name;
    
    @Value("28")
    private int age;
    
    private float height;
    private boolean programmer;
    private long ageinseconds;

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

    @Override
    public String toString() {
        return "Main{" + "name=" + name + ", age=" + age + ", height=" + height + ", programmer=" + programmer + ", ageinseconds=" + ageinseconds + '}';
    }
    
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);
        Main m = ctx.getBean("main", Main.class);
        System.out.println(m);
    }
}
