/*    */ package android.accounts;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class AbstractAccountAuthenticator
/*    */ {
/*    */   public AbstractAccountAuthenticator(Context context)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final IBinder getIBinder() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString);
/*    */ 
/*    */   public abstract Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle) throws NetworkErrorException;
/*    */ 
/*    */   public abstract Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle) throws NetworkErrorException;
/*    */ 
/*    */   public abstract Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle) throws NetworkErrorException;
/*    */ 
/*    */   public abstract String getAuthTokenLabel(String paramString);
/*    */ 
/*    */   public abstract Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle) throws NetworkErrorException;
/*    */ 
/*    */   public abstract Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString) throws NetworkErrorException;
/*    */ 
/* 13 */   public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) throws NetworkErrorException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.accounts.AbstractAccountAuthenticator
 * JD-Core Version:    0.6.0
 */