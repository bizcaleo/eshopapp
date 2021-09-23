package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020\u0005\u00a2\u0006\u0002\u0010/J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u000fH\u00c6\u0003J\t\u0010^\u001a\u00020\u0011H\u00c6\u0003J\t\u0010_\u001a\u00020\u0013H\u00c6\u0003J\t\u0010`\u001a\u00020\u0015H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u00c6\u0003J\t\u0010d\u001a\u00020\nH\u00c6\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019H\u00c6\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\nH\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020$H\u00c6\u0003J\t\u0010n\u001a\u00020&H\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u00c6\u0003J\t\u0010t\u001a\u00020\u0005H\u00c6\u0003J\t\u0010u\u001a\u00020\u0005H\u00c6\u0003J\t\u0010v\u001a\u00020\u0005H\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\nH\u00c6\u0003J\t\u0010{\u001a\u00020\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0005H\u00c6\u0003J\u00f5\u0002\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u007f\u001a\u00020$2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\n\u0010\u0081\u0001\u001a\u00020\nH\u00d6\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u001a\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0011\u0010 \u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00108R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00103R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0011\u0010(\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0011\u0010)\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010GR\u0011\u0010+\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0011\u0010,\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0011\u0010-\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00103R\u0011\u0010.\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00103\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/iqonic/store/models/Order;", "Ljava/io/Serializable;", "billing", "Lcom/iqonic/store/models/Billing;", "cart_hash", "", "cart_tax", "created_via", "currency", "customer_id", "", "customer_ip_address", "customer_note", "customer_user_agent", "date_completed", "", "date_created", "Lcom/iqonic/store/models/DateCreated;", "date_modified", "Lcom/iqonic/store/models/DateModified;", "date_paid", "Lcom/iqonic/store/models/DatePaid;", "discount_tax", "discount_total", "fee_lines", "", "id", "line_items", "Lcom/iqonic/store/models/LineItems;", "meta_data", "number", "order_key", "parent_id", "payment_method", "payment_method_title", "prices_include_tax", "", "shipping", "Lcom/iqonic/store/models/Shipping;", "shipping_tax", "shipping_total", "status", "tax_lines", "total", "total_tax", "transaction_id", "version", "(Lcom/iqonic/store/models/Billing;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/iqonic/store/models/DateCreated;Lcom/iqonic/store/models/DateModified;Lcom/iqonic/store/models/DatePaid;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/iqonic/store/models/Shipping;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBilling", "()Lcom/iqonic/store/models/Billing;", "getCart_hash", "()Ljava/lang/String;", "getCart_tax", "getCreated_via", "getCurrency", "getCustomer_id", "()I", "getCustomer_ip_address", "getCustomer_note", "getCustomer_user_agent", "getDate_completed", "()Ljava/lang/Object;", "getDate_created", "()Lcom/iqonic/store/models/DateCreated;", "getDate_modified", "()Lcom/iqonic/store/models/DateModified;", "getDate_paid", "()Lcom/iqonic/store/models/DatePaid;", "getDiscount_tax", "getDiscount_total", "getFee_lines", "()Ljava/util/List;", "getId", "getLine_items", "getMeta_data", "getNumber", "getOrder_key", "getParent_id", "getPayment_method", "getPayment_method_title", "getPrices_include_tax", "()Z", "getShipping", "()Lcom/iqonic/store/models/Shipping;", "getShipping_tax", "getShipping_total", "getStatus", "getTax_lines", "getTotal", "getTotal_tax", "getTransaction_id", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Order implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.Billing billing = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cart_hash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cart_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_via = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final int customer_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_ip_address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_note = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_user_agent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object date_completed = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.DateCreated date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.DateModified date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.DatePaid date_paid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String discount_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String discount_total = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> fee_lines = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.LineItems> line_items = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> meta_data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_key = null;
    private final int parent_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method_title = null;
    private final boolean prices_include_tax = false;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.Shipping shipping = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shipping_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shipping_total = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> tax_lines = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transaction_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Billing getBilling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCart_hash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCart_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_via() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final int getCustomer_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_ip_address() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_note() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_user_agent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDate_completed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DateCreated getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DateModified getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DatePaid getDate_paid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscount_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscount_total() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getFee_lines() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.LineItems> getLine_items() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getMeta_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_key() {
        return null;
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method_title() {
        return null;
    }
    
    public final boolean getPrices_include_tax() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Shipping getShipping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_total() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTax_lines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransaction_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public Order(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Billing billing, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_hash, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String created_via, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_ip_address, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_note, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_user_agent, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_completed, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DateCreated date_created, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DateModified date_modified, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DatePaid date_paid, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> fee_lines, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.LineItems> line_items, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String order_key, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method_title, boolean prices_include_tax, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_total, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tax_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String total, @org.jetbrains.annotations.NotNull()
    java.lang.String total_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Billing component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DateCreated component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DateModified component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.DatePaid component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component16() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.LineItems> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    public final boolean component25() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Shipping component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Order copy(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Billing billing, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_hash, @org.jetbrains.annotations.NotNull()
    java.lang.String cart_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String created_via, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_ip_address, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_note, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_user_agent, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_completed, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DateCreated date_created, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DateModified date_modified, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.DatePaid date_paid, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> fee_lines, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.LineItems> line_items, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String order_key, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method_title, boolean prices_include_tax, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Shipping shipping, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_total, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tax_lines, @org.jetbrains.annotations.NotNull()
    java.lang.String total, @org.jetbrains.annotations.NotNull()
    java.lang.String total_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}