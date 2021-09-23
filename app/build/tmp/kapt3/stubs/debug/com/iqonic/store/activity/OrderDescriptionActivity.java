package com.iqonic.store.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0003R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/iqonic/store/activity/OrderDescriptionActivity;", "Lcom/iqonic/store/AppBaseActivity;", "()V", "mOrderNoteList", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/OrderNotes;", "orderModel", "Lcom/iqonic/store/models/Order;", "totalAmt", "", "changeColor", "", "isJSONValid", "", "test", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "orderCancelPopup", "setDetail", "app_debug"})
public final class OrderDescriptionActivity extends com.iqonic.store.AppBaseActivity {
    private com.iqonic.store.models.Order orderModel;
    private double totalAmt = 0.0;
    private java.util.ArrayList<com.iqonic.store.models.OrderNotes> mOrderNoteList;
    private java.util.HashMap _$_findViewCache;
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Popup for cancel order
     */
    private final void orderCancelPopup() {
    }
    
    private final boolean isJSONValid(java.lang.String test) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "SimpleDateFormat"})
    private final void setDetail() {
    }
    
    private final void changeColor() {
    }
    
    public OrderDescriptionActivity() {
        super();
    }
}