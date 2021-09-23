package com.iqonic.store.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0002\u0010\u0010\u001aC\u0010\u0011\u001a\u00020\u0001\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0013*\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0019\b\n\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u00a2\u0006\u0002\b\u0019H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001a"}, d2 = {"dialNumber", "", "Landroid/content/Context;", "number", "", "getAppVersionName", "pName", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getLocationManager", "Landroid/location/LocationManager;", "isGPSEnable", "", "isPermissionGranted", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "launchActivity", "T", "", "options", "Landroid/os/Bundle;", "init", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public final class ContextExtensionsKt {
    
    public static final boolean isGPSEnable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGPSEnable) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.location.LocationManager getLocationManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getLocationManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.ConnectivityManager getConnectivityManager(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getConnectivityManager) {
        return null;
    }
    
    /**
     * Check if an App is Installed on the user device.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getAppVersionName(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getAppVersionName, @org.jetbrains.annotations.NotNull()
    java.lang.String pName) throws android.content.pm.PackageManager.NameNotFoundException {
        return null;
    }
    
    public static final void dialNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dialNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String number) {
    }
    
    public static final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isPermissionGranted, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
}