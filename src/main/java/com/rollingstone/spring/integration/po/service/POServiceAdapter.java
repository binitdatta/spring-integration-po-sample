package com.rollingstone.spring.integration.po.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;


@Service
public class POServiceAdapter implements POService {

	Logger logger = Logger.getLogger(POServiceAdapter.class);

 
	@Override
	public void pacePurchaseOrder(VendorPurchaseOrderSummary vpo)
			throws POException {
	
		logger.info("Final Step of the integration process Success : Vendor PO :"+vpo.toString());
	}

	@Override
	public void handlePOPlacementError(VendorPurchaseOrderSummary vpo)
			throws POException {
		logger.info("Final Step of the integration process Failure : Vendor PO :"+vpo.toString());

		
	}

}
