package com.iqonic.store.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R \u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR \u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR&\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR&\u0010\'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR \u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR \u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u00103\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R \u00106\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R \u00109\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00100\"\u0004\b;\u00102R&\u0010<\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR \u0010?\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000fR \u0010B\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\"\u0010R\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bS\u0010\u0013\"\u0004\bT\u0010\u0015R&\u0010U\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR \u0010X\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000fR\"\u0010[\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\\\u0010\u0013\"\u0004\b]\u0010\u0015R&\u0010^\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR\u001e\u0010a\u001a\u00020I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR&\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0007\"\u0004\bi\u0010\tR\u001e\u0010j\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010o\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR\u001e\u0010q\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR \u0010s\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010y\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bz\u0010\u0013\"\u0004\b{\u0010\u0015R\"\u0010|\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\b}\u0010K\"\u0004\b~\u0010MR(\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0007\"\u0005\b\u0081\u0001\u0010\tR#\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\r\"\u0005\b\u0084\u0001\u0010\u000fR!\u0010\u0085\u0001\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010l\"\u0005\b\u0087\u0001\u0010nR%\u0010\u0088\u0001\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010N\u001a\u0005\b\u0089\u0001\u0010K\"\u0005\b\u008a\u0001\u0010MR#\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\r\"\u0005\b\u008d\u0001\u0010\u000fR#\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\r\"\u0005\b\u0090\u0001\u0010\u000fR#\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\r\"\u0005\b\u0093\u0001\u0010\u000fR!\u0010\u0094\u0001\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010l\"\u0005\b\u0096\u0001\u0010nR#\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\r\"\u0005\b\u0099\u0001\u0010\u000fR%\u0010\u009a\u0001\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010N\u001a\u0005\b\u009b\u0001\u0010K\"\u0005\b\u009c\u0001\u0010MR#\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\r\"\u0005\b\u009f\u0001\u0010\u000fR)\u0010\u00a0\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u0007\"\u0005\b\u00a2\u0001\u0010\tR%\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u00a4\u0001\u0010\u0013\"\u0005\b\u00a5\u0001\u0010\u0015R#\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\r\"\u0005\b\u00a8\u0001\u0010\u000fR#\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010\r\"\u0005\b\u00ab\u0001\u0010\u000fR%\u0010\u00ac\u0001\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010N\u001a\u0005\b\u00ad\u0001\u0010K\"\u0005\b\u00ae\u0001\u0010MR%\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u00b0\u0001\u0010\u0013\"\u0005\b\u00b1\u0001\u0010\u0015R%\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u00b3\u0001\u0010\u0013\"\u0005\b\u00b4\u0001\u0010\u0015R#\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b6\u0001\u0010\r\"\u0005\b\u00b7\u0001\u0010\u000fR#\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b9\u0001\u0010\r\"\u0005\b\u00ba\u0001\u0010\u000fR#\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bc\u0001\u0010\r\"\u0005\b\u00bd\u0001\u0010\u000fR%\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u00bf\u0001\u0010\u0013\"\u0005\b\u00c0\u0001\u0010\u0015R#\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c2\u0001\u0010\r\"\u0005\b\u00c3\u0001\u0010\u000fR%\u0010\u00c4\u0001\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010N\u001a\u0005\b\u00c5\u0001\u0010K\"\u0005\b\u00c6\u0001\u0010MR#\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c8\u0001\u0010\r\"\u0005\b\u00c9\u0001\u0010\u000fR)\u0010\u00ca\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cb\u0001\u0010\u0007\"\u0005\b\u00cc\u0001\u0010\tR#\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ce\u0001\u0010\r\"\u0005\b\u00cf\u0001\u0010\u000fR#\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d1\u0001\u0010\r\"\u0005\b\u00d2\u0001\u0010\u000fR%\u0010\u00d3\u0001\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010N\u001a\u0005\b\u00d4\u0001\u0010K\"\u0005\b\u00d5\u0001\u0010MR#\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d7\u0001\u0010\r\"\u0005\b\u00d8\u0001\u0010\u000fR)\u0010\u00d9\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00da\u0001\u0010\u0007\"\u0005\b\u00db\u0001\u0010\tR*\u0010\u00dc\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u00dd\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00de\u0001\u0010\u0007\"\u0005\b\u00df\u0001\u0010\tR)\u0010\u00e0\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e1\u0001\u0010\u0007\"\u0005\b\u00e2\u0001\u0010\tR%\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010\u0016\u001a\u0005\b\u00e4\u0001\u0010\u0013\"\u0005\b\u00e5\u0001\u0010\u0015R#\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e7\u0001\u0010\r\"\u0005\b\u00e8\u0001\u0010\u000f\u00a8\u0006\u00e9\u0001"}, d2 = {"Lcom/iqonic/store/models/StoreProductModel;", "Ljava/io/Serializable;", "()V", "attributes", "", "Lcom/iqonic/store/models/Attributes;", "getAttributes", "()Ljava/util/List;", "setAttributes", "(Ljava/util/List;)V", "averageRating", "", "getAverageRating", "()Ljava/lang/String;", "setAverageRating", "(Ljava/lang/String;)V", "backordered", "", "getBackordered", "()Ljava/lang/Boolean;", "setBackordered", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "backorders", "getBackorders", "setBackorders", "backordersAllowed", "getBackordersAllowed", "setBackordersAllowed", "buttonText", "getButtonText", "setButtonText", "catalogVisibility", "getCatalogVisibility", "setCatalogVisibility", "categories", "Lcom/iqonic/store/models/StoreCategory;", "getCategories", "setCategories", "crossSellIds", "", "getCrossSellIds", "setCrossSellIds", "dateModifiedGmt", "getDateModifiedGmt", "setDateModifiedGmt", "dateOnSaleFrom", "getDateOnSaleFrom", "()Ljava/lang/Object;", "setDateOnSaleFrom", "(Ljava/lang/Object;)V", "dateOnSaleFromGmt", "getDateOnSaleFromGmt", "setDateOnSaleFromGmt", "dateOnSaleTo", "getDateOnSaleTo", "setDateOnSaleTo", "dateOnSaleToGmt", "getDateOnSaleToGmt", "setDateOnSaleToGmt", "defaultAttributes", "getDefaultAttributes", "setDefaultAttributes", "description", "getDescription", "setDescription", "dimensions", "Lcom/iqonic/store/models/Dimensions;", "getDimensions", "()Lcom/iqonic/store/models/Dimensions;", "setDimensions", "(Lcom/iqonic/store/models/Dimensions;)V", "downloadExpiry", "", "getDownloadExpiry", "()Ljava/lang/Integer;", "setDownloadExpiry", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "downloadLimit", "getDownloadLimit", "setDownloadLimit", "downloadable", "getDownloadable", "setDownloadable", "downloads", "getDownloads", "setDownloads", "externalUrl", "getExternalUrl", "setExternalUrl", "featured", "getFeatured", "setFeatured", "groupedProducts", "getGroupedProducts", "setGroupedProducts", "id", "getId", "()I", "setId", "(I)V", "images", "Lcom/iqonic/store/models/Image;", "getImages", "setImages", "in_stock", "getIn_stock", "()Z", "setIn_stock", "(Z)V", "is_added_cart", "set_added_cart", "is_added_wishlist", "set_added_wishlist", "links", "Lcom/iqonic/store/models/Links;", "getLinks", "()Lcom/iqonic/store/models/Links;", "setLinks", "(Lcom/iqonic/store/models/Links;)V", "manageStock", "getManageStock", "setManageStock", "menuOrder", "getMenuOrder", "setMenuOrder", "metaData", "getMetaData", "setMetaData", "name", "getName", "setName", "onSale", "getOnSale", "setOnSale", "parentId", "getParentId", "setParentId", "permalink", "getPermalink", "setPermalink", "price", "getPrice", "setPrice", "priceHtml", "getPriceHtml", "setPriceHtml", "purchasable", "getPurchasable", "setPurchasable", "purchaseNote", "getPurchaseNote", "setPurchaseNote", "ratingCount", "getRatingCount", "setRatingCount", "regularPrice", "getRegularPrice", "setRegularPrice", "relatedIds", "getRelatedIds", "setRelatedIds", "reviewsAllowed", "getReviewsAllowed", "setReviewsAllowed", "salePrice", "getSalePrice", "setSalePrice", "shippingClass", "getShippingClass", "setShippingClass", "shippingClassId", "getShippingClassId", "setShippingClassId", "shippingRequired", "getShippingRequired", "setShippingRequired", "shippingTaxable", "getShippingTaxable", "setShippingTaxable", "shortDescription", "getShortDescription", "setShortDescription", "sku", "getSku", "setSku", "slug", "getSlug", "setSlug", "soldIndividually", "getSoldIndividually", "setSoldIndividually", "status", "getStatus", "setStatus", "stockQuantity", "getStockQuantity", "setStockQuantity", "stockStatus", "getStockStatus", "setStockStatus", "tags", "getTags", "setTags", "taxClass", "getTaxClass", "setTaxClass", "taxStatus", "getTaxStatus", "setTaxStatus", "totalSales", "getTotalSales", "setTotalSales", "type", "getType", "setType", "upsellIds", "getUpsellIds", "setUpsellIds", "upsell_id", "Lcom/iqonic/store/models/StoreUpSale;", "getUpsell_id", "setUpsell_id", "variations", "getVariations", "setVariations", "virtual", "getVirtual", "setVirtual", "weight", "getWeight", "setWeight", "app_debug"})
public final class StoreProductModel implements java.io.Serializable {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "is_added_cart")
    private boolean is_added_cart = false;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "is_added_wishlist")
    private boolean is_added_wishlist = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "upsell_id")
    private java.util.List<com.iqonic.store.models.StoreUpSale> upsell_id;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "slug")
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "permalink")
    private java.lang.String permalink;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_modified_gmt")
    private java.lang.String dateModifiedGmt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "featured")
    private java.lang.Boolean featured;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "catalog_visibility")
    private java.lang.String catalogVisibility;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "short_description")
    private java.lang.String shortDescription;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "sku")
    private java.lang.String sku;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "price")
    private java.lang.String price;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "regular_price")
    private java.lang.String regularPrice;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "sale_price")
    private java.lang.String salePrice;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_on_sale_from")
    private java.lang.Object dateOnSaleFrom;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_on_sale_from_gmt")
    private java.lang.Object dateOnSaleFromGmt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_on_sale_to")
    private java.lang.Object dateOnSaleTo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_on_sale_to_gmt")
    private java.lang.Object dateOnSaleToGmt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "price_html")
    private java.lang.String priceHtml;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "on_sale")
    private boolean onSale = false;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "purchasable")
    private boolean purchasable = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_sales")
    private java.lang.Integer totalSales;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "virtual")
    private java.lang.Boolean virtual;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "downloadable")
    private java.lang.Boolean downloadable;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "downloads")
    private java.util.List<? extends java.lang.Object> downloads;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "download_limit")
    private java.lang.Integer downloadLimit;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "download_expiry")
    private java.lang.Integer downloadExpiry;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "external_url")
    private java.lang.String externalUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "button_text")
    private java.lang.String buttonText;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tax_status")
    private java.lang.String taxStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tax_class")
    private java.lang.String taxClass;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "manage_stock")
    private java.lang.Boolean manageStock;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "stock_quantity")
    private java.lang.Integer stockQuantity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "stock_status")
    private java.lang.String stockStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "backorders")
    private java.lang.String backorders;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "backorders_allowed")
    private java.lang.Boolean backordersAllowed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "backordered")
    private java.lang.Boolean backordered;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "sold_individually")
    private java.lang.Boolean soldIndividually;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "weight")
    private java.lang.String weight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "dimensions")
    private com.iqonic.store.models.Dimensions dimensions;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "shipping_required")
    private java.lang.Boolean shippingRequired;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "shipping_taxable")
    private java.lang.Boolean shippingTaxable;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "shipping_class")
    private java.lang.String shippingClass;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "shipping_class_id")
    private java.lang.Integer shippingClassId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "reviews_allowed")
    private java.lang.Boolean reviewsAllowed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "average_rating")
    private java.lang.String averageRating;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "rating_count")
    private java.lang.Integer ratingCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "related_ids")
    private java.util.List<java.lang.Integer> relatedIds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "upsell_ids")
    private java.util.List<java.lang.Integer> upsellIds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "cross_sell_ids")
    private java.util.List<? extends java.lang.Object> crossSellIds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "parent_id")
    private java.lang.Integer parentId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "purchase_note")
    private java.lang.String purchaseNote;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "categories")
    private java.util.List<com.iqonic.store.models.StoreCategory> categories;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tags")
    private java.util.List<? extends java.lang.Object> tags;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "images")
    private java.util.List<com.iqonic.store.models.Image> images;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "attributes")
    private java.util.List<com.iqonic.store.models.Attributes> attributes;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "default_attributes")
    private java.util.List<? extends java.lang.Object> defaultAttributes;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "variations")
    private java.util.List<java.lang.Integer> variations;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "grouped_products")
    private java.util.List<? extends java.lang.Object> groupedProducts;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "menu_order")
    private java.lang.Integer menuOrder;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "meta_data")
    private java.util.List<? extends java.lang.Object> metaData;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "_links")
    private com.iqonic.store.models.Links links;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "in_stock")
    private boolean in_stock = false;
    
    public final boolean is_added_cart() {
        return false;
    }
    
    public final void set_added_cart(boolean p0) {
    }
    
    public final boolean is_added_wishlist() {
        return false;
    }
    
    public final void set_added_wishlist(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.store.models.StoreUpSale> getUpsell_id() {
        return null;
    }
    
    public final void setUpsell_id(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.store.models.StoreUpSale> p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    public final void setPermalink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateModifiedGmt() {
        return null;
    }
    
    public final void setDateModifiedGmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFeatured() {
        return null;
    }
    
    public final void setFeatured(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCatalogVisibility() {
        return null;
    }
    
    public final void setCatalogVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortDescription() {
        return null;
    }
    
    public final void setShortDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegularPrice() {
        return null;
    }
    
    public final void setRegularPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSalePrice() {
        return null;
    }
    
    public final void setSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDateOnSaleFrom() {
        return null;
    }
    
    public final void setDateOnSaleFrom(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDateOnSaleFromGmt() {
        return null;
    }
    
    public final void setDateOnSaleFromGmt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDateOnSaleTo() {
        return null;
    }
    
    public final void setDateOnSaleTo(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDateOnSaleToGmt() {
        return null;
    }
    
    public final void setDateOnSaleToGmt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPriceHtml() {
        return null;
    }
    
    public final void setPriceHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getOnSale() {
        return false;
    }
    
    public final void setOnSale(boolean p0) {
    }
    
    public final boolean getPurchasable() {
        return false;
    }
    
    public final void setPurchasable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalSales() {
        return null;
    }
    
    public final void setTotalSales(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVirtual() {
        return null;
    }
    
    public final void setVirtual(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDownloadable() {
        return null;
    }
    
    public final void setDownloadable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getDownloads() {
        return null;
    }
    
    public final void setDownloads(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDownloadLimit() {
        return null;
    }
    
    public final void setDownloadLimit(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDownloadExpiry() {
        return null;
    }
    
    public final void setDownloadExpiry(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExternalUrl() {
        return null;
    }
    
    public final void setExternalUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getButtonText() {
        return null;
    }
    
    public final void setButtonText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaxStatus() {
        return null;
    }
    
    public final void setTaxStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaxClass() {
        return null;
    }
    
    public final void setTaxClass(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getManageStock() {
        return null;
    }
    
    public final void setManageStock(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStockQuantity() {
        return null;
    }
    
    public final void setStockQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStockStatus() {
        return null;
    }
    
    public final void setStockStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    public final void setBackorders(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBackordersAllowed() {
        return null;
    }
    
    public final void setBackordersAllowed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBackordered() {
        return null;
    }
    
    public final void setBackordered(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSoldIndividually() {
        return null;
    }
    
    public final void setSoldIndividually(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Dimensions getDimensions() {
        return null;
    }
    
    public final void setDimensions(@org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Dimensions p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShippingRequired() {
        return null;
    }
    
    public final void setShippingRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShippingTaxable() {
        return null;
    }
    
    public final void setShippingTaxable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingClass() {
        return null;
    }
    
    public final void setShippingClass(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShippingClassId() {
        return null;
    }
    
    public final void setShippingClassId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReviewsAllowed() {
        return null;
    }
    
    public final void setReviewsAllowed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverageRating() {
        return null;
    }
    
    public final void setAverageRating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingCount() {
        return null;
    }
    
    public final void setRatingCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getRelatedIds() {
        return null;
    }
    
    public final void setRelatedIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getUpsellIds() {
        return null;
    }
    
    public final void setUpsellIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getCrossSellIds() {
        return null;
    }
    
    public final void setCrossSellIds(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParentId() {
        return null;
    }
    
    public final void setParentId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurchaseNote() {
        return null;
    }
    
    public final void setPurchaseNote(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.store.models.StoreCategory> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.store.models.StoreCategory> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.store.models.Image> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.store.models.Image> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.iqonic.store.models.Attributes> getAttributes() {
        return null;
    }
    
    public final void setAttributes(@org.jetbrains.annotations.Nullable()
    java.util.List<com.iqonic.store.models.Attributes> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getDefaultAttributes() {
        return null;
    }
    
    public final void setDefaultAttributes(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getVariations() {
        return null;
    }
    
    public final void setVariations(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getGroupedProducts() {
        return null;
    }
    
    public final void setGroupedProducts(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMenuOrder() {
        return null;
    }
    
    public final void setMenuOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getMetaData() {
        return null;
    }
    
    public final void setMetaData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.store.models.Links getLinks() {
        return null;
    }
    
    public final void setLinks(@org.jetbrains.annotations.Nullable()
    com.iqonic.store.models.Links p0) {
    }
    
    public final boolean getIn_stock() {
        return false;
    }
    
    public final void setIn_stock(boolean p0) {
    }
    
    public StoreProductModel() {
        super();
    }
}