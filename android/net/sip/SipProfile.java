/*    */ package android.net.sip;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.Serializable;
/*    */ import java.text.ParseException;
/*    */ 
/*    */ public class SipProfile
/*    */   implements Parcelable, Serializable, Cloneable
/*    */ {
/* 35 */   public static final Parcelable.Creator<SipProfile> CREATOR = null;
/*    */ 
/*    */   SipProfile()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String getUriString() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String getDisplayName() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getUserName() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getPassword() { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getSipDomain() { throw new RuntimeException("Stub!"); } 
/* 28 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 29 */   public String getProtocol() { throw new RuntimeException("Stub!"); } 
/* 30 */   public String getProxyAddress() { throw new RuntimeException("Stub!"); } 
/* 31 */   public String getProfileName() { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean getSendKeepAlive() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean getAutoRegistration() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(SipProfile profile)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder(String uriString) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder(String username, String serverDomain) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder setProfileName(String name) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder setPassword(String password) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder setPort(int port) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder setProtocol(String protocol) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder setOutboundProxy(String outboundProxy) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder setDisplayName(String displayName) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder setSendKeepAlive(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder setAutoRegistration(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 18 */     public SipProfile build() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.sip.SipProfile
 * JD-Core Version:    0.6.0
 */