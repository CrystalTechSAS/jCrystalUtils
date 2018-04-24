package jcrystal.payments.epayco;

import jcrystal.json.Jsonify;

@Jsonify
public class EpaycoConfirm {
	public String x_cust_id_cliente;
	public String x_description;
	public int x_amount_ok;
	public String x_id_invoice;
	public int x_amount_base;
	public int x_tax;
	public String x_currency_code;
	public String x_franchise	;
	public String x_transaction_date;
	public String x_approval_code;
	public String x_transaction_id;
	public String x_ref_payco;
	public EpaycoTransactionState x_cod_transaction_state;
	public String x_transaction_state;
	public String x_signature	;
	public String x_response	;
	public String x_response_reason_text;
	public String x_extra1;
	public String x_extra2;
	public String x_extra3;
	public String x_customer_doctype;
	public String x_customer_document;
	public String x_customer_name;
	public String x_customer_lastname;
	public String x_customer_email;
	public String x_customer_phone;
	public String x_customer_country;
	public String x_customer_city;
	public String x_customer_address;
	public String x_customer_ip;
}
