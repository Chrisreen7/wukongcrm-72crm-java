package com.kakarote.crm9.erp.crm.entity;

import com.kakarote.crm9.erp.crm.entity.base.BaseCrmContacts;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class CrmContacts extends BaseCrmContacts<CrmContacts> {
	public static final CrmContacts dao = new CrmContacts().dao();

	private String contactsIds;
	private Long newOwnerUserId;
	private String customerName;

	public String getContactsIds() {
		return contactsIds;
	}

	public void setContactsIds(String contactsIds) {
		this.contactsIds = contactsIds;
	}

	public Long getNewOwnerUserId() {
		return newOwnerUserId;
	}

	public void setNewOwnerUserId(Long newOwnerUserId) {
		this.newOwnerUserId = newOwnerUserId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}