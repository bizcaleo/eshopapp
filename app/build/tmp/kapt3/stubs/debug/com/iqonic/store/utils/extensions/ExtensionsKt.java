package com.iqonic.store.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00bc\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u001d\u0010\u0002\u001a\u00020\u0003\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\b\u001a\u001c\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014\u001a\u0012\u0010\u0019\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014\u001a\n\u0010\u001c\u001a\u00020\r*\u00020\u0010\u001a\n\u0010\u001d\u001a\u00020\r*\u00020\u0010\u001a\n\u0010\u001e\u001a\u00020\r*\u00020\u001f\u001a\u0012\u0010 \u001a\u00020\r*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012\u001a\u0012\u0010!\u001a\u00020\r*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0012\u001a\n\u0010\"\u001a\u00020\r*\u00020\u0010\u001a\n\u0010#\u001a\u00020\r*\u00020\u0010\u001a\n\u0010$\u001a\u00020\r*\u00020\u0010\u001a\n\u0010%\u001a\u00020\r*\u00020\u0010\u001a\u0012\u0010&\u001a\u00020\r*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0012\u001a\n\u0010\'\u001a\u00020\r*\u00020\u0010\u001a\n\u0010(\u001a\u00020\r*\u00020)\u001a\u0012\u0010\u001b\u001a\u00020\u0014*\u00020*2\u0006\u0010\u001b\u001a\u00020\u0014\u001a\u0012\u0010+\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010,\u001a\u00020\r*\u00020-\u001a)\u0010.\u001a\u00020\u0014*\u00020/2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020201\u00a2\u0006\u0002\b3H\u0086\b\u00f8\u0001\u0000\u001a\u0015\u00104\u001a\u00020\u001f*\u0002052\u0006\u00106\u001a\u00020\u0014H\u0086\u0004\u001aM\u00107\u001a\u00020\r\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020-2\b\b\u0002\u00108\u001a\u00020\u00142\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\u0019\b\n\u0010;\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r01\u00a2\u0006\u0002\b3H\u0086\b\u00f8\u0001\u0000\u001aM\u00107\u001a\u00020\r\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u00172\b\b\u0002\u00108\u001a\u00020\u00142\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\u0019\b\n\u0010;\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r01\u00a2\u0006\u0002\b3H\u0086\b\u00f8\u0001\u0000\u001a\u0019\u0010<\u001a\u00020\r\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020-H\u0086\b\u001a\n\u0010=\u001a\u00020\r*\u00020\u0015\u001a\n\u0010>\u001a\u00020\r*\u00020-\u001af\u0010?\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020@*\u0002H\u00042K\u0010A\u001aG\u0012\u0013\u0012\u00110\u001f\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\r0B\u00a2\u0006\u0002\u0010H\u001a:\u0010?\u001a\u00020\r\"\b\b\u0000\u0010\u0004*\u00020\u001f*\u0002H\u00042\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\r01\u00a2\u0006\u0002\b3H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010I\u001a\u0012\u0010J\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u001a\u0010K\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014\u001a@\u0010L\u001a\u00020\r*\u00020*2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120N2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\r01\u00a2\u0006\u0002\u0010Q\u001a\u0014\u0010R\u001a\u00020\r*\u00020S2\b\b\u0002\u0010T\u001a\u00020\u0001\u001a\u0014\u0010U\u001a\u00020\r*\u00020S2\b\b\u0002\u0010T\u001a\u00020\u0001\u001a\u0012\u0010V\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0012\u0010W\u001a\u00020\r*\u00020-2\u0006\u0010E\u001a\u00020\u001f\u001a\u001c\u0010X\u001a\u00020\r*\u00020-2\u0006\u0010Y\u001a\u00020\u00122\b\b\u0002\u0010Z\u001a\u00020\u0014\u001a\u0012\u0010X\u001a\u00020\r*\u00020\u00172\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010[\u001a\u00020\r*\u00020-2\u0006\u0010Y\u001a\u00020\u0012\u001a\u0012\u0010\\\u001a\u00020\u0014*\u00020*2\u0006\u0010\u001b\u001a\u00020\u0012\u001a\u0012\u0010]\u001a\u00020\r*\u00020\u00152\u0006\u0010^\u001a\u00020\u0001\u001a\u0016\u0010_\u001a\u00020`*\u00020`2\b\b\u0001\u0010\u001b\u001a\u00020\u0014H\u0000\u001a\u001e\u0010a\u001a\u00020\r*\u00020-2\b\b\u0001\u0010b\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020\u0014\u001a\u001c\u0010a\u001a\u00020\r*\u00020-2\u0006\u0010d\u001a\u00020\u00122\b\b\u0002\u0010c\u001a\u00020\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006e"}, d2 = {"isNetworkAvailable", "", "newIntent", "Landroid/content/Intent;", "T", "", "context", "Landroid/content/Context;", "runDelayed", "delayMillis", "", "action", "Lkotlin/Function0;", "", "setTextViewDrawableColor", "textView", "Landroid/widget/TextView;", "colors", "", "addFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "applyColorFilter", "Landroid/widget/ImageView;", "color", "applyStrike", "changeAccentColor", "changeBackgroundColor", "Landroid/view/View;", "changeBackgroundImageTint", "changeBackgroundTint", "changePrimaryColor", "changePrimaryColorDark", "changeTextPrimaryColor", "changeTextSecondaryColor", "changeTint", "changeTitleColor", "changeToolbarFont", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/fragment/app/FragmentActivity;", "hideFragment", "hideSoftKeyboard", "Landroid/app/Activity;", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "inflate", "Landroid/view/ViewGroup;", "layoutRes", "launchActivity", "requestCode", "options", "Landroid/os/Bundle;", "init", "launchActivityWithNewTask", "makeTransaprant", "noInternetSnackBar", "onClick", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "event", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "view", "position", "type", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function3;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "removeFragment", "replaceFragment", "requestPermissions", "permissions", "", "onResult", "isGranted", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "setHorizontalLayout", "Landroidx/recyclerview/widget/RecyclerView;", "aReverseLayout", "setVerticalLayout", "showFragment", "showPermissionAlert", "snackBar", "msg", "length", "snackBarError", "stringColor", "switchToDarkMode", "isDark", "tint", "Landroid/graphics/drawable/Drawable;", "toast", "stringRes", "duration", "text", "app_debug"})
public final class ExtensionsKt {
    
    @androidx.annotation.RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
    public static final boolean isNetworkAvailable() {
        return false;
    }
    
    public static final <T extends android.view.View>void onClick(@org.jetbrains.annotations.NotNull()
    T $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> func) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final int inTransaction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager $this$inTransaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, ? extends androidx.fragment.app.FragmentTransaction> func) {
        return 0;
    }
    
    public static final void snackBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$snackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int length) {
    }
    
    public static final void snackBar(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$snackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public static final void snackBarError(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$snackBarError, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public static final void noInternetSnackBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$noInternetSnackBar) {
    }
    
    public static final void showPermissionAlert(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showPermissionAlert, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final int replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
        return 0;
    }
    
    public static final int addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
        return 0;
    }
    
    public static final int removeFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$removeFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final int showFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$showFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final int hideFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$hideFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final void makeTransaprant(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$makeTransaprant) {
    }
    
    public static final boolean runDelayed(long delayMillis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.recyclerview.widget.RecyclerView.ViewHolder>T onClick(@org.jetbrains.annotations.NotNull()
    T $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$inflate, int layoutRes) {
        return null;
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideSoftKeyboard) {
    }
    
    public static final void changeToolbarFont(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar $this$changeToolbarFont) {
    }
    
    public static final void applyColorFilter(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$applyColorFilter, int color) {
    }
    
    public static final void applyStrike(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$applyStrike) {
    }
    
    public static final void requestPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$requestPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable tint(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$tint, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    public static final void setVerticalLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setVerticalLayout, boolean aReverseLayout) {
    }
    
    public static final void setHorizontalLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setHorizontalLayout, boolean aReverseLayout) {
    }
    
    public static final int color(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$color, int color) {
        return 0;
    }
    
    public static final int stringColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$stringColor, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
        return 0;
    }
    
    public static final void switchToDarkMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$switchToDarkMode, boolean isDark) {
    }
    
    public static final void changeAccentColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changeAccentColor) {
    }
    
    public static final void changePrimaryColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changePrimaryColor) {
    }
    
    public static final void changePrimaryColorDark(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changePrimaryColorDark) {
    }
    
    public static final void changeTextPrimaryColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changeTextPrimaryColor) {
    }
    
    public static final void changeTextSecondaryColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changeTextSecondaryColor) {
    }
    
    public static final void changeTitleColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changeTitleColor) {
    }
    
    public static final void changeBackgroundTint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$changeBackgroundTint, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    public static final void changeBackgroundImageTint(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$changeBackgroundImageTint, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    public static final void changeTint(@org.jetbrains.annotations.NotNull()
    android.view.View $this$changeTint, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
    }
    
    public static final void changeBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$changeBackgroundColor) {
    }
    
    public static final void setTextViewDrawableColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.String colors) {
    }
}