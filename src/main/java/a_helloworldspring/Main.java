package a_helloworldspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author AMV
 */

public class Main {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xml = new XmlBeanDefinitionReader(factory);
        xml.loadBeanDefinitions(new FileSystemResource("src/main/resources/a_bean.xml"));
        Display d = (Display) factory.getBean("mensageiro");
        //Display d = factory.getBean("mensageiro", Display.class); //identico linha cima
        System.out.println(d.getMensagem());
    }
}





