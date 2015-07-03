/*     */ package android.hardware;
/*     */ 
/*     */ import android.graphics.SurfaceTexture;
/*     */ import android.view.SurfaceHolder;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ 
/*     */ public class Camera
/*     */ {
/*     */   public static final int CAMERA_ERROR_UNKNOWN = 1;
/*     */   public static final int CAMERA_ERROR_SERVER_DIED = 100;
/*     */ 
/*     */   Camera()
/*     */   {
/* 175 */     throw new RuntimeException("Stub!"); } 
/*     */   public static native int getNumberOfCameras();
/*     */ 
/*     */   public static native void getCameraInfo(int paramInt, CameraInfo paramCameraInfo);
/*     */ 
/* 178 */   public static Camera open(int cameraId) { throw new RuntimeException("Stub!"); } 
/* 179 */   public static Camera open() { throw new RuntimeException("Stub!"); } 
/* 180 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 181 */   public final void release() { throw new RuntimeException("Stub!"); } 
/*     */   public final native void unlock();
/*     */ 
/*     */   public final native void lock();
/*     */ 
/*     */   public final native void reconnect() throws IOException;
/*     */ 
/* 185 */   public final void setPreviewDisplay(SurfaceHolder holder) throws IOException { throw new RuntimeException("Stub!"); } 
/*     */   public final native void setPreviewTexture(SurfaceTexture paramSurfaceTexture);
/*     */ 
/*     */   public final native void startPreview();
/*     */ 
/*     */   public final native void stopPreview();
/*     */ 
/* 189 */   public final void setPreviewCallback(PreviewCallback cb) { throw new RuntimeException("Stub!"); } 
/* 190 */   public final void setOneShotPreviewCallback(PreviewCallback cb) { throw new RuntimeException("Stub!"); } 
/* 191 */   public final void setPreviewCallbackWithBuffer(PreviewCallback cb) { throw new RuntimeException("Stub!"); } 
/*     */   public final native void addCallbackBuffer(byte[] paramArrayOfByte);
/*     */ 
/* 193 */   public final void autoFocus(AutoFocusCallback cb) { throw new RuntimeException("Stub!"); } 
/* 194 */   public final void cancelAutoFocus() { throw new RuntimeException("Stub!"); } 
/* 195 */   public final void takePicture(ShutterCallback shutter, PictureCallback raw, PictureCallback jpeg) { throw new RuntimeException("Stub!"); } 
/* 196 */   public final void takePicture(ShutterCallback shutter, PictureCallback raw, PictureCallback postview, PictureCallback jpeg) { throw new RuntimeException("Stub!"); } 
/*     */   public final native void startSmoothZoom(int paramInt);
/*     */ 
/*     */   public final native void stopSmoothZoom();
/*     */ 
/*     */   public final native void setDisplayOrientation(int paramInt);
/*     */ 
/* 200 */   public final void setZoomChangeListener(OnZoomChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 201 */   public final void setErrorCallback(ErrorCallback cb) { throw new RuntimeException("Stub!"); } 
/* 202 */   public void setParameters(Parameters params) { throw new RuntimeException("Stub!"); } 
/* 203 */   public Parameters getParameters() { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public class Parameters
/*     */   {
/*     */     public static final String WHITE_BALANCE_AUTO = "auto";
/*     */     public static final String WHITE_BALANCE_INCANDESCENT = "incandescent";
/*     */     public static final String WHITE_BALANCE_FLUORESCENT = "fluorescent";
/*     */     public static final String WHITE_BALANCE_WARM_FLUORESCENT = "warm-fluorescent";
/*     */     public static final String WHITE_BALANCE_DAYLIGHT = "daylight";
/*     */     public static final String WHITE_BALANCE_CLOUDY_DAYLIGHT = "cloudy-daylight";
/*     */     public static final String WHITE_BALANCE_TWILIGHT = "twilight";
/*     */     public static final String WHITE_BALANCE_SHADE = "shade";
/*     */     public static final String EFFECT_NONE = "none";
/*     */     public static final String EFFECT_MONO = "mono";
/*     */     public static final String EFFECT_NEGATIVE = "negative";
/*     */     public static final String EFFECT_SOLARIZE = "solarize";
/*     */     public static final String EFFECT_SEPIA = "sepia";
/*     */     public static final String EFFECT_POSTERIZE = "posterize";
/*     */     public static final String EFFECT_WHITEBOARD = "whiteboard";
/*     */     public static final String EFFECT_BLACKBOARD = "blackboard";
/*     */     public static final String EFFECT_AQUA = "aqua";
/*     */     public static final String ANTIBANDING_AUTO = "auto";
/*     */     public static final String ANTIBANDING_50HZ = "50hz";
/*     */     public static final String ANTIBANDING_60HZ = "60hz";
/*     */     public static final String ANTIBANDING_OFF = "off";
/*     */     public static final String FLASH_MODE_OFF = "off";
/*     */     public static final String FLASH_MODE_AUTO = "auto";
/*     */     public static final String FLASH_MODE_ON = "on";
/*     */     public static final String FLASH_MODE_RED_EYE = "red-eye";
/*     */     public static final String FLASH_MODE_TORCH = "torch";
/*     */     public static final String SCENE_MODE_AUTO = "auto";
/*     */     public static final String SCENE_MODE_ACTION = "action";
/*     */     public static final String SCENE_MODE_PORTRAIT = "portrait";
/*     */     public static final String SCENE_MODE_LANDSCAPE = "landscape";
/*     */     public static final String SCENE_MODE_NIGHT = "night";
/*     */     public static final String SCENE_MODE_NIGHT_PORTRAIT = "night-portrait";
/*     */     public static final String SCENE_MODE_THEATRE = "theatre";
/*     */     public static final String SCENE_MODE_BEACH = "beach";
/*     */     public static final String SCENE_MODE_SNOW = "snow";
/*     */     public static final String SCENE_MODE_SUNSET = "sunset";
/*     */     public static final String SCENE_MODE_STEADYPHOTO = "steadyphoto";
/*     */     public static final String SCENE_MODE_FIREWORKS = "fireworks";
/*     */     public static final String SCENE_MODE_SPORTS = "sports";
/*     */     public static final String SCENE_MODE_PARTY = "party";
/*     */     public static final String SCENE_MODE_CANDLELIGHT = "candlelight";
/*     */     public static final String SCENE_MODE_BARCODE = "barcode";
/*     */     public static final String FOCUS_MODE_AUTO = "auto";
/*     */     public static final String FOCUS_MODE_INFINITY = "infinity";
/*     */     public static final String FOCUS_MODE_MACRO = "macro";
/*     */     public static final String FOCUS_MODE_FIXED = "fixed";
/*     */     public static final String FOCUS_MODE_EDOF = "edof";
/*     */     public static final String FOCUS_MODE_CONTINUOUS_VIDEO = "continuous-video";
/*     */     public static final int FOCUS_DISTANCE_NEAR_INDEX = 0;
/*     */     public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = 1;
/*     */     public static final int FOCUS_DISTANCE_FAR_INDEX = 2;
/*     */     public static final int PREVIEW_FPS_MIN_INDEX = 0;
/*     */     public static final int PREVIEW_FPS_MAX_INDEX = 1;
/*     */ 
/*     */     Parameters()
/*     */     {
/*  46 */       throw new RuntimeException("Stub!"); } 
/*  47 */     public String flatten() { throw new RuntimeException("Stub!"); } 
/*  48 */     public void unflatten(String flattened) { throw new RuntimeException("Stub!"); } 
/*  49 */     public void remove(String key) { throw new RuntimeException("Stub!"); } 
/*  50 */     public void set(String key, String value) { throw new RuntimeException("Stub!"); } 
/*  51 */     public void set(String key, int value) { throw new RuntimeException("Stub!"); } 
/*  52 */     public String get(String key) { throw new RuntimeException("Stub!"); } 
/*  53 */     public int getInt(String key) { throw new RuntimeException("Stub!"); } 
/*  54 */     public void setPreviewSize(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  55 */     public Camera.Size getPreviewSize() { throw new RuntimeException("Stub!"); } 
/*  56 */     public List<Camera.Size> getSupportedPreviewSizes() { throw new RuntimeException("Stub!"); } 
/*  57 */     public List<Camera.Size> getSupportedVideoSizes() { throw new RuntimeException("Stub!"); } 
/*  58 */     public Camera.Size getPreferredPreviewSizeForVideo() { throw new RuntimeException("Stub!"); } 
/*  59 */     public void setJpegThumbnailSize(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  60 */     public Camera.Size getJpegThumbnailSize() { throw new RuntimeException("Stub!"); } 
/*  61 */     public List<Camera.Size> getSupportedJpegThumbnailSizes() { throw new RuntimeException("Stub!"); } 
/*  62 */     public void setJpegThumbnailQuality(int quality) { throw new RuntimeException("Stub!"); } 
/*  63 */     public int getJpegThumbnailQuality() { throw new RuntimeException("Stub!"); } 
/*  64 */     public void setJpegQuality(int quality) { throw new RuntimeException("Stub!"); } 
/*  65 */     public int getJpegQuality() { throw new RuntimeException("Stub!"); } 
/*  66 */     public void setPreviewFrameRate(int fps) { throw new RuntimeException("Stub!"); } 
/*  67 */     public int getPreviewFrameRate() { throw new RuntimeException("Stub!"); } 
/*  68 */     public List<Integer> getSupportedPreviewFrameRates() { throw new RuntimeException("Stub!"); } 
/*  69 */     public void setPreviewFpsRange(int min, int max) { throw new RuntimeException("Stub!"); } 
/*  70 */     public void getPreviewFpsRange(int[] range) { throw new RuntimeException("Stub!"); } 
/*  71 */     public List<int[]> getSupportedPreviewFpsRange() { throw new RuntimeException("Stub!"); } 
/*  72 */     public void setPreviewFormat(int pixel_format) { throw new RuntimeException("Stub!"); } 
/*  73 */     public int getPreviewFormat() { throw new RuntimeException("Stub!"); } 
/*  74 */     public List<Integer> getSupportedPreviewFormats() { throw new RuntimeException("Stub!"); } 
/*  75 */     public void setPictureSize(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  76 */     public Camera.Size getPictureSize() { throw new RuntimeException("Stub!"); } 
/*  77 */     public List<Camera.Size> getSupportedPictureSizes() { throw new RuntimeException("Stub!"); } 
/*  78 */     public void setPictureFormat(int pixel_format) { throw new RuntimeException("Stub!"); } 
/*  79 */     public int getPictureFormat() { throw new RuntimeException("Stub!"); } 
/*  80 */     public List<Integer> getSupportedPictureFormats() { throw new RuntimeException("Stub!"); } 
/*  81 */     public void setRotation(int rotation) { throw new RuntimeException("Stub!"); } 
/*  82 */     public void setGpsLatitude(double latitude) { throw new RuntimeException("Stub!"); } 
/*  83 */     public void setGpsLongitude(double longitude) { throw new RuntimeException("Stub!"); } 
/*  84 */     public void setGpsAltitude(double altitude) { throw new RuntimeException("Stub!"); } 
/*  85 */     public void setGpsTimestamp(long timestamp) { throw new RuntimeException("Stub!"); } 
/*  86 */     public void setGpsProcessingMethod(String processing_method) { throw new RuntimeException("Stub!"); } 
/*  87 */     public void removeGpsData() { throw new RuntimeException("Stub!"); } 
/*  88 */     public String getWhiteBalance() { throw new RuntimeException("Stub!"); } 
/*  89 */     public void setWhiteBalance(String value) { throw new RuntimeException("Stub!"); } 
/*  90 */     public List<String> getSupportedWhiteBalance() { throw new RuntimeException("Stub!"); } 
/*  91 */     public String getColorEffect() { throw new RuntimeException("Stub!"); } 
/*  92 */     public void setColorEffect(String value) { throw new RuntimeException("Stub!"); } 
/*  93 */     public List<String> getSupportedColorEffects() { throw new RuntimeException("Stub!"); } 
/*  94 */     public String getAntibanding() { throw new RuntimeException("Stub!"); } 
/*  95 */     public void setAntibanding(String antibanding) { throw new RuntimeException("Stub!"); } 
/*  96 */     public List<String> getSupportedAntibanding() { throw new RuntimeException("Stub!"); } 
/*  97 */     public String getSceneMode() { throw new RuntimeException("Stub!"); } 
/*  98 */     public void setSceneMode(String value) { throw new RuntimeException("Stub!"); } 
/*  99 */     public List<String> getSupportedSceneModes() { throw new RuntimeException("Stub!"); } 
/* 100 */     public String getFlashMode() { throw new RuntimeException("Stub!"); } 
/* 101 */     public void setFlashMode(String value) { throw new RuntimeException("Stub!"); } 
/* 102 */     public List<String> getSupportedFlashModes() { throw new RuntimeException("Stub!"); } 
/* 103 */     public String getFocusMode() { throw new RuntimeException("Stub!"); } 
/* 104 */     public void setFocusMode(String value) { throw new RuntimeException("Stub!"); } 
/* 105 */     public List<String> getSupportedFocusModes() { throw new RuntimeException("Stub!"); } 
/* 106 */     public float getFocalLength() { throw new RuntimeException("Stub!"); } 
/* 107 */     public float getHorizontalViewAngle() { throw new RuntimeException("Stub!"); } 
/* 108 */     public float getVerticalViewAngle() { throw new RuntimeException("Stub!"); } 
/* 109 */     public int getExposureCompensation() { throw new RuntimeException("Stub!"); } 
/* 110 */     public void setExposureCompensation(int value) { throw new RuntimeException("Stub!"); } 
/* 111 */     public int getMaxExposureCompensation() { throw new RuntimeException("Stub!"); } 
/* 112 */     public int getMinExposureCompensation() { throw new RuntimeException("Stub!"); } 
/* 113 */     public float getExposureCompensationStep() { throw new RuntimeException("Stub!"); } 
/* 114 */     public int getZoom() { throw new RuntimeException("Stub!"); } 
/* 115 */     public void setZoom(int value) { throw new RuntimeException("Stub!"); } 
/* 116 */     public boolean isZoomSupported() { throw new RuntimeException("Stub!"); } 
/* 117 */     public int getMaxZoom() { throw new RuntimeException("Stub!"); } 
/* 118 */     public List<Integer> getZoomRatios() { throw new RuntimeException("Stub!"); } 
/* 119 */     public boolean isSmoothZoomSupported() { throw new RuntimeException("Stub!"); } 
/* 120 */     public void getFocusDistances(float[] output) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public class Size
/*     */   {
/*     */     public int width;
/*     */     public int height;
/*     */ 
/*     */     public Size(int w, int h)
/*     */     {
/*  38 */       throw new RuntimeException("Stub!"); } 
/*  39 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  40 */     public int hashCode() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface ErrorCallback
/*     */   {
/*     */     public abstract void onError(int paramInt, Camera paramCamera);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnZoomChangeListener
/*     */   {
/*     */     public abstract void onZoomChange(int paramInt, boolean paramBoolean, Camera paramCamera);
/*     */   }
/*     */ 
/*     */   public static abstract interface PictureCallback
/*     */   {
/*     */     public abstract void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera);
/*     */   }
/*     */ 
/*     */   public static abstract interface ShutterCallback
/*     */   {
/*     */     public abstract void onShutter();
/*     */   }
/*     */ 
/*     */   public static abstract interface AutoFocusCallback
/*     */   {
/*     */     public abstract void onAutoFocus(boolean paramBoolean, Camera paramCamera);
/*     */   }
/*     */ 
/*     */   public static abstract interface PreviewCallback
/*     */   {
/*     */     public abstract void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera);
/*     */   }
/*     */ 
/*     */   public static class CameraInfo
/*     */   {
/*     */     public static final int CAMERA_FACING_BACK = 0;
/*     */     public static final int CAMERA_FACING_FRONT = 1;
/*     */     public int facing;
/*     */     public int orientation;
/*     */ 
/*     */     public CameraInfo()
/*     */     {
/*   6 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.hardware.Camera
 * JD-Core Version:    0.6.0
 */