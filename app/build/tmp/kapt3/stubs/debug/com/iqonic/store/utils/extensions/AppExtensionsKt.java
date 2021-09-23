package com.iqonic.store.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00a8\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001aM\u0010\u0006\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\u00010\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\b\u001a\b\u0010\u0010\u001a\u00020\u0003H\u0007\u001a\u0006\u0010\u0011\u001a\u00020\u0003\u001a\b\u0010\u0012\u001a\u00020\u0003H\u0007\u001a\u0006\u0010\u0013\u001a\u00020\u0014\u001a\b\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0006\u0010\u0016\u001a\u00020\u0003\u001a\u0006\u0010\u0017\u001a\u00020\u0003\u001a\u0006\u0010\u0018\u001a\u00020\u0003\u001a\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u0006\u0010\u001a\u001a\u00020\u0003\u001a\u0006\u0010\u001b\u001a\u00020\u0003\u001a\u0006\u0010\u001c\u001a\u00020\u0003\u001a\u0006\u0010\u001d\u001a\u00020\u0003\u001a\u0006\u0010\u001e\u001a\u00020\u0003\u001a\b\u0010\u001f\u001a\u00020\u0003H\u0007\u001a\u0006\u0010 \u001a\u00020\u0003\u001a\u0006\u0010!\u001a\u00020\"\u001a\u0006\u0010#\u001a\u00020\u0003\u001a\u0006\u0010$\u001a\u00020%\u001a\u0006\u0010&\u001a\u00020\'\u001a\b\u0010(\u001a\u00020\u0003H\u0007\u001a\b\u0010)\u001a\u00020\u0003H\u0007\u001a\b\u0010*\u001a\u00020\u0003H\u0007\u001a\u0006\u0010+\u001a\u00020\u0003\u001a\u0006\u0010,\u001a\u00020\u0003\u001a\u0006\u0010-\u001a\u00020\u0003\u001a\u0006\u0010.\u001a\u00020\u0003\u001a\u0006\u0010/\u001a\u00020\u0003\u001a\u0006\u00100\u001a\u000201\u001a\u0006\u00102\u001a\u000203\u001a\u001a\u00104\u001a\u00020\u0001*\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\"\u001a\n\u00109\u001a\u00020\u0001*\u00020:\u001a\f\u0010;\u001a\u0004\u0018\u00010<*\u000207\u001a\f\u0010=\u001a\u0004\u0018\u00010<*\u000207\u001a\f\u0010>\u001a\u0004\u0018\u00010<*\u000207\u001a\u0012\u0010?\u001a\u00020\u0003*\u0002072\u0006\u0010@\u001a\u00020\u0003\u001a\u0082\u0001\u0010A\u001a\u00020B*\u00020:2\u0006\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\'\u0010G\u001a#\u0012\u0013\u0012\u00110I\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010H2\'\u0010K\u001a#\u0012\u0013\u0012\u00110I\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010H\u001a\u0014\u0010L\u001a\u00020\u0001*\u0002052\b\b\u0001\u00108\u001a\u00020\"\u001a\u001e\u0010M\u001a\u00020\u0001*\u0002072\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00010\b\u001a\u0012\u0010P\u001a\u00020\u0001*\u0002072\u0006\u0010Q\u001a\u00020\u0003\u001a\u0018\u0010R\u001a\u00020\u0001*\u00020:2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00010T\u001a\n\u0010U\u001a\u00020V*\u00020:\u001a\n\u0010W\u001a\u00020V*\u00020:\u001a\u001a\u0010X\u001a\u00020\u0001*\u00020:2\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[\u001a\n\u0010\\\u001a\u00020\u0001*\u00020]\u001a\u0012\u0010^\u001a\u00020\u0001*\u00020:2\u0006\u0010Y\u001a\u00020\u0003\u001a\n\u0010_\u001a\u00020\u0001*\u00020:\u001a\n\u0010`\u001a\u00020\u0001*\u00020:\u001a\n\u0010a\u001a\u00020\u0001*\u00020:\u001a\n\u0010b\u001a\u00020\u0001*\u00020:\u001a\n\u0010c\u001a\u00020\u0001*\u00020:\u00a8\u0006d"}, d2 = {"clearLoginPref", "", "convertOrderDataToLocalDate", "", "ourDate", "convertToLocalDate", "fetchCountry", "onApiSuccess", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/CountryModel;", "Lkotlin/collections/ArrayList;", "onApiError", "Lkotlin/ParameterName;", "name", "aError", "getAccentColor", "getApiToken", "getBackgroundColor", "getBuilderDashboard", "Lcom/iqonic/store/models/BuilderDashboard;", "getButtonColor", "getCartCount", "getDefaultCurrency", "getDefaultCurrencyFormate", "getDisplayName", "getEmail", "getFirstName", "getLanguage", "getLastName", "getOrderCount", "getPrimaryColor", "getPrimaryColorDark", "getProductDetailConstant", "", "getProfile", "getSharedPrefInstance", "Lcom/iqonic/store/utils/SharedPrefUtils;", "getShippingList", "Lcom/iqonic/store/models/Shipping;", "getTextPrimaryColor", "getTextSecondaryColor", "getTextTitleColor", "getUserFullName", "getUserId", "getUserName", "getUserProfile", "getWishListCount", "getbillingList", "Lcom/iqonic/store/models/Billing;", "isLoggedIn", "", "displayBlankImage", "Landroid/widget/ImageView;", "aContext", "Landroid/content/Context;", "aPlaceHolderImage", "fetchAndStoreCartData", "Landroid/app/Activity;", "fontBold", "Landroid/graphics/Typeface;", "fontRegular", "fontSemiBold", "fromJson", "file", "getAlertDialog", "Landroidx/appcompat/app/AlertDialog;", "aMsgText", "aTitleText", "aPositiveText", "aNegativeText", "onPositiveClick", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "dialog", "onNegativeClick", "loadImageFromDrawable", "mainContent", "onSuccess", "Lcom/iqonic/store/models/DashBoardResponse;", "openCustomTab", "url", "openNetworkDialog", "onClick", "Lkotlin/Function0;", "productLayoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "productLayoutParamsForDealOffer", "registerBroadCastReceiver", "action", "receiver", "Landroid/content/BroadcastReceiver;", "rvItemAnimation", "Landroidx/recyclerview/widget/RecyclerView;", "sendBroadcast", "sendCartBroadcast", "sendCartCountChangeBroadcast", "sendOrderCountChangeBroadcast", "sendProfileUpdateBroadcast", "sendWishlistBroadcast", "app_debug"})
public final class AppExtensionsKt {
    
    public static final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultCurrencyFormate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCartCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getWishListCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOrderCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getApiToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getPrimaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPrimaryColorDark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getAccentColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getButtonColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getTextPrimaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getTextSecondaryColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getBackgroundColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public static final java.lang.String getTextTitleColor() {
        return null;
    }
    
    public static final int getProductDetailConstant() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserFullName() {
        return null;
    }
    
    public static final void openCustomTab(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openCustomTab, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getProfile() {
        return null;
    }
    
    public static final void fetchAndStoreCartData(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fetchAndStoreCartData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String convertOrderDataToLocalDate(@org.jetbrains.annotations.NotNull()
    java.lang.String ourDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String convertToLocalDate(@org.jetbrains.annotations.NotNull()
    java.lang.String ourDate) {
        return null;
    }
    
    /**
     * Add shared preference related to user session here
     */
    public static final void clearLoginPref() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.store.utils.SharedPrefUtils getSharedPrefInstance() {
        return null;
    }
    
    public static final void rvItemAnimation(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$rvItemAnimation) {
    }
    
    public static final void displayBlankImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$displayBlankImage, @org.jetbrains.annotations.NotNull()
    android.content.Context aContext, int aPlaceHolderImage) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontSemiBold(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontSemiBold) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontBold(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontBold) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontRegular(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontRegular) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.appcompat.app.AlertDialog getAlertDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getAlertDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String aMsgText, @org.jetbrains.annotations.NotNull()
    java.lang.String aTitleText, @org.jetbrains.annotations.NotNull()
    java.lang.String aPositiveText, @org.jetbrains.annotations.NotNull()
    java.lang.String aNegativeText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.content.DialogInterface, ? super java.lang.Integer, kotlin.Unit> onPositiveClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.content.DialogInterface, ? super java.lang.Integer, kotlin.Unit> onNegativeClick) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.RelativeLayout.LayoutParams productLayoutParams(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$productLayoutParams) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.RelativeLayout.LayoutParams productLayoutParamsForDealOffer(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$productLayoutParamsForDealOffer) {
        return null;
    }
    
    public static final void sendCartCountChangeBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendCartCountChangeBroadcast) {
    }
    
    public static final void sendProfileUpdateBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendProfileUpdateBroadcast) {
    }
    
    public static final void sendWishlistBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendWishlistBroadcast) {
    }
    
    public static final void sendCartBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendCartBroadcast) {
    }
    
    public static final void sendOrderCountChangeBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendOrderCountChangeBroadcast) {
    }
    
    public static final void sendBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendBroadcast, @org.jetbrains.annotations.NotNull()
    java.lang.String action) {
    }
    
    public static final void registerBroadCastReceiver(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$registerBroadCastReceiver, @org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver receiver) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.store.models.Billing getbillingList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.store.models.Shipping getShippingList() {
        return null;
    }
    
    public static final void loadImageFromDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageFromDrawable, @androidx.annotation.DrawableRes()
    int aPlaceHolderImage) {
    }
    
    public static final void fetchCountry(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.CountryModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public static final void openNetworkDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$openNetworkDialog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String fromJson(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fromJson, @org.jetbrains.annotations.NotNull()
    java.lang.String file) {
        return null;
    }
    
    public static final void mainContent(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$mainContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.DashBoardResponse, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.store.models.BuilderDashboard getBuilderDashboard() {
        return null;
    }
}