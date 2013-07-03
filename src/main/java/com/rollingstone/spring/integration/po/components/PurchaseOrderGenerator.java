package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.factory.PurchaseOrderUtil;

/**
 * Utility class for generating purchase orders.
 */
@Component
public class PurchaseOrderGenerator {

	Logger logger = Logger.getLogger(PurchaseOrderGenerator.class);

	public PurchaseOrderSummary generatePurchaseOrder(String poType,
			boolean highValue) {

		PurchaseOrderSummary poSumary = null;

		if (poType.equals(PurchaseOrderSummary.PURCHASEORDER_FOREIGN)) {

			if (highValue) {
				logger.info("High Value + Foreign PO");
				poSumary = PurchaseOrderUtil.createForeignHighValuePO();
			} else {
				logger.info("Low Value + Foreign PO");

				poSumary = PurchaseOrderUtil.createForeignPO();
			}
		} else if (poType.equals(PurchaseOrderSummary.PURCHASEORDER_LOCAL)) {

			if (highValue) {
				logger.info("High Value + Local PO");

				poSumary = PurchaseOrderUtil.createLocalHighValuePO();
			} else {
				logger.info("Low Value + Local PO");

				poSumary = PurchaseOrderUtil.createLocalPO();
			}
		} else if (poType
				.equals(PurchaseOrderSummary.PURCHASEORDER_RATECONTRACT)) {

			if (highValue) {
				logger.info("High Value + RC PO");

				poSumary = PurchaseOrderUtil.createHighValueRateContractPO();
			} else {
				logger.info("Low Value + RC PO");

				poSumary = PurchaseOrderUtil.createRateContractPO();
			}
		}

		return poSumary;
	}

}
