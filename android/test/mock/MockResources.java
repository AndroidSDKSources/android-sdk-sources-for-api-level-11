/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.content.res.AssetManager;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Configuration;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.content.res.TypedArray;
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.Movie;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import android.util.TypedValue;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class MockResources extends Resources
/*    */ {
/*    */   public MockResources()
/*    */   {
/*  5 */     super((AssetManager)null, (DisplayMetrics)null, (Configuration)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public void updateConfiguration(Configuration config, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/*  7 */   public CharSequence getText(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getString(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getString(int id, Object[] formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getQuantityString(int id, int quantity, Object[] formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getQuantityString(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence getText(int id, CharSequence def) { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence[] getTextArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public String[] getStringArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 16 */   public int[] getIntArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 17 */   public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 18 */   public float getDimension(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getDimensionPixelOffset(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getDimensionPixelSize(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 21 */   public Drawable getDrawable(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Movie getMovie(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getColor(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 24 */   public ColorStateList getColorStateList(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getInteger(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 26 */   public XmlResourceParser getLayout(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 27 */   public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 28 */   public XmlResourceParser getXml(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 29 */   public InputStream openRawResource(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 30 */   public AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 31 */   public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 32 */   public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 33 */   public TypedArray obtainAttributes(AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); } 
/* 34 */   public DisplayMetrics getDisplayMetrics() { throw new RuntimeException("Stub!"); } 
/* 35 */   public Configuration getConfiguration() { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getIdentifier(String name, String defType, String defPackage) { throw new RuntimeException("Stub!"); } 
/* 37 */   public String getResourceName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 38 */   public String getResourcePackageName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 39 */   public String getResourceTypeName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 40 */   public String getResourceEntryName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockResources
 * JD-Core Version:    0.6.0
 */