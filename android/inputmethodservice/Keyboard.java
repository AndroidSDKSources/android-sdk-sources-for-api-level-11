/*    */ package android.inputmethodservice;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Keyboard
/*    */ {
/*    */   public static final int EDGE_LEFT = 1;
/*    */   public static final int EDGE_RIGHT = 2;
/*    */   public static final int EDGE_TOP = 4;
/*    */   public static final int EDGE_BOTTOM = 8;
/*    */   public static final int KEYCODE_SHIFT = -1;
/*    */   public static final int KEYCODE_MODE_CHANGE = -2;
/*    */   public static final int KEYCODE_CANCEL = -3;
/*    */   public static final int KEYCODE_DONE = -4;
/*    */   public static final int KEYCODE_DELETE = -5;
/*    */   public static final int KEYCODE_ALT = -6;
/*    */ 
/*    */   public Keyboard(Context context, int xmlLayoutResId)
/*    */   {
/* 43 */     throw new RuntimeException("Stub!"); } 
/* 44 */   public Keyboard(Context context, int xmlLayoutResId, int modeId, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Keyboard(Context context, int xmlLayoutResId, int modeId) { throw new RuntimeException("Stub!"); } 
/* 46 */   public Keyboard(Context context, int layoutTemplateResId, CharSequence characters, int columns, int horizontalPadding) { throw new RuntimeException("Stub!"); } 
/* 47 */   public List<Key> getKeys() { throw new RuntimeException("Stub!"); } 
/* 48 */   public List<Key> getModifierKeys() { throw new RuntimeException("Stub!"); } 
/* 49 */   protected int getHorizontalGap() { throw new RuntimeException("Stub!"); } 
/* 50 */   protected void setHorizontalGap(int gap) { throw new RuntimeException("Stub!"); } 
/* 51 */   protected int getVerticalGap() { throw new RuntimeException("Stub!"); } 
/* 52 */   protected void setVerticalGap(int gap) { throw new RuntimeException("Stub!"); } 
/* 53 */   protected int getKeyHeight() { throw new RuntimeException("Stub!"); } 
/* 54 */   protected void setKeyHeight(int height) { throw new RuntimeException("Stub!"); } 
/* 55 */   protected int getKeyWidth() { throw new RuntimeException("Stub!"); } 
/* 56 */   protected void setKeyWidth(int width) { throw new RuntimeException("Stub!"); } 
/* 57 */   public int getHeight() { throw new RuntimeException("Stub!"); } 
/* 58 */   public int getMinWidth() { throw new RuntimeException("Stub!"); } 
/* 59 */   public boolean setShifted(boolean shiftState) { throw new RuntimeException("Stub!"); } 
/* 60 */   public boolean isShifted() { throw new RuntimeException("Stub!"); } 
/* 61 */   public int getShiftKeyIndex() { throw new RuntimeException("Stub!"); } 
/* 62 */   public int[] getNearestKeys(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 63 */   protected Row createRowFromXml(Resources res, XmlResourceParser parser) { throw new RuntimeException("Stub!"); } 
/* 64 */   protected Key createKeyFromXml(Resources res, Row parent, int x, int y, XmlResourceParser parser) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Key
/*    */   {
/* 24 */     public int[] codes = null;
/*    */     public CharSequence label;
/*    */     public Drawable icon;
/*    */     public Drawable iconPreview;
/*    */     public int width;
/*    */     public int height;
/*    */     public int gap;
/*    */     public boolean sticky;
/*    */     public int x;
/*    */     public int y;
/*    */     public boolean pressed;
/*    */     public boolean on;
/*    */     public CharSequence text;
/*    */     public CharSequence popupCharacters;
/*    */     public int edgeFlags;
/*    */     public boolean modifier;
/*    */     public int popupResId;
/*    */     public boolean repeatable;
/*    */ 
/*    */     public Key(Keyboard.Row parent)
/*    */     {
/* 17 */       throw new RuntimeException("Stub!"); } 
/* 18 */     public Key(Resources res, Keyboard.Row parent, int x, int y, XmlResourceParser parser) { throw new RuntimeException("Stub!"); } 
/* 19 */     public void onPressed() { throw new RuntimeException("Stub!"); } 
/* 20 */     public void onReleased(boolean inside) { throw new RuntimeException("Stub!"); } 
/* 21 */     public boolean isInside(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 22 */     public int squaredDistanceFrom(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 23 */     public int[] getCurrentDrawableState() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Row
/*    */   {
/*    */     public int defaultWidth;
/*    */     public int defaultHeight;
/*    */     public int defaultHorizontalGap;
/*    */     public int verticalGap;
/*    */     public int rowEdgeFlags;
/*    */     public int mode;
/*    */ 
/*    */     public Row(Keyboard parent)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public Row(Resources res, Keyboard parent, XmlResourceParser parser) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.inputmethodservice.Keyboard
 * JD-Core Version:    0.6.0
 */