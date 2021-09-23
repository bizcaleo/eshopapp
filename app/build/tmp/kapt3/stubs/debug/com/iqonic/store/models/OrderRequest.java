package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0012\u00a2\u0006\u0002\u0010\u0017J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012H\u00c6\u0003J\u001d\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0012H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u001d\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012H\u00c6\u0003J\u00b7\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00122\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00122\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0012H\u00c6\u0001J\u0013\u0010F\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u0006H\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR.\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#\u00a8\u0006J"}, d2 = {"Lcom/iqonic/store/models/OrderRequest;", "", "payment_method", "", "transaction_id", "customer_id", "", "currency", "status", "set_paid", "", "billing", "Lcom/iqonic/store/models/Billing;", "shipping", "Lcom/iqonic/store/models/Shipping;", "line_items", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/Line_items;", "Lkotlin/collections/ArrayList;", "shipping_lines", "Lcom/iqonic/store/models/ShippingLines;", "coupon_lines", "Lcom/iqonic/store/models/CouponLines;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLcom/iqonic/store/models/Billing;Lcom/iqonic/store/models/Shipping;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getBilling", "()Lcom/iqonic/store/models/Billing;", "setBilling", "(Lcom/iqonic/store/models/Billing;)V", "getCoupon_lines", "()Ljava/util/ArrayList;", "setCoupon_lines", "(Ljava/util/ArrayList;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCustomer_id", "()I", "setCustomer_id", "(I)V", "getLine_items", "setLine_items", "getPayment_method", "setPayment_method", "getSet_paid", "()Z", "setSet_paid", "(Z)V", "getShipping", "()Lcom/iqonic/store/models/Shipping;", "setShipping", "(Lcom/iqonic/store/models/Shipping;)V", "getShipping_lines", "setShipping_lines", "getStatus", "setStatus", "getTransaction_id", "setTransaction_id", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class OrderRequest {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String payment_method;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transaction_id;
    private int customer_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    private boolean set_paid;
    @org.jetbrains.annotations.Nullable()
    private com.iqonic.store.models.Billing billing;
    @org.jetbrains.annotations.Nullable()
    private com.iqonic.store.models.Shipping shipping;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.iqonic.store.models.Line_items> line_items;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.iqonic.store.models.ShippingLines> shipping_lines;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.iqonic.store.models.CouponLines> coupon_lines;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    public final void setPayment_method(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransaction_id() {
        return null;
    }
    
    public final void setTransaction_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCustomer_id() {
        return 0;
    }
    
    public final void setCustomer_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSet_paid() {
        return false;
    }
    
    public final void setSet_paid(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Billing getBilling() {
        return null;
    }
    
    public final void setBilling(@org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Billing p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Shipping getShipping() {
        return null;
    }
    
    public final void setShipping(@org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Shipping p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.Line_items> getLine_items() {
        return null;
    }
    
    public final void setLine_items(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.Line_items> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.ShippingLines> getShipping_lines() {
        return null;
    }
    
    public final void setShipping_lines(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.ShippingLines> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.CouponLines> getCoupon_lines() {
        return null;
    }
    
    public final void setCoupon_lines(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.CouponLines> p0) {
    }
    
    public OrderRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String status, boolean set_paid, @org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Billing billing, @org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Shipping shipping, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.Line_items> line_items, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.ShippingLines> shipping_lines, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.CouponLines> coupon_lines) {
        super();
    }
    
    public OrderRequest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Billing component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Shipping component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.Line_items> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.ShippingLines> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.CouponLines> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.OrderRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String transaction_id, int customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String status, boolean set_paid, @org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Billing billing, @org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Shipping shipping, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.Line_items> line_items, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.ShippingLines> shipping_lines, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.CouponLines> coupon_lines) {
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