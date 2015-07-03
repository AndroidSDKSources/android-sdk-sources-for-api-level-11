/*    */ package android.media.audiofx;
/*    */ 
/*    */ public class Visualizer
/*    */ {
/*    */   public static final int STATE_UNINITIALIZED = 0;
/*    */   public static final int STATE_INITIALIZED = 1;
/*    */   public static final int STATE_ENABLED = 2;
/*    */   public static final int SUCCESS = 0;
/*    */   public static final int ERROR = -1;
/*    */   public static final int ALREADY_EXISTS = -2;
/*    */   public static final int ERROR_NO_INIT = -3;
/*    */   public static final int ERROR_BAD_VALUE = -4;
/*    */   public static final int ERROR_INVALID_OPERATION = -5;
/*    */   public static final int ERROR_NO_MEMORY = -6;
/*    */   public static final int ERROR_DEAD_OBJECT = -7;
/*    */ 
/*    */   public Visualizer(int audioSession)
/*    */     throws UnsupportedOperationException, RuntimeException
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int setEnabled(boolean enabled) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean getEnabled() { throw new RuntimeException("Stub!"); } 
/*    */   public static native int[] getCaptureSizeRange();
/*    */ 
/*    */   public static native int getMaxCaptureRate();
/*    */ 
/* 16 */   public int setCaptureSize(int size) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getCaptureSize() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getSamplingRate() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getWaveForm(byte[] waveform) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getFft(byte[] fft) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 21 */   public int setDataCaptureListener(OnDataCaptureListener listener, int rate, boolean waveform, boolean fft) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnDataCaptureListener
/*    */   {
/*    */     public abstract void onWaveFormDataCapture(Visualizer paramVisualizer, byte[] paramArrayOfByte, int paramInt);
/*    */ 
/*    */     public abstract void onFftDataCapture(Visualizer paramVisualizer, byte[] paramArrayOfByte, int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.audiofx.Visualizer
 * JD-Core Version:    0.6.0
 */