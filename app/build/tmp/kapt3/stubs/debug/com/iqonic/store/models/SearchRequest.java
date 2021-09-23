package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRJ\u0010\t\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\nj\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b\u00a8\u00062"}, d2 = {"Lcom/iqonic/store/models/SearchRequest;", "", "()V", "Optional_selling", "", "getOptional_selling", "()Ljava/lang/String;", "setOptional_selling", "(Ljava/lang/String;)V", "attribute", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAttribute", "()Ljava/util/ArrayList;", "setAttribute", "(Ljava/util/ArrayList;)V", "category", "", "", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "featured", "getFeatured", "setFeatured", "newest", "getNewest", "setNewest", "on_sale", "getOn_sale", "setOn_sale", "page", "getPage", "()I", "setPage", "(I)V", "price", "getPrice", "setPrice", "product_per_page", "getProduct_per_page", "setProduct_per_page", "special_product", "getSpecial_product", "setSpecial_product", "text", "getText", "setText", "app_debug"})
public final class SearchRequest {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> attribute;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> category;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Optional_selling;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String on_sale;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String newest;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String featured;
    private int page = 0;
    private int product_per_page = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String special_product;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> getAttribute() {
        return null;
    }
    
    public final void setAttribute(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOptional_selling() {
        return null;
    }
    
    public final void setOptional_selling(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOn_sale() {
        return null;
    }
    
    public final void setOn_sale(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNewest() {
        return null;
    }
    
    public final void setNewest(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFeatured() {
        return null;
    }
    
    public final void setFeatured(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getProduct_per_page() {
        return 0;
    }
    
    public final void setProduct_per_page(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpecial_product() {
        return null;
    }
    
    public final void setSpecial_product(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public SearchRequest() {
        super();
    }
}