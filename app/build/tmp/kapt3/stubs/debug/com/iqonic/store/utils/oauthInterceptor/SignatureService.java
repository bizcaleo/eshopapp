package com.iqonic.store.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/iqonic/store/utils/oauthInterceptor/SignatureService;", "", "signatureMethod", "", "getSignatureMethod", "()Ljava/lang/String;", "getSignature", "baseString", "apiSecret", "tokenSecret", "app_debug"})
public abstract interface SignatureService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSignatureMethod();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSignature(@org.jetbrains.annotations.NotNull()
    java.lang.String baseString, @org.jetbrains.annotations.NotNull()
    java.lang.String apiSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenSecret);
}