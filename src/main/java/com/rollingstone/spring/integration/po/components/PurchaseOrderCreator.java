package com.rollingstone.spring.integration.po.components;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;
import com.rollingstone.spring.integration.po.exception.POException;

/**
 * Creates vendor specific purchase order from internal purchase orders.
 */
public interface PurchaseOrderCreator {

    VendorPurchaseOrderSummary createPurchaseOrder(PurchaseOrderSummary po) throws POException;

}
