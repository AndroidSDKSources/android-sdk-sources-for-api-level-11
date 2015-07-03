/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Dialog;
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.widget.AdapterView;
/*    */ import android.widget.AdapterView.OnItemClickListener;
/*    */ import android.widget.ListAdapter;
/*    */ import android.widget.ListView;
/*    */ 
/*    */ public final class PreferenceScreen extends PreferenceGroup
/*    */   implements AdapterView.OnItemClickListener, DialogInterface.OnDismissListener
/*    */ {
/*    */   PreferenceScreen()
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public ListAdapter getRootAdapter() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected ListAdapter onCreateRootAdapter() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void bind(ListView listView) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void onClick() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onItemClick(AdapterView parent, View view, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.preference.PreferenceScreen
 * JD-Core Version:    0.6.0
 */