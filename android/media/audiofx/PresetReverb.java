/*    */ package android.media.audiofx;
/*    */ 
/*    */ public class PresetReverb extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_PRESET = 0;
/*    */   public static final short PRESET_NONE = 0;
/*    */   public static final short PRESET_SMALLROOM = 1;
/*    */   public static final short PRESET_MEDIUMROOM = 2;
/*    */   public static final short PRESET_LARGEROOM = 3;
/*    */   public static final short PRESET_MEDIUMHALL = 4;
/*    */   public static final short PRESET_LARGEHALL = 5;
/*    */   public static final short PRESET_PLATE = 6;
/*    */ 
/*    */   public PresetReverb(int priority, int audioSession)
/*    */     throws IllegalArgumentException, UnsupportedOperationException, RuntimeException
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public void setPreset(short preset) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 18 */   public short getPreset() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Settings
/*    */   {
/*    */     public short preset;
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
/*    */     public abstract void onParameterChange(PresetReverb paramPresetReverb, int paramInt1, int paramInt2, short paramShort);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.audiofx.PresetReverb
 * JD-Core Version:    0.6.0
 */