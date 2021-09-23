package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0018\u0012\b\b\u0002\u0010!\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u0011\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010K\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010N\u001a\u00020\u0013H\u00c6\u0003J\t\u0010O\u001a\u00020\u0018H\u00c6\u0003J\t\u0010P\u001a\u00020\u0013H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0011H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010X\u001a\u00020\u0018H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0018H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0011H\u00c6\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\u00cb\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00112\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001J\u0013\u0010d\u001a\u00020\u00132\b\u0010e\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010f\u001a\u00020\u0018H\u00d6\u0001J\t\u0010g\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0011\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0019\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0011\u0010\u001a\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0011\u0010 \u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u0011\u0010!\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0011\u0010\"\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010=R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00103\u00a8\u0006h"}, d2 = {"Lcom/iqonic/store/models/Coupons;", "Ljava/io/Serializable;", "_links", "Lcom/iqonic/store/models/CouponsLinks;", "amount", "", "code", "date_created", "date_created_gmt", "date_expires", "date_expires_gmt", "date_modified", "date_modified_gmt", "description", "discount_type", "email_restrictions", "", "", "exclude_sale_items", "", "excluded_product_categories", "excluded_product_ids", "free_shipping", "id", "", "individual_use", "limit_usage_to_x_items", "maximum_amount", "meta_data", "minimum_amount", "product_categories", "product_ids", "usage_count", "usage_limit", "usage_limit_per_user", "used_by", "(Lcom/iqonic/store/models/CouponsLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;ZIZLjava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;IILjava/lang/Object;Ljava/util/List;)V", "get_links", "()Lcom/iqonic/store/models/CouponsLinks;", "getAmount", "()Ljava/lang/String;", "getCode", "getDate_created", "getDate_created_gmt", "getDate_expires", "getDate_expires_gmt", "getDate_modified", "getDate_modified_gmt", "getDescription", "getDiscount_type", "getEmail_restrictions", "()Ljava/util/List;", "getExclude_sale_items", "()Z", "getExcluded_product_categories", "getExcluded_product_ids", "getFree_shipping", "getId", "()I", "getIndividual_use", "getLimit_usage_to_x_items", "()Ljava/lang/Object;", "getMaximum_amount", "getMeta_data", "getMinimum_amount", "getProduct_categories", "getProduct_ids", "getUsage_count", "getUsage_limit", "getUsage_limit_per_user", "getUsed_by", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Coupons implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.CouponsLinks _links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String amount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_expires = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_expires_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String discount_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> email_restrictions = null;
    private final boolean exclude_sale_items = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> excluded_product_categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> excluded_product_ids = null;
    private final boolean free_shipping = false;
    private final int id = 0;
    private final boolean individual_use = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object limit_usage_to_x_items = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String maximum_amount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> meta_data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String minimum_amount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> product_categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> product_ids = null;
    private final int usage_count = 0;
    private final int usage_limit = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object usage_limit_per_user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> used_by = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.CouponsLinks get_links() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
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
    public final java.lang.String getDate_expires() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_expires_gmt() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiscount_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getEmail_restrictions() {
        return null;
    }
    
    public final boolean getExclude_sale_items() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getExcluded_product_categories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getExcluded_product_ids() {
        return null;
    }
    
    public final boolean getFree_shipping() {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean getIndividual_use() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLimit_usage_to_x_items() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaximum_amount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getMeta_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinimum_amount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getProduct_categories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getProduct_ids() {
        return null;
    }
    
    public final int getUsage_count() {
        return 0;
    }
    
    public final int getUsage_limit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUsage_limit_per_user() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getUsed_by() {
        return null;
    }
    
    public Coupons(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CouponsLinks _links, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_expires, @org.jetbrains.annotations.NotNull()
    java.lang.String date_expires_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> email_restrictions, boolean exclude_sale_items, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> excluded_product_categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> excluded_product_ids, boolean free_shipping, int id, boolean individual_use, @org.jetbrains.annotations.NotNull()
    java.lang.Object limit_usage_to_x_items, @org.jetbrains.annotations.NotNull()
    java.lang.String maximum_amount, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String minimum_amount, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> product_categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> product_ids, int usage_count, int usage_limit, @org.jetbrains.annotations.NotNull()
    java.lang.Object usage_limit_per_user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> used_by) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.CouponsLinks component1() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
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
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component15() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final boolean component18() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component24() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Coupons copy(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CouponsLinks _links, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_expires, @org.jetbrains.annotations.NotNull()
    java.lang.String date_expires_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String discount_type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> email_restrictions, boolean exclude_sale_items, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> excluded_product_categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> excluded_product_ids, boolean free_shipping, int id, boolean individual_use, @org.jetbrains.annotations.NotNull()
    java.lang.Object limit_usage_to_x_items, @org.jetbrains.annotations.NotNull()
    java.lang.String maximum_amount, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String minimum_amount, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> product_categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> product_ids, int usage_count, int usage_limit, @org.jetbrains.annotations.NotNull()
    java.lang.Object usage_limit_per_user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> used_by) {
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