/*     */ package android.provider;
/*     */ 
/*     */ import android.accounts.Account;
/*     */ import android.content.ContentProviderClient;
/*     */ import android.content.ContentProviderOperation;
/*     */ import android.content.ContentResolver;
/*     */ import android.content.Context;
/*     */ import android.content.EntityIterator;
/*     */ import android.content.res.Resources;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Rect;
/*     */ import android.net.Uri;
/*     */ import android.os.RemoteException;
/*     */ import android.util.Pair;
/*     */ import android.view.View;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ public final class ContactsContract
/*     */ {
/*     */   public static final String AUTHORITY = "com.android.contacts";
/* 677 */   public static final Uri AUTHORITY_URI = null;
/*     */   public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
/*     */   public static final String DIRECTORY_PARAM_KEY = "directory";
/*     */   public static final String LIMIT_PARAM_KEY = "limit";
/*     */ 
/*     */   public ContactsContract()
/*     */   {
/* 671 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static final class Intents
/*     */   {
/*     */     public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
/*     */     public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
/*     */     public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
/*     */     public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
/*     */     public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
/*     */ 
/*     */     public Intents()
/*     */     {
/* 662 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Insert
/*     */     {
/*     */       public static final String ACTION = "android.intent.action.INSERT";
/*     */       public static final String FULL_MODE = "full_mode";
/*     */       public static final String NAME = "name";
/*     */       public static final String PHONETIC_NAME = "phonetic_name";
/*     */       public static final String COMPANY = "company";
/*     */       public static final String JOB_TITLE = "job_title";
/*     */       public static final String NOTES = "notes";
/*     */       public static final String PHONE = "phone";
/*     */       public static final String PHONE_TYPE = "phone_type";
/*     */       public static final String PHONE_ISPRIMARY = "phone_isprimary";
/*     */       public static final String SECONDARY_PHONE = "secondary_phone";
/*     */       public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
/*     */       public static final String TERTIARY_PHONE = "tertiary_phone";
/*     */       public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
/*     */       public static final String EMAIL = "email";
/*     */       public static final String EMAIL_TYPE = "email_type";
/*     */       public static final String EMAIL_ISPRIMARY = "email_isprimary";
/*     */       public static final String SECONDARY_EMAIL = "secondary_email";
/*     */       public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
/*     */       public static final String TERTIARY_EMAIL = "tertiary_email";
/*     */       public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
/*     */       public static final String POSTAL = "postal";
/*     */       public static final String POSTAL_TYPE = "postal_type";
/*     */       public static final String POSTAL_ISPRIMARY = "postal_isprimary";
/*     */       public static final String IM_HANDLE = "im_handle";
/*     */       public static final String IM_PROTOCOL = "im_protocol";
/*     */       public static final String IM_ISPRIMARY = "im_isprimary";
/*     */       public static final String DATA = "data";
/*     */ 
/*     */       public Insert()
/*     */       {
/* 632 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class QuickContact
/*     */   {
/*     */     public static final int MODE_SMALL = 1;
/*     */     public static final int MODE_MEDIUM = 2;
/*     */     public static final int MODE_LARGE = 3;
/*     */ 
/*     */     public QuickContact()
/*     */     {
/* 621 */       throw new RuntimeException("Stub!"); } 
/* 622 */     public static void showQuickContact(Context context, View target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!"); } 
/* 623 */     public static void showQuickContact(Context context, Rect target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Settings
/*     */     implements ContactsContract.SettingsColumns
/*     */   {
/* 617 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";
/*     */ 
/*     */     Settings()
/*     */     {
/* 613 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface SettingsColumns
/*     */   {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String UNGROUPED_VISIBLE = "ungrouped_visible";
/*     */     public static final String ANY_UNSYNCED = "any_unsynced";
/*     */     public static final String UNGROUPED_COUNT = "summ_count";
/*     */     public static final String UNGROUPED_WITH_PHONES = "summ_phones";
/*     */   }
/*     */ 
/*     */   public static final class AggregationExceptions
/*     */     implements BaseColumns
/*     */   {
/* 598 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_AUTOMATIC = 0;
/*     */     public static final int TYPE_KEEP_TOGETHER = 1;
/*     */     public static final int TYPE_KEEP_SEPARATE = 2;
/*     */     public static final String RAW_CONTACT_ID1 = "raw_contact_id1";
/*     */     public static final String RAW_CONTACT_ID2 = "raw_contact_id2";
/*     */ 
/*     */     AggregationExceptions()
/*     */     {
/* 588 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Groups
/*     */     implements BaseColumns, ContactsContract.GroupsColumns, ContactsContract.SyncColumns
/*     */   {
/* 583 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_SUMMARY_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/group";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";
/*     */ 
/*     */     Groups()
/*     */     {
/* 577 */       throw new RuntimeException("Stub!"); } 
/* 578 */     public static EntityIterator newEntityIterator(Cursor cursor) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface GroupsColumns
/*     */   {
/*     */     public static final String TITLE = "title";
/*     */     public static final String NOTES = "notes";
/*     */     public static final String SYSTEM_ID = "system_id";
/*     */     public static final String SUMMARY_COUNT = "summ_count";
/*     */     public static final String SUMMARY_WITH_PHONES = "summ_phones";
/*     */     public static final String GROUP_VISIBLE = "group_visible";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String AUTO_ADD = "auto_add";
/*     */     public static final String FAVORITES = "favorites";
/*     */     public static final String GROUP_IS_READ_ONLY = "group_is_read_only";
/*     */   }
/*     */ 
/*     */   public static final class CommonDataKinds
/*     */   {
/*     */     CommonDataKinds()
/*     */     {
/* 558 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class SipAddress
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String SIP_ADDRESS = "data1";
/*     */ 
/*     */       SipAddress()
/*     */       {
/* 549 */         throw new RuntimeException("Stub!"); } 
/* 550 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 551 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Website
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
/*     */       public static final int TYPE_HOMEPAGE = 1;
/*     */       public static final int TYPE_BLOG = 2;
/*     */       public static final int TYPE_PROFILE = 3;
/*     */       public static final int TYPE_HOME = 4;
/*     */       public static final int TYPE_WORK = 5;
/*     */       public static final int TYPE_FTP = 6;
/*     */       public static final int TYPE_OTHER = 7;
/*     */       public static final String URL = "data1";
/*     */ 
/*     */       Website()
/*     */       {
/* 535 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class GroupMembership
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
/*     */       public static final String GROUP_ROW_ID = "data1";
/*     */       public static final String GROUP_SOURCE_ID = "group_sourceid";
/*     */ 
/*     */       GroupMembership()
/*     */       {
/* 527 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Note
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
/*     */       public static final String NOTE = "data1";
/*     */ 
/*     */       Note()
/*     */       {
/* 520 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Photo
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
/*     */       public static final String PHOTO = "data15";
/*     */ 
/*     */       Photo()
/*     */       {
/* 513 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Event
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
/*     */       public static final int TYPE_ANNIVERSARY = 1;
/*     */       public static final int TYPE_OTHER = 2;
/*     */       public static final int TYPE_BIRTHDAY = 3;
/*     */       public static final String START_DATE = "data1";
/*     */ 
/*     */       Event()
/*     */       {
/* 502 */         throw new RuntimeException("Stub!"); } 
/* 503 */       public static int getTypeResource(Integer type) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Relation
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
/*     */       public static final int TYPE_ASSISTANT = 1;
/*     */       public static final int TYPE_BROTHER = 2;
/*     */       public static final int TYPE_CHILD = 3;
/*     */       public static final int TYPE_DOMESTIC_PARTNER = 4;
/*     */       public static final int TYPE_FATHER = 5;
/*     */       public static final int TYPE_FRIEND = 6;
/*     */       public static final int TYPE_MANAGER = 7;
/*     */       public static final int TYPE_MOTHER = 8;
/*     */       public static final int TYPE_PARENT = 9;
/*     */       public static final int TYPE_PARTNER = 10;
/*     */       public static final int TYPE_REFERRED_BY = 11;
/*     */       public static final int TYPE_RELATIVE = 12;
/*     */       public static final int TYPE_SISTER = 13;
/*     */       public static final int TYPE_SPOUSE = 14;
/*     */       public static final String NAME = "data1";
/*     */ 
/*     */       Relation()
/*     */       {
/* 479 */         throw new RuntimeException("Stub!"); } 
/* 480 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 481 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Organization
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
/*     */       public static final int TYPE_WORK = 1;
/*     */       public static final int TYPE_OTHER = 2;
/*     */       public static final String COMPANY = "data1";
/*     */       public static final String TITLE = "data4";
/*     */       public static final String DEPARTMENT = "data5";
/*     */       public static final String JOB_DESCRIPTION = "data6";
/*     */       public static final String SYMBOL = "data7";
/*     */       public static final String PHONETIC_NAME = "data8";
/*     */       public static final String OFFICE_LOCATION = "data9";
/*     */ 
/*     */       Organization()
/*     */       {
/* 462 */         throw new RuntimeException("Stub!"); } 
/* 463 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 464 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Im
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String PROTOCOL = "data5";
/*     */       public static final String CUSTOM_PROTOCOL = "data6";
/*     */       public static final int PROTOCOL_CUSTOM = -1;
/*     */       public static final int PROTOCOL_AIM = 0;
/*     */       public static final int PROTOCOL_MSN = 1;
/*     */       public static final int PROTOCOL_YAHOO = 2;
/*     */       public static final int PROTOCOL_SKYPE = 3;
/*     */       public static final int PROTOCOL_QQ = 4;
/*     */       public static final int PROTOCOL_GOOGLE_TALK = 5;
/*     */       public static final int PROTOCOL_ICQ = 6;
/*     */       public static final int PROTOCOL_JABBER = 7;
/*     */       public static final int PROTOCOL_NETMEETING = 8;
/*     */ 
/*     */       Im()
/*     */       {
/* 437 */         throw new RuntimeException("Stub!"); } 
/* 438 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 439 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); } 
/* 440 */       public static final int getProtocolLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 441 */       public static final CharSequence getProtocolLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class StructuredPostal
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
/* 432 */       public static final Uri CONTENT_URI = null;
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final String FORMATTED_ADDRESS = "data1";
/*     */       public static final String STREET = "data4";
/*     */       public static final String POBOX = "data5";
/*     */       public static final String NEIGHBORHOOD = "data6";
/*     */       public static final String CITY = "data7";
/*     */       public static final String REGION = "data8";
/*     */       public static final String POSTCODE = "data9";
/*     */       public static final String COUNTRY = "data10";
/*     */ 
/*     */       StructuredPostal()
/*     */       {
/* 415 */         throw new RuntimeException("Stub!"); } 
/* 416 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 417 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Email
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";
/* 410 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_LOOKUP_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final String ADDRESS = "data1";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final int TYPE_MOBILE = 4;
/*     */       public static final String DISPLAY_NAME = "data4";
/*     */ 
/*     */       Email()
/*     */       {
/* 396 */         throw new RuntimeException("Stub!"); } 
/* 397 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 398 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Phone
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";
/* 391 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_MOBILE = 2;
/*     */       public static final int TYPE_WORK = 3;
/*     */       public static final int TYPE_FAX_WORK = 4;
/*     */       public static final int TYPE_FAX_HOME = 5;
/*     */       public static final int TYPE_PAGER = 6;
/*     */       public static final int TYPE_OTHER = 7;
/*     */       public static final int TYPE_CALLBACK = 8;
/*     */       public static final int TYPE_CAR = 9;
/*     */       public static final int TYPE_COMPANY_MAIN = 10;
/*     */       public static final int TYPE_ISDN = 11;
/*     */       public static final int TYPE_MAIN = 12;
/*     */       public static final int TYPE_OTHER_FAX = 13;
/*     */       public static final int TYPE_RADIO = 14;
/*     */       public static final int TYPE_TELEX = 15;
/*     */       public static final int TYPE_TTY_TDD = 16;
/*     */       public static final int TYPE_WORK_MOBILE = 17;
/*     */       public static final int TYPE_WORK_PAGER = 18;
/*     */       public static final int TYPE_ASSISTANT = 19;
/*     */       public static final int TYPE_MMS = 20;
/*     */       public static final String NUMBER = "data1";
/*     */ 
/*     */       Phone()
/*     */       {
/* 363 */         throw new RuntimeException("Stub!"); } 
/* 364 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); } 
/* 365 */       public static final CharSequence getTypeLabel(Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Nickname
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
/*     */       public static final int TYPE_DEFAULT = 1;
/*     */       public static final int TYPE_OTHER_NAME = 2;
/*     */       public static final int TYPE_MAIDEN_NAME = 3;
/*     */       public static final int TYPE_MAINDEN_NAME = 3;
/*     */       public static final int TYPE_SHORT_NAME = 4;
/*     */       public static final int TYPE_INITIALS = 5;
/*     */       public static final String NAME = "data1";
/*     */ 
/*     */       Nickname()
/*     */       {
/* 350 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class StructuredName
/*     */       implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
/*     */       public static final String DISPLAY_NAME = "data1";
/*     */       public static final String GIVEN_NAME = "data2";
/*     */       public static final String FAMILY_NAME = "data3";
/*     */       public static final String PREFIX = "data4";
/*     */       public static final String MIDDLE_NAME = "data5";
/*     */       public static final String SUFFIX = "data6";
/*     */       public static final String PHONETIC_GIVEN_NAME = "data7";
/*     */       public static final String PHONETIC_MIDDLE_NAME = "data8";
/*     */       public static final String PHONETIC_FAMILY_NAME = "data9";
/*     */ 
/*     */       StructuredName()
/*     */       {
/* 335 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     protected static abstract interface CommonColumns extends ContactsContract.CommonDataKinds.BaseTypes
/*     */     {
/*     */       public static final String DATA = "data1";
/*     */       public static final String TYPE = "data2";
/*     */       public static final String LABEL = "data3";
/*     */     }
/*     */ 
/*     */     public static abstract interface BaseTypes
/*     */     {
/*     */       public static final int TYPE_CUSTOM = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Presence extends ContactsContract.StatusUpdates
/*     */   {
/*     */     public Presence()
/*     */     {
/* 317 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class StatusUpdates
/*     */     implements ContactsContract.StatusColumns, ContactsContract.PresenceColumns
/*     */   {
/* 311 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
/*     */ 
/*     */     StatusUpdates()
/*     */     {
/* 305 */       throw new RuntimeException("Stub!"); } 
/* 306 */     public static final int getPresenceIconResourceId(int status) { throw new RuntimeException("Stub!"); } 
/* 307 */     public static final int getPresencePrecedence(int status) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface PresenceColumns
/*     */   {
/*     */     public static final String DATA_ID = "presence_data_id";
/*     */     public static final String PROTOCOL = "protocol";
/*     */     public static final String CUSTOM_PROTOCOL = "custom_protocol";
/*     */     public static final String IM_HANDLE = "im_handle";
/*     */     public static final String IM_ACCOUNT = "im_account";
/*     */   }
/*     */ 
/*     */   public static final class PhoneLookup
/*     */     implements BaseColumns, ContactsContract.PhoneLookupColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns
/*     */   {
/* 292 */     public static final Uri CONTENT_FILTER_URI = null;
/*     */ 
/*     */     PhoneLookup()
/*     */     {
/* 290 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface PhoneLookupColumns
/*     */   {
/*     */     public static final String NUMBER = "number";
/*     */     public static final String TYPE = "type";
/*     */     public static final String LABEL = "label";
/*     */   }
/*     */ 
/*     */   public static final class RawContactsEntity
/*     */     implements BaseColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns
/*     */   {
/* 279 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
/*     */     public static final String DATA_ID = "data_id";
/*     */ 
/*     */     RawContactsEntity()
/*     */     {
/* 275 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Data
/*     */     implements ContactsContract.DataColumnsWithJoins
/*     */   {
/* 270 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/data";
/*     */ 
/*     */     Data()
/*     */     {
/* 266 */       throw new RuntimeException("Stub!"); } 
/* 267 */     public static Uri getContactLookupUri(ContentResolver resolver, Uri dataUri) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface DataColumnsWithJoins extends BaseColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */   {
/*     */   }
/*     */ 
/*     */   protected static abstract interface DataColumns
/*     */   {
/*     */     public static final String MIMETYPE = "mimetype";
/*     */     public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */     public static final String IS_PRIMARY = "is_primary";
/*     */     public static final String IS_SUPER_PRIMARY = "is_super_primary";
/*     */     public static final String IS_READ_ONLY = "is_read_only";
/*     */     public static final String DATA_VERSION = "data_version";
/*     */     public static final String DATA1 = "data1";
/*     */     public static final String DATA2 = "data2";
/*     */     public static final String DATA3 = "data3";
/*     */     public static final String DATA4 = "data4";
/*     */     public static final String DATA5 = "data5";
/*     */     public static final String DATA6 = "data6";
/*     */     public static final String DATA7 = "data7";
/*     */     public static final String DATA8 = "data8";
/*     */     public static final String DATA9 = "data9";
/*     */     public static final String DATA10 = "data10";
/*     */     public static final String DATA11 = "data11";
/*     */     public static final String DATA12 = "data12";
/*     */     public static final String DATA13 = "data13";
/*     */     public static final String DATA14 = "data14";
/*     */     public static final String DATA15 = "data15";
/*     */     public static final String SYNC1 = "data_sync1";
/*     */     public static final String SYNC2 = "data_sync2";
/*     */     public static final String SYNC3 = "data_sync3";
/*     */     public static final String SYNC4 = "data_sync4";
/*     */   }
/*     */ 
/*     */   protected static abstract interface StatusColumns
/*     */   {
/*     */     public static final String PRESENCE = "mode";
/*     */     public static final String PRESENCE_STATUS = "mode";
/*     */     public static final int OFFLINE = 0;
/*     */     public static final int INVISIBLE = 1;
/*     */     public static final int AWAY = 2;
/*     */     public static final int IDLE = 3;
/*     */     public static final int DO_NOT_DISTURB = 4;
/*     */     public static final int AVAILABLE = 5;
/*     */     public static final String STATUS = "status";
/*     */     public static final String PRESENCE_CUSTOM_STATUS = "status";
/*     */     public static final String STATUS_TIMESTAMP = "status_ts";
/*     */     public static final String STATUS_RES_PACKAGE = "status_res_package";
/*     */     public static final String STATUS_LABEL = "status_label";
/*     */     public static final String STATUS_ICON = "status_icon";
/*     */     public static final String CHAT_CAPABILITY = "chat_capability";
/*     */     public static final int CAPABILITY_HAS_VOICE = 1;
/*     */     public static final int CAPABILITY_HAS_VIDEO = 2;
/*     */     public static final int CAPABILITY_HAS_CAMERA = 4;
/*     */   }
/*     */ 
/*     */   public static final class RawContacts
/*     */     implements BaseColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.SyncColumns
/*     */   {
/* 208 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";
/*     */     public static final int AGGREGATION_MODE_DEFAULT = 0;
/*     */     public static final int AGGREGATION_MODE_IMMEDIATE = 1;
/*     */     public static final int AGGREGATION_MODE_SUSPENDED = 2;
/*     */     public static final int AGGREGATION_MODE_DISABLED = 3;
/*     */ 
/*     */     RawContacts()
/*     */     {
/* 198 */       throw new RuntimeException("Stub!"); } 
/* 199 */     public static Uri getContactLookupUri(ContentResolver resolver, Uri rawContactUri) { throw new RuntimeException("Stub!"); } 
/* 200 */     public static EntityIterator newEntityIterator(Cursor cursor) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Entity
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "entity";
/*     */       public static final String DATA_ID = "data_id";
/*     */ 
/*     */       Entity()
/*     */       {
/* 194 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Data
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "data";
/*     */ 
/*     */       Data()
/*     */       {
/* 188 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface RawContactsColumns
/*     */   {
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */     public static final String AGGREGATION_MODE = "aggregation_mode";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";
/*     */   }
/*     */ 
/*     */   public static class Contacts
/*     */     implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactStatusColumns
/*     */   {
/* 173 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_LOOKUP_URI = null; public static final Uri CONTENT_VCARD_URI = null; public static final Uri CONTENT_FILTER_URI = null; public static final Uri CONTENT_STREQUENT_URI = null; public static final Uri CONTENT_STREQUENT_FILTER_URI = null; public static final Uri CONTENT_GROUP_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";
/*     */     public static final String CONTENT_VCARD_TYPE = "text/x-vcard";
/*     */ 
/*     */     Contacts()
/*     */     {
/* 157 */       throw new RuntimeException("Stub!"); } 
/* 158 */     public static Uri getLookupUri(ContentResolver resolver, Uri contactUri) { throw new RuntimeException("Stub!"); } 
/* 159 */     public static Uri getLookupUri(long contactId, String lookupKey) { throw new RuntimeException("Stub!"); } 
/* 160 */     public static Uri lookupContact(ContentResolver resolver, Uri lookupUri) { throw new RuntimeException("Stub!"); } 
/* 161 */     public static void markAsContacted(ContentResolver resolver, long contactId) { throw new RuntimeException("Stub!"); } 
/* 162 */     public static InputStream openContactPhotoInputStream(ContentResolver cr, Uri contactUri) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Photo
/*     */       implements BaseColumns, ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "photo";
/*     */       public static final String PHOTO = "data15";
/*     */ 
/*     */       Photo()
/*     */       {
/* 153 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class AggregationSuggestions
/*     */       implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "suggestions";
/*     */ 
/*     */       AggregationSuggestions()
/*     */       {
/* 147 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Entity
/*     */       implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.RawContactsColumns, ContactsContract.BaseSyncColumns, ContactsContract.SyncColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "entities";
/*     */       public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */       public static final String DATA_ID = "data_id";
/*     */ 
/*     */       Entity()
/*     */       {
/* 139 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Data
/*     */       implements BaseColumns, ContactsContract.DataColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "data";
/*     */ 
/*     */       Data()
/*     */       {
/* 133 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactNameColumns
/*     */   {
/*     */     public static final String DISPLAY_NAME_SOURCE = "display_name_source";
/*     */     public static final String DISPLAY_NAME_PRIMARY = "display_name";
/*     */     public static final String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";
/*     */     public static final String PHONETIC_NAME_STYLE = "phonetic_name_style";
/*     */     public static final String PHONETIC_NAME = "phonetic_name";
/*     */     public static final String SORT_KEY_PRIMARY = "sort_key";
/*     */     public static final String SORT_KEY_ALTERNATIVE = "sort_key_alt";
/*     */   }
/*     */ 
/*     */   public static abstract interface DisplayNameSources
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int EMAIL = 10;
/*     */     public static final int PHONE = 20;
/*     */     public static final int ORGANIZATION = 30;
/*     */     public static final int NICKNAME = 35;
/*     */     public static final int STRUCTURED_NAME = 40;
/*     */   }
/*     */ 
/*     */   public static abstract interface PhoneticNameStyle
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int PINYIN = 3;
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */   }
/*     */ 
/*     */   public static abstract interface FullNameStyle
/*     */   {
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int WESTERN = 1;
/*     */     public static final int CJK = 2;
/*     */     public static final int CHINESE = 3;
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactStatusColumns
/*     */   {
/*     */     public static final String CONTACT_PRESENCE = "contact_presence";
/*     */     public static final String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";
/*     */     public static final String CONTACT_STATUS = "contact_status";
/*     */     public static final String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
/*     */     public static final String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
/*     */     public static final String CONTACT_STATUS_LABEL = "contact_status_label";
/*     */     public static final String CONTACT_STATUS_ICON = "contact_status_icon";
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactsColumns
/*     */   {
/*     */     public static final String DISPLAY_NAME = "display_name";
/*     */     public static final String PHOTO_ID = "photo_id";
/*     */     public static final String PHOTO_URI = "photo_uri";
/*     */     public static final String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";
/*     */     public static final String IN_VISIBLE_GROUP = "in_visible_group";
/*     */     public static final String HAS_PHONE_NUMBER = "has_phone_number";
/*     */     public static final String LOOKUP_KEY = "lookup";
/*     */   }
/*     */ 
/*     */   protected static abstract interface ContactOptionsColumns
/*     */   {
/*     */     public static final String TIMES_CONTACTED = "times_contacted";
/*     */     public static final String LAST_TIME_CONTACTED = "last_time_contacted";
/*     */     public static final String STARRED = "starred";
/*     */     public static final String CUSTOM_RINGTONE = "custom_ringtone";
/*     */     public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
/*     */   }
/*     */ 
/*     */   protected static abstract interface SyncColumns extends ContactsContract.BaseSyncColumns
/*     */   {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String SOURCE_ID = "sourceid";
/*     */     public static final String VERSION = "version";
/*     */     public static final String DIRTY = "dirty";
/*     */   }
/*     */ 
/*     */   protected static abstract interface BaseSyncColumns
/*     */   {
/*     */     public static final String SYNC1 = "sync1";
/*     */     public static final String SYNC2 = "sync2";
/*     */     public static final String SYNC3 = "sync3";
/*     */     public static final String SYNC4 = "sync4";
/*     */   }
/*     */ 
/*     */   public static final class SyncState
/*     */     implements SyncStateContract.Columns
/*     */   {
/*     */     public static final String CONTENT_DIRECTORY = "syncstate";
/*  46 */     public static final Uri CONTENT_URI = null;
/*     */ 
/*     */     SyncState()
/*     */     {
/*  39 */       throw new RuntimeException("Stub!"); } 
/*  40 */     public static byte[] get(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  41 */     public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  42 */     public static void set(ContentProviderClient provider, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  43 */     public static ContentProviderOperation newSetOperation(Account account, byte[] data) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Directory
/*     */     implements BaseColumns
/*     */   {
/*  34 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";
/*     */     public static final long DEFAULT = 0L;
/*     */     public static final long LOCAL_INVISIBLE = 1L;
/*     */     public static final String PACKAGE_NAME = "packageName";
/*     */     public static final String TYPE_RESOURCE_ID = "typeResourceId";
/*     */     public static final String DISPLAY_NAME = "displayName";
/*     */     public static final String DIRECTORY_AUTHORITY = "authority";
/*     */     public static final String ACCOUNT_TYPE = "accountType";
/*     */     public static final String ACCOUNT_NAME = "accountName";
/*     */     public static final String EXPORT_SUPPORT = "exportSupport";
/*     */     public static final int EXPORT_SUPPORT_NONE = 0;
/*     */     public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;
/*     */     public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;
/*     */     public static final String SHORTCUT_SUPPORT = "shortcutSupport";
/*     */     public static final int SHORTCUT_SUPPORT_NONE = 0;
/*     */     public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;
/*     */     public static final int SHORTCUT_SUPPORT_FULL = 2;
/*     */     public static final String PHOTO_SUPPORT = "photoSupport";
/*     */     public static final int PHOTO_SUPPORT_NONE = 0;
/*     */     public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;
/*     */     public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;
/*     */     public static final int PHOTO_SUPPORT_FULL = 3;
/*     */ 
/*     */     Directory()
/*     */     {
/*   8 */       throw new RuntimeException("Stub!"); } 
/*   9 */     public static void notifyDirectoryChange(ContentResolver resolver) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.ContactsContract
 * JD-Core Version:    0.6.0
 */