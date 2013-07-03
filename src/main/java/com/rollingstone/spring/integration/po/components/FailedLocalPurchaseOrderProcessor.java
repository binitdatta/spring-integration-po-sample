package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.service.POService;

/**
 * Component for handling failure processing local purchase orders
 */

@Component
public class FailedLocalPurchaseOrderProcessor {

	Logger logger = Logger.getLogger(FailedLocalPurchaseOrderProcessor.class);

	   @Autowired
	    POService purcaseOrderService;

	    @ServiceActivator
	    public void handlePOPlacementError(VendorPurchaseOrderSummary vpo) throws POException {
	    	logger.info("Failed Local Purchase Order Processing :"+vpo.getPoNumber());

	    	purcaseOrderService.handlePOPlacementError(vpo);
	    }
}
