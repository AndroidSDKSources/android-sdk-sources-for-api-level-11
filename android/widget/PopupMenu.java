/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ 
/*    */ public class PopupMenu
/*    */ {
/*    */   public PopupMenu(Context context, View anchor)
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public Menu getMenu() { throw new RuntimeException("Stub!"); } 
/* 10 */   public MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void show() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setOnMenuItemClickListener(OnMenuItemClickListener listener) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnMenuItemClickListener
/*    */   {
/*    */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.PopupMenu
 * JD-Core Version:    0.6.0
 */