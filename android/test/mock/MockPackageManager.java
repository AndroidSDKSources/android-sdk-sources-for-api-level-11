/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.pm.ActivityInfo;
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.content.pm.FeatureInfo;
/*    */ import android.content.pm.InstrumentationInfo;
/*    */ import android.content.pm.PackageInfo;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.PackageManager.NameNotFoundException;
/*    */ import android.content.pm.PermissionGroupInfo;
/*    */ import android.content.pm.PermissionInfo;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import java.util.List;
/*    */ 
/*    */ public class MockPackageManager extends PackageManager
/*    */ {
/*    */   public MockPackageManager()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PackageInfo getPackageInfo(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   public String[] currentToCanonicalPackageNames(String[] names) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String[] canonicalToCurrentPackageNames(String[] names) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Intent getLaunchIntentForPackage(String packageName) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int[] getPackageGids(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 11 */   public PermissionInfo getPermissionInfo(String name, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 12 */   public List<PermissionInfo> queryPermissionsByGroup(String group, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 13 */   public PermissionGroupInfo getPermissionGroupInfo(String name, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 14 */   public List<PermissionGroupInfo> getAllPermissionGroups(int flags) { throw new RuntimeException("Stub!"); } 
/* 15 */   public ApplicationInfo getApplicationInfo(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 16 */   public ActivityInfo getActivityInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 17 */   public ActivityInfo getReceiverInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 18 */   public ServiceInfo getServiceInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 19 */   public ProviderInfo getProviderInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 20 */   public List<PackageInfo> getInstalledPackages(int flags) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int checkPermission(String permName, String pkgName) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean addPermission(PermissionInfo info) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean addPermissionAsync(PermissionInfo info) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void removePermission(String name) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int checkSignatures(String pkg1, String pkg2) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int checkSignatures(int uid1, int uid2) { throw new RuntimeException("Stub!"); } 
/* 27 */   public String[] getPackagesForUid(int uid) { throw new RuntimeException("Stub!"); } 
/* 28 */   public String getNameForUid(int uid) { throw new RuntimeException("Stub!"); } 
/* 29 */   public List<ApplicationInfo> getInstalledApplications(int flags) { throw new RuntimeException("Stub!"); } 
/* 30 */   public ResolveInfo resolveActivity(Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 31 */   public List<ResolveInfo> queryIntentActivities(Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 32 */   public List<ResolveInfo> queryIntentActivityOptions(ComponentName caller, Intent[] specifics, Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 33 */   public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 34 */   public ResolveInfo resolveService(Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 35 */   public List<ResolveInfo> queryIntentServices(Intent intent, int flags) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ProviderInfo resolveContentProvider(String name, int flags) { throw new RuntimeException("Stub!"); } 
/* 37 */   public List<ProviderInfo> queryContentProviders(String processName, int uid, int flags) { throw new RuntimeException("Stub!"); } 
/* 38 */   public InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 39 */   public List<InstrumentationInfo> queryInstrumentation(String targetPackage, int flags) { throw new RuntimeException("Stub!"); } 
/* 40 */   public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); } 
/* 41 */   public Drawable getActivityIcon(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 42 */   public Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 43 */   public Drawable getDefaultActivityIcon() { throw new RuntimeException("Stub!"); } 
/* 44 */   public Drawable getApplicationIcon(ApplicationInfo info) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Drawable getApplicationIcon(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 46 */   public Drawable getActivityLogo(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 47 */   public Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 48 */   public Drawable getApplicationLogo(ApplicationInfo info) { throw new RuntimeException("Stub!"); } 
/* 49 */   public Drawable getApplicationLogo(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 50 */   public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); } 
/* 51 */   public XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); } 
/* 52 */   public CharSequence getApplicationLabel(ApplicationInfo info) { throw new RuntimeException("Stub!"); } 
/* 53 */   public Resources getResourcesForActivity(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 54 */   public Resources getResourcesForApplication(ApplicationInfo app) { throw new RuntimeException("Stub!"); } 
/* 55 */   public Resources getResourcesForApplication(String appPackageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 56 */   public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void setInstallerPackageName(String targetPackage, String installerPackageName) { throw new RuntimeException("Stub!"); } 
/* 58 */   public String getInstallerPackageName(String packageName) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void addPackageToPreferred(String packageName) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void removePackageFromPreferred(String packageName) { throw new RuntimeException("Stub!"); } 
/* 61 */   public List<PackageInfo> getPreferredPackages(int flags) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) { throw new RuntimeException("Stub!"); } 
/* 63 */   public int getComponentEnabledSetting(ComponentName componentName) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setApplicationEnabledSetting(String packageName, int newState, int flags) { throw new RuntimeException("Stub!"); } 
/* 65 */   public int getApplicationEnabledSetting(String packageName) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void addPreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void clearPackagePreferredActivities(String packageName) { throw new RuntimeException("Stub!"); } 
/* 68 */   public int getPreferredActivities(List<IntentFilter> outFilters, List<ComponentName> outActivities, String packageName) { throw new RuntimeException("Stub!"); } 
/* 69 */   public String[] getSystemSharedLibraryNames() { throw new RuntimeException("Stub!"); } 
/* 70 */   public FeatureInfo[] getSystemAvailableFeatures() { throw new RuntimeException("Stub!"); } 
/* 71 */   public boolean hasSystemFeature(String name) { throw new RuntimeException("Stub!"); } 
/* 72 */   public boolean isSafeMode() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockPackageManager
 * JD-Core Version:    0.6.0
 */