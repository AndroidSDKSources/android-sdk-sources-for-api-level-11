/*    */ package android.os;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.security.GeneralSecurityException;
/*    */ 
/*    */ public class RecoverySystem
/*    */ {
/*    */   public RecoverySystem()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public static void verifyPackage(File packageFile, ProgressListener listener, File deviceCertsZipFile) throws IOException, GeneralSecurityException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static void installPackage(Context context, File packageFile) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public static void rebootWipeUserData(Context context) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface ProgressListener
/*    */   {
/*    */     public abstract void onProgress(int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.RecoverySystem
 * JD-Core Version:    0.6.0
 */