/*   */ package android.view;
/*   */ 
/*   */ import android.graphics.Rect;
/*   */ 
/*   */ public class Gravity
/*   */ {
/*   */   public static final int NO_GRAVITY = 0;
/*   */   public static final int AXIS_SPECIFIED = 1;
/*   */   public static final int AXIS_PULL_BEFORE = 2;
/*   */   public static final int AXIS_PULL_AFTER = 4;
/*   */   public static final int AXIS_CLIP = 8;
/*   */   public static final int AXIS_X_SHIFT = 0;
/*   */   public static final int AXIS_Y_SHIFT = 4;
/*   */   public static final int TOP = 48;
/*   */   public static final int BOTTOM = 80;
/*   */   public static final int LEFT = 3;
/*   */   public static final int RIGHT = 5;
/*   */   public static final int CENTER_VERTICAL = 16;
/*   */   public static final int FILL_VERTICAL = 112;
/*   */   public static final int CENTER_HORIZONTAL = 1;
/*   */   public static final int FILL_HORIZONTAL = 7;
/*   */   public static final int CENTER = 17;
/*   */   public static final int FILL = 119;
/*   */   public static final int CLIP_VERTICAL = 128;
/*   */   public static final int CLIP_HORIZONTAL = 8;
/*   */   public static final int HORIZONTAL_GRAVITY_MASK = 7;
/*   */   public static final int VERTICAL_GRAVITY_MASK = 112;
/*   */   public static final int DISPLAY_CLIP_VERTICAL = 268435456;
/*   */   public static final int DISPLAY_CLIP_HORIZONTAL = 16777216;
/*   */ 
/*   */   public Gravity()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static void apply(int gravity, int w, int h, Rect container, Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void apply(int gravity, int w, int h, Rect container, int xAdj, int yAdj, Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 7 */   public static void applyDisplay(int gravity, Rect display, Rect inoutObj) { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean isVertical(int gravity) { throw new RuntimeException("Stub!"); } 
/* 9 */   public static boolean isHorizontal(int gravity) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.Gravity
 * JD-Core Version:    0.6.0
 */