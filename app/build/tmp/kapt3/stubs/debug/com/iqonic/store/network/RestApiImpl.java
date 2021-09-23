package com.iqonic.store.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JE\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJU\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00032\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJ=\u0010\u001d\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020#2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020+2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010-\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010.\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010/\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u00100\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002010\u0018j\b\u0012\u0004\u0012\u000201`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u0002032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJ=\u00105\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u00107\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002080\u0018j\b\u0012\u0004\u0012\u000208`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJU\u00109\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020:0\u0018j\b\u0012\u0004\u0012\u00020:`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010=\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010?\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020@0\u0018j\b\u0012\u0004\u0012\u00020@`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJa\u0010A\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140C2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020D0\u0018j\b\u0012\u0004\u0012\u00020D`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJa\u0010E\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140C2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020F0\u0018j\b\u0012\u0004\u0012\u00020F`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010G\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020H0\u0018j\b\u0012\u0004\u0012\u00020H`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJ=\u0010I\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010K\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020F0\u0018j\b\u0012\u0004\u0012\u00020F`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010L\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJU\u0010M\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0018j\b\u0012\u0004\u0012\u00020\u0015`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010N\u001a\u00020\b2\u0006\u0010B\u001a\u00020O2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJU\u0010Q\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020F0\u0018j\b\u0012\u0004\u0012\u00020F`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJU\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00142\"\u0010\u000b\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020F0\u0018j\b\u0012\u0004\u0012\u00020F`\u001a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010T\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010U\u001a\u00020\b2\u0006\u0010\t\u001a\u00020V2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010W\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJ=\u0010X\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010Z\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJQ\u0010\\\u001a\u00020\b2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030C2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010^\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010_\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJE\u0010`\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fJM\u0010b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lcom/iqonic/store/network/RestApiImpl;", "", "s", "", "(Ljava/lang/String;)V", "getRestApis", "Lcom/iqonic/store/network/RestApis;", "CreateCustomer", "", "request", "Lcom/iqonic/store/models/RequestModel;", "onApiSuccess", "Lkotlin/Function1;", "Lcom/iqonic/store/models/RegisterResponse;", "onApiError", "Lkotlin/ParameterName;", "name", "aError", "DeleteProductReview", "id", "", "Lcom/iqonic/store/models/ProductReviewData;", "FindCoupon", "acode", "Ljava/util/ArrayList;", "Lcom/iqonic/store/models/Coupons;", "Lkotlin/collections/ArrayList;", "Login", "Lcom/iqonic/store/models/loginResponse;", "TokenAPI", "Lcom/iqonic/store/models/TokenResponse;", "addItemToCart", "Lcom/iqonic/store/models/AddCartResponse;", "addOrderNotes", "oderID", "Lcom/iqonic/store/models/CreateOrderNotes;", "Lcom/iqonic/store/models/BaseResponse;", "addWishList", "cancelOrder", "orderId", "Lcom/iqonic/store/models/CancelOrderRequest;", "changePwd", "createOrderRequest", "Lcom/iqonic/store/models/OrderRequest;", "Lcom/iqonic/store/models/CreateOrderResponse;", "createProductReview", "deleteOrder", "forgetPassword", "getCart", "Lcom/iqonic/store/models/CartResponse;", "getCheckoutUrl", "Lcom/iqonic/store/models/CheckoutUrlRequest;", "Lcom/iqonic/store/models/CheckoutResponse;", "getDashboardData", "Lcom/iqonic/store/models/Dashboard;", "getOrderData", "Lcom/iqonic/store/models/Order;", "getOrderTracking", "Lcom/iqonic/store/models/OrderNotes;", "getShippingMethod", "Lcom/iqonic/store/models/ShippingModel;", "getStripeClientSecret", "Lcom/iqonic/store/models/GetStripeClientSecret;", "getWishList", "Lcom/iqonic/store/models/WishList;", "listAllCategory", "option", "", "Lcom/iqonic/store/models/Category;", "listAllCategoryProduct", "Lcom/iqonic/store/models/StoreProductModel;", "listAllCountry", "Lcom/iqonic/store/models/CountryModel;", "listAllProductAttribute", "Lcom/iqonic/store/models/StoreProductAttribute;", "listAllProducts", "listCoupons", "listReview", "listSaleProducts", "Lcom/iqonic/store/models/SearchRequest;", "Lcom/iqonic/store/models/StoreProductModelNew;", "listSingleCategory", "productDetail", "aProductId", "removeCartItem", "removeMultipleCartItem", "Lcom/iqonic/store/models/CartRequestModel;", "removeWishList", "retrieveCustomer", "Lcom/iqonic/store/models/CustomerData;", "saveProfileImage", "Lcom/iqonic/store/models/ProfileImage;", "search", "options", "socialLogin", "updateCustomer", "updateItemInCart", "Lcom/iqonic/store/models/UpdateCartResponse;", "updateProductReview", "app_debug"})
public final class RestApiImpl {
    private com.iqonic.store.network.RestApis getRestApis;
    
    public final void getDashboardData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.Dashboard, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listAllProducts(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.StoreProductModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listAllCountry(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.CountryModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listAllProductAttribute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.StoreProductAttribute, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void productDetail(int aProductId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.StoreProductModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listAllCategory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> option, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Category>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listSingleCategory(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.StoreProductModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listAllCategoryProduct(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> option, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.StoreProductModel>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listSaleProducts(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.SearchRequest option, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.StoreProductModelNew, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listReview(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.ProductReviewData>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void createProductReview(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.ProductReviewData, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void DeleteProductReview(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.ProductReviewData, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void updateProductReview(int id, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.ProductReviewData, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void listCoupons(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Coupons>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void FindCoupon(@org.jetbrains.annotations.NotNull()
    java.lang.String acode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Coupons>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.StoreProductModelNew, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void CreateCustomer(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.RegisterResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void Login(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.loginResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void TokenAPI(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.TokenResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void retrieveCustomer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.CustomerData, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void updateCustomer(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.CustomerData, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void addItemToCart(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.AddCartResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void removeCartItem(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void addOrderNotes(int oderID, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CreateOrderNotes request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void removeMultipleCartItem(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CartRequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getCheckoutUrl(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CheckoutUrlRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.CheckoutResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void createOrderRequest(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.OrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.CreateOrderResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getStripeClientSecret(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.GetStripeClientSecret, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getCart(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.CartResponse>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void updateItemInCart(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.UpdateCartResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void addWishList(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void removeWishList(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getWishList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.WishList>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void cancelOrder(int orderId, @org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.CancelOrderRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getOrderData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.Order>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getOrderTracking(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.store.models.OrderNotes>, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void changePwd(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void saveProfileImage(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.ProfileImage, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void forgetPassword(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void getShippingMethod(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.ShippingModel, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void deleteOrder(int orderId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.BaseResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public final void socialLogin(@org.jetbrains.annotations.NotNull()
    com.iqonic.store.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.store.models.loginResponse, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError) {
    }
    
    public RestApiImpl(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        super();
    }
}