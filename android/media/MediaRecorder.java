/*    */ package android.media;
/*    */ 
/*    */ import android.hardware.Camera;
/*    */ import android.view.Surface;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class MediaRecorder
/*    */ {
/*    */   public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
/*    */   public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
/*    */   public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
/*    */   public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
/*    */ 
/*    */   public MediaRecorder()
/*    */   {
/* 56 */     throw new RuntimeException("Stub!"); } 
/*    */   public native void setCamera(Camera paramCamera);
/*    */ 
/* 58 */   public void setPreviewDisplay(Surface sv) { throw new RuntimeException("Stub!"); } 
/*    */   public native void setAudioSource(int paramInt) throws IllegalStateException;
/*    */ 
/* 60 */   public static final int getAudioSourceMax() { throw new RuntimeException("Stub!"); } 
/*    */   public native void setVideoSource(int paramInt) throws IllegalStateException;
/*    */ 
/* 62 */   public void setProfile(CamcorderProfile profile) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void setCaptureRate(double fps) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); } 
/*    */   public native void setOutputFormat(int paramInt) throws IllegalStateException;
/*    */ 
/*    */   public native void setVideoSize(int paramInt1, int paramInt2) throws IllegalStateException;
/*    */ 
/*    */   public native void setVideoFrameRate(int paramInt) throws IllegalStateException;
/*    */ 
/*    */   public native void setMaxDuration(int paramInt) throws IllegalArgumentException;
/*    */ 
/*    */   public native void setMaxFileSize(long paramLong) throws IllegalArgumentException;
/*    */ 
/*    */   public native void setAudioEncoder(int paramInt) throws IllegalStateException;
/*    */ 
/*    */   public native void setVideoEncoder(int paramInt) throws IllegalStateException;
/*    */ 
/* 72 */   public void setAudioSamplingRate(int samplingRate) { throw new RuntimeException("Stub!"); } 
/* 73 */   public void setAudioChannels(int numChannels) { throw new RuntimeException("Stub!"); } 
/* 74 */   public void setAudioEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); } 
/* 75 */   public void setVideoEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); } 
/* 76 */   public void setAuxiliaryOutputFile(FileDescriptor fd) { throw new RuntimeException("Stub!"); } 
/* 77 */   public void setAuxiliaryOutputFile(String path) { throw new RuntimeException("Stub!"); } 
/* 78 */   public void setOutputFile(FileDescriptor fd) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 79 */   public void setOutputFile(String path) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 80 */   public void prepare() throws IllegalStateException, IOException { throw new RuntimeException("Stub!"); } 
/*    */   public native void start() throws IllegalStateException;
/*    */ 
/*    */   public native void stop() throws IllegalStateException;
/*    */ 
/* 83 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*    */   public native int getMaxAmplitude() throws IllegalStateException;
/*    */ 
/* 85 */   public void setOnErrorListener(OnErrorListener l) { throw new RuntimeException("Stub!"); } 
/* 86 */   public void setOnInfoListener(OnInfoListener listener) { throw new RuntimeException("Stub!"); } 
/*    */   public native void release();
/*    */ 
/* 88 */   protected void finalize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnInfoListener
/*    */   {
/*    */     public abstract void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnErrorListener
/*    */   {
/*    */     public abstract void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2);
/*    */   }
/*    */ 
/*    */   public final class VideoEncoder
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int H263 = 1;
/*    */     public static final int H264 = 2;
/*    */     public static final int MPEG_4_SP = 3;
/*    */ 
/*    */     VideoEncoder()
/*    */     {
/* 42 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public final class AudioEncoder
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int AMR_NB = 1;
/*    */     public static final int AMR_WB = 2;
/*    */     public static final int AAC = 3;
/*    */ 
/*    */     AudioEncoder()
/*    */     {
/* 34 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public final class OutputFormat
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int THREE_GPP = 1;
/*    */     public static final int MPEG_4 = 2;
/*    */     public static final int RAW_AMR = 3;
/*    */     public static final int AMR_NB = 3;
/*    */     public static final int AMR_WB = 4;
/*    */ 
/*    */     OutputFormat()
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public final class VideoSource
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int CAMERA = 1;
/*    */ 
/*    */     VideoSource()
/*    */     {
/* 18 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public final class AudioSource
/*    */   {
/*    */     public static final int DEFAULT = 0;
/*    */     public static final int MIC = 1;
/*    */     public static final int VOICE_UPLINK = 2;
/*    */     public static final int VOICE_DOWNLINK = 3;
/*    */     public static final int VOICE_CALL = 4;
/*    */     public static final int CAMCORDER = 5;
/*    */     public static final int VOICE_RECOGNITION = 6;
/*    */     public static final int VOICE_COMMUNICATION = 7;
/*    */ 
/*    */     AudioSource()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.MediaRecorder
 * JD-Core Version:    0.6.0
 */