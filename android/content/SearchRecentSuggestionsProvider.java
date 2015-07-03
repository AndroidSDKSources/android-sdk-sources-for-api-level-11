/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class SearchRecentSuggestionsProvider extends ContentProvider
/*    */ {
/*    */   public static final int DATABASE_MODE_QUERIES = 1;
/*    */   public static final int DATABASE_MODE_2LINES = 2;
/*    */ 
/*    */   public SearchRecentSuggestionsProvider()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void setupSuggestions(String authority, int mode) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int delete(Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getType(Uri uri) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Uri insert(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean onCreate() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.SearchRecentSuggestionsProvider
 * JD-Core Version:    0.6.0
 */