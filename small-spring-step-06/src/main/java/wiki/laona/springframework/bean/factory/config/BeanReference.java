package wiki.laona.springframework.bean.factory.config;

/**
 * Created by laona
 **/
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
