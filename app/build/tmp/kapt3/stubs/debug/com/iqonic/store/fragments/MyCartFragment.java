package com.iqonic.store.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020 H\u0003J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\u0006H\u0002J\b\u0010&\u001a\u00020 H\u0003J\b\u0010\'\u001a\u00020 H\u0007J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0006H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0012H\u0002J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0012H\u0002J\u0018\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\"\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0018\u00107\u001a\u00020 2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010:\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0012H\u0002J\u001a\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020=2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010H\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0002J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020 H\u0002J\u0010\u0010K\u001a\u00020 2\u0006\u0010!\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/iqonic/store/fragments/MyCartFragment;", "Lcom/iqonic/store/fragments/BaseFragment;", "()V", "cartItemId", "", "isRemoveCoupons", "", "mCartAdapter", "Lcom/iqonic/store/adapter/BaseAdapter;", "Lcom/iqonic/store/models/CartResponse;", "mCoupons", "Lcom/iqonic/store/models/Coupons;", "mOrderItems", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/Line_items;", "Lkotlin/collections/ArrayList;", "mShippingCost", "mShippingMethodAdapter", "Lcom/iqonic/store/models/Method;", "mSubTotal", "", "mTotalCount", "mTotalDiscount", "mTotalDiscountMRP", "mTotalMRPCount", "selectedMethod", "", "shipping", "Lcom/iqonic/store/models/Shipping;", "shippingMethods", "shippingMethodsAvailable", "addClick", "", "model", "position", "applyCouponCode", "changeColor", "coupan", "fetchShippingMethods", "invalidateCartLayout", "invalidatePaymentLayout", "b", "invalidateShippingMethods", "isMethodAvailable", "method", "minAmount", "minusClick", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onShippingMethodChanged", "pos", "onViewCreated", "view", "removeCartItem", "removeCoupon", "removeMultipleCartItem", "updateCartItem", "app_debug"})
public final class MyCartFragment extends com.iqonic.store.fragments.BaseFragment {
    private com.iqonic.store.models.Coupons mCoupons;
    private double mTotalCount = 0.0;
    private double mTotalMRPCount = 0.0;
    private double mSubTotal = 0.0;
    private java.lang.String mTotalDiscount = "0";
    private double mTotalDiscountMRP = 0.0;
    private java.lang.String mShippingCost = "0";
    private java.lang.String cartItemId = "";
    private boolean isRemoveCoupons = true;
    private java.util.ArrayList<com.iqonic.store.models.Line_items> mOrderItems;
    private java.util.ArrayList<com.iqonic.store.models.Method> shippingMethods;
    private java.util.ArrayList<com.iqonic.store.models.Method> shippingMethodsAvailable;
    private com.iqonic.store.models.Shipping shipping;
    private int selectedMethod = 0;
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.CartResponse> mCartAdapter = null;
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.Method> mShippingMethodAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void addClick(com.iqonic.store.models.CartResponse model, int position) {
    }
    
    private final void minusClick(com.iqonic.store.models.CartResponse model, int position) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onShippingMethodChanged(int pos, com.iqonic.store.models.Method model) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void invalidatePaymentLayout(boolean b) {
    }
    
    private final void removeMultipleCartItem() {
    }
    
    private final void removeCartItem(com.iqonic.store.models.CartResponse model) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void invalidateCartLayout() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void fetchShippingMethods() {
    }
    
    private final void invalidateShippingMethods() {
    }
    
    private final boolean isMethodAvailable(com.iqonic.store.models.Method method) {
        return false;
    }
    
    private final boolean minAmount(com.iqonic.store.models.Method method) {
        return false;
    }
    
    private final boolean coupan() {
        return false;
    }
    
    private final void updateCartItem(com.iqonic.store.models.CartResponse model) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * Apply coupon code
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void applyCouponCode() {
    }
    
    private final void removeCoupon() {
    }
    
    private final void changeColor() {
    }
    
    public MyCartFragment() {
        super();
    }
}