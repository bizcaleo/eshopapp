package com.iqonic.store.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rH\u0002J\"\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\u001a\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020\u0012H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/iqonic/store/activity/OrderSummaryActivity;", "Lcom/iqonic/store/AppBaseActivity;", "Lcom/razorpay/PaymentResultListener;", "()V", "TAG", "", "isNativePayment", "", "mCoupons", "Lcom/iqonic/store/models/Coupons;", "mTotalDiscountMRP", "", "orderId", "", "Ljava/lang/Integer;", "shippingItems", "Lcom/iqonic/store/models/Method;", "changeColor", "", "createOrderRequest", "orderRequest", "Lcom/iqonic/store/models/OrderRequest;", "deleteOrder", "getCheckoutUrl", "id", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPaymentError", "errorCode", "response", "onPaymentSuccess", "razorpayPaymentId", "showPaymentFailDialog", "startPayment", "updateAddress", "app_debug"})
public final class OrderSummaryActivity extends com.iqonic.store.AppBaseActivity implements com.razorpay.PaymentResultListener {
    private final java.lang.String TAG = null;
    private boolean isNativePayment = false;
    private com.iqonic.store.models.Method shippingItems;
    private com.iqonic.store.models.Coupons mCoupons;
    private java.lang.Integer orderId;
    private double mTotalDiscountMRP = 0.0;
    private java.util.HashMap _$_findViewCache;
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateAddress() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void deleteOrder() {
    }
    
    /**
     * Razorpay Payment
     */
    private final void startPayment() {
    }
    
    @java.lang.Override()
    public void onPaymentError(int errorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String response) {
    }
    
    private final void createOrderRequest(com.iqonic.store.models.OrderRequest orderRequest) {
    }
    
    private final void getCheckoutUrl(int id) {
    }
    
    @java.lang.Override()
    public void onPaymentSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String razorpayPaymentId) {
    }
    
    private final void showPaymentFailDialog() {
    }
    
    private final void changeColor() {
    }
    
    public OrderSummaryActivity() {
        super();
    }
}