package com.iqonic.store.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/store/network/ApiError;", "T", "", "apiErrorCode", "", "error", "(ILjava/lang/Object;)V", "getApiErrorCode", "()I", "setApiErrorCode", "(I)V", "getError", "()Ljava/lang/Object;", "setError", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "app_debug"})
public final class ApiError<T extends java.lang.Object> {
    private int apiErrorCode;
    @org.jetbrains.annotations.Nullable()
    private T error;
    
    public final int getApiErrorCode() {
        return 0;
    }
    
    public final void setApiErrorCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public ApiError(int apiErrorCode, @org.jetbrains.annotations.Nullable()
    T error) {
        super();
    }
}