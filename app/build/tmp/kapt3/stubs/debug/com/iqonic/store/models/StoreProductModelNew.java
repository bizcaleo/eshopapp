package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/iqonic/store/models/StoreProductModelNew;", "", "()V", "data", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/StoreProductModel;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "numOfPages", "", "getNumOfPages", "()I", "setNumOfPages", "(I)V", "app_debug"})
public final class StoreProductModelNew {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "num_of_pages")
    private int numOfPages = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.ArrayList<com.iqonic.store.models.StoreProductModel> data;
    
    public final int getNumOfPages() {
        return 0;
    }
    
    public final void setNumOfPages(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.store.models.StoreProductModel> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.store.models.StoreProductModel> p0) {
    }
    
    public StoreProductModelNew() {
        super();
    }
}