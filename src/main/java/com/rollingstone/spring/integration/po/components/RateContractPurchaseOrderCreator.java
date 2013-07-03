package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.factory.PurchaseOrderUtil;

/**
 * Spring @Trandformer Component for processing a vendor specific purchase order . 
 */

@Component
public class RateContractPurchaseOrderCreator implements PurchaseOrderCreator {

	Logger logger = Logger.getLogger(RateContractPurchaseOrderCreator.class);

    @Override
	@Transformer
	public VendorPurchaseOrderSummary createPurchaseOrder(
			PurchaseOrderSummary po) throws POException {
    	logger.info("Rate Contract Purchase Order Creator...");
		return PurchaseOrderUtil.createVendorRateContractPO(po);
	}

}
