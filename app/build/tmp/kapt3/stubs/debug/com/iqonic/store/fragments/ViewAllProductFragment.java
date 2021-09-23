package com.iqonic.store.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0002J\u001c\u0010$\u001a\u00020\"2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u001c\u0010&\u001a\u00020\"2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\u0018\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J&\u0010,\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0006\u00104\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/iqonic/store/fragments/ViewAllProductFragment;", "Lcom/iqonic/store/fragments/BaseFragment;", "()V", "countLoadMore", "", "data", "", "", "image", "isLastPage", "", "Ljava/lang/Boolean;", "mCategoryId", "mColorArray", "", "mId", "mIsLastPage", "mIsLoading", "mProductAdapter", "Lcom/iqonic/store/adapter/BaseAdapter;", "Lcom/iqonic/store/models/StoreProductModel;", "mProductAttributeResponseMsg", "mSubCategoryAdapter", "Lcom/iqonic/store/models/Category;", "menuCart", "Landroid/view/View;", "searchRequest", "Lcom/iqonic/store/models/SearchRequest;", "showPagination", "specialProduct", "subCategoryCountLoadMore", "subCategoryData", "totalPages", "addCart", "", "model", "loadCategory", "loadData", "loadSubCategory", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setCartCount", "Companion", "app_debug"})
public final class ViewAllProductFragment extends com.iqonic.store.fragments.BaseFragment {
    private java.lang.Boolean showPagination = true;
    private boolean mIsLoading = false;
    private int countLoadMore = 1;
    private int subCategoryCountLoadMore = 1;
    private int mCategoryId = 0;
    private java.lang.String mProductAttributeResponseMsg;
    private android.view.View menuCart;
    private int mId = 0;
    private int[] mColorArray = {2131099698};
    private com.iqonic.store.models.SearchRequest searchRequest;
    private java.lang.String specialProduct = "";
    private int totalPages = 0;
    private final java.util.Map<java.lang.String, java.lang.Integer> data = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> subCategoryData = null;
    private java.lang.Boolean isLastPage = false;
    private java.lang.Boolean mIsLastPage = false;
    private java.lang.String image = "";
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.Category> mSubCategoryAdapter = null;
    private final com.iqonic.store.adapter.BaseAdapter<com.iqonic.store.models.StoreProductModel> mProductAdapter = null;
    public static final com.iqonic.store.fragments.ViewAllProductFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addCart(com.iqonic.store.models.StoreProductModel model) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public final void setCartCount() {
    }
    
    private final void loadCategory(java.util.Map<java.lang.String, java.lang.Integer> data) {
    }
    
    private final void loadSubCategory(java.util.Map<java.lang.String, java.lang.Integer> data) {
    }
    
    private final void loadData() {
    }
    
    public ViewAllProductFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/store/fragments/ViewAllProductFragment$Companion;", "", "()V", "getNewInstance", "Lcom/iqonic/store/fragments/ViewAllProductFragment;", "id", "", "mCategoryId", "showPagination", "", "specialProduct", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.store.fragments.ViewAllProductFragment getNewInstance(int id, int mCategoryId, boolean showPagination, @org.jetbrains.annotations.NotNull()
        java.lang.String specialProduct) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}