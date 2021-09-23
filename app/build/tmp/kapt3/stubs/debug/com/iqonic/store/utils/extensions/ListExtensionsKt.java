package com.iqonic.store.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\u0010\u000b\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u001aM\u0010\u0000\u001a\u00020\u0001*\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\u0010\u000e\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u001a\u00ba\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072\u0006\u0010\u0012\u001a\u00020\u00132#\u0010\u0014\u001a\u001f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0002\b\u00172\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b\u00a2\u0006\u0002\u0010\u001d\u001a\u008f\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u00132A\u0010\u0014\u001a=\u0012\u0004\u0012\u00020\u0016\u0012\u0013\u0012\u0011H\u000f\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0002\b\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u000f\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\n28\b\u0002\u0010\u0019\u001a2\u0012\u0013\u0012\u0011H\u000f\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b\u001a\u001e\u0010\"\u001a\u00020\u0001*\u00020#2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010$\u00a8\u0006%"}, d2 = {"create", "", "Landroid/widget/AutoCompleteTextView;", "itemLayout", "", "textViewId", "items", "", "", "onItemSelected", "Lkotlin/Function2;", "(Landroid/widget/AutoCompleteTextView;II[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "Landroid/widget/Spinner;", "(Landroid/widget/Spinner;II[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "T", "Landroidx/recyclerview/widget/RecyclerView;", "itemSize", "layoutMgr", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onBindView", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ExtensionFunctionType;", "itemClick", "itemLongClick", "onScrollTop", "Lkotlin/Function0;", "onScrollBottom", "(Landroidx/recyclerview/widget/RecyclerView;II[Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/ParameterName;", "name", "item", "position", "onPageSelected", "Landroidx/viewpager/widget/ViewPager;", "Lkotlin/Function1;", "app_debug"})
public final class ListExtensionsKt {
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final <T extends java.lang.Object>void create(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$create, int itemSize, int itemLayout, @org.jetbrains.annotations.NotNull()
    T[] items, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutMgr, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollTop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollBottom) {
    }
    
    public static final <T extends java.lang.Object>void create(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$create, int itemSize, int itemLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutMgr, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollTop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollBottom) {
    }
    
    public static final void onPageSelected(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPageSelected) {
    }
}