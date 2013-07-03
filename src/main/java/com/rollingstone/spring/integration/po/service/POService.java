	package com.rollingstone.spring.integration.po.service;
	
	import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
	import com.rollingstone.spring.integration.po.exception.POException;
	
	/**
	 * Contract for communication with bank.
	 */
	public interface POService {
	
	    void pacePurchaseOrder(VendorPurchaseOrderSummary po) throws POException;
	    
	    void handlePOPlacementError(VendorPurchaseOrderSummary vpo) throws POException; 
	
	}
