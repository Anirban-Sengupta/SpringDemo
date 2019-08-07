package spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Drawing {

	public static void main(String[] args) {
    Resource resource=new ClassPathResource("SpringXML.xml");
	BeanFactory fac=new XmlBeanFactory(resource);
	fac.getBean("triangle");
	Triangle triangle = (Triangle)fac.getBean("triangle");
	triangle.draw();
	}

}
