package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.service.POService;

/**
 * Component for handling failure processing rate contract purchase orders 
 */

@Component
public class FailedRateContractPurchaseOrderProcessor {

	Logger logger = Logger.getLogger(FailedRateContractPurchaseOrderProcessor.class);

	   @Autowired
	    POService purcaseOrderService;

	    @ServiceActivator
	    public void handlePOPlacementError(VendorPurchaseOrderSummary vpo) throws POException {
	    	logger.info("Failed Rate Contract Purchase Order Processing :"+vpo.getPoNumber());

	    	purcaseOrderService.handlePOPlacementError(vpo);
	    }

}
