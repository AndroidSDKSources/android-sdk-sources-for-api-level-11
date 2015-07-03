/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ 
/*    */ public class GridLayoutAnimationController extends LayoutAnimationController
/*    */ {
/*    */   public static final int DIRECTION_LEFT_TO_RIGHT = 0;
/*    */   public static final int DIRECTION_RIGHT_TO_LEFT = 1;
/*    */   public static final int DIRECTION_TOP_TO_BOTTOM = 0;
/*    */   public static final int DIRECTION_BOTTOM_TO_TOP = 2;
/*    */   public static final int DIRECTION_HORIZONTAL_MASK = 1;
/*    */   public static final int DIRECTION_VERTICAL_MASK = 2;
/*    */   public static final int PRIORITY_NONE = 0;
/*    */   public static final int PRIORITY_COLUMN = 1;
/*    */   public static final int PRIORITY_ROW = 2;
/*    */ 
/*    */   public GridLayoutAnimationController(Context context, AttributeSet attrs)
/*    */   {
/* 14 */     super((Animation)null, 0.0F); throw new RuntimeException("Stub!"); } 
/* 15 */   public GridLayoutAnimationController(Animation animation) { super((Animation)null, 0.0F); throw new RuntimeException("Stub!"); } 
/* 16 */   public GridLayoutAnimationController(Animation animation, float columnDelay, float rowDelay) { super((Animation)null, 0.0F); throw new RuntimeException("Stub!"); } 
/* 17 */   public float getColumnDelay() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setColumnDelay(float columnDelay) { throw new RuntimeException("Stub!"); } 
/* 19 */   public float getRowDelay() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setRowDelay(float rowDelay) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getDirection() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setDirection(int direction) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getDirectionPriority() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setDirectionPriority(int directionPriority) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean willOverlap() { throw new RuntimeException("Stub!"); } 
/* 26 */   protected long getDelayForView(View view) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class AnimationParameters extends LayoutAnimationController.AnimationParameters
/*    */   {
/*    */     public int column;
/*    */     public int row;
/*    */     public int columnsCount;
/*    */     public int rowsCount;
/*    */ 
/*    */     public AnimationParameters()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.animation.GridLayoutAnimationController
 * JD-Core Version:    0.6.0
 */