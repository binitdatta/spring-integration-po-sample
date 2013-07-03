package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.service.POService;

/**
 * Component for handling failure processing foreign purchase orders
 */

@Component
public class FailedForeignPurchaseOrderProcessor {

	Logger logger = Logger.getLogger(FailedForeignPurchaseOrderProcessor.class);

	   @Autowired
	    POService purcaseOrderService;

	    @ServiceActivator
	    public void handlePOPlacementError(VendorPurchaseOrderSummary vpo) throws POException {
	    	logger.info("Failed Foreign Purchase Order Processing :"+vpo.getPoNumber());

	    	purcaseOrderService.handlePOPlacementError(vpo);
	    }

}
