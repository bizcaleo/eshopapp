package com.iqonic.store;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u000bH\u0007J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000bH\u0014J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0002J\u000e\u0010,\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020(J\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\"J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/iqonic/store/AppBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "language", "Ljava/util/Locale;", "getLanguage", "()Ljava/util/Locale;", "setLanguage", "(Ljava/util/Locale;)V", "onNetworkRetry", "Lkotlin/Function0;", "", "getOnNetworkRetry", "()Lkotlin/jvm/functions/Function0;", "setOnNetworkRetry", "(Lkotlin/jvm/functions/Function0;)V", "progressDialog", "Landroid/app/Dialog;", "themeApp", "", "attachBaseContext", "newBase", "Landroid/content/Context;", "changeLanguage", "context", "locale", "disableHardwareRendering", "v", "Landroid/view/View;", "mAppBarColor", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "setDetailToolbar", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "setStatusBarGradient", "activity", "Landroid/app/Activity;", "setToolbar", "showProgress", "show", "updateBaseContextLocale", "app_debug"})
public class AppBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.app.Dialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private java.util.Locale language;
    private int themeApp = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNetworkRetry;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Locale getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.util.Locale p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNetworkRetry() {
        return null;
    }
    
    public final void setOnNetworkRetry(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final void disableHardwareRendering(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar mToolbar) {
    }
    
    public final void setDetailToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar mToolbar) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setStatusBarGradient(android.app.Activity activity) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void mAppBarColor() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showProgress(boolean show) {
    }
    
    private final android.content.Context changeLanguage(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    private final android.content.Context updateBaseContextLocale(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public AppBaseActivity() {
        super();
    }
}