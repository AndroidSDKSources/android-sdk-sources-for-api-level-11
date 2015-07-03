/*    */ package android.test;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ import android.database.sqlite.SQLiteDatabase;
/*    */ import android.database.sqlite.SQLiteDatabase.CursorFactory;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ 
/*    */ public class RenamingDelegatingContext extends ContextWrapper
/*    */ {
/*    */   public RenamingDelegatingContext(Context context, String filePrefix)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public RenamingDelegatingContext(Context context, Context fileContext, String filePrefix) { super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public static <T extends ContentProvider> T providerWithRenamedContext(Class<T> contentProvider, Context c, String filePrefix) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <T extends ContentProvider> T providerWithRenamedContext(Class<T> contentProvider, Context c, String filePrefix, boolean allowAccessToExistingFilesAndDbs) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void makeExistingFilesAndDbsAccessible() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getDatabasePrefix() { throw new RuntimeException("Stub!"); } 
/* 11 */   public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 12 */   public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean deleteDatabase(String name) { throw new RuntimeException("Stub!"); } 
/* 14 */   public File getDatabasePath(String name) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String[] databaseList() { throw new RuntimeException("Stub!"); } 
/* 16 */   public FileInputStream openFileInput(String name) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 17 */   public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 18 */   public File getFileStreamPath(String name) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean deleteFile(String name) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String[] fileList() { throw new RuntimeException("Stub!"); } 
/* 21 */   public File getCacheDir() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.RenamingDelegatingContext
 * JD-Core Version:    0.6.0
 */