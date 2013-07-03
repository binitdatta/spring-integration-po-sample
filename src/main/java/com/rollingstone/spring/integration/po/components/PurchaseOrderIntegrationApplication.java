package com.rollingstone.spring.integration.po.components;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry Testing point of the application.
 */
public class PurchaseOrderIntegrationApplication {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/purchase-order-context.xml");
    }

}
