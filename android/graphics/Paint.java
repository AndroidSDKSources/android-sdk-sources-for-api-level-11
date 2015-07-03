/*     */ package android.graphics;
/*     */ 
/*     */ public class Paint
/*     */ {
/*     */   public static final int ANTI_ALIAS_FLAG = 1;
/*     */   public static final int FILTER_BITMAP_FLAG = 2;
/*     */   public static final int DITHER_FLAG = 4;
/*     */   public static final int UNDERLINE_TEXT_FLAG = 8;
/*     */   public static final int STRIKE_THRU_TEXT_FLAG = 16;
/*     */   public static final int FAKE_BOLD_TEXT_FLAG = 32;
/*     */   public static final int LINEAR_TEXT_FLAG = 64;
/*     */   public static final int SUBPIXEL_TEXT_FLAG = 128;
/*     */   public static final int DEV_KERN_TEXT_FLAG = 256;
/*     */ 
/*     */   public Paint()
/*     */   {
/*  47 */     throw new RuntimeException("Stub!"); } 
/*  48 */   public Paint(int flags) { throw new RuntimeException("Stub!"); } 
/*  49 */   public Paint(Paint paint) { throw new RuntimeException("Stub!"); } 
/*  50 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*  51 */   public void set(Paint src) { throw new RuntimeException("Stub!"); } 
/*     */   public native int getFlags();
/*     */ 
/*     */   public native void setFlags(int paramInt);
/*     */ 
/*  54 */   public final boolean isAntiAlias() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setAntiAlias(boolean paramBoolean);
/*     */ 
/*  56 */   public final boolean isDither() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setDither(boolean paramBoolean);
/*     */ 
/*  58 */   public final boolean isLinearText() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setLinearText(boolean paramBoolean);
/*     */ 
/*  60 */   public final boolean isSubpixelText() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setSubpixelText(boolean paramBoolean);
/*     */ 
/*  62 */   public final boolean isUnderlineText() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setUnderlineText(boolean paramBoolean);
/*     */ 
/*  64 */   public final boolean isStrikeThruText() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setStrikeThruText(boolean paramBoolean);
/*     */ 
/*  66 */   public final boolean isFakeBoldText() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setFakeBoldText(boolean paramBoolean);
/*     */ 
/*  68 */   public final boolean isFilterBitmap() { throw new RuntimeException("Stub!"); } 
/*     */   public native void setFilterBitmap(boolean paramBoolean);
/*     */ 
/*  70 */   public Style getStyle() { throw new RuntimeException("Stub!"); } 
/*  71 */   public void setStyle(Style style) { throw new RuntimeException("Stub!"); } 
/*     */   public native int getColor();
/*     */ 
/*     */   public native void setColor(int paramInt);
/*     */ 
/*     */   public native int getAlpha();
/*     */ 
/*     */   public native void setAlpha(int paramInt);
/*     */ 
/*  76 */   public void setARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); } 
/*     */   public native float getStrokeWidth();
/*     */ 
/*     */   public native void setStrokeWidth(float paramFloat);
/*     */ 
/*     */   public native float getStrokeMiter();
/*     */ 
/*     */   public native void setStrokeMiter(float paramFloat);
/*     */ 
/*  81 */   public Cap getStrokeCap() { throw new RuntimeException("Stub!"); } 
/*  82 */   public void setStrokeCap(Cap cap) { throw new RuntimeException("Stub!"); } 
/*  83 */   public Join getStrokeJoin() { throw new RuntimeException("Stub!"); } 
/*  84 */   public void setStrokeJoin(Join join) { throw new RuntimeException("Stub!"); } 
/*  85 */   public boolean getFillPath(Path src, Path dst) { throw new RuntimeException("Stub!"); } 
/*  86 */   public Shader getShader() { throw new RuntimeException("Stub!"); } 
/*  87 */   public Shader setShader(Shader shader) { throw new RuntimeException("Stub!"); } 
/*  88 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); } 
/*  89 */   public ColorFilter setColorFilter(ColorFilter filter) { throw new RuntimeException("Stub!"); } 
/*  90 */   public Xfermode getXfermode() { throw new RuntimeException("Stub!"); } 
/*  91 */   public Xfermode setXfermode(Xfermode xfermode) { throw new RuntimeException("Stub!"); } 
/*  92 */   public PathEffect getPathEffect() { throw new RuntimeException("Stub!"); } 
/*  93 */   public PathEffect setPathEffect(PathEffect effect) { throw new RuntimeException("Stub!"); } 
/*  94 */   public MaskFilter getMaskFilter() { throw new RuntimeException("Stub!"); } 
/*  95 */   public MaskFilter setMaskFilter(MaskFilter maskfilter) { throw new RuntimeException("Stub!"); } 
/*  96 */   public Typeface getTypeface() { throw new RuntimeException("Stub!"); } 
/*  97 */   public Typeface setTypeface(Typeface typeface) { throw new RuntimeException("Stub!"); } 
/*  98 */   public Rasterizer getRasterizer() { throw new RuntimeException("Stub!"); } 
/*  99 */   public Rasterizer setRasterizer(Rasterizer rasterizer) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void clearShadowLayer() { throw new RuntimeException("Stub!"); } 
/* 102 */   public Align getTextAlign() { throw new RuntimeException("Stub!"); } 
/* 103 */   public void setTextAlign(Align align) { throw new RuntimeException("Stub!"); } 
/*     */   public native float getTextSize();
/*     */ 
/*     */   public native void setTextSize(float paramFloat);
/*     */ 
/*     */   public native float getTextScaleX();
/*     */ 
/*     */   public native void setTextScaleX(float paramFloat);
/*     */ 
/*     */   public native float getTextSkewX();
/*     */ 
/*     */   public native void setTextSkewX(float paramFloat);
/*     */ 
/*     */   public native float ascent();
/*     */ 
/*     */   public native float descent();
/*     */ 
/*     */   public native float getFontMetrics(FontMetrics paramFontMetrics);
/*     */ 
/* 113 */   public FontMetrics getFontMetrics() { throw new RuntimeException("Stub!"); } 
/*     */   public native int getFontMetricsInt(FontMetricsInt paramFontMetricsInt);
/*     */ 
/* 115 */   public FontMetricsInt getFontMetricsInt() { throw new RuntimeException("Stub!"); } 
/* 116 */   public float getFontSpacing() { throw new RuntimeException("Stub!"); } 
/* 117 */   public float measureText(char[] text, int index, int count) { throw new RuntimeException("Stub!"); } 
/* 118 */   public float measureText(String text, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 119 */   public float measureText(String text) { throw new RuntimeException("Stub!"); } 
/* 120 */   public float measureText(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 121 */   public int breakText(char[] text, int index, int count, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); } 
/* 122 */   public int breakText(CharSequence text, int start, int end, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); } 
/* 123 */   public int breakText(String text, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); } 
/* 124 */   public int getTextWidths(char[] text, int index, int count, float[] widths) { throw new RuntimeException("Stub!"); } 
/* 125 */   public int getTextWidths(CharSequence text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); } 
/* 126 */   public int getTextWidths(String text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); } 
/* 127 */   public int getTextWidths(String text, float[] widths) { throw new RuntimeException("Stub!"); } 
/* 128 */   public void getTextPath(char[] text, int index, int count, float x, float y, Path path) { throw new RuntimeException("Stub!"); } 
/* 129 */   public void getTextPath(String text, int start, int end, float x, float y, Path path) { throw new RuntimeException("Stub!"); } 
/* 130 */   public void getTextBounds(String text, int start, int end, Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 131 */   public void getTextBounds(char[] text, int index, int count, Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 132 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static class FontMetricsInt
/*     */   {
/*     */     public int top;
/*     */     public int ascent;
/*     */     public int descent;
/*     */     public int bottom;
/*     */     public int leading;
/*     */ 
/*     */     public FontMetricsInt()
/*     */     {
/*  39 */       throw new RuntimeException("Stub!"); } 
/*  40 */     public String toString() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class FontMetrics
/*     */   {
/*     */     public float top;
/*     */     public float ascent;
/*     */     public float descent;
/*     */     public float bottom;
/*     */     public float leading;
/*     */ 
/*     */     public FontMetrics()
/*     */     {
/*  30 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static enum Align
/*     */   {
/*  24 */     CENTER, 
/*  25 */     LEFT, 
/*  26 */     RIGHT;
/*     */   }
/*     */ 
/*     */   public static enum Join
/*     */   {
/*  18 */     BEVEL, 
/*  19 */     MITER, 
/*  20 */     ROUND;
/*     */   }
/*     */ 
/*     */   public static enum Cap
/*     */   {
/*  12 */     BUTT, 
/*  13 */     ROUND, 
/*  14 */     SQUARE;
/*     */   }
/*     */ 
/*     */   public static enum Style
/*     */   {
/*   6 */     FILL, 
/*   7 */     FILL_AND_STROKE, 
/*   8 */     STROKE;
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Paint
 * JD-Core Version:    0.6.0
 */