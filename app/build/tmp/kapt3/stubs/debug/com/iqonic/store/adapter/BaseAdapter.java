package com.iqonic.store.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u00010\u0003R\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002:\u00016BZ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012K\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010#\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000&J\u0014\u0010\'\u001a\u00020\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0013\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010$J\u0006\u0010*\u001a\u00020\u000eJ\b\u0010+\u001a\u00020\u0005H\u0016J\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J(\u0010-\u001a\u00020\u000e2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J(\u0010/\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005H\u0016J\u000e\u00103\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0005R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000RV\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ra\u0010\u0018\u001aI\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00067"}, d2 = {"Lcom/iqonic/store/adapter/BaseAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqonic/store/adapter/BaseAdapter$ViewHolder;", "layout", "", "onBind", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "item", "position", "", "(ILkotlin/jvm/functions/Function3;)V", "items", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getOnBind", "()Lkotlin/jvm/functions/Function3;", "onItemClick", "pos", "getOnItemClick", "setOnItemClick", "(Lkotlin/jvm/functions/Function3;)V", "size", "getSize", "()Ljava/lang/Integer;", "setSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "addItem", "(Ljava/lang/Object;)V", "addItems", "", "addMoreItems", "aList", "addNewItem", "clearItems", "getItemCount", "getModel", "onBindViewHolder", "holder", "onCreateViewHolder", "p0", "Landroid/view/ViewGroup;", "p1", "removeItem", "setModelSize", "aSize", "ViewHolder", "app_debug"})
public final class BaseAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.iqonic.store.adapter.BaseAdapter<T>.ViewHolder<T>> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> items;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, ? super T, kotlin.Unit> onItemClick;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer size;
    private final int layout = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<android.view.View, T, java.lang.Integer, kotlin.Unit> onBind = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, android.view.View, T, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super android.view.View, ? super T, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final void addItem(T item) {
    }
    
    public final void addMoreItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> aList) {
    }
    
    public final void addNewItem(T item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getModel() {
        return null;
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
    }
    
    public final void removeItem(int pos) {
    }
    
    public final void clearItems() {
    }
    
    public final void setModelSize(int aSize) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.iqonic.store.adapter.BaseAdapter<T>.ViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.adapter.BaseAdapter<T>.ViewHolder<T> holder, int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function3<android.view.View, T, java.lang.Integer, kotlin.Unit> getOnBind() {
        return null;
    }
    
    public BaseAdapter(int layout, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBind) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\u00020\u0003BZ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012K\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016RV\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/iqonic/store/adapter/BaseAdapter$ViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "onBind", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "item", "", "position", "", "(Lcom/iqonic/store/adapter/BaseAdapter;Landroid/view/View;Lkotlin/jvm/functions/Function3;)V", "getOnBind", "()Lkotlin/jvm/functions/Function3;", "bind", "(Ljava/lang/Object;I)V", "onClick", "p0", "app_debug"})
    public final class ViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function3<android.view.View, T, java.lang.Integer, kotlin.Unit> onBind = null;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View p0) {
        }
        
        public final void bind(T item, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<android.view.View, T, java.lang.Integer, kotlin.Unit> getOnBind() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBind) {
            super(null);
        }
    }
}