package com.rollingstone.spring.integration.po.components;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;

/**
 * Spring @filter Component for filtering our purchase order based on local , 
 * foreign or rate contract boolean attribute . 
 */

@Component
public class PurchaseOrderFilter {

	Logger logger = Logger.getLogger(PurchaseOrderFilter.class);

	public static final int LOW_ENOUGH_LOCAL_THRESHOLD = 5000;
	public static final int LOW_ENOUGH_FOREIGN_THRESHOLD = 5000;
	public static final int LOW_ENOUGH_RATE_CONTRACT_THRESHOLD = 5000;

	@Filter
	public boolean accept(PurchaseOrderSummary purchaseOrder) {
		boolean returnValue = false;

		if (purchaseOrder.isForeignPO()) {

			returnValue = purchaseOrder.getForeignPoAmount().intValue() < LOW_ENOUGH_FOREIGN_THRESHOLD;

			logger.info("PO filtering Foreign PO Dollar Amount of $"
					+ purchaseOrder.getForeignPoAmount()
					+ (returnValue ? " can" : " can not")
					+ " be automatically processed by system");

		} else if (purchaseOrder.isLocalPO()) {
			returnValue = purchaseOrder.getLocalPoAmount().intValue() < LOW_ENOUGH_LOCAL_THRESHOLD;

			logger.info("PO filtering Local PO Dollar Amount of $"
					+ purchaseOrder.getLocalPoAmount()
					+ (returnValue ? " can" : " can not")
					+ " be automatically processed by system");
		} else if (purchaseOrder.isRateContract()) {

			returnValue = purchaseOrder.getRateContractAmount().intValue() < LOW_ENOUGH_RATE_CONTRACT_THRESHOLD;

			logger.info("PO filtering Rate Contract PO Dollar Amount of $"
					+ purchaseOrder.getRateContractAmount()
					+ (returnValue ? " can" : " can not")
					+ " be automatically processed by system");
		}

		return returnValue;
	}

}
