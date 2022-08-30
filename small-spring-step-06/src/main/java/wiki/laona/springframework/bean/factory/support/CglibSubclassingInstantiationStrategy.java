package wiki.laona.springframework.bean.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import wiki.laona.springframework.bean.BeansException;
import wiki.laona.springframework.bean.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Created by laona
 **/
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition,
                              String beanName,
                              Constructor ctor,
                              Object[] args) throws BeansException {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) {
            return enhancer.create();
        }
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
