/*    */ package android.speech.tts;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.HashMap;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class TextToSpeech
/*    */ {
/*    */   public static final int SUCCESS = 0;
/*    */   public static final int ERROR = -1;
/*    */   public static final int QUEUE_FLUSH = 0;
/*    */   public static final int QUEUE_ADD = 1;
/*    */   public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
/*    */   public static final int LANG_COUNTRY_AVAILABLE = 1;
/*    */   public static final int LANG_AVAILABLE = 0;
/*    */   public static final int LANG_MISSING_DATA = -1;
/*    */   public static final int LANG_NOT_SUPPORTED = -2;
/*    */   public static final String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
/*    */ 
/*    */   public TextToSpeech(Context context, OnInitListener listener)
/*    */   {
/* 36 */     throw new RuntimeException("Stub!"); } 
/* 37 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 38 */   public int addSpeech(String text, String packagename, int resourceId) { throw new RuntimeException("Stub!"); } 
/* 39 */   public int addSpeech(String text, String filename) { throw new RuntimeException("Stub!"); } 
/* 40 */   public int addEarcon(String earcon, String packagename, int resourceId) { throw new RuntimeException("Stub!"); } 
/* 41 */   public int addEarcon(String earcon, String filename) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int speak(String text, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 43 */   public int playEarcon(String earcon, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int playSilence(long durationInMs, int queueMode, HashMap<String, String> params) { throw new RuntimeException("Stub!"); } 
/* 45 */   public boolean isSpeaking() { throw new RuntimeException("Stub!"); } 
/* 46 */   public int stop() { throw new RuntimeException("Stub!"); } 
/* 47 */   public int setSpeechRate(float speechRate) { throw new RuntimeException("Stub!"); } 
/* 48 */   public int setPitch(float pitch) { throw new RuntimeException("Stub!"); } 
/* 49 */   public int setLanguage(Locale loc) { throw new RuntimeException("Stub!"); } 
/* 50 */   public Locale getLanguage() { throw new RuntimeException("Stub!"); } 
/* 51 */   public int isLanguageAvailable(Locale loc) { throw new RuntimeException("Stub!"); } 
/* 52 */   public int synthesizeToFile(String text, HashMap<String, String> params, String filename) { throw new RuntimeException("Stub!"); } 
/* 53 */   public int setOnUtteranceCompletedListener(OnUtteranceCompletedListener listener) { throw new RuntimeException("Stub!"); } 
/* 54 */   public int setEngineByPackageName(String enginePackageName) { throw new RuntimeException("Stub!"); } 
/* 55 */   public String getDefaultEngine() { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean areDefaultsEnforced() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class Engine
/*    */   {
/*    */     public static final int DEFAULT_STREAM = 3;
/*    */     public static final int CHECK_VOICE_DATA_PASS = 1;
/*    */     public static final int CHECK_VOICE_DATA_FAIL = 0;
/*    */     public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
/*    */     public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
/*    */     public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
/*    */     public static final String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
/*    */     public static final String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
/*    */     public static final String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
/*    */     public static final String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
/*    */     public static final String EXTRA_VOICE_DATA_FILES = "dataFiles";
/*    */     public static final String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
/*    */     public static final String EXTRA_AVAILABLE_VOICES = "availableVoices";
/*    */     public static final String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
/*    */     public static final String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
/*    */     public static final String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
/*    */     public static final String KEY_PARAM_STREAM = "streamType";
/*    */     public static final String KEY_PARAM_UTTERANCE_ID = "utteranceId";
/*    */     public static final String KEY_PARAM_VOLUME = "volume";
/*    */     public static final String KEY_PARAM_PAN = "pan";
/*    */ 
/*    */     public Engine()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnUtteranceCompletedListener
/*    */   {
/*    */     public abstract void onUtteranceCompleted(String paramString);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnInitListener
/*    */   {
/*    */     public abstract void onInit(int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.speech.tts.TextToSpeech
 * JD-Core Version:    0.6.0
 */