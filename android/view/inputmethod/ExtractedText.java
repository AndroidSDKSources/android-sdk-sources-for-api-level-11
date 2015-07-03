/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ExtractedText
/*    */   implements Parcelable
/*    */ {
/*    */   public CharSequence text;
/*    */   public int startOffset;
/*    */   public int partialStartOffset;
/*    */   public int partialEndOffset;
/*    */   public int selectionStart;
/*    */   public int selectionEnd;
/*    */   public static final int FLAG_SINGLE_LINE = 1;
/*    */   public static final int FLAG_SELECTING = 2;
/*    */   public int flags;
/* 18 */   public static final Parcelable.Creator<ExtractedText> CREATOR = null;
/*    */ 
/*    */   public ExtractedText()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.ExtractedText
 * JD-Core Version:    0.6.0
 */