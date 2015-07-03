/*   */ package android.text.method;
/*   */ 
/*   */ import android.app.Dialog;
/*   */ import android.content.Context;
/*   */ import android.content.DialogInterface.OnCancelListener;
/*   */ import android.os.Bundle;
/*   */ import android.text.Editable;
/*   */ import android.view.View;
/*   */ import android.view.View.OnClickListener;
/*   */ import android.widget.AdapterView;
/*   */ import android.widget.AdapterView.OnItemClickListener;
/*   */ 
/*   */ public class CharacterPickerDialog extends Dialog
/*   */   implements AdapterView.OnItemClickListener, View.OnClickListener
/*   */ {
/*   */   public CharacterPickerDialog(Context context, View view, Editable text, String options, boolean insert)
/*   */   {
/* 6 */     super((Context)null, false, (DialogInterface.OnCancelListener)null); throw new RuntimeException("Stub!"); } 
/* 7 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void onItemClick(AdapterView parent, View view, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void onClick(View v) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.CharacterPickerDialog
 * JD-Core Version:    0.6.0
 */