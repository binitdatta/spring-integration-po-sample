package com.rollingstone.spring.integration.po.components;

import java.util.Collection;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;

/**
 * Defines a contract that is allows loose coupling with the  client and the Spring Integration framework.
 */
public interface PurchaseOrderAcceptorGateway {

    void acceptPurchaseOrders(Collection<PurchaseOrderSummary> pos);

}
