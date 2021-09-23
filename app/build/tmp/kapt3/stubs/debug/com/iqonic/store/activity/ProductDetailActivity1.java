package com.iqonic.store.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\u001a\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u0004H\u0002J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\u001cH\u0003J\b\u0010*\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u0017H\u0002J\u0012\u0010-\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001cH\u0002J\u0010\u00104\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rH\u0003J\b\u00105\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\u0010\u00108\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rH\u0003J\"\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00172\b\b\u0002\u0010;\u001a\u00020\u0006H\u0002J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rH\u0003J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/iqonic/store/activity/ProductDetailActivity1;", "Lcom/iqonic/store/AppBaseActivity;", "()V", "image", "", "isAddedToCart", "", "mAttributeAdapter", "Lcom/iqonic/store/adapter/BaseAdapter;", "mCategoryAdapter", "Lcom/iqonic/store/models/StoreCategory;", "mExternalURL", "mGroupCartAdapter", "Lcom/iqonic/store/models/StoreProductModel;", "mImages", "Ljava/util/ArrayList;", "mIsExternalProduct", "mIsInWishList", "mMenuCart", "Landroid/view/View;", "mPId", "", "mProductAdapter", "Lcom/iqonic/store/models/StoreUpSale;", "mQuantity", "mYearAdapter", "Landroid/widget/ArrayAdapter;", "addItemToCart", "", "addItemToCartGroupItem", "id", "calculateDiscount", "", "salePrice", "regularPrice", "changeColor", "changeFavIcon", "drawable", "iconTint", "checkWishListCartDetail", "its", "getProductDetail", "loadApis", "mAddCart", "model", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onFavouriteClick", "onSaleOffer", "removeCartItem", "setCartCount", "setCartCountFromPref", "setPriceDetail", "setProductItem1", "view", "params", "showUpComingSale", "viewVariableImage", "app_debug"})
public final class ProductDetailActivity1 extends com.iqonic.store.AppBaseActivity {
    private int mPId = 0;
    private final java.util.ArrayList<java.lang.String> mImages = null;
    private android.view.View mMenuCart;
    private boolean isAddedToCart = false;
    private boolean mIsInWishList = false;
    private boolean mIsExternalProduct = false;
    private java.lang.String mExternalURL = "";
    private com.iqonic.store.adapter.BaseAdapter<java.lang.String> mAttributeAdapter;
    private android.widget.ArrayAdapter<java.lang.String> mYearAdapter;
    private java.lang.String mQuantity = "1";
    private java.lang.String image = "";
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.StoreUpSale> mProductAdapter = null;
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.StoreCategory> mCategoryAdapter = null;
    
    /**
     * Grouped Items DisplayM
     */
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.StoreProductModel> mGroupCartAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void setProductItem1(android.view.View view, com.iqonic.store.models.StoreUpSale model, boolean params) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void mAddCart(com.iqonic.store.models.StoreUpSale model) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    private final void setCartCountFromPref() {
    }
    
    private final void addItemToCart() {
    }
    
    private final void addItemToCartGroupItem(int id) {
    }
    
    private final void setCartCount() {
    }
    
    private final void removeCartItem() {
    }
    
    private final void loadApis() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "InflateParams"})
    private final void getProductDetail() {
    }
    
    private final float calculateDiscount(java.lang.String salePrice, java.lang.String regularPrice) {
        return 0.0F;
    }
    
    /**
     * Header Images
     */
    private final void viewVariableImage(com.iqonic.store.models.StoreProductModel its) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setPriceDetail(com.iqonic.store.models.StoreProductModel its) {
    }
    
    private final void checkWishListCartDetail(com.iqonic.store.models.StoreProductModel its) {
    }
    
    /**
     * Showing Special Price Label
     */
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void onSaleOffer(com.iqonic.store.models.StoreProductModel its) {
    }
    
    /**
     * Show Upcoming sale details
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showUpComingSale(com.iqonic.store.models.StoreProductModel its) {
    }
    
    private final void onFavouriteClick() {
    }
    
    private final void changeFavIcon(int drawable, java.lang.String iconTint) {
    }
    
    private final void changeColor() {
    }
    
    public ProductDetailActivity1() {
        super();
    }
}