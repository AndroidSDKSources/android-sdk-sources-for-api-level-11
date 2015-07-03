/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class AnimationDrawable extends DrawableContainer
/*    */   implements Runnable, Animatable
/*    */ {
/*    */   public AnimationDrawable()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void start() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void stop() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isRunning() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void run() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void unscheduleSelf(Runnable what) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getNumberOfFrames() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Drawable getFrame(int index) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getDuration(int i) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isOneShot() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setOneShot(boolean oneShot) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void addFrame(Drawable frame, int duration) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public Drawable mutate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.AnimationDrawable
 * JD-Core Version:    0.6.0
 */