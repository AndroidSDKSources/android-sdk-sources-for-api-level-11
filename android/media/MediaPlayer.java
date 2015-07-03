/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import android.view.SurfaceHolder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class MediaPlayer
/*    */ {
/*    */   public static final int MEDIA_ERROR_UNKNOWN = 1;
/*    */   public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*    */   public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
/*    */   public static final int MEDIA_INFO_UNKNOWN = 1;
/*    */   public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
/*    */   public static final int MEDIA_INFO_BUFFERING_START = 701;
/*    */   public static final int MEDIA_INFO_BUFFERING_END = 702;
/*    */   public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
/*    */   public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
/*    */   public static final int MEDIA_INFO_METADATA_UPDATE = 802;
/*    */ 
/*    */   public MediaPlayer()
/*    */   {
/* 32 */     throw new RuntimeException("Stub!"); } 
/* 33 */   public void setDisplay(SurfaceHolder sh) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static MediaPlayer create(Context context, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static MediaPlayer create(Context context, Uri uri, SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static MediaPlayer create(Context context, int resid) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*    */   public native void setDataSource(String paramString) throws IOException, IllegalArgumentException, IllegalStateException;
/*    */ 
/* 39 */   public void setDataSource(FileDescriptor fd) throws IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/*    */   public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IOException, IllegalArgumentException, IllegalStateException;
/*    */ 
/*    */   public native void prepare() throws IOException, IllegalStateException;
/*    */ 
/*    */   public native void prepareAsync() throws IllegalStateException;
/*    */ 
/* 43 */   public void start() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 44 */   public void stop() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 45 */   public void pause() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setWakeMode(Context context, int mode) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setScreenOnWhilePlaying(boolean screenOn) { throw new RuntimeException("Stub!"); } 
/*    */   public native int getVideoWidth();
/*    */ 
/*    */   public native int getVideoHeight();
/*    */ 
/*    */   public native boolean isPlaying();
/*    */ 
/*    */   public native void seekTo(int paramInt) throws IllegalStateException;
/*    */ 
/*    */   public native int getCurrentPosition();
/*    */ 
/*    */   public native int getDuration();
/*    */ 
/* 54 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 55 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*    */   public native void setAudioStreamType(int paramInt);
/*    */ 
/*    */   public native void setLooping(boolean paramBoolean);
/*    */ 
/*    */   public native boolean isLooping();
/*    */ 
/*    */   public native void setVolume(float paramFloat1, float paramFloat2);
/*    */ 
/*    */   public native void setAudioSessionId(int paramInt) throws IllegalArgumentException, IllegalStateException;
/*    */ 
/*    */   public native int getAudioSessionId();
/*    */ 
/*    */   public native void attachAuxEffect(int paramInt);
/*    */ 
/*    */   public native void setAuxEffectSendLevel(float paramFloat);
/*    */ 
/* 64 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 65 */   public void setOnPreparedListener(OnPreparedListener listener) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void setOnCompletionListener(OnCompletionListener listener) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) { throw new RuntimeException("Stub!"); } 
/* 68 */   public void setOnSeekCompleteListener(OnSeekCompleteListener listener) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) { throw new RuntimeException("Stub!"); } 
/* 70 */   public void setOnErrorListener(OnErrorListener listener) { throw new RuntimeException("Stub!"); } 
/* 71 */   public void setOnInfoListener(OnInfoListener listener) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnInfoListener
/*    */   {
/*    */     public abstract boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnErrorListener
/*    */   {
/*    */     public abstract boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnVideoSizeChangedListener
/*    */   {
/*    */     public abstract void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnSeekCompleteListener
/*    */   {
/*    */     public abstract void onSeekComplete(MediaPlayer paramMediaPlayer);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnBufferingUpdateListener
/*    */   {
/*    */     public abstract void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnCompletionListener
/*    */   {
/*    */     public abstract void onCompletion(MediaPlayer paramMediaPlayer);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPreparedListener
/*    */   {
/*    */     public abstract void onPrepared(MediaPlayer paramMediaPlayer);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.MediaPlayer
 * JD-Core Version:    0.6.0
 */