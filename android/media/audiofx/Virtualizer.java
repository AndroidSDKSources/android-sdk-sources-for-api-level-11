/*    */ package android.media.audiofx;
/*    */ 
/*    */ public class Virtualizer extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_STRENGTH_SUPPORTED = 0;
/*    */   public static final int PARAM_STRENGTH = 1;
/*    */ 
/*    */   public Virtualizer(int priority, int audioSession)
/*    */     throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException, RuntimeException
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean getStrengthSupported() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setStrength(short strength) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 19 */   public short getRoundedStrength() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Settings
/*    */   {
/*    */     public short strength;
/*    */ 
/*    */     public Settings()
/*    */     {
/* 11 */       throw new RuntimeException("Stub!"); } 
/* 12 */     public Settings(String settings) { throw new RuntimeException("Stub!"); } 
/* 13 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnParameterChangeListener
/*    */   {
/*    */     public abstract void onParameterChange(Virtualizer paramVirtualizer, int paramInt1, int paramInt2, short paramShort);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.audiofx.Virtualizer
 * JD-Core Version:    0.6.0
 */