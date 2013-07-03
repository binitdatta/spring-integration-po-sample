package com.rollingstone.spring.integration.po.components;

/**
 * Spring @Trandformer Component for processing a vendor specific purchase order . 
 */

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.factory.PurchaseOrderUtil;

@Component
public class LocalPurchaseOrderCreator implements PurchaseOrderCreator {

	Logger logger = Logger.getLogger(LocalPurchaseOrderCreator.class);

	@Override
	@Transformer
	public VendorPurchaseOrderSummary createPurchaseOrder(
			PurchaseOrderSummary po) throws POException {
		logger.info("Reached Local Purchase Order Creator");

		return PurchaseOrderUtil.createVendorLocalHighValuePO(po);
	}
}
	