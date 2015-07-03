package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

public abstract interface AclEntry extends Cloneable
{
  public abstract boolean setPrincipal(Principal paramPrincipal);

  public abstract Principal getPrincipal();

  public abstract void setNegativePermissions();

  public abstract boolean isNegative();

  public abstract boolean addPermission(Permission paramPermission);

  public abstract boolean removePermission(Permission paramPermission);

  public abstract boolean checkPermission(Permission paramPermission);

  public abstract Enumeration<Permission> permissions();

  public abstract String toString();

  public abstract Object clone();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.acl.AclEntry
 * JD-Core Version:    0.6.0
 */