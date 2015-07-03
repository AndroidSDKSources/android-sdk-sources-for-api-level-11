/*    */ package android.provider;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class UserDictionary
/*    */ {
/*    */   public static final String AUTHORITY = "user_dictionary";
/* 25 */   public static final Uri CONTENT_URI = null;
/*    */ 
/*    */   public UserDictionary()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Words
/*    */     implements BaseColumns
/*    */   {
/* 20 */     public static final Uri CONTENT_URI = null;
/*    */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
/*    */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
/*    */     public static final String _ID = "_id";
/*    */     public static final String WORD = "word";
/*    */     public static final String FREQUENCY = "frequency";
/*    */     public static final String LOCALE = "locale";
/*    */     public static final String APP_ID = "appid";
/*    */     public static final int LOCALE_TYPE_ALL = 0;
/*    */     public static final int LOCALE_TYPE_CURRENT = 1;
/*    */     public static final String DEFAULT_SORT_ORDER = "frequency DESC";
/*    */ 
/*    */     public Words()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public static void addWord(Context context, String word, int frequency, int localeType) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.UserDictionary
 * JD-Core Version:    0.6.0
 */