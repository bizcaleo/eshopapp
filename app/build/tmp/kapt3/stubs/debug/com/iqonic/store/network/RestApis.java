package com.iqonic.store.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H\'J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u0019H\'J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u001f2\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020!H\'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H\'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H\'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J2\u0010\'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020(0\u0004j\b\u0012\u0004\u0012\u00020(`\u00060\u00032\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J,\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0010\u001a\u00020+2\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0003H\'J2\u0010.\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0\u0004j\b\u0012\u0004\u0012\u00020/`\u00060\u00032\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J(\u00100\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002010\u0004j\b\u0012\u0004\u0012\u000201`\u00060\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H\'J\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0003H\'J\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u000205H\'J,\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J,\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J2\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0\u0004j\b\u0012\u0004\u0012\u00020;`\u00060\u00032\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J4\u0010<\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020=0\u0004j\b\u0012\u0004\u0012\u00020=`\u00060\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\rH\'J4\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020?0\u0004j\b\u0012\u0004\u0012\u00020?`\u00060\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\rH\'J\u001e\u0010@\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020?0\u0004j\b\u0012\u0004\u0012\u00020?`\u00060\u0003H\'J\u001e\u0010A\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020B0\u0004j\b\u0012\u0004\u0012\u00020B`\u00060\u0003H\'J(\u0010C\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020#0\u0004j\b\u0012\u0004\u0012\u00020#`\u00060\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0018H\'J(\u0010D\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020?0\u0004j\b\u0012\u0004\u0012\u00020?`\u00060\u00032\b\b\u0001\u0010E\u001a\u00020\u0018H\'J<\u0010F\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020?0\u0004j\b\u0012\u0004\u0012\u00020?`\u00060\u00032\b\b\u0001\u0010G\u001a\u00020\u00182\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J,\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J,\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020L2\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J,\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J6\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010R\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00032\b\b\u0003\u0010V\u001a\u00020\bH\'J\"\u0010W\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J,\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\b2\b\b\u0003\u0010\u0013\u001a\u00020\bH\'J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006["}, d2 = {"Lcom/iqonic/store/network/RestApis;", "", "FindCoupon", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/Coupons;", "Lkotlin/collections/ArrayList;", "code", "", "GetCoupon", "Search", "Lcom/iqonic/store/models/StoreProductModelNew;", "options", "", "addItemToCart", "Lcom/iqonic/store/models/AddCartResponse;", "request", "Lcom/iqonic/store/models/RequestModel;", "token", "id", "addWishList", "Lcom/iqonic/store/models/BaseResponse;", "cancelOrder", "ids", "", "Lcom/iqonic/store/models/CancelOrderRequest;", "changePwd", "createCustomer", "Lcom/iqonic/store/models/RegisterResponse;", "createOrder", "Lcom/iqonic/store/models/CreateOrderResponse;", "Lcom/iqonic/store/models/OrderRequest;", "createOrderNotes", "Lcom/iqonic/store/models/CreateOrderNotes;", "createProductReview", "Lcom/iqonic/store/models/ProductReviewData;", "deleteOrder", "deleteProductReview", "forgetPassword", "getCart", "Lcom/iqonic/store/models/CartResponse;", "getCheckoutUrl", "Lcom/iqonic/store/models/CheckoutResponse;", "Lcom/iqonic/store/models/CheckoutUrlRequest;", "getDashboardData", "Lcom/iqonic/store/models/Dashboard;", "getOrderData", "Lcom/iqonic/store/models/Order;", "getOrderTracking", "Lcom/iqonic/store/models/OrderNotes;", "getProductAttribute", "Lcom/iqonic/store/models/StoreProductAttribute;", "getSaleProducts", "Lcom/iqonic/store/models/SearchRequest;", "getShippingMethod", "Lcom/iqonic/store/models/ShippingModel;", "getStripeClientSecret", "Lcom/iqonic/store/models/GetStripeClientSecret;", "getWishList", "Lcom/iqonic/store/models/WishList;", "listAllCategory", "Lcom/iqonic/store/models/Category;", "listAllCategoryProduct", "Lcom/iqonic/store/models/StoreProductModel;", "listAllProducts", "listCountry", "Lcom/iqonic/store/models/CountryModel;", "listReview", "listSingleCategory", "categories", "listSingleProducts", "product_id", "login", "Lcom/iqonic/store/models/loginResponse;", "removeCartItem", "removeMultipleCartItem", "Lcom/iqonic/store/models/CartRequestModel;", "removeWishList", "retrieveCustomer", "Lcom/iqonic/store/models/CustomerData;", "saveProfileImage", "Lcom/iqonic/store/models/ProfileImage;", "type", "socialLogin", "tokenValidate", "Lcom/iqonic/store/models/TokenResponse;", "Authorization", "updateCustomer", "updateItemInCart", "Lcom/iqonic/store/models/UpdateCartResponse;", "updateProductReview", "app_debug"})
public abstract interface RestApis {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/woocommerce/get-dashboard")
    public abstract retrofit2.Call<com.iqonic.store.models.Dashboard> getDashboardData();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/products")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.StoreProductModel>> listAllProducts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/woocommerce/get-product-details")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.StoreProductModel>> listSingleProducts(@retrofit2.http.Query(value = "product_id")
    int product_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/products/categories")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.Category>> listAllCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Integer> options);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/products")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.StoreProductModel>> listSingleCategory(@retrofit2.http.Query(value = "category")
    int categories);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/products")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.StoreProductModel>> listAllCategoryProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Integer> options);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v1/products/{id}/reviews")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.ProductReviewData>> listReview(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/products/reviews")
    public abstract retrofit2.Call<com.iqonic.store.models.ProductReviewData> createProductReview(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "DELETE", path = "wc/v3/products/reviews/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.store.models.ProductReviewData> deleteProductReview(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "PUT", path = "wc/v3/products/reviews/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.store.models.ProductReviewData> updateProductReview(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/Coupons")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.Coupons>> GetCoupon();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/Coupons")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.Coupons>> FindCoupon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "code")
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/woocommerce/get-product")
    public abstract retrofit2.Call<com.iqonic.store.models.StoreProductModelNew> Search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> options);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/get-product")
    public abstract retrofit2.Call<com.iqonic.store.models.StoreProductModelNew> getSaleProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.SearchRequest options);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/woocommerce/get-product-attributes")
    public abstract retrofit2.Call<com.iqonic.store.models.StoreProductAttribute> getProductAttribute();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/customer/registration")
    public abstract retrofit2.Call<com.iqonic.store.models.RegisterResponse> createCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "jwt-auth/v1/token")
    public abstract retrofit2.Call<com.iqonic.store.models.loginResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "jwt-auth/v1/token/validate")
    public abstract retrofit2.Call<com.iqonic.store.models.TokenResponse> tokenValidate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/customers/{id}")
    public abstract retrofit2.Call<com.iqonic.store.models.CustomerData> retrieveCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/customers/{id}")
    public abstract retrofit2.Call<com.iqonic.store.models.CustomerData> updateCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/cart/add-cart/")
    public abstract retrofit2.Call<com.iqonic.store.models.AddCartResponse> addItemToCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/cart/get-cart/")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.CartResponse>> getCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/get-stripe-client-secret")
    public abstract retrofit2.Call<com.iqonic.store.models.GetStripeClientSecret> getStripeClientSecret(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/orders/{order_id}/notes")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> createOrderNotes(@retrofit2.http.Path(value = "order_id")
    int ids, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.CreateOrderNotes request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/get-checkout-url")
    public abstract retrofit2.Call<com.iqonic.store.models.CheckoutResponse> getCheckoutUrl(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.CheckoutUrlRequest request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/orders")
    public abstract retrofit2.Call<com.iqonic.store.models.CreateOrderResponse> createOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.OrderRequest request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/cart/delete-cart/")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> removeCartItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/cart/delete-cart/")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> removeMultipleCartItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.CartRequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/cart/update-cart/")
    public abstract retrofit2.Call<com.iqonic.store.models.UpdateCartResponse> updateItemInCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/wishlist/add-wishlist/")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> addWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/wishlist/get-wishlist/")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.WishList>> getWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/orders/{order_id}")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> cancelOrder(@retrofit2.http.Path(value = "order_id")
    int ids, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.CancelOrderRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/wishlist/delete-wishlist/")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> removeWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "iqonic-api/api/v1/woocommerce/get-customer-orders")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.Order>> getOrderData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/orders/{order_id}/notes")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.OrderNotes>> getOrderTracking(@retrofit2.http.Path(value = "order_id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/change-password")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> changePwd(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/customer/save-profile-image")
    public abstract retrofit2.Call<com.iqonic.store.models.ProfileImage> saveProfileImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/customer/forget-password")
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> forgetPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iqonic-api/api/v1/woocommerce/get-shipping-methods")
    public abstract retrofit2.Call<com.iqonic.store.models.ShippingModel> getShippingMethod(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/data/countries")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.store.models.CountryModel>> listCountry();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "DELETE", path = "wc/v3/orders/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.store.models.BaseResponse> deleteOrder(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/customer/social_login")
    public abstract retrofit2.Call<com.iqonic.store.models.loginResponse> socialLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.store.models.RequestModel request);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}