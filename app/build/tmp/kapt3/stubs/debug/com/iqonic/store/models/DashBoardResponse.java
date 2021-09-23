package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/iqonic/store/models/DashBoardResponse;", "", "()V", "Productdetailview", "Lcom/iqonic/store/models/BuilderDetail;", "getProductdetailview", "()Lcom/iqonic/store/models/BuilderDetail;", "appSetup", "Lcom/iqonic/store/models/AppSetup;", "getAppSetup", "()Lcom/iqonic/store/models/AppSetup;", "dashboard", "Lcom/iqonic/store/models/BuilderDashboard;", "getDashboard", "()Lcom/iqonic/store/models/BuilderDashboard;", "app_debug"})
public final class DashBoardResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dashboard")
    private final com.iqonic.store.models.BuilderDashboard dashboard = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "productdetailview")
    private final com.iqonic.store.models.BuilderDetail Productdetailview = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "appsetup")
    private final com.iqonic.store.models.AppSetup appSetup = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.BuilderDashboard getDashboard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.BuilderDetail getProductdetailview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.AppSetup getAppSetup() {
        return null;
    }
    
    public DashBoardResponse() {
        super();
    }
}