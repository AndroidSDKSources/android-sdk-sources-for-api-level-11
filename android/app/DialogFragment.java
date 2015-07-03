/*    */ package android.app;
/*    */ 
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.os.Bundle;
/*    */ 
/*    */ public class DialogFragment extends Fragment
/*    */   implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
/*    */ {
/*    */   public static final int STYLE_NORMAL = 0;
/*    */   public static final int STYLE_NO_TITLE = 1;
/*    */   public static final int STYLE_NO_FRAME = 2;
/*    */   public static final int STYLE_NO_INPUT = 3;
/*    */ 
/*    */   public DialogFragment()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void setStyle(int style, int theme) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void show(FragmentManager manager, String tag) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int show(FragmentTransaction transaction, String tag) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getTheme() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isCancelable() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setShowsDialog(boolean showsDialog) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean getShowsDialog() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Dialog onCreateDialog(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onCancel(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onStop() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onDestroyView() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.DialogFragment
 * JD-Core Version:    0.6.0
 */