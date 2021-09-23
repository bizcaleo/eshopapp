package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\u0018J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0012H\u00c6\u0003J\t\u00100\u001a\u00020\u0012H\u00c6\u0003J\t\u00101\u001a\u00020\u0012H\u00c6\u0003J\t\u00102\u001a\u00020\u0016H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003J\u00d5\u0001\u0010<\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u00162\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020@H\u00d6\u0001J\t\u0010A\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c\u00a8\u0006B"}, d2 = {"Lcom/iqonic/store/models/Dashboard;", "", "banner", "", "Lcom/iqonic/store/models/DashboardBanner;", "best_selling_product", "Lcom/iqonic/store/models/StoreProductModel;", "currency_symbol", "Lcom/iqonic/store/models/CurrencySymbol;", "deal_of_the_day", "featured", "newest", "offer", "sale_product", "social_link", "Lcom/iqonic/store/models/SocialLink;", "suggested_for_you", "theme_color", "", "payment_method", "app_lang", "enable_coupons", "", "you_may_like", "(Ljava/util/List;Ljava/util/List;Lcom/iqonic/store/models/CurrencySymbol;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/iqonic/store/models/SocialLink;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getApp_lang", "()Ljava/lang/String;", "getBanner", "()Ljava/util/List;", "getBest_selling_product", "getCurrency_symbol", "()Lcom/iqonic/store/models/CurrencySymbol;", "getDeal_of_the_day", "getEnable_coupons", "()Z", "getFeatured", "getNewest", "getOffer", "getPayment_method", "getSale_product", "getSocial_link", "()Lcom/iqonic/store/models/SocialLink;", "getSuggested_for_you", "getTheme_color", "getYou_may_like", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Dashboard {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.DashboardBanner> banner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> best_selling_product = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.CurrencySymbol currency_symbol = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> deal_of_the_day = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> featured = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> newest = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> offer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> sale_product = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.store.models.SocialLink social_link = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> suggested_for_you = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String theme_color = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String app_lang = null;
    private final boolean enable_coupons = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.iqonic.store.models.StoreProductModel> you_may_like = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.DashboardBanner> getBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getBest_selling_product() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.CurrencySymbol getCurrency_symbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getDeal_of_the_day() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getFeatured() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getNewest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getOffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getSale_product() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.SocialLink getSocial_link() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getSuggested_for_you() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTheme_color() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApp_lang() {
        return null;
    }
    
    public final boolean getEnable_coupons() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> getYou_may_like() {
        return null;
    }
    
    public Dashboard(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.DashboardBanner> banner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> best_selling_product, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CurrencySymbol currency_symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> deal_of_the_day, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> featured, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> newest, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> offer, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> sale_product, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.SocialLink social_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> suggested_for_you, @org.jetbrains.annotations.NotNull()
    java.lang.String theme_color, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String app_lang, boolean enable_coupons, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> you_may_like) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.DashboardBanner> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.CurrencySymbol component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.SocialLink component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
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
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.store.models.StoreProductModel> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.store.models.Dashboard copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.DashboardBanner> banner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> best_selling_product, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CurrencySymbol currency_symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> deal_of_the_day, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> featured, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> newest, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> offer, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> sale_product, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.SocialLink social_link, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> suggested_for_you, @org.jetbrains.annotations.NotNull()
    java.lang.String theme_color, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_method, @org.jetbrains.annotations.NotNull()
    java.lang.String app_lang, boolean enable_coupons, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.store.models.StoreProductModel> you_may_like) {
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