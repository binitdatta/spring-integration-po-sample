package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.service.POService;

/**
 * Spring  Component for processing a vendor specific purchase order . 
 */
@Component
public class LocalPurchaseOrderProcessor {

	Logger logger = Logger.getLogger(LocalPurchaseOrderProcessor.class);

	   @Autowired
	    POService purcaseOrderService;

	    @ServiceActivator
	    public void pacePurchaseOrder(VendorPurchaseOrderSummary vpo) throws POException {
	    	logger.info("Reached LocalPurchaseOrderProcessor... placing purchase order");

	    	purcaseOrderService.pacePurchaseOrder(vpo);
	    }
}
