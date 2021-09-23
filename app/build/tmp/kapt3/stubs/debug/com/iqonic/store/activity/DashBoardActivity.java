package com.iqonic.store.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0006\u0010\u0017\u001a\u00020\u0011J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\b\u0010!\u001a\u00020\u0011H\u0014J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/iqonic/store/activity/DashBoardActivity;", "Lcom/iqonic/store/AppBaseActivity;", "()V", "count", "", "mHomeFragment", "Landroidx/fragment/app/Fragment;", "mModeFlag", "", "mViewAllProductFragment", "Lcom/iqonic/store/fragments/ViewAllProductFragment;", "mWishListFragment", "Lcom/iqonic/store/fragments/WishListFragment;", "selectedDashboard", "", "selectedFragment", "cartCount", "", "changeColor", "closeDrawer", "loadFragment", "aFragment", "loadHomeFragment", "loadWishlistFragment", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setCartCountFromPref", "setListener", "setUpDrawerToggle", "setUserInfo", "app_debug"})
public final class DashBoardActivity extends com.iqonic.store.AppBaseActivity {
    private java.lang.String count = "";
    private androidx.fragment.app.Fragment mHomeFragment;
    private final com.iqonic.store.fragments.WishListFragment mWishListFragment = null;
    private final com.iqonic.store.fragments.ViewAllProductFragment mViewAllProductFragment = null;
    private androidx.fragment.app.Fragment selectedFragment;
    private int selectedDashboard = 0;
    private boolean mModeFlag = false;
    private java.util.HashMap _$_findViewCache;
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setUserInfo() {
    }
    
    private final void closeDrawer() {
    }
    
    private final void setUpDrawerToggle() {
    }
    
    private final void setListener() {
    }
    
    private final void loadFragment(androidx.fragment.app.Fragment aFragment) {
    }
    
    private final void loadHomeFragment() {
    }
    
    public final void loadWishlistFragment() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void cartCount() {
    }
    
    private final void setCartCountFromPref() {
    }
    
    private final void changeColor() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public DashBoardActivity() {
        super();
    }
}