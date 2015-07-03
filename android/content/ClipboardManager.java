/*    */ package android.content;
/*    */ 
/*    */ public class ClipboardManager extends android.text.ClipboardManager
/*    */ {
/*    */   ClipboardManager()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void setPrimaryClip(ClipData clip) { throw new RuntimeException("Stub!"); } 
/* 11 */   public ClipData getPrimaryClip() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ClipDescription getPrimaryClipDescription() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean hasPrimaryClip() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addPrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void removePrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); } 
/* 16 */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean hasText() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPrimaryClipChangedListener
/*    */   {
/*    */     public abstract void onPrimaryClipChanged();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ClipboardManager
 * JD-Core Version:    0.6.0
 */