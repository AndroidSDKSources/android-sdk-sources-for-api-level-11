/*     */ package android.content;
/*     */ 
/*     */ import android.content.pm.ActivityInfo;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.Rect;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.AttributeSet;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.net.URISyntaxException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Set;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ 
/*     */ public class Intent
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public static final String ACTION_MAIN = "android.intent.action.MAIN";
/*     */   public static final String ACTION_VIEW = "android.intent.action.VIEW";
/*     */   public static final String ACTION_DEFAULT = "android.intent.action.VIEW";
/*     */   public static final String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
/*     */   public static final String ACTION_EDIT = "android.intent.action.EDIT";
/*     */   public static final String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
/*     */   public static final String ACTION_PICK = "android.intent.action.PICK";
/*     */   public static final String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
/*     */   public static final String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
/*     */   public static final String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
/*     */   public static final String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
/*     */   public static final String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
/*     */   public static final String ACTION_CHOOSER = "android.intent.action.CHOOSER";
/*     */   public static final String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
/*     */   public static final String ACTION_DIAL = "android.intent.action.DIAL";
/*     */   public static final String ACTION_CALL = "android.intent.action.CALL";
/*     */   public static final String ACTION_SENDTO = "android.intent.action.SENDTO";
/*     */   public static final String ACTION_SEND = "android.intent.action.SEND";
/*     */   public static final String ACTION_SEND_MULTIPLE = "android.intent.action.SEND_MULTIPLE";
/*     */   public static final String ACTION_ANSWER = "android.intent.action.ANSWER";
/*     */   public static final String ACTION_INSERT = "android.intent.action.INSERT";
/*     */   public static final String ACTION_PASTE = "android.intent.action.PASTE";
/*     */   public static final String ACTION_DELETE = "android.intent.action.DELETE";
/*     */   public static final String ACTION_RUN = "android.intent.action.RUN";
/*     */   public static final String ACTION_SYNC = "android.intent.action.SYNC";
/*     */   public static final String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
/*     */   public static final String ACTION_SEARCH = "android.intent.action.SEARCH";
/*     */   public static final String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";
/*     */   public static final String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
/*     */   public static final String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
/*     */   public static final String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
/*     */   public static final String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
/*     */   public static final String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
/*     */   public static final String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
/*     */   public static final String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
/*     */   public static final String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";
/*     */   public static final String ACTION_POWER_USAGE_SUMMARY = "android.intent.action.POWER_USAGE_SUMMARY";
/*     */   public static final String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
/*     */   public static final String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
/*     */   public static final String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";
/*     */   public static final String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
/*     */   public static final String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
/*     */   public static final String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
/*     */   public static final String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
/*     */   public static final String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
/*     */   public static final String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
/*     */   public static final String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
/*     */   public static final String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
/*     */   public static final String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";
/*     */   public static final String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
/*     */   public static final String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
/*     */   public static final String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
/*     */   public static final String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";
/*     */   public static final String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
/*     */   public static final String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
/*     */   public static final String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
/*     */   public static final String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
/*     */   public static final String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
/*     */   public static final String ACTION_LOCALE_CHANGED = "android.intent.action.LOCALE_CHANGED";
/*     */   public static final String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
/*     */   public static final String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
/*     */   public static final String ACTION_BATTERY_OKAY = "android.intent.action.BATTERY_OKAY";
/*     */   public static final String ACTION_POWER_CONNECTED = "android.intent.action.ACTION_POWER_CONNECTED";
/*     */   public static final String ACTION_POWER_DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";
/*     */   public static final String ACTION_SHUTDOWN = "android.intent.action.ACTION_SHUTDOWN";
/*     */   public static final String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
/*     */   public static final String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
/*     */   public static final String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
/*     */   public static final String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
/*     */   public static final String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
/*     */   public static final String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
/*     */   public static final String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
/*     */   public static final String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";
/*     */   public static final String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";
/*     */   public static final String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
/*     */   public static final String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
/*     */   public static final String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
/*     */   public static final String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
/*     */   public static final String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
/*     */   public static final String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
/*     */   public static final String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
/*     */   public static final String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
/*     */   public static final String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
/*     */   public static final String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
/*     */   public static final String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
/*     */   public static final String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
/*     */   public static final String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";
/*     */   public static final String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
/*     */   public static final String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
/*     */   public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
/*     */   public static final String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
/*     */   public static final String ACTION_REBOOT = "android.intent.action.REBOOT";
/*     */   public static final String ACTION_DOCK_EVENT = "android.intent.action.DOCK_EVENT";
/*     */   public static final String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
/*     */   public static final String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
/*     */   public static final String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
/*     */   public static final String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
/*     */   public static final String CATEGORY_TAB = "android.intent.category.TAB";
/*     */   public static final String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
/*     */   public static final String CATEGORY_INFO = "android.intent.category.INFO";
/*     */   public static final String CATEGORY_HOME = "android.intent.category.HOME";
/*     */   public static final String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
/*     */   public static final String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
/*     */   public static final String CATEGORY_EMBED = "android.intent.category.EMBED";
/*     */   public static final String CATEGORY_APP_MARKET = "android.intent.category.APP_MARKET";
/*     */   public static final String CATEGORY_MONKEY = "android.intent.category.MONKEY";
/*     */   public static final String CATEGORY_TEST = "android.intent.category.TEST";
/*     */   public static final String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
/*     */   public static final String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
/*     */   public static final String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
/*     */   public static final String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
/*     */   public static final String CATEGORY_CAR_DOCK = "android.intent.category.CAR_DOCK";
/*     */   public static final String CATEGORY_DESK_DOCK = "android.intent.category.DESK_DOCK";
/*     */   public static final String CATEGORY_LE_DESK_DOCK = "android.intent.category.LE_DESK_DOCK";
/*     */   public static final String CATEGORY_HE_DESK_DOCK = "android.intent.category.HE_DESK_DOCK";
/*     */   public static final String CATEGORY_CAR_MODE = "android.intent.category.CAR_MODE";
/*     */   public static final String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
/*     */   public static final String EXTRA_TEXT = "android.intent.extra.TEXT";
/*     */   public static final String EXTRA_STREAM = "android.intent.extra.STREAM";
/*     */   public static final String EXTRA_EMAIL = "android.intent.extra.EMAIL";
/*     */   public static final String EXTRA_CC = "android.intent.extra.CC";
/*     */   public static final String EXTRA_BCC = "android.intent.extra.BCC";
/*     */   public static final String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
/*     */   public static final String EXTRA_INTENT = "android.intent.extra.INTENT";
/*     */   public static final String EXTRA_TITLE = "android.intent.extra.TITLE";
/*     */   public static final String EXTRA_INITIAL_INTENTS = "android.intent.extra.INITIAL_INTENTS";
/*     */   public static final String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
/*     */   public static final String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
/*     */   public static final String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
/*     */   public static final String EXTRA_UID = "android.intent.extra.UID";
/*     */   public static final String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";
/*     */   public static final String EXTRA_REPLACING = "android.intent.extra.REPLACING";
/*     */   public static final String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
/*     */   public static final String EXTRA_DOCK_STATE = "android.intent.extra.DOCK_STATE";
/*     */   public static final int EXTRA_DOCK_STATE_UNDOCKED = 0;
/*     */   public static final int EXTRA_DOCK_STATE_DESK = 1;
/*     */   public static final int EXTRA_DOCK_STATE_CAR = 2;
/*     */   public static final int EXTRA_DOCK_STATE_LE_DESK = 3;
/*     */   public static final int EXTRA_DOCK_STATE_HE_DESK = 4;
/*     */   public static final String METADATA_DOCK_HOME = "android.dock_home";
/*     */   public static final String EXTRA_REMOTE_INTENT_TOKEN = "android.intent.extra.remote_intent_token";
/*     */   public static final String EXTRA_CHANGED_COMPONENT_NAME = "android.intent.extra.changed_component_name";
/*     */   public static final String EXTRA_CHANGED_COMPONENT_NAME_LIST = "android.intent.extra.changed_component_name_list";
/*     */   public static final String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
/*     */   public static final String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
/*     */   public static final String EXTRA_LOCAL_ONLY = "android.intent.extra.LOCAL_ONLY";
/*     */   public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
/*     */   public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
/*     */   public static final int FLAG_FROM_BACKGROUND = 4;
/*     */   public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
/*     */   public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;
/*     */   public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;
/*     */   public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;
/*     */   public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;
/*     */   public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
/*     */   public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;
/*     */   public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;
/*     */   public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;
/*     */   public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;
/*     */   public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;
/*     */   public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;
/*     */   public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;
/*     */   public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;
/*     */   public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;
/*     */   public static final int FLAG_ACTIVITY_NO_ANIMATION = 65536;
/*     */   public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
/*     */   public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
/*     */   public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;
/*     */   public static final int FLAG_RECEIVER_REPLACE_PENDING = 536870912;
/*     */   public static final int URI_INTENT_SCHEME = 1;
/*     */   public static final int FILL_IN_ACTION = 1;
/*     */   public static final int FILL_IN_DATA = 2;
/*     */   public static final int FILL_IN_CATEGORIES = 4;
/*     */   public static final int FILL_IN_COMPONENT = 8;
/*     */   public static final int FILL_IN_PACKAGE = 16;
/*     */   public static final int FILL_IN_SOURCE_BOUNDS = 32;
/* 321 */   public static final Parcelable.Creator<Intent> CREATOR = null;
/*     */ 
/*     */   public Intent()
/*     */   {
/*  25 */     throw new RuntimeException("Stub!"); } 
/*  26 */   public Intent(Intent o) { throw new RuntimeException("Stub!"); } 
/*  27 */   public Intent(String action) { throw new RuntimeException("Stub!"); } 
/*  28 */   public Intent(String action, Uri uri) { throw new RuntimeException("Stub!"); } 
/*  29 */   public Intent(Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); } 
/*  30 */   public Intent(String action, Uri uri, Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); } 
/*  31 */   public static Intent createChooser(Intent target, CharSequence title) { throw new RuntimeException("Stub!"); } 
/*  32 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  33 */   public Intent cloneFilter() { throw new RuntimeException("Stub!"); } 
/*  34 */   public static Intent makeMainActivity(ComponentName mainActivity) { throw new RuntimeException("Stub!"); } 
/*  35 */   public static Intent makeRestartActivityTask(ComponentName mainActivity) { throw new RuntimeException("Stub!"); } 
/*  36 */   public static Intent getIntent(String uri) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  37 */   public static Intent parseUri(String uri, int flags) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  38 */   public static Intent getIntentOld(String uri) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  39 */   public String getAction() { throw new RuntimeException("Stub!"); } 
/*  40 */   public Uri getData() { throw new RuntimeException("Stub!"); } 
/*  41 */   public String getDataString() { throw new RuntimeException("Stub!"); } 
/*  42 */   public String getScheme() { throw new RuntimeException("Stub!"); } 
/*  43 */   public String getType() { throw new RuntimeException("Stub!"); } 
/*  44 */   public String resolveType(Context context) { throw new RuntimeException("Stub!"); } 
/*  45 */   public String resolveType(ContentResolver resolver) { throw new RuntimeException("Stub!"); } 
/*  46 */   public String resolveTypeIfNeeded(ContentResolver resolver) { throw new RuntimeException("Stub!"); } 
/*  47 */   public boolean hasCategory(String category) { throw new RuntimeException("Stub!"); } 
/*  48 */   public Set<String> getCategories() { throw new RuntimeException("Stub!"); } 
/*  49 */   public void setExtrasClassLoader(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  50 */   public boolean hasExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  51 */   public boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); } 
/*  52 */   public boolean getBooleanExtra(String name, boolean defaultValue) { throw new RuntimeException("Stub!"); } 
/*  53 */   public byte getByteExtra(String name, byte defaultValue) { throw new RuntimeException("Stub!"); } 
/*  54 */   public short getShortExtra(String name, short defaultValue) { throw new RuntimeException("Stub!"); } 
/*  55 */   public char getCharExtra(String name, char defaultValue) { throw new RuntimeException("Stub!"); } 
/*  56 */   public int getIntExtra(String name, int defaultValue) { throw new RuntimeException("Stub!"); } 
/*  57 */   public long getLongExtra(String name, long defaultValue) { throw new RuntimeException("Stub!"); } 
/*  58 */   public float getFloatExtra(String name, float defaultValue) { throw new RuntimeException("Stub!"); } 
/*  59 */   public double getDoubleExtra(String name, double defaultValue) { throw new RuntimeException("Stub!"); } 
/*  60 */   public String getStringExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  61 */   public CharSequence getCharSequenceExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  62 */   public <T extends Parcelable> T getParcelableExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  63 */   public Parcelable[] getParcelableArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  64 */   public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  65 */   public Serializable getSerializableExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  66 */   public ArrayList<Integer> getIntegerArrayListExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  67 */   public ArrayList<String> getStringArrayListExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  68 */   public ArrayList<CharSequence> getCharSequenceArrayListExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  69 */   public boolean[] getBooleanArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  70 */   public byte[] getByteArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  71 */   public short[] getShortArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  72 */   public char[] getCharArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  73 */   public int[] getIntArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  74 */   public long[] getLongArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  75 */   public float[] getFloatArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  76 */   public double[] getDoubleArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  77 */   public String[] getStringArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  78 */   public CharSequence[] getCharSequenceArrayExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  79 */   public Bundle getBundleExtra(String name) { throw new RuntimeException("Stub!"); } 
/*  80 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); } 
/*  81 */   public int getFlags() { throw new RuntimeException("Stub!"); } 
/*  82 */   public String getPackage() { throw new RuntimeException("Stub!"); } 
/*  83 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); } 
/*  84 */   public Rect getSourceBounds() { throw new RuntimeException("Stub!"); } 
/*  85 */   public ComponentName resolveActivity(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/*  86 */   public ActivityInfo resolveActivityInfo(PackageManager pm, int flags) { throw new RuntimeException("Stub!"); } 
/*  87 */   public Intent setAction(String action) { throw new RuntimeException("Stub!"); } 
/*  88 */   public Intent setData(Uri data) { throw new RuntimeException("Stub!"); } 
/*  89 */   public Intent setType(String type) { throw new RuntimeException("Stub!"); } 
/*  90 */   public Intent setDataAndType(Uri data, String type) { throw new RuntimeException("Stub!"); } 
/*  91 */   public Intent addCategory(String category) { throw new RuntimeException("Stub!"); } 
/*  92 */   public void removeCategory(String category) { throw new RuntimeException("Stub!"); } 
/*  93 */   public Intent putExtra(String name, boolean value) { throw new RuntimeException("Stub!"); } 
/*  94 */   public Intent putExtra(String name, byte value) { throw new RuntimeException("Stub!"); } 
/*  95 */   public Intent putExtra(String name, char value) { throw new RuntimeException("Stub!"); } 
/*  96 */   public Intent putExtra(String name, short value) { throw new RuntimeException("Stub!"); } 
/*  97 */   public Intent putExtra(String name, int value) { throw new RuntimeException("Stub!"); } 
/*  98 */   public Intent putExtra(String name, long value) { throw new RuntimeException("Stub!"); } 
/*  99 */   public Intent putExtra(String name, float value) { throw new RuntimeException("Stub!"); } 
/* 100 */   public Intent putExtra(String name, double value) { throw new RuntimeException("Stub!"); } 
/* 101 */   public Intent putExtra(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 102 */   public Intent putExtra(String name, CharSequence value) { throw new RuntimeException("Stub!"); } 
/* 103 */   public Intent putExtra(String name, Parcelable value) { throw new RuntimeException("Stub!"); } 
/* 104 */   public Intent putExtra(String name, Parcelable[] value) { throw new RuntimeException("Stub!"); } 
/* 105 */   public Intent putParcelableArrayListExtra(String name, ArrayList<? extends Parcelable> value) { throw new RuntimeException("Stub!"); } 
/* 106 */   public Intent putIntegerArrayListExtra(String name, ArrayList<Integer> value) { throw new RuntimeException("Stub!"); } 
/* 107 */   public Intent putStringArrayListExtra(String name, ArrayList<String> value) { throw new RuntimeException("Stub!"); } 
/* 108 */   public Intent putCharSequenceArrayListExtra(String name, ArrayList<CharSequence> value) { throw new RuntimeException("Stub!"); } 
/* 109 */   public Intent putExtra(String name, Serializable value) { throw new RuntimeException("Stub!"); } 
/* 110 */   public Intent putExtra(String name, boolean[] value) { throw new RuntimeException("Stub!"); } 
/* 111 */   public Intent putExtra(String name, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 112 */   public Intent putExtra(String name, short[] value) { throw new RuntimeException("Stub!"); } 
/* 113 */   public Intent putExtra(String name, char[] value) { throw new RuntimeException("Stub!"); } 
/* 114 */   public Intent putExtra(String name, int[] value) { throw new RuntimeException("Stub!"); } 
/* 115 */   public Intent putExtra(String name, long[] value) { throw new RuntimeException("Stub!"); } 
/* 116 */   public Intent putExtra(String name, float[] value) { throw new RuntimeException("Stub!"); } 
/* 117 */   public Intent putExtra(String name, double[] value) { throw new RuntimeException("Stub!"); } 
/* 118 */   public Intent putExtra(String name, String[] value) { throw new RuntimeException("Stub!"); } 
/* 119 */   public Intent putExtra(String name, CharSequence[] value) { throw new RuntimeException("Stub!"); } 
/* 120 */   public Intent putExtra(String name, Bundle value) { throw new RuntimeException("Stub!"); } 
/* 121 */   public Intent putExtras(Intent src) { throw new RuntimeException("Stub!"); } 
/* 122 */   public Intent putExtras(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 123 */   public Intent replaceExtras(Intent src) { throw new RuntimeException("Stub!"); } 
/* 124 */   public Intent replaceExtras(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 125 */   public void removeExtra(String name) { throw new RuntimeException("Stub!"); } 
/* 126 */   public Intent setFlags(int flags) { throw new RuntimeException("Stub!"); } 
/* 127 */   public Intent addFlags(int flags) { throw new RuntimeException("Stub!"); } 
/* 128 */   public Intent setPackage(String packageName) { throw new RuntimeException("Stub!"); } 
/* 129 */   public Intent setComponent(ComponentName component) { throw new RuntimeException("Stub!"); } 
/* 130 */   public Intent setClassName(Context packageContext, String className) { throw new RuntimeException("Stub!"); } 
/* 131 */   public Intent setClassName(String packageName, String className) { throw new RuntimeException("Stub!"); } 
/* 132 */   public Intent setClass(Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); } 
/* 133 */   public void setSourceBounds(Rect r) { throw new RuntimeException("Stub!"); } 
/* 134 */   public int fillIn(Intent other, int flags) { throw new RuntimeException("Stub!"); } 
/* 135 */   public boolean filterEquals(Intent other) { throw new RuntimeException("Stub!"); } 
/* 136 */   public int filterHashCode() { throw new RuntimeException("Stub!"); } 
/* 137 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 138 */   public String toURI() { throw new RuntimeException("Stub!"); } 
/* 139 */   public String toUri(int flags) { throw new RuntimeException("Stub!"); } 
/* 140 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 141 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 142 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); } 
/* 143 */   public static Intent parseIntent(Resources resources, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static final class FilterComparison
/*     */   {
/*     */     public FilterComparison(Intent intent)
/*     */     {
/*  20 */       throw new RuntimeException("Stub!"); } 
/*  21 */     public Intent getIntent() { throw new RuntimeException("Stub!"); } 
/*  22 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  23 */     public int hashCode() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class ShortcutIconResource
/*     */     implements Parcelable
/*     */   {
/*     */     public String packageName;
/*     */     public String resourceName;
/*  16 */     public static final Parcelable.Creator<ShortcutIconResource> CREATOR = null;
/*     */ 
/*     */     public ShortcutIconResource()
/*     */     {
/*   8 */       throw new RuntimeException("Stub!"); } 
/*   9 */     public static ShortcutIconResource fromContext(Context context, int resourceId) { throw new RuntimeException("Stub!"); } 
/*  10 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  11 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  12 */     public String toString() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.Intent
 * JD-Core Version:    0.6.0
 */