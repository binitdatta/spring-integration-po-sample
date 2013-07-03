package com.rollingstone.spring.integration.po.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;

/**
 * Job that every n-seconds generates purchase orders and sends them to the system.  This may be the 
 * system integrated to the point of sale terminals as they reduce inventory when completing sales.
 */
@Component
public class PurchaseOrderIntegrationJob {

	Logger logger = Logger.getLogger(PurchaseOrderIntegrationJob.class);

	@Autowired
	PurchaseOrderAcceptorGateway purchaseOrderGateway;

	@Autowired
	PurchaseOrderGenerator purchaseOrderGenerator;

	@Scheduled(fixedRate = 4000)
	public void schedulePoIntegration() {
		Collection<PurchaseOrderSummary> pos = generatePurchaseOrder();
		logger.info("================================================================Start of a New Job=====================================");
		logger.info("\n===========> Sending " + pos.size()
				+ " Purchase Orders to the system");
		purchaseOrderGateway.acceptPurchaseOrders(pos);
	}

	private Collection<PurchaseOrderSummary> generatePurchaseOrder() {
		List<PurchaseOrderSummary> pos = new ArrayList<PurchaseOrderSummary>();

		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_FOREIGN, true));
		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_FOREIGN, false));
		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_LOCAL, true));
		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_LOCAL, false));
		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_RATECONTRACT, true));
		pos.add(purchaseOrderGenerator.generatePurchaseOrder(
				PurchaseOrderSummary.PURCHASEORDER_RATECONTRACT, false));

		return pos;
	}

}
