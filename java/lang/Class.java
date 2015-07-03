/*    */ package java.lang;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedElement;
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.GenericDeclaration;
/*    */ import java.lang.reflect.Method;
/*    */ import java.lang.reflect.Type;
/*    */ import java.lang.reflect.TypeVariable;
/*    */ import java.net.URL;
/*    */ import java.security.ProtectionDomain;
/*    */ 
/*    */ public final class Class<T>
/*    */   implements Serializable, AnnotatedElement, GenericDeclaration, Type
/*    */ {
/*    */   Class()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Class<?> forName(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Class<?> forName(String className, boolean initializeBoolean, ClassLoader classLoader) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Class<?>[] getClasses() { throw new RuntimeException("Stub!"); } 
/*  9 */   public <A extends Annotation> A getAnnotation(Class<A> annotationClass) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getCanonicalName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?> getComponentType();
/*    */ 
/* 14 */   public Constructor<T> getConstructor(Class<?>[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Constructor<?>[] getConstructors() throws SecurityException { throw new RuntimeException("Stub!"); } 
/*    */   public native Annotation[] getDeclaredAnnotations();
/*    */ 
/* 17 */   public Class<?>[] getDeclaredClasses() throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 18 */   public Constructor<T> getDeclaredConstructor(Class<?>[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 19 */   public Constructor<?>[] getDeclaredConstructors() throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 20 */   public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 21 */   public Field[] getDeclaredFields() throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Method getDeclaredMethod(String name, Class<?>[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 23 */   public Method[] getDeclaredMethods() throws SecurityException { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?> getDeclaringClass();
/*    */ 
/*    */   public native Class<?> getEnclosingClass();
/*    */ 
/*    */   public native Constructor<?> getEnclosingConstructor();
/*    */ 
/*    */   public native Method getEnclosingMethod();
/*    */ 
/* 28 */   public T[] getEnumConstants() { throw new RuntimeException("Stub!"); } 
/* 29 */   public Field getField(String name) throws NoSuchFieldException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 30 */   public Field[] getFields() throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 31 */   public Type[] getGenericInterfaces() { throw new RuntimeException("Stub!"); } 
/* 32 */   public Type getGenericSuperclass() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<?>[] getInterfaces();
/*    */ 
/* 34 */   public Method getMethod(String name, Class<?>[] parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); } 
/* 35 */   public Method[] getMethods() throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getModifiers() { throw new RuntimeException("Stub!"); } 
/* 37 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 38 */   public String getSimpleName() { throw new RuntimeException("Stub!"); } 
/* 39 */   public ProtectionDomain getProtectionDomain() { throw new RuntimeException("Stub!"); } 
/* 40 */   public URL getResource(String resName) { throw new RuntimeException("Stub!"); } 
/* 41 */   public InputStream getResourceAsStream(String resName) { throw new RuntimeException("Stub!"); } 
/* 42 */   public Object[] getSigners() { throw new RuntimeException("Stub!"); } 
/*    */   public native Class<? super T> getSuperclass();
/*    */ 
/* 44 */   public synchronized TypeVariable<Class<T>>[] getTypeParameters() { throw new RuntimeException("Stub!"); } 
/* 45 */   public boolean isAnnotation() { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isAnonymousClass();
/*    */ 
/* 48 */   public boolean isArray() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isAssignableFrom(Class<?> paramClass);
/*    */ 
/* 50 */   public boolean isEnum() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isInstance(Object paramObject);
/*    */ 
/*    */   public native boolean isInterface();
/*    */ 
/* 53 */   public boolean isLocalClass() { throw new RuntimeException("Stub!"); } 
/* 54 */   public boolean isMemberClass() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isPrimitive();
/*    */ 
/* 56 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); } 
/* 57 */   public T newInstance() throws InstantiationException, IllegalAccessException { throw new RuntimeException("Stub!"); } 
/* 58 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 59 */   public Package getPackage() { throw new RuntimeException("Stub!"); } 
/*    */   public native boolean desiredAssertionStatus();
/*    */ 
/* 61 */   public <U> Class<? extends U> asSubclass(Class<U> clazz) { throw new RuntimeException("Stub!"); } 
/* 62 */   public T cast(Object obj) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Class
 * JD-Core Version:    0.6.0
 */