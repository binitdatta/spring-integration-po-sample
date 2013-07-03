package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;
import com.rollingstone.spring.integration.po.factory.PurchaseOrderUtil;

/**
 * Spring @Trandformer Component for transforming an internal purchase order into a vendor specific one. 
 */
@Component
public class ForeignPurchaseOrderCreator implements PurchaseOrderCreator {

	Logger logger = Logger.getLogger(ForeignPurchaseOrderCreator.class);

	@Override
	@Transformer
	public VendorPurchaseOrderSummary createPurchaseOrder(
			PurchaseOrderSummary po) throws POException {
		logger.info("Reached Foreign Purchase Order Creator");
		return PurchaseOrderUtil.createVendorForeignHighValuePO(po);
	}

}
