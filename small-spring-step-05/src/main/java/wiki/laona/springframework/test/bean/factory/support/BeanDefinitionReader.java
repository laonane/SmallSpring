package wiki.laona.springframework.test.bean.factory.support;

import wiki.laona.springframework.test.bean.BeansException;
import wiki.laona.springframework.core.io.Resource;
import wiki.laona.springframework.core.io.ResourceLoader;

/**
 * Created by laona
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
