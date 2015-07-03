/*     */ package android.view;
/*     */ 
/*     */ import android.graphics.Matrix;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ 
/*     */ public final class MotionEvent extends InputEvent
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int ACTION_MASK = 255;
/*     */   public static final int ACTION_DOWN = 0;
/*     */   public static final int ACTION_UP = 1;
/*     */   public static final int ACTION_MOVE = 2;
/*     */   public static final int ACTION_CANCEL = 3;
/*     */   public static final int ACTION_OUTSIDE = 4;
/*     */   public static final int ACTION_POINTER_DOWN = 5;
/*     */   public static final int ACTION_POINTER_UP = 6;
/*     */   public static final int ACTION_POINTER_INDEX_MASK = 65280;
/*     */   public static final int ACTION_POINTER_INDEX_SHIFT = 8;
/*     */   public static final int ACTION_POINTER_1_DOWN = 5;
/*     */   public static final int ACTION_POINTER_2_DOWN = 261;
/*     */   public static final int ACTION_POINTER_3_DOWN = 517;
/*     */   public static final int ACTION_POINTER_1_UP = 6;
/*     */   public static final int ACTION_POINTER_2_UP = 262;
/*     */   public static final int ACTION_POINTER_3_UP = 518;
/*     */   public static final int ACTION_POINTER_ID_MASK = 65280;
/*     */   public static final int ACTION_POINTER_ID_SHIFT = 8;
/*     */   public static final int FLAG_WINDOW_IS_OBSCURED = 1;
/*     */   public static final int EDGE_TOP = 1;
/*     */   public static final int EDGE_BOTTOM = 2;
/*     */   public static final int EDGE_LEFT = 4;
/*     */   public static final int EDGE_RIGHT = 8;
/* 115 */   public static final Parcelable.Creator<MotionEvent> CREATOR = null;
/*     */ 
/*     */   MotionEvent()
/*     */   {
/*  19 */     throw new RuntimeException("Stub!"); } 
/*  20 */   public static MotionEvent obtain(long downTime, long eventTime, int action, int pointers, int[] pointerIds, PointerCoords[] pointerCoords, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags, int source, int flags) { throw new RuntimeException("Stub!"); } 
/*  21 */   public static MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, float pressure, float size, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags) { throw new RuntimeException("Stub!"); } 
/*  22 */   public static MotionEvent obtain(long downTime, long eventTime, int action, int pointers, float x, float y, float pressure, float size, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags) { throw new RuntimeException("Stub!"); } 
/*  23 */   public static MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, int metaState) { throw new RuntimeException("Stub!"); } 
/*  24 */   public static MotionEvent obtain(MotionEvent o) { throw new RuntimeException("Stub!"); } 
/*  25 */   public static MotionEvent obtainNoHistory(MotionEvent o) { throw new RuntimeException("Stub!"); } 
/*  26 */   public final void recycle() { throw new RuntimeException("Stub!"); } 
/*  27 */   public final int getAction() { throw new RuntimeException("Stub!"); } 
/*  28 */   public final int getActionMasked() { throw new RuntimeException("Stub!"); } 
/*  29 */   public final int getActionIndex() { throw new RuntimeException("Stub!"); } 
/*  30 */   public final int getFlags() { throw new RuntimeException("Stub!"); } 
/*  31 */   public final long getDownTime() { throw new RuntimeException("Stub!"); } 
/*  32 */   public final long getEventTime() { throw new RuntimeException("Stub!"); } 
/*  33 */   public final float getX() { throw new RuntimeException("Stub!"); } 
/*  34 */   public final float getY() { throw new RuntimeException("Stub!"); } 
/*  35 */   public final float getPressure() { throw new RuntimeException("Stub!"); } 
/*  36 */   public final float getSize() { throw new RuntimeException("Stub!"); } 
/*  37 */   public final float getTouchMajor() { throw new RuntimeException("Stub!"); } 
/*  38 */   public final float getTouchMinor() { throw new RuntimeException("Stub!"); } 
/*  39 */   public final float getToolMajor() { throw new RuntimeException("Stub!"); } 
/*  40 */   public final float getToolMinor() { throw new RuntimeException("Stub!"); } 
/*  41 */   public final float getOrientation() { throw new RuntimeException("Stub!"); } 
/*  42 */   public final int getPointerCount() { throw new RuntimeException("Stub!"); } 
/*  43 */   public final int getPointerId(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  44 */   public final int findPointerIndex(int pointerId) { throw new RuntimeException("Stub!"); } 
/*  45 */   public final float getX(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  46 */   public final float getY(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  47 */   public final float getPressure(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  48 */   public final float getSize(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  49 */   public final float getTouchMajor(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  50 */   public final float getTouchMinor(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  51 */   public final float getToolMajor(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  52 */   public final float getToolMinor(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  53 */   public final float getOrientation(int pointerIndex) { throw new RuntimeException("Stub!"); } 
/*  54 */   public final void getPointerCoords(int pointerIndex, PointerCoords outPointerCoords) { throw new RuntimeException("Stub!"); } 
/*  55 */   public final int getMetaState() { throw new RuntimeException("Stub!"); } 
/*  56 */   public final float getRawX() { throw new RuntimeException("Stub!"); } 
/*  57 */   public final float getRawY() { throw new RuntimeException("Stub!"); } 
/*  58 */   public final float getXPrecision() { throw new RuntimeException("Stub!"); } 
/*  59 */   public final float getYPrecision() { throw new RuntimeException("Stub!"); } 
/*  60 */   public final int getHistorySize() { throw new RuntimeException("Stub!"); } 
/*  61 */   public final long getHistoricalEventTime(int pos) { throw new RuntimeException("Stub!"); } 
/*  62 */   public final float getHistoricalX(int pos) { throw new RuntimeException("Stub!"); } 
/*  63 */   public final float getHistoricalY(int pos) { throw new RuntimeException("Stub!"); } 
/*  64 */   public final float getHistoricalPressure(int pos) { throw new RuntimeException("Stub!"); } 
/*  65 */   public final float getHistoricalSize(int pos) { throw new RuntimeException("Stub!"); } 
/*  66 */   public final float getHistoricalTouchMajor(int pos) { throw new RuntimeException("Stub!"); } 
/*  67 */   public final float getHistoricalTouchMinor(int pos) { throw new RuntimeException("Stub!"); } 
/*  68 */   public final float getHistoricalToolMajor(int pos) { throw new RuntimeException("Stub!"); } 
/*  69 */   public final float getHistoricalToolMinor(int pos) { throw new RuntimeException("Stub!"); } 
/*  70 */   public final float getHistoricalOrientation(int pos) { throw new RuntimeException("Stub!"); } 
/*  71 */   public final float getHistoricalX(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  72 */   public final float getHistoricalY(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  73 */   public final float getHistoricalPressure(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  74 */   public final float getHistoricalSize(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  75 */   public final float getHistoricalTouchMajor(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  76 */   public final float getHistoricalTouchMinor(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  77 */   public final float getHistoricalToolMajor(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  78 */   public final float getHistoricalToolMinor(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  79 */   public final float getHistoricalOrientation(int pointerIndex, int pos) { throw new RuntimeException("Stub!"); } 
/*  80 */   public final void getHistoricalPointerCoords(int pointerIndex, int pos, PointerCoords outPointerCoords) { throw new RuntimeException("Stub!"); } 
/*  81 */   public final int getEdgeFlags() { throw new RuntimeException("Stub!"); } 
/*  82 */   public final void setEdgeFlags(int flags) { throw new RuntimeException("Stub!"); } 
/*  83 */   public final void setAction(int action) { throw new RuntimeException("Stub!"); } 
/*  84 */   public final void offsetLocation(float deltaX, float deltaY) { throw new RuntimeException("Stub!"); } 
/*  85 */   public final void setLocation(float x, float y) { throw new RuntimeException("Stub!"); } 
/*  86 */   public final void transform(Matrix matrix) { throw new RuntimeException("Stub!"); } 
/*  87 */   public final void addBatch(long eventTime, float x, float y, float pressure, float size, int metaState) { throw new RuntimeException("Stub!"); } 
/*  88 */   public final void addBatch(long eventTime, PointerCoords[] pointerCoords, int metaState) { throw new RuntimeException("Stub!"); } 
/*  89 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  90 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static final class PointerCoords
/*     */   {
/*     */     public float x;
/*     */     public float y;
/*     */     public float pressure;
/*     */     public float size;
/*     */     public float touchMajor;
/*     */     public float touchMinor;
/*     */     public float toolMajor;
/*     */     public float toolMinor;
/*     */     public float orientation;
/*     */ 
/*     */     public PointerCoords()
/*     */     {
/*   8 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.MotionEvent
 * JD-Core Version:    0.6.0
 */