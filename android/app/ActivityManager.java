/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Intent;
/*     */ import android.content.pm.ConfigurationInfo;
/*     */ import android.graphics.Bitmap;
/*     */ import android.os.Debug.MemoryInfo;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ActivityManager
/*     */ {
/*     */   public static final int RECENT_WITH_EXCLUDED = 1;
/*     */   public static final int RECENT_IGNORE_UNAVAILABLE = 2;
/*     */   public static final int MOVE_TASK_WITH_HOME = 1;
/*     */ 
/*     */   ActivityManager()
/*     */   {
/* 127 */     throw new RuntimeException("Stub!"); } 
/* 128 */   public int getMemoryClass() { throw new RuntimeException("Stub!"); } 
/* 129 */   public int getLargeMemoryClass() { throw new RuntimeException("Stub!"); } 
/* 130 */   public List<RecentTaskInfo> getRecentTasks(int maxNum, int flags) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 131 */   public List<RunningTaskInfo> getRunningTasks(int maxNum) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 132 */   public void moveTaskToFront(int taskId, int flags) { throw new RuntimeException("Stub!"); } 
/* 133 */   public List<RunningServiceInfo> getRunningServices(int maxNum) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 134 */   public PendingIntent getRunningServiceControlPanel(ComponentName service) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 135 */   public void getMemoryInfo(MemoryInfo outInfo) { throw new RuntimeException("Stub!"); } 
/* 136 */   public List<ProcessErrorStateInfo> getProcessesInErrorState() { throw new RuntimeException("Stub!"); } 
/* 137 */   public List<RunningAppProcessInfo> getRunningAppProcesses() { throw new RuntimeException("Stub!"); } 
/* 138 */   public Debug.MemoryInfo[] getProcessMemoryInfo(int[] pids) { throw new RuntimeException("Stub!"); } 
/* 139 */   public void restartPackage(String packageName) { throw new RuntimeException("Stub!"); } 
/* 140 */   public void killBackgroundProcesses(String packageName) { throw new RuntimeException("Stub!"); } 
/* 141 */   public ConfigurationInfo getDeviceConfigurationInfo() { throw new RuntimeException("Stub!"); } 
/* 142 */   public int getLauncherLargeIconDensity() { throw new RuntimeException("Stub!"); } 
/* 143 */   public int getLauncherLargeIconSize() { throw new RuntimeException("Stub!"); } 
/* 144 */   public static boolean isUserAMonkey() { throw new RuntimeException("Stub!"); } 
/* 145 */   public static boolean isRunningInTestHarness() { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static class RunningAppProcessInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public String processName;
/*     */     public int pid;
/*     */     public int uid;
/* 109 */     public String[] pkgList = null;
/*     */     public static final int IMPORTANCE_FOREGROUND = 100;
/*     */     public static final int IMPORTANCE_VISIBLE = 200;
/*     */     public static final int IMPORTANCE_PERCEPTIBLE = 130;
/*     */     public static final int IMPORTANCE_SERVICE = 300;
/*     */     public static final int IMPORTANCE_BACKGROUND = 400;
/*     */     public static final int IMPORTANCE_EMPTY = 500;
/*     */     public int importance;
/*     */     public int lru;
/*     */     public static final int REASON_UNKNOWN = 0;
/*     */     public static final int REASON_PROVIDER_IN_USE = 1;
/*     */     public static final int REASON_SERVICE_IN_USE = 2;
/*     */     public int importanceReasonCode;
/*     */     public int importanceReasonPid;
/*     */     public ComponentName importanceReasonComponent;
/* 125 */     public static final Parcelable.Creator<RunningAppProcessInfo> CREATOR = null;
/*     */ 
/*     */     public RunningAppProcessInfo()
/*     */     {
/* 101 */       throw new RuntimeException("Stub!"); } 
/* 102 */     public RunningAppProcessInfo(String pProcessName, int pPid, String[] pArr) { throw new RuntimeException("Stub!"); } 
/* 103 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 104 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 105 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class ProcessErrorStateInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public static final int NO_ERROR = 0;
/*     */     public static final int CRASHED = 1;
/*     */     public static final int NOT_RESPONDING = 2;
/*     */     public int condition;
/*     */     public String processName;
/*     */     public int pid;
/*     */     public int uid;
/*     */     public String tag;
/*     */     public String shortMsg;
/*     */     public String longMsg;
/*     */     public String stackTrace;
/*  94 */     public byte[] crashData = null;
/*     */ 
/*  96 */     public static final Parcelable.Creator<ProcessErrorStateInfo> CREATOR = null;
/*     */ 
/*     */     public ProcessErrorStateInfo()
/*     */     {
/*  79 */       throw new RuntimeException("Stub!"); } 
/*  80 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  81 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  82 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class MemoryInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public long availMem;
/*     */     public long threshold;
/*     */     public boolean lowMemory;
/*  74 */     public static final Parcelable.Creator<MemoryInfo> CREATOR = null;
/*     */ 
/*     */     public MemoryInfo()
/*     */     {
/*  66 */       throw new RuntimeException("Stub!"); } 
/*  67 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  68 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  69 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class RunningServiceInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public ComponentName service;
/*     */     public int pid;
/*     */     public int uid;
/*     */     public String process;
/*     */     public boolean foreground;
/*     */     public long activeSince;
/*     */     public boolean started;
/*     */     public int clientCount;
/*     */     public int crashCount;
/*     */     public long lastActivityTime;
/*     */     public long restarting;
/*     */     public static final int FLAG_STARTED = 1;
/*     */     public static final int FLAG_FOREGROUND = 2;
/*     */     public static final int FLAG_SYSTEM_PROCESS = 4;
/*     */     public static final int FLAG_PERSISTENT_PROCESS = 8;
/*     */     public int flags;
/*     */     public String clientPackage;
/*     */     public int clientLabel;
/*  61 */     public static final Parcelable.Creator<RunningServiceInfo> CREATOR = null;
/*     */ 
/*     */     public RunningServiceInfo()
/*     */     {
/*  38 */       throw new RuntimeException("Stub!"); } 
/*  39 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  40 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  41 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class RunningTaskInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public int id;
/*     */     public ComponentName baseActivity;
/*     */     public ComponentName topActivity;
/*     */     public Bitmap thumbnail;
/*     */     public CharSequence description;
/*     */     public int numActivities;
/*     */     public int numRunning;
/*  33 */     public static final Parcelable.Creator<RunningTaskInfo> CREATOR = null;
/*     */ 
/*     */     public RunningTaskInfo()
/*     */     {
/*  21 */       throw new RuntimeException("Stub!"); } 
/*  22 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*  23 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  24 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class RecentTaskInfo
/*     */     implements Parcelable
/*     */   {
/*     */     public int id;
/*     */     public Intent baseIntent;
/*     */     public ComponentName origActivity;
/*     */     public CharSequence description;
/*  16 */     public static final Parcelable.Creator<RecentTaskInfo> CREATOR = null;
/*     */ 
/*     */     public RecentTaskInfo()
/*     */     {
/*   7 */       throw new RuntimeException("Stub!"); } 
/*   8 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/*   9 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/*  10 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.ActivityManager
 * JD-Core Version:    0.6.0
 */