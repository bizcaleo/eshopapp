package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\u00a1\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\t\u0010=\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018\u00a8\u0006>"}, d2 = {"Lcom/iqonic/store/models/LineItems;", "Ljava/io/Serializable;", "id", "", "meta_data", "", "Lcom/iqonic/store/models/MetaData;", "name", "", "order_id", "product_id", "product_images", "Lcom/iqonic/store/models/ProductImage;", "quantity", "subtotal", "subtotal_tax", "tax_class", "taxes", "Lcom/iqonic/store/models/Taxes;", "total", "total_tax", "variation_id", "(ILjava/util/List;Ljava/lang/String;IILjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqonic/store/models/Taxes;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getMeta_data", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getOrder_id", "getProduct_id", "getProduct_images", "getQuantity", "getSubtotal", "getSubtotal_tax", "getTax_class", "getTaxes", "()Lcom/iqonic/store/models/Taxes;", "getTotal", "getTotal_tax", "getVariation_id", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class LineItems implements java.io.Serializable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.MetaData> meta_data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int order_id = 0;
    private final int product_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.ProductImage> product_images = null;
    private final int quantity = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subtotal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subtotal_tax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax_class = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.Taxes taxes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total_tax = null;
    private final int variation_id = 0;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.MetaData> getMeta_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getOrder_id() {
        return 0;
    }
    
    public final int getProduct_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.ProductImage> getProduct_images() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubtotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubtotal_tax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Taxes getTaxes() {
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
    
    public final int getVariation_id() {
        return 0;
    }
    
    public LineItems(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int order_id, int product_id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.ProductImage> product_images, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String subtotal, @org.jetbrains.annotations.NotNull()
    java.lang.String subtotal_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Taxes taxes, @org.jetbrains.annotations.NotNull()
    java.lang.String total, @org.jetbrains.annotations.NotNull()
    java.lang.String total_tax, int variation_id) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.MetaData> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.ProductImage> component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
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
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Taxes component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.LineItems copy(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int order_id, int product_id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.ProductImage> product_images, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String subtotal, @org.jetbrains.annotations.NotNull()
    java.lang.String subtotal_tax, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.Taxes taxes, @org.jetbrains.annotations.NotNull()
    java.lang.String total, @org.jetbrains.annotations.NotNull()
    java.lang.String total_tax, int variation_id) {
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