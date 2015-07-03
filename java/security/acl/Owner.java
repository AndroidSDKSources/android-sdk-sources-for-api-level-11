package java.security.acl;

import java.security.Principal;

public abstract interface Owner
{
  public abstract boolean addOwner(Principal paramPrincipal1, Principal paramPrincipal2)
    throws NotOwnerException;

  public abstract boolean deleteOwner(Principal paramPrincipal1, Principal paramPrincipal2)
    throws NotOwnerException, LastOwnerException;

  public abstract boolean isOwner(Principal paramPrincipal);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.acl.Owner
 * JD-Core Version:    0.6.0
 */