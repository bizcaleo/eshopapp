package com.iqonic.store.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/iqonic/store/utils/Constants;", "", "()V", "DD_MMM_YYYY", "Ljava/text/SimpleDateFormat;", "getDD_MMM_YYYY", "()Ljava/text/SimpleDateFormat;", "EXTRA_ADD_AMOUNT", "", "FULL_DATE_FORMATTER", "getFULL_DATE_FORMATTER", "YYYY_MM_DD", "getYYYY_MM_DD", "myPreferences", "", "AppBroadcasts", "DateFormatCodes", "KeyIntent", "OrderStatus", "PAYMENT_METHOD", "RequestCode", "SharedPref", "THEME", "TotalItem", "viewAllCode", "viewName", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat FULL_DATE_FORMATTER = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat DD_MMM_YYYY = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat YYYY_MM_DD = null;
    public static final int EXTRA_ADD_AMOUNT = 55;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String myPreferences = "MyPreferences";
    public static final com.iqonic.store.utils.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getFULL_DATE_FORMATTER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getDD_MMM_YYYY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getYYYY_MM_DD() {
        return null;
    }
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/store/utils/Constants$RequestCode;", "", "()V", "ACCOUNT", "", "ADD_ADDRESS", "COUPON_CODE", "EDIT_PROFILE", "LOGIN", "ORDER_CANCEL", "ORDER_SUMMARY", "ROZORPAY_PAYMENT", "SIGN_IN", "STRIPE_PAYMENT", "WEB_PAYMENT", "WISHLIST", "app_debug"})
    public static final class RequestCode {
        public static final int ADD_ADDRESS = 201;
        public static final int COUPON_CODE = 202;
        public static final int ACCOUNT = 203;
        public static final int ROZORPAY_PAYMENT = 204;
        public static final int ORDER_SUMMARY = 205;
        public static final int ORDER_CANCEL = 206;
        public static final int STRIPE_PAYMENT = 207;
        public static final int WEB_PAYMENT = 208;
        public static final int EDIT_PROFILE = 209;
        public static final int WISHLIST = 210;
        public static final int LOGIN = 211;
        public static final int SIGN_IN = 206;
        public static final com.iqonic.store.utils.Constants.RequestCode INSTANCE = null;
        
        private RequestCode() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/iqonic/store/utils/Constants$SharedPref;", "", "()V", "ACCENTCOLOR", "", "APPURL", "BACKGROUNDCOLOR", "BILLING", "CONSUMERKEY", "CONSUMERSECRET", "CONTACT", "COPYRIGHT_TEXT", "COUNTRY", "DASHBOARDDATA", "DEFAULT_CURRENCY", "DEFAULT_CURRENCY_FORMATE", "ENABLE_COUPONS", "FACEBOOK", "INSTAGRAM", "IS_LOGGED_IN", "IS_SOCIAL_LOGIN", "KEY_CART_COUNT", "KEY_DASHBOARD", "KEY_ORDER_COUNT", "KEY_PRODUCT_DETAIL", "KEY_USER_ADDRESS", "KEY_USER_CART", "KEY_WISHLIST_COUNT", "LANGUAGE", "MODE", "PAYMENT_METHOD", "PRIMARYCOLOR", "PRIMARYCOLORDARK", "PRIVACY_POLICY", "SHIPPING", "SHOW_SWIPE", "TERM_CONDITION", "TEXTPRIMARYCOLOR", "TEXTSECONDARYCOLOR", "THEME", "THEME_COLOR", "TWITTER", "USER_COUNTRY_CODE", "USER_DISPLAY_NAME", "USER_EMAIL", "USER_FIRST_NAME", "USER_ID", "USER_LAST_NAME", "USER_NICE_NAME", "USER_PASSWORD", "USER_PICODE", "USER_PROFILE", "USER_ROLE", "USER_STATE_CODE", "USER_STATE_NAME", "USER_TOKEN", "USER_USERNAME", "WHATSAPP", "app_debug"})
    public static final class SharedPref {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_LOGGED_IN = "isLoggedIn";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ID = "user_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_DISPLAY_NAME = "user_display_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_NICE_NAME = "user_nicename";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_EMAIL = "user_email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_FIRST_NAME = "user_first_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_COUNTRY_CODE = "user_country_code";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PICODE = "user_pincode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_STATE_CODE = "user_state_code";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_STATE_NAME = "user_state_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_LAST_NAME = "user_last_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PASSWORD = "user_password";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_USERNAME = "user_username";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ROLE = "user_username";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_SWIPE = "showswipe";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_USER_ADDRESS = "user_address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_USER_CART = "user_cart";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_WISHLIST_COUNT = "wishlist_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_ORDER_COUNT = "order_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_CART_COUNT = "cart_count";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_PROFILE = "user_profile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COUNTRY = "COUNTRY";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BILLING = "user_billing";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHIPPING = "user_shipping";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_TOKEN = "user_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String THEME_COLOR = "theme_color";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_CURRENCY = "default_currency";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEFAULT_CURRENCY_FORMATE = "default_currency_formate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENABLE_COUPONS = "enable_coupons";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WHATSAPP = "whatsapp";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FACEBOOK = "facebook";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TWITTER = "twitter";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String INSTAGRAM = "instagram";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTACT = "contact";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRIVACY_POLICY = "privacy_policy";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TERM_CONDITION = "term_condition";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COPYRIGHT_TEXT = "copyright_text";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE = "selected_language";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_SOCIAL_LOGIN = "is_social_login";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAYMENT_METHOD = "payment_method";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String THEME = "selected_theme";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_DASHBOARD = "key_dashboard";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEY_PRODUCT_DETAIL = "key_product_detail";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONSUMERKEY = "consumerKey";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONSUMERSECRET = "consumerSecret";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRIMARYCOLOR = "primaryColor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRIMARYCOLORDARK = "primaryColorDark";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCENTCOLOR = "accentColor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TEXTPRIMARYCOLOR = "textPrimaryColor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TEXTSECONDARYCOLOR = "textSecondaryColor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BACKGROUNDCOLOR = "backgroundColor";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DASHBOARDDATA = "dashboardData";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MODE = "mode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String APPURL = "appurl";
        public static final com.iqonic.store.utils.Constants.SharedPref INSTANCE = null;
        
        private SharedPref() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/store/utils/Constants$KeyIntent;", "", "()V", "ADDRESS_ID", "", "CHECKOUT_URL", "COUPON_CODE", "DATA", "DISCOUNT", "DISCOUNT_MRP", "EXTERNAL_URL", "IS_BANNER", "KEYID", "ORDER_DATA", "PRICE", "PRODUCTDATA", "PRODUCT_ID", "SHIPPING", "SHIPPINGDATA", "SHOW_PAGINATION", "SPECIAL_PRODUCT_KEY", "SUBTOTAL", "TITLE", "VIEWALLID", "app_debug"})
    public static final class KeyIntent {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRODUCT_ID = "product_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHOW_PAGINATION = "show_pagination";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TITLE = "title";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ADDRESS_ID = "address_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String KEYID = "key_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATA = "data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CHECKOUT_URL = "checkoutUrl";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EXTERNAL_URL = "external_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COUPON_CODE = "CouponCode";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRICE = "price";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PRODUCTDATA = "productdata";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHIPPINGDATA = "shippingdata";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUBTOTAL = "SUBTOTAL";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DISCOUNT = "DISCOUNT";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHIPPING = "SHIPPING";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DISCOUNT_MRP = "DISCOUNT_MRP";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ORDER_DATA = "orderData";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEWALLID = "viewallid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SPECIAL_PRODUCT_KEY = "special_product_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_BANNER = "is_banner";
        public static final com.iqonic.store.utils.Constants.KeyIntent INSTANCE = null;
        
        private KeyIntent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/store/utils/Constants$OrderStatus;", "", "()V", "CANCELED", "", "COMPLETED", "FAILED", "REFUNDED", "TRASH", "app_debug"})
    public static final class OrderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMPLETED = "completed";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REFUNDED = "refunded";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CANCELED = "cancelled";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TRASH = "trash";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FAILED = "failed";
        public static final com.iqonic.store.utils.Constants.OrderStatus INSTANCE = null;
        
        private OrderStatus() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/iqonic/store/utils/Constants$viewAllCode;", "", "()V", "BESTSELLING", "", "CATEGORY", "FEATURED", "NEWEST", "OTHER", "SALE", "SPECIAL_PRODUCT", "app_debug"})
    public static final class viewAllCode {
        public static final int NEWEST = 102;
        public static final int FEATURED = 103;
        public static final int OTHER = 105;
        public static final int SALE = 106;
        public static final int CATEGORY = 104;
        public static final int BESTSELLING = 107;
        public static final int SPECIAL_PRODUCT = 108;
        public static final com.iqonic.store.utils.Constants.viewAllCode INSTANCE = null;
        
        private viewAllCode() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/store/utils/Constants$AppBroadcasts;", "", "()V", "CARTITEM_UPDATE", "", "CART_COUNT_CHANGE", "ORDER_COUNT_CHANGE", "PROFILE_UPDATE", "WISHLIST_UPDATE", "app_debug"})
    public static final class AppBroadcasts {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CART_COUNT_CHANGE = "app.broadcast.setCartCount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ORDER_COUNT_CHANGE = "app.broadcast.OnOrderCountChanged";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PROFILE_UPDATE = "app.broadcast.OnProfileUpdated";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WISHLIST_UPDATE = "app.broadcast.OnWishListUpdated";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CARTITEM_UPDATE = "app.broadcast.OnCartItemUpdated";
        public static final com.iqonic.store.utils.Constants.AppBroadcasts INSTANCE = null;
        
        private AppBroadcasts() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/store/utils/Constants$DateFormatCodes;", "", "()V", "YMD", "", "YMD_HMS", "app_debug"})
    public static final class DateFormatCodes {
        public static final int YMD_HMS = 0;
        public static final int YMD = 1;
        public static final com.iqonic.store.utils.Constants.DateFormatCodes INSTANCE = null;
        
        private DateFormatCodes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/store/utils/Constants$PAYMENT_METHOD;", "", "()V", "PAYMENT_METHOD_NATIVE", "", "PAYMENT_METHOD_WEB", "app_debug"})
    public static final class PAYMENT_METHOD {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAYMENT_METHOD_NATIVE = "native";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAYMENT_METHOD_WEB = "webview";
        public static final com.iqonic.store.utils.Constants.PAYMENT_METHOD INSTANCE = null;
        
        private PAYMENT_METHOD() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/iqonic/store/utils/Constants$THEME;", "", "()V", "DARK", "", "LIGHT", "app_debug"})
    public static final class THEME {
        public static final int DARK = 1;
        public static final int LIGHT = 2;
        public static final com.iqonic.store.utils.Constants.THEME INSTANCE = null;
        
        private THEME() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/iqonic/store/utils/Constants$TotalItem;", "", "()V", "TOTAL_CATEGORY_PER_PAGE", "", "TOTAL_ITEM_PER_PAGE", "TOTAL_SUB_CATEGORY_PER_PAGE", "app_debug"})
    public static final class TotalItem {
        public static final int TOTAL_ITEM_PER_PAGE = 20;
        public static final int TOTAL_CATEGORY_PER_PAGE = 20;
        public static final int TOTAL_SUB_CATEGORY_PER_PAGE = 50;
        public static final com.iqonic.store.utils.Constants.TotalItem INSTANCE = null;
        
        private TotalItem() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/iqonic/store/utils/Constants$viewName;", "", "()V", "VIEW_BANNER", "", "VIEW_BEST_SELLING", "VIEW_DEAL_OF_THE_DAY", "VIEW_FEATURED", "VIEW_NEWEST", "VIEW_OFFER", "VIEW_SALE", "VIEW_SUGGESTED_FOR_YOU", "VIEW_YOU_MAY_LIKE", "app_debug"})
    public static final class viewName {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_BANNER = "slider";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_NEWEST = "newest_product";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_FEATURED = "feature_products";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_DEAL_OF_THE_DAY = "deal_of_the_day";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_BEST_SELLING = "best_selling_product";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_SALE = "sale_product";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_OFFER = "offer";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_SUGGESTED_FOR_YOU = "suggested_for_you";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VIEW_YOU_MAY_LIKE = "you_may_like";
        public static final com.iqonic.store.utils.Constants.viewName INSTANCE = null;
        
        private viewName() {
            super();
        }
    }
}