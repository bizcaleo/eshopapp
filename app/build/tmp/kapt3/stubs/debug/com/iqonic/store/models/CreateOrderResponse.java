package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u00f1\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010\'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070+\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0+\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070+\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002020+\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070+\u0012\u0006\u00104\u001a\u00020\u0007\u00a2\u0006\u0002\u00105R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010)\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0015\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020+\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00109R\u0011\u00104\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00109R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00109R\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00109R\u0011\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0011\u0010\'\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0011\u0010(\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00109R\u0011\u0010%\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u0011\u0010&\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010;R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010;R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070+\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010BR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010BR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00109R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010BR\u0011\u0010\"\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0011\u0010#\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00109R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070+\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0+\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010=R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010;R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010;R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00109R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070+\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010=R\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010;R\u0011\u0010\u0017\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010;R\u0011\u0010$\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00109R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00109\u00a8\u0006f"}, d2 = {"Lcom/iqonic/store/models/CreateOrderResponse;", "Ljava/io/Serializable;", "id", "", "parent_id", "number", "order_key", "", "created_via", "version", "status", "currency", "date_created", "date_created_gmt", "date_modified", "date_modified_gmt", "discount_total", "", "discount_tax", "shipping_total", "shipping_tax", "cart_tax", "total", "total_tax", "prices_include_tax", "", "customer_id", "customer_ip_address", "customer_user_agent", "customer_note", "billing", "Lcom/iqonic/store/models/Billing;", "shipping", "Lcom/iqonic/store/models/Shipping;", "payment_method", "payment_method_title", "transaction_id", "date_paid", "date_paid_gmt", "date_completed", "date_completed_gmt", "cart_hash", "line_items", "", "Lcom/iqonic/store/models/Line_items;", "tax_lines", "shipping_lines", "Lcom/iqonic/store/models/ShippingLines;", "fee_lines", "coupon_lines", "Lcom/iqonic/store/models/CouponLines;", "refunds", "currency_symbol", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDDDZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqonic/store/models/Billing;Lcom/iqonic/store/models/Shipping;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getBilling", "()Lcom/iqonic/store/models/Billing;", "getCart_hash", "()Ljava/lang/String;", "getCart_tax", "()D", "getCoupon_lines", "()Ljava/util/List;", "getCreated_via", "getCurrency", "getCurrency_symbol", "getCustomer_id", "()I", "getCustomer_ip_address", "getCustomer_note", "getCustomer_user_agent", "getDate_completed", "getDate_completed_gmt", "getDate_created", "getDate_created_gmt", "getDate_modified", "getDate_modified_gmt", "getDate_paid", "getDate_paid_gmt", "getDiscount_tax", "getDiscount_total", "getFee_lines", "getId", "getLine_items", "getNumber", "getOrder_key", "getParent_id", "getPayment_method", "getPayment_method_title", "getPrices_include_tax", "()Z", "getRefunds", "getShipping", "()Lcom/iqonic/store/models/Shipping;", "getShipping_lines", "getShipping_tax", "getShipping_total", "getStatus", "getTax_lines", "getTotal", "getTotal_tax", "getTransaction_id", "getVersion", "app_debug"})
public final class CreateOrderResponse implements java.io.Serializable {
    private final int id = 0;
    private final int parent_id = 0;
    private final int number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_key = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_via = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified_gmt = null;
    private final double discount_total = 0.0;
    private final double discount_tax = 0.0;
    private final double shipping_total = 0.0;
    private final double shipping_tax = 0.0;
    private final double cart_tax = 0.0;
    private final double total = 0.0;
    private final double total_tax = 0.0;
    private final boolean prices_include_tax = false;
    private final int customer_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_ip_address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_user_agent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_note = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.Billing billing = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.Shipping shipping = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method_title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transaction_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_paid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_paid_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_completed = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_completed_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cart_hash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.Line_items> line_items = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tax_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.ShippingLines> shipping_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> fee_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.CouponLines> coupon_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> refunds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency_symbol = null;
    
    public final int getId() {
        return 0;
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_via() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified_gmt() {
        return null;
    }
    
    public final double getDiscount_total() {
        return 0.0;
    }
    
    public final double getDiscount_tax() {
        return 0.0;
    }
    
    public final double getShipping_total() {
        return 0.0;
    }
    
    public final double getShipping_tax() {
        return 0.0;
    }
    
    public final double getCart_tax() {
        return 0.0;
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    public final double getTotal_tax() {
        return 0.0;
    }
    
    public final boolean getPrices_include_tax() {
        return false;
    }
    
    public final int getCustomer_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_ip_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_user_agent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_note() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Billing getBilling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Shipping getShipping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method_title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransaction_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_paid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_paid_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_completed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_completed_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCart_hash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.Line_items> getLine_items() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTax_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.ShippingLines> getShipping_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFee_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.CouponLines> getCoupon_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRefunds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency_symbol() {
        return null;
    }
    
    public CreateOrderResponse(int id, int parent_id, int number, @org.jetbrains.annotations.NotNull()
    java.lang.String order_key, @org.jetbrains.annotations.NotNull()
    java.lang.String created_via, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, double discount_total, double discount_tax, double shipping_total, double shipping_tax, double cart_tax, double total, double total_tax, boolean prices_include_tax, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_ip_address, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_user_agent, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_note, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Billing billing, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method_title, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid, @org.jetbrains.annotations.NotNull()
    java.lang.String date_paid_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_completed, @org.jetbrains.annotations.NotNull()
    java.lang.String date_completed_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_hash, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.Line_items> line_items, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tax_lines, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.ShippingLines> shipping_lines, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> fee_lines, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.CouponLines> coupon_lines, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> refunds, @org.jetbrains.annotations.NotNull()
    java.lang.String currency_symbol) {
        super();
    }
}