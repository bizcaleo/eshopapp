package com.iqonic.store.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bR\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\b\t\u00a8\u0006\u001b"}, d2 = {"Lcom/iqonic/store/adapter/ProductImageAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "mImg", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "mListener", "Lcom/iqonic/store/adapter/ProductImageAdapter$OnClickListener;", "mListener$1", "destroyItem", "", "parent", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "v", "Landroid/view/View;", "setListener", "Companion", "OnClickListener", "app_debug"})
public final class ProductImageAdapter extends androidx.viewpager.widget.PagerAdapter {
    private com.iqonic.store.adapter.ProductImageAdapter.OnClickListener mListener$1;
    private java.util.ArrayList<java.lang.String> mImg;
    @org.jetbrains.annotations.Nullable()
    private static com.iqonic.store.adapter.ProductImageAdapter.OnClickListener mListener;
    public static final com.iqonic.store.adapter.ProductImageAdapter.Companion Companion = null;
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.adapter.ProductImageAdapter.OnClickListener mListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    public ProductImageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> mImg) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/store/adapter/ProductImageAdapter$OnClickListener;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/store/adapter/ProductImageAdapter$Companion;", "", "()V", "mListener", "Lcom/iqonic/store/adapter/ProductImageAdapter$OnClickListener;", "getMListener", "()Lcom/iqonic/store/adapter/ProductImageAdapter$OnClickListener;", "setMListener", "(Lcom/iqonic/store/adapter/ProductImageAdapter$OnClickListener;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.store.adapter.ProductImageAdapter.OnClickListener getMListener() {
            return null;
        }
        
        public final void setMListener(@org.jetbrains.annotations.Nullable()
        com.iqonic.store.adapter.ProductImageAdapter.OnClickListener p0) {
        }
        
        private Companion() {
            super();
        }
    }
}