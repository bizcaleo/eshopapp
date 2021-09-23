package com.iqonic.store.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00bc\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001ae\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\n2#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u001a9\u0010\u0011\u001a\u00020\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0001\u001a*\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u001aY\u0010\u001e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u001f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a&\u0010 \u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010%\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010\'\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\n\u001a.\u0010)\u001a\u00020\u0005*\u00020!2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,\u0012\u0004\u0012\u00020\u00050\n\u001a.\u0010-\u001a\u00020\u0005*\u00020!2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020.0*j\b\u0012\u0004\u0012\u00020.`,\u0012\u0004\u0012\u00020\u00050\n\u001a6\u0010/\u001a\u00020\u0005*\u00020!2\u0006\u00100\u001a\u0002012\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002020*j\b\u0012\u0004\u0012\u000202`,\u0012\u0004\u0012\u00020\u00050\n\u001a.\u00103\u001a\u00020\u0005*\u00020!2\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002040*j\b\u0012\u0004\u0012\u000204`,\u0012\u0004\u0012\u00020\u00050\n\u001a6\u00105\u001a\u00020\u0005*\u00020!2\u0006\u00100\u001a\u0002012\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002060*j\b\u0012\u0004\u0012\u000206`,\u0012\u0004\u0012\u00020\u00050\n\u001a&\u00107\u001a\u00020\u0005*\u0002082\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u0002012\b\b\u0002\u0010;\u001a\u000201\u001a&\u0010<\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010>\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010?\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020@2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050\n\u001a6\u0010A\u001a\u00020\u0005*\u00020!2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010G\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\n\u001aB\u0010H\u001a\u00020\u0005*\u00020!2\u0006\u0010I\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00050\n\u001a&\u0010J\u001a\u00020\u0005*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00050\n\u00a8\u0006L"}, d2 = {"bodyToString", "", "request", "Lokhttp3/Request;", "callApi", "", "T", "call", "Lretrofit2/Call;", "onApiSuccess", "Lkotlin/Function1;", "onApiError", "Lkotlin/ParameterName;", "name", "aError", "onNetworkError", "Lkotlin/Function0;", "failureCallback", "getJsonMsg", "errorBody", "Lokhttp3/ResponseBody;", "getRestApiImpl", "Lcom/iqonic/store/network/RestApiImpl;", "url", "logData", "response", "time", "", "isError", "", "successCallback", "Lretrofit2/Response;", "addItemToCart", "Lcom/iqonic/store/AppBaseActivity;", "requestModel", "Lcom/iqonic/store/models/RequestModel;", "Lcom/iqonic/store/models/AddCartResponse;", "addToWishList", "onSuccess", "createCustomer", "Lcom/iqonic/store/models/RegisterResponse;", "fetchAndStoreWishListData", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/WishList;", "Lkotlin/collections/ArrayList;", "getOrder", "Lcom/iqonic/store/models/Order;", "getOrderTracking", "id", "", "Lcom/iqonic/store/models/OrderNotes;", "listCoupons", "Lcom/iqonic/store/models/Coupons;", "listReview", "Lcom/iqonic/store/models/ProductReviewData;", "loadImageFromUrl", "Landroid/widget/ImageView;", "aImageUrl", "aPlaceHolderImage", "aErrorImage", "removeCartItem", "Lcom/iqonic/store/models/BaseResponse;", "removeFromWishList", "removeMultipleCartItem", "Lcom/iqonic/store/models/CartRequestModel;", "saveLoginResponse", "it", "Lcom/iqonic/store/models/loginResponse;", "isSocialLogin", "password", "onError", "saveProfileImage", "signIn", "email", "updateCustomer", "Lcom/iqonic/store/models/CustomerData;", "app_debug"})
public final class NetworkExtensionKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String bodyToString(@org.jetbrains.annotations.Nullable()
    okhttp3.Request request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getJsonMsg(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody) {
        return null;
    }
    
    public static final void logData(@org.jetbrains.annotations.NotNull()
    okhttp3.Request request, @org.jetbrains.annotations.NotNull()
    java.lang.String response, long time, boolean isError) {
    }
    
    public static final <T extends java.lang.Object>void callApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNetworkError) {
    }
    
    public static final <T extends java.lang.Object>void successCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response, @org.jetbrains.annotations.NotNull()
    okhttp3.Request request) {
    }
    
    public static final void failureCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError, @org.jetbrains.annotations.NotNull()
    okhttp3.Request request, @org.jetbrains.annotations.NotNull()
    java.lang.String aError) {
    }
    
    public static final void loadImageFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageFromUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String aImageUrl, int aPlaceHolderImage, int aErrorImage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.store.network.RestApiImpl getRestApiImpl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public static final void listReview(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$listReview, int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.ProductReviewData>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void listCoupons(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$listCoupons, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Coupons>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void createCustomer(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$createCustomer, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.RegisterResponse, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void updateCustomer(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$updateCustomer, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.CustomerData, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void signIn(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$signIn, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.loginResponse, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void saveLoginResponse(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$saveLoginResponse, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.loginResponse it, boolean isSocialLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public static final void addItemToCart(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$addItemToCart, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.AddCartResponse, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void removeCartItem(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$removeCartItem, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void removeMultipleCartItem(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$removeMultipleCartItem, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CartRequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void removeFromWishList(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$removeFromWishList, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void addToWishList(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$addToWishList, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void fetchAndStoreWishListData(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$fetchAndStoreWishListData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.WishList>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void getOrder(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$getOrder, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Order>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void getOrderTracking(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$getOrderTracking, int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.OrderNotes>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void saveProfileImage(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.AppBaseActivity $this$saveProfileImage, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onApiSuccess) {
    }
}