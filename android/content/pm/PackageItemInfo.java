/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.util.Printer;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ public class PackageItemInfo
/*    */ {
/*    */   public String name;
/*    */   public String packageName;
/*    */   public int labelRes;
/*    */   public CharSequence nonLocalizedLabel;
/*    */   public int icon;
/*    */   public int logo;
/*    */   public Bundle metaData;
/*    */ 
/*    */   public PackageItemInfo()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public PackageItemInfo(PackageItemInfo orig) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected PackageItemInfo(Parcel source) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Drawable loadLogo(PackageManager pm) { throw new RuntimeException("Stub!"); } 
/* 16 */   public XmlResourceParser loadXmlMetaData(PackageManager pm, String name) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void dumpFront(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void dumpBack(Printer pw, String prefix) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class DisplayNameComparator
/*    */     implements Comparator<PackageItemInfo>
/*    */   {
/*    */     public DisplayNameComparator(PackageManager pm)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public final int compare(PackageItemInfo aa, PackageItemInfo ab) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.PackageItemInfo
 * JD-Core Version:    0.6.0
 */