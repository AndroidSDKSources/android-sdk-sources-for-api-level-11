/*    */ package android.view;
/*    */ 
/*    */ public abstract class ActionMode
/*    */ {
/*    */   public ActionMode()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract void setTitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setTitle(int paramInt);
/*    */ 
/*    */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*    */ 
/*    */   public abstract void setSubtitle(int paramInt);
/*    */ 
/*    */   public abstract void setCustomView(View paramView);
/*    */ 
/*    */   public abstract void invalidate();
/*    */ 
/*    */   public abstract void finish();
/*    */ 
/*    */   public abstract Menu getMenu();
/*    */ 
/*    */   public abstract CharSequence getTitle();
/*    */ 
/*    */   public abstract CharSequence getSubtitle();
/*    */ 
/*    */   public abstract View getCustomView();
/*    */ 
/*    */   public abstract MenuInflater getMenuInflater();
/*    */ 
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */ 
/*    */     public abstract boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */ 
/*    */     public abstract boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem);
/*    */ 
/*    */     public abstract void onDestroyActionMode(ActionMode paramActionMode);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.ActionMode
 * JD-Core Version:    0.6.0
 */