package com.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCard {
    public static void main(String[] args) {
	    Resource r = new ClassPathResource("pancard.xml");
	    BeanFactory factory = new XmlBeanFactory(r);
	    PanCard card = factory.getBean("pancard",PanCard.class);
	    System.out.println(card);
	}
}
