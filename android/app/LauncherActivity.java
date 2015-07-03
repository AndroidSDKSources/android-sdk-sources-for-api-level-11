/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.view.View;
/*    */ import android.widget.ListView;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class LauncherActivity extends ListActivity
/*    */ {
/*    */   public LauncherActivity()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onCreate(Bundle icicle) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected void onSetContentView() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onListItemClick(ListView l, View v, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected Intent intentForPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected ListItem itemForPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected Intent getTargetIntent() { throw new RuntimeException("Stub!"); } 
/* 29 */   protected List<ResolveInfo> onQueryPackageManager(Intent queryIntent) { throw new RuntimeException("Stub!"); } 
/* 30 */   public List<ListItem> makeListItems() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class IconResizer
/*    */   {
/*    */     public IconResizer()
/*    */     {
/* 17 */       throw new RuntimeException("Stub!"); } 
/* 18 */     public Drawable createIconThumbnail(Drawable icon) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class ListItem
/*    */   {
/*    */     public ResolveInfo resolveInfo;
/*    */     public CharSequence label;
/*    */     public Drawable icon;
/*    */     public String packageName;
/*    */     public String className;
/*    */     public Bundle extras;
/*    */ 
/*    */     public ListItem()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.LauncherActivity
 * JD-Core Version:    0.6.0
 */