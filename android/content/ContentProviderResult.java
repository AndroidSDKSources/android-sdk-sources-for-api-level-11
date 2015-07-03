/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ContentProviderResult
/*    */   implements Parcelable
/*    */ {
/*    */   public final Uri uri;
/*    */   public final Integer count;
/* 14 */   public static final Parcelable.Creator<ContentProviderResult> CREATOR = null;
/*    */ 
/*    */   public ContentProviderResult(Uri uri)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ContentProviderResult(int count) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ContentProviderResult(Parcel source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ContentProviderResult
 * JD-Core Version:    0.6.0
 */