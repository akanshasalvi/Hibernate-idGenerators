package com.uid.entities;

import java.io.Serializable;
import java.util.Date;

public class Merchant implements Serializable{
	
	protected String merchant_no;
	protected Date merchant_registrated_date;
	protected String product_Name;
	protected String contact_no;
	protected String email_address;
	public String getMerchant_no() {
		return merchant_no;
	}
	public void setMerchant_no(String merchant_no) {
		this.merchant_no = merchant_no;
	}
	public Date getMerchant_registrated_date() {
		return merchant_registrated_date;
	}
	public void setMerchant_registrated_date(Date merchant_registrated_date) {
		this.merchant_registrated_date = merchant_registrated_date;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	@Override
	public String toString() {
		return "Merchant [merchant_no=" + merchant_no + ", merchant_registrated_date=" + merchant_registrated_date
				+ ", product_Name=" + product_Name + ", contact_no=" + contact_no + ", email_address=" + email_address
				+ "]";
	}
}
