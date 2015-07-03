/*    */ package java.util.prefs;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public abstract class Preferences
/*    */ {
/*    */   public static final int MAX_KEY_LENGTH = 80;
/*    */   public static final int MAX_NAME_LENGTH = 80;
/*    */   public static final int MAX_VALUE_LENGTH = 8192;
/*    */ 
/*    */   protected Preferences()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract String absolutePath();
/*    */ 
/*    */   public abstract String[] childrenNames() throws BackingStoreException;
/*    */ 
/*    */   public abstract void clear() throws BackingStoreException;
/*    */ 
/*    */   public abstract void exportNode(OutputStream paramOutputStream) throws IOException, BackingStoreException;
/*    */ 
/*    */   public abstract void exportSubtree(OutputStream paramOutputStream) throws IOException, BackingStoreException;
/*    */ 
/*    */   public abstract void flush() throws BackingStoreException;
/*    */ 
/*    */   public abstract String get(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract boolean getBoolean(String paramString, boolean paramBoolean);
/*    */ 
/*    */   public abstract byte[] getByteArray(String paramString, byte[] paramArrayOfByte);
/*    */ 
/*    */   public abstract double getDouble(String paramString, double paramDouble);
/*    */ 
/*    */   public abstract float getFloat(String paramString, float paramFloat);
/*    */ 
/*    */   public abstract int getInt(String paramString, int paramInt);
/*    */ 
/*    */   public abstract long getLong(String paramString, long paramLong);
/*    */ 
/* 18 */   public static void importPreferences(InputStream istream) throws InvalidPreferencesFormatException, IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isUserNode();
/*    */ 
/*    */   public abstract String[] keys() throws BackingStoreException;
/*    */ 
/*    */   public abstract String name();
/*    */ 
/*    */   public abstract Preferences node(String paramString);
/*    */ 
/*    */   public abstract boolean nodeExists(String paramString) throws BackingStoreException;
/*    */ 
/*    */   public abstract Preferences parent();
/*    */ 
/*    */   public abstract void put(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract void putBoolean(String paramString, boolean paramBoolean);
/*    */ 
/*    */   public abstract void putByteArray(String paramString, byte[] paramArrayOfByte);
/*    */ 
/*    */   public abstract void putDouble(String paramString, double paramDouble);
/*    */ 
/*    */   public abstract void putFloat(String paramString, float paramFloat);
/*    */ 
/*    */   public abstract void putInt(String paramString, int paramInt);
/*    */ 
/*    */   public abstract void putLong(String paramString, long paramLong);
/*    */ 
/*    */   public abstract void remove(String paramString);
/*    */ 
/*    */   public abstract void removeNode() throws BackingStoreException;
/*    */ 
/*    */   public abstract void addNodeChangeListener(NodeChangeListener paramNodeChangeListener);
/*    */ 
/*    */   public abstract void addPreferenceChangeListener(PreferenceChangeListener paramPreferenceChangeListener);
/*    */ 
/*    */   public abstract void removeNodeChangeListener(NodeChangeListener paramNodeChangeListener);
/*    */ 
/*    */   public abstract void removePreferenceChangeListener(PreferenceChangeListener paramPreferenceChangeListener);
/*    */ 
/*    */   public abstract void sync() throws BackingStoreException;
/*    */ 
/* 39 */   public static Preferences systemNodeForPackage(Class<?> c) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static Preferences systemRoot() { throw new RuntimeException("Stub!"); } 
/* 41 */   public static Preferences userNodeForPackage(Class<?> c) { throw new RuntimeException("Stub!"); } 
/* 42 */   public static Preferences userRoot() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract String toString();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.Preferences
 * JD-Core Version:    0.6.0
 */