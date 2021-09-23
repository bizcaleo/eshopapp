package com.iqonic.store.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/store/network/RestApiCallback;", "T", "K", "", "onApiError", "", "aApiCode", "", "aFailureResponse", "(ILjava/lang/Object;)V", "onSuccess", "aSuccessResponse", "app_debug"})
public abstract interface RestApiCallback<T extends java.lang.Object, K extends java.lang.Object> {
    
    public abstract void onSuccess(int aApiCode, T aSuccessResponse);
    
    public abstract void onApiError(int aApiCode, K aFailureResponse);
}