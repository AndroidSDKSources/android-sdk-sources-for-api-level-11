/*    */ package java.util.prefs;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public abstract class AbstractPreferences extends Preferences
/*    */ {
/*    */   protected final Object lock;
/*    */   protected boolean newNode;
/*    */ 
/*    */   protected AbstractPreferences(AbstractPreferences parent, String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected final AbstractPreferences[] cachedChildren() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected AbstractPreferences getChild(String name) throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean isRemoved() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void flushSpi() throws BackingStoreException;
/*    */ 
/*    */   protected abstract String[] childrenNamesSpi() throws BackingStoreException;
/*    */ 
/*    */   protected abstract AbstractPreferences childSpi(String paramString);
/*    */ 
/*    */   protected abstract void putSpi(String paramString1, String paramString2);
/*    */ 
/*    */   protected abstract String getSpi(String paramString);
/*    */ 
/*    */   protected abstract String[] keysSpi() throws BackingStoreException;
/*    */ 
/*    */   protected abstract void removeNodeSpi() throws BackingStoreException;
/*    */ 
/*    */   protected abstract void removeSpi(String paramString);
/*    */ 
/*    */   protected abstract void syncSpi() throws BackingStoreException;
/*    */ 
/* 18 */   public String absolutePath() { throw new RuntimeException("Stub!"); } 
/* 19 */   public String[] childrenNames() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void clear() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void exportNode(OutputStream ostream) throws IOException, BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void exportSubtree(OutputStream ostream) throws IOException, BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 23 */   public void flush() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 24 */   public String get(String key, String deflt) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean getBoolean(String key, boolean deflt) { throw new RuntimeException("Stub!"); } 
/* 26 */   public byte[] getByteArray(String key, byte[] deflt) { throw new RuntimeException("Stub!"); } 
/* 27 */   public double getDouble(String key, double deflt) { throw new RuntimeException("Stub!"); } 
/* 28 */   public float getFloat(String key, float deflt) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getInt(String key, int deflt) { throw new RuntimeException("Stub!"); } 
/* 30 */   public long getLong(String key, long deflt) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean isUserNode() { throw new RuntimeException("Stub!"); } 
/* 32 */   public String[] keys() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 33 */   public String name() { throw new RuntimeException("Stub!"); } 
/* 34 */   public Preferences node(String name) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean nodeExists(String name) throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 36 */   public Preferences parent() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void put(String key, String value) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void putBoolean(String key, boolean value) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void putByteArray(String key, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void putDouble(String key, double value) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void putFloat(String key, float value) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void putInt(String key, int value) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void putLong(String key, long value) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void remove(String key) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void removeNode() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 46 */   public void addNodeChangeListener(NodeChangeListener ncl) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void addPreferenceChangeListener(PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void removeNodeChangeListener(NodeChangeListener ncl) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void removePreferenceChangeListener(PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void sync() throws BackingStoreException { throw new RuntimeException("Stub!"); } 
/* 51 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.AbstractPreferences
 * JD-Core Version:    0.6.0
 */