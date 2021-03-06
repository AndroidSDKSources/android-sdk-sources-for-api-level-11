/*    */ package android.graphics;
/*    */ 
/*    */ public class Canvas
/*    */ {
/*    */   public static final int MATRIX_SAVE_FLAG = 1;
/*    */   public static final int CLIP_SAVE_FLAG = 2;
/*    */   public static final int HAS_ALPHA_LAYER_SAVE_FLAG = 4;
/*    */   public static final int FULL_COLOR_LAYER_SAVE_FLAG = 8;
/*    */   public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
/*    */   public static final int ALL_SAVE_FLAG = 31;
/*    */ 
/*    */   public Canvas()
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/* 16 */   public Canvas(Bitmap bitmap) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setBitmap(Bitmap bitmap) { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isOpaque();
/*    */ 
/*    */   public native int getWidth();
/*    */ 
/*    */   public native int getHeight();
/*    */ 
/* 22 */   public int getDensity() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setDensity(int density) { throw new RuntimeException("Stub!"); } 
/*    */   public native int save();
/*    */ 
/*    */   public native int save(int paramInt);
/*    */ 
/* 26 */   public int saveLayer(RectF bounds, Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); } 
/* 27 */   public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); } 
/*    */   public native void restore();
/*    */ 
/*    */   public native int getSaveCount();
/*    */ 
/*    */   public native void restoreToCount(int paramInt);
/*    */ 
/*    */   public native void translate(float paramFloat1, float paramFloat2);
/*    */ 
/*    */   public native void scale(float paramFloat1, float paramFloat2);
/*    */ 
/* 35 */   public final void scale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); } 
/*    */   public native void rotate(float paramFloat);
/*    */ 
/* 37 */   public final void rotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); } 
/*    */   public native void skew(float paramFloat1, float paramFloat2);
/*    */ 
/* 39 */   public void concat(Matrix matrix) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void getMatrix(Matrix ctm) { throw new RuntimeException("Stub!"); } 
/* 42 */   public final Matrix getMatrix() { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean clipRect(RectF rect, Region.Op op) { throw new RuntimeException("Stub!"); } 
/* 44 */   public boolean clipRect(Rect rect, Region.Op op) { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean clipRect(RectF paramRectF);
/*    */ 
/*    */   public native boolean clipRect(Rect paramRect);
/*    */ 
/* 47 */   public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean clipRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */ 
/*    */   public native boolean clipRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */ 
/* 50 */   public boolean clipPath(Path path, Region.Op op) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean clipPath(Path path) { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean clipRegion(Region region, Region.Op op) { throw new RuntimeException("Stub!"); } 
/* 53 */   public boolean clipRegion(Region region) { throw new RuntimeException("Stub!"); } 
/* 54 */   public DrawFilter getDrawFilter() { throw new RuntimeException("Stub!"); } 
/* 55 */   public void setDrawFilter(DrawFilter filter) { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean quickReject(RectF rect, EdgeType type) { throw new RuntimeException("Stub!"); } 
/* 57 */   public boolean quickReject(Path path, EdgeType type) { throw new RuntimeException("Stub!"); } 
/* 58 */   public boolean quickReject(float left, float top, float right, float bottom, EdgeType type) { throw new RuntimeException("Stub!"); } 
/* 59 */   public boolean getClipBounds(Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 60 */   public final Rect getClipBounds() { throw new RuntimeException("Stub!"); } 
/* 61 */   public void drawRGB(int r, int g, int b) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void drawARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void drawColor(int color) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void drawColor(int color, PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void drawPaint(Paint paint) { throw new RuntimeException("Stub!"); } 
/*    */   public native void drawPoints(float[] paramArrayOfFloat, int paramInt1, int paramInt2, Paint paramPaint);
/*    */ 
/* 67 */   public void drawPoints(float[] pts, Paint paint) { throw new RuntimeException("Stub!"); } 
/*    */   public native void drawPoint(float paramFloat1, float paramFloat2, Paint paramPaint);
/*    */ 
/* 69 */   public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) { throw new RuntimeException("Stub!"); } 
/*    */   public native void drawLines(float[] paramArrayOfFloat, int paramInt1, int paramInt2, Paint paramPaint);
/*    */ 
/* 71 */   public void drawLines(float[] pts, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 72 */   public void drawRect(RectF rect, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 73 */   public void drawRect(Rect r, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 74 */   public void drawRect(float left, float top, float right, float bottom, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 75 */   public void drawOval(RectF oval, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 76 */   public void drawCircle(float cx, float cy, float radius, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 77 */   public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 78 */   public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 79 */   public void drawPath(Path path, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 80 */   public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 81 */   public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 82 */   public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 83 */   public void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 84 */   public void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 85 */   public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 86 */   public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 87 */   public void drawVertices(VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 88 */   public void drawText(char[] text, int index, int count, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 89 */   public void drawText(String text, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 90 */   public void drawText(String text, int start, int end, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 91 */   public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 92 */   public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 93 */   public void drawPosText(String text, float[] pos, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 94 */   public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 95 */   public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 96 */   public void drawPicture(Picture picture) { throw new RuntimeException("Stub!"); } 
/* 97 */   public void drawPicture(Picture picture, RectF dst) { throw new RuntimeException("Stub!"); } 
/* 98 */   public void drawPicture(Picture picture, Rect dst) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum VertexMode
/*    */   {
/* 11 */     TRIANGLES, 
/* 12 */     TRIANGLE_FAN, 
/* 13 */     TRIANGLE_STRIP;
/*    */   }
/*    */ 
/*    */   public static enum EdgeType
/*    */   {
/*  6 */     AA, 
/*  7 */     BW;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Canvas
 * JD-Core Version:    0.6.0
 */