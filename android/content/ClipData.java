/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ClipData
/*    */   implements Parcelable
/*    */ {
/* 29 */   public static final Parcelable.Creator<ClipData> CREATOR = null;
/*    */ 
/*    */   public ClipData(CharSequence label, String[] mimeTypes, Item item)
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public ClipData(ClipDescription description, Item item) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static ClipData newPlainText(CharSequence label, CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static ClipData newIntent(CharSequence label, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static ClipData newUri(ContentResolver resolver, CharSequence label, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static ClipData newRawUri(CharSequence label, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 22 */   public ClipDescription getDescription() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void addItem(Item item) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getItemCount() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Item getItemAt(int index) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Item
/*    */   {
/*    */     public Item(CharSequence text)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Item(Intent intent) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Item(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Item(CharSequence text, Intent intent, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 11 */     public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/* 12 */     public Intent getIntent() { throw new RuntimeException("Stub!"); } 
/* 13 */     public Uri getUri() { throw new RuntimeException("Stub!"); } 
/* 14 */     public CharSequence coerceToText(Context context) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ClipData
 * JD-Core Version:    0.6.0
 */