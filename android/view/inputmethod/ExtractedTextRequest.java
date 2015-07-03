/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ExtractedTextRequest
/*    */   implements Parcelable
/*    */ {
/*    */   public int token;
/*    */   public int flags;
/*    */   public int hintMaxLines;
/*    */   public int hintMaxChars;
/* 13 */   public static final Parcelable.Creator<ExtractedTextRequest> CREATOR = null;
/*    */ 
/*    */   public ExtractedTextRequest()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int describeContents() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.ExtractedTextRequest
 * JD-Core Version:    0.6.0
 */