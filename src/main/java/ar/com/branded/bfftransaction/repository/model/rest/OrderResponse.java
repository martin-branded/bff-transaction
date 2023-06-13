package ar.com.branded.bfftransaction.repository.model.rest;

import java.util.List;

public class OrderResponse {
    private int id;
    private String token;
    private int store_id;
    private String abandoned_checkout_url;
    private String contact_email;
    private String contact_name;
    private String contact_phone;
    private String contact_identification;
    private String shipping_name;
    private String shipping_phone;
    private String shipping_address;
    private String shipping_number;
    private String shipping_floor;
    private String shipping_locality;
    private String shipping_zipcode;
    private String shipping_city;
    private String shipping_province;
    private String shipping_country;
    private String shipping_min_days;
    private String shipping_max_days;
    private String billing_name;
    private String billing_phone;
    private String billing_address;
    private String billing_number;
    private String billing_floor;
    private String billing_locality;
    private String billing_zipcode;
    private String billing_city;
    private String billing_province;
    private String billing_country;
    private String shipping_cost_owner;
    private String shipping_cost_customer;
    private List<String> coupon;
    private PromotionalDiscount promotional_discount;
    private String subtotal;
    private String discount;
    private String discount_coupon;
    private String discount_gateway;
    private String total;
    private String total_usd;
    private boolean checkout_enabled;
    private String weight;
    private String currency;
    private String language;
    private String gateway;
    private String gateway_id;
    private String shipping;
    private String shipping_option;
    private String shipping_option_code;
    private String shipping_option_reference;
    private String shipping_pickup_details;
    private String shipping_tracking_number;
    private String shipping_tracking_url;
    private String shipping_store_branch_name;
    private String shipping_pickup_type;
    private List<String> shipping_suboption;
    private String storefront;
    private String note;
    private String created_at;
    private String updated_at;
    private String completed_at;
    private String next_action;
    private PaymentDetails payment_details;
    private List<String> attributes;
    private Customer customer;
    private List<ProductResponse> products;
    private Clearsale clearsale;
    private String checkout_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getAbandoned_checkout_url() {
        return abandoned_checkout_url;
    }

    public void setAbandoned_checkout_url(String abandoned_checkout_url) {
        this.abandoned_checkout_url = abandoned_checkout_url;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_identification() {
        return contact_identification;
    }

    public void setContact_identification(String contact_identification) {
        this.contact_identification = contact_identification;
    }

    public String getShipping_name() {
        return shipping_name;
    }

    public void setShipping_name(String shipping_name) {
        this.shipping_name = shipping_name;
    }

    public String getShipping_phone() {
        return shipping_phone;
    }

    public void setShipping_phone(String shipping_phone) {
        this.shipping_phone = shipping_phone;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getShipping_number() {
        return shipping_number;
    }

    public void setShipping_number(String shipping_number) {
        this.shipping_number = shipping_number;
    }

    public String getShipping_floor() {
        return shipping_floor;
    }

    public void setShipping_floor(String shipping_floor) {
        this.shipping_floor = shipping_floor;
    }

    public String getShipping_locality() {
        return shipping_locality;
    }

    public void setShipping_locality(String shipping_locality) {
        this.shipping_locality = shipping_locality;
    }

    public String getShipping_zipcode() {
        return shipping_zipcode;
    }

    public void setShipping_zipcode(String shipping_zipcode) {
        this.shipping_zipcode = shipping_zipcode;
    }

    public String getShipping_city() {
        return shipping_city;
    }

    public void setShipping_city(String shipping_city) {
        this.shipping_city = shipping_city;
    }

    public String getShipping_province() {
        return shipping_province;
    }

    public void setShipping_province(String shipping_province) {
        this.shipping_province = shipping_province;
    }

    public String getShipping_country() {
        return shipping_country;
    }

    public void setShipping_country(String shipping_country) {
        this.shipping_country = shipping_country;
    }

    public String getShipping_min_days() {
        return shipping_min_days;
    }

    public void setShipping_min_days(String shipping_min_days) {
        this.shipping_min_days = shipping_min_days;
    }

    public String getShipping_max_days() {
        return shipping_max_days;
    }

    public void setShipping_max_days(String shipping_max_days) {
        this.shipping_max_days = shipping_max_days;
    }

    public String getBilling_name() {
        return billing_name;
    }

    public void setBilling_name(String billing_name) {
        this.billing_name = billing_name;
    }

    public String getBilling_phone() {
        return billing_phone;
    }

    public void setBilling_phone(String billing_phone) {
        this.billing_phone = billing_phone;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public String getBilling_number() {
        return billing_number;
    }

    public void setBilling_number(String billing_number) {
        this.billing_number = billing_number;
    }

    public String getBilling_floor() {
        return billing_floor;
    }

    public void setBilling_floor(String billing_floor) {
        this.billing_floor = billing_floor;
    }

    public String getBilling_locality() {
        return billing_locality;
    }

    public void setBilling_locality(String billing_locality) {
        this.billing_locality = billing_locality;
    }

    public String getBilling_zipcode() {
        return billing_zipcode;
    }

    public void setBilling_zipcode(String billing_zipcode) {
        this.billing_zipcode = billing_zipcode;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }

    public String getBilling_province() {
        return billing_province;
    }

    public void setBilling_province(String billing_province) {
        this.billing_province = billing_province;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }

    public String getShipping_cost_owner() {
        return shipping_cost_owner;
    }

    public void setShipping_cost_owner(String shipping_cost_owner) {
        this.shipping_cost_owner = shipping_cost_owner;
    }

    public String getShipping_cost_customer() {
        return shipping_cost_customer;
    }

    public void setShipping_cost_customer(String shipping_cost_customer) {
        this.shipping_cost_customer = shipping_cost_customer;
    }

    public List<String> getCoupon() {
        return coupon;
    }

    public void setCoupon(List<String> coupon) {
        this.coupon = coupon;
    }

    public PromotionalDiscount getPromotional_discount() {
        return promotional_discount;
    }

    public void setPromotional_discount(PromotionalDiscount promotional_discount) {
        this.promotional_discount = promotional_discount;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(String discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public String getDiscount_gateway() {
        return discount_gateway;
    }

    public void setDiscount_gateway(String discount_gateway) {
        this.discount_gateway = discount_gateway;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_usd() {
        return total_usd;
    }

    public void setTotal_usd(String total_usd) {
        this.total_usd = total_usd;
    }

    public boolean isCheckout_enabled() {
        return checkout_enabled;
    }

    public void setCheckout_enabled(boolean checkout_enabled) {
        this.checkout_enabled = checkout_enabled;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getGateway_id() {
        return gateway_id;
    }

    public void setGateway_id(String gateway_id) {
        this.gateway_id = gateway_id;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getShipping_option() {
        return shipping_option;
    }

    public void setShipping_option(String shipping_option) {
        this.shipping_option = shipping_option;
    }

    public String getShipping_option_code() {
        return shipping_option_code;
    }

    public void setShipping_option_code(String shipping_option_code) {
        this.shipping_option_code = shipping_option_code;
    }

    public String getShipping_option_reference() {
        return shipping_option_reference;
    }

    public void setShipping_option_reference(String shipping_option_reference) {
        this.shipping_option_reference = shipping_option_reference;
    }

    public String getShipping_pickup_details() {
        return shipping_pickup_details;
    }

    public void setShipping_pickup_details(String shipping_pickup_details) {
        this.shipping_pickup_details = shipping_pickup_details;
    }

    public String getShipping_tracking_number() {
        return shipping_tracking_number;
    }

    public void setShipping_tracking_number(String shipping_tracking_number) {
        this.shipping_tracking_number = shipping_tracking_number;
    }

    public String getShipping_tracking_url() {
        return shipping_tracking_url;
    }

    public void setShipping_tracking_url(String shipping_tracking_url) {
        this.shipping_tracking_url = shipping_tracking_url;
    }

    public String getShipping_store_branch_name() {
        return shipping_store_branch_name;
    }

    public void setShipping_store_branch_name(String shipping_store_branch_name) {
        this.shipping_store_branch_name = shipping_store_branch_name;
    }

    public String getShipping_pickup_type() {
        return shipping_pickup_type;
    }

    public void setShipping_pickup_type(String shipping_pickup_type) {
        this.shipping_pickup_type = shipping_pickup_type;
    }

    public List<String> getShipping_suboption() {
        return shipping_suboption;
    }

    public void setShipping_suboption(List<String> shipping_suboption) {
        this.shipping_suboption = shipping_suboption;
    }

    public String getStorefront() {
        return storefront;
    }

    public void setStorefront(String storefront) {
        this.storefront = storefront;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public String getNext_action() {
        return next_action;
    }

    public void setNext_action(String next_action) {
        this.next_action = next_action;
    }

    public PaymentDetails getPayment_details() {
        return payment_details;
    }

    public void setPayment_details(PaymentDetails payment_details) {
        this.payment_details = payment_details;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }

    public Clearsale getClearsale() {
        return clearsale;
    }

    public void setClearsale(Clearsale clearsale) {
        this.clearsale = clearsale;
    }

    public String getCheckout_url() {
        return checkout_url;
    }

    public void setCheckout_url(String checkout_url) {
        this.checkout_url = checkout_url;
    }
}
