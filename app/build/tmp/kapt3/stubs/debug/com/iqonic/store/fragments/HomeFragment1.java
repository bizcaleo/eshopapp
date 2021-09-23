package com.iqonic.store.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0018H\u0003J\b\u0010\"\u001a\u00020\u0018H\u0003JV\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\b\b\u0002\u0010+\u001a\u00020)H\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J&\u00101\u001a\u0004\u0018\u00010\r2\u0006\u0010/\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0006\u0010<\u001a\u00020\u0018J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0004H\u0002J\u0018\u0010?\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/iqonic/store/fragments/HomeFragment1;", "Lcom/iqonic/store/fragments/BaseFragment;", "()V", "image", "", "isAddedToCart", "", "lan", "mDashboardJson", "Lcom/iqonic/store/models/BuilderDashboard;", "mLLDynamic", "Landroid/widget/LinearLayout;", "mMenuCart", "Landroid/view/View;", "mSliderView", "mViewBestSelling", "mViewDealOfTheDay", "mViewFeatured", "mViewNewest", "mViewOffer", "mViewSale", "mViewSuggested", "mViewYouMayLike", "addSlider", "", "productList", "", "Lcom/iqonic/store/models/DashboardBanner;", "listAllProducts", "loadApis", "mAddCart", "model", "Lcom/iqonic/store/models/StoreProductModel;", "mProductUI", "mSliderUI", "onAddView", "mView", "isGridView", "title", "mViewAll", "code", "", "specialKey", "modelSize", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "setCartCount", "setNewLocale", "language", "setProductItem", "showLoader", "app_debug"})
public final class HomeFragment1 extends com.iqonic.store.fragments.BaseFragment {
    private android.view.View mMenuCart;
    private java.lang.String image = "";
    private boolean isAddedToCart = false;
    private java.lang.String lan;
    private android.view.View mViewNewest;
    private android.view.View mViewFeatured;
    private android.view.View mViewDealOfTheDay;
    private android.view.View mViewOffer;
    private android.view.View mViewBestSelling;
    private android.view.View mViewSale;
    private android.view.View mViewYouMayLike;
    private android.view.View mViewSuggested;
    private android.view.View mSliderView;
    private android.widget.LinearLayout mLLDynamic;
    private com.iqonic.store.models.BuilderDashboard mDashboardJson;
    private java.util.HashMap _$_findViewCache;
    
    private final void setProductItem(android.view.View view, com.iqonic.store.models.StoreProductModel model) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void mAddCart(com.iqonic.store.models.StoreProductModel model) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void mProductUI() {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void mSliderUI() {
    }
    
    private final void onAddView(android.view.View mView, boolean isGridView, java.lang.String title, java.lang.String mViewAll, int code, java.lang.String specialKey, java.util.List<com.iqonic.store.models.StoreProductModel> productList, int modelSize) {
    }
    
    private final void addSlider(java.util.List<com.iqonic.store.models.DashboardBanner> productList) {
    }
    
    private final void showLoader() {
    }
    
    private final void loadApis() {
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
    
    public final void setCartCount() {
    }
    
    private final void listAllProducts() {
    }
    
    private final void setNewLocale(java.lang.String language) {
    }
    
    public HomeFragment1() {
        super();
    }
}