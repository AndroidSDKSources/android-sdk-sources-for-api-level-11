/*    */ package android.content.res;
/*    */ 
/*    */ import android.graphics.Movie;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import android.util.TypedValue;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class Resources
/*    */ {
/*    */   public Resources(AssetManager assets, DisplayMetrics metrics, Configuration config)
/*    */   {
/* 22 */     throw new RuntimeException("Stub!"); } 
/* 23 */   public static Resources getSystem() { throw new RuntimeException("Stub!"); } 
/* 24 */   public CharSequence getText(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 25 */   public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getString(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getString(int id, Object[] formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 28 */   public String getQuantityString(int id, int quantity, Object[] formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 29 */   public String getQuantityString(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 30 */   public CharSequence getText(int id, CharSequence def) { throw new RuntimeException("Stub!"); } 
/* 31 */   public CharSequence[] getTextArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 32 */   public String[] getStringArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 33 */   public int[] getIntArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 34 */   public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 35 */   public float getDimension(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getDimensionPixelOffset(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 37 */   public int getDimensionPixelSize(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 38 */   public float getFraction(int id, int base, int pbase) { throw new RuntimeException("Stub!"); } 
/* 39 */   public Drawable getDrawable(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 40 */   public Movie getMovie(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 41 */   public int getColor(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 42 */   public ColorStateList getColorStateList(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean getBoolean(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 44 */   public int getInteger(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 45 */   public XmlResourceParser getLayout(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 46 */   public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 47 */   public XmlResourceParser getXml(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 48 */   public InputStream openRawResource(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 49 */   public InputStream openRawResource(int id, TypedValue value) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 50 */   public AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 51 */   public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 52 */   public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 53 */   public final Theme newTheme() { throw new RuntimeException("Stub!"); } 
/* 54 */   public TypedArray obtainAttributes(AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void updateConfiguration(Configuration config, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/* 56 */   public DisplayMetrics getDisplayMetrics() { throw new RuntimeException("Stub!"); } 
/* 57 */   public Configuration getConfiguration() { throw new RuntimeException("Stub!"); } 
/* 58 */   public int getIdentifier(String name, String defType, String defPackage) { throw new RuntimeException("Stub!"); } 
/* 59 */   public String getResourceName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 60 */   public String getResourcePackageName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 61 */   public String getResourceTypeName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 62 */   public String getResourceEntryName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 63 */   public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 64 */   public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/* 65 */   public final AssetManager getAssets() { throw new RuntimeException("Stub!"); } 
/* 66 */   public final void flushLayoutCache() { throw new RuntimeException("Stub!"); } 
/* 67 */   public final void finishPreloading() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public final class Theme
/*    */   {
/*    */     Theme()
/*    */     {
/* 12 */       throw new RuntimeException("Stub!"); } 
/* 13 */     public void applyStyle(int resid, boolean force) { throw new RuntimeException("Stub!"); } 
/* 14 */     public void setTo(Theme other) { throw new RuntimeException("Stub!"); } 
/* 15 */     public TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); } 
/* 16 */     public TypedArray obtainStyledAttributes(int resid, int[] attrs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 17 */     public TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); } 
/* 18 */     public boolean resolveAttribute(int resid, TypedValue outValue, boolean resolveRefs) { throw new RuntimeException("Stub!"); } 
/* 19 */     public void dump(int priority, String tag, String prefix) { throw new RuntimeException("Stub!"); } 
/* 20 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class NotFoundException extends RuntimeException
/*    */   {
/*    */     public NotFoundException()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public NotFoundException(String name) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.res.Resources
 * JD-Core Version:    0.6.0
 */