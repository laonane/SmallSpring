package wiki.laona.springframework.test.bean.factory.config;

/**
 * @author laona
 * @description
 * @date 2022-08-04 15:23
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
