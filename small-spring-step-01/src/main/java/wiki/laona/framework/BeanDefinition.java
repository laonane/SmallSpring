package wiki.laona.framework;

/**
 * Created by laona
 **/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition() {
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
