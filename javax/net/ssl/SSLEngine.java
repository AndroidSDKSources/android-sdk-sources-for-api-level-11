/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public abstract class SSLEngine
/*    */ {
/*    */   protected SSLEngine()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   protected SSLEngine(String host, int port) { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getPeerHost() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getPeerPort() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void beginHandshake() throws SSLException;
/*    */ 
/*    */   public abstract void closeInbound() throws SSLException;
/*    */ 
/*    */   public abstract void closeOutbound();
/*    */ 
/*    */   public abstract Runnable getDelegatedTask();
/*    */ 
/*    */   public abstract String[] getEnabledCipherSuites();
/*    */ 
/*    */   public abstract String[] getEnabledProtocols();
/*    */ 
/*    */   public abstract boolean getEnableSessionCreation();
/*    */ 
/*    */   public abstract SSLEngineResult.HandshakeStatus getHandshakeStatus();
/*    */ 
/*    */   public abstract boolean getNeedClientAuth();
/*    */ 
/*    */   public abstract SSLSession getSession();
/*    */ 
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */ 
/*    */   public abstract String[] getSupportedProtocols();
/*    */ 
/*    */   public abstract boolean getUseClientMode();
/*    */ 
/*    */   public abstract boolean getWantClientAuth();
/*    */ 
/*    */   public abstract boolean isInboundDone();
/*    */ 
/*    */   public abstract boolean isOutboundDone();
/*    */ 
/*    */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setUseClientMode(boolean paramBoolean);
/*    */ 
/*    */   public abstract void setWantClientAuth(boolean paramBoolean);
/*    */ 
/*    */   public abstract SSLEngineResult unwrap(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws SSLException;
/*    */ 
/*    */   public abstract SSLEngineResult wrap(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) throws SSLException;
/*    */ 
/* 32 */   public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 33 */   public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer[] dsts) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 34 */   public SSLEngineResult wrap(ByteBuffer[] srcs, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 35 */   public SSLEngineResult wrap(ByteBuffer src, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 36 */   public SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setSSLParameters(SSLParameters p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLEngine
 * JD-Core Version:    0.6.0
 */