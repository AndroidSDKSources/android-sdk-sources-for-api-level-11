/*     */ package android.provider;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.BitmapFactory.Options;
/*     */ import android.net.Uri;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public final class MediaStore
/*     */ {
/*     */   public static final String AUTHORITY = "media";
/*     */   public static final String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";
/*     */   public static final String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";
/*     */   public static final String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
/*     */   public static final String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
/*     */   public static final String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
/*     */   public static final String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
/*     */   public static final String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
/*     */   public static final String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";
/*     */   public static final String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
/*     */   public static final String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";
/*     */   public static final String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
/*     */   public static final String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";
/*     */   public static final String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";
/*     */   public static final String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
/*     */   public static final String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
/*     */   public static final String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";
/*     */   public static final String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";
/*     */   public static final String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
/*     */   public static final String EXTRA_OUTPUT = "output";
/*     */   public static final String UNKNOWN_STRING = "<unknown>";
/*     */   public static final String MEDIA_SCANNER_VOLUME = "volume";
/*     */   public static final String MEDIA_IGNORE_FILENAME = ".nomedia";
/*     */ 
/*     */   public MediaStore()
/*     */   {
/* 303 */     throw new RuntimeException("Stub!"); } 
/* 304 */   public static Uri getMediaScannerUri() { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static final class Video
/*     */   {
/*     */     public static final String DEFAULT_SORT_ORDER = "_display_name";
/*     */ 
/*     */     public Video()
/*     */     {
/* 299 */       throw new RuntimeException("Stub!"); } 
/* 300 */     public static final Cursor query(ContentResolver cr, Uri uri, String[] projection) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static class Thumbnails
/*     */       implements BaseColumns
/*     */     {
/* 297 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String DEFAULT_SORT_ORDER = "video_id ASC";
/*     */       public static final String DATA = "_data";
/*     */       public static final String VIDEO_ID = "video_id";
/*     */       public static final String KIND = "kind";
/*     */       public static final int MINI_KIND = 1;
/*     */       public static final int FULL_SCREEN_KIND = 2;
/*     */       public static final int MICRO_KIND = 3;
/*     */       public static final String WIDTH = "width";
/*     */       public static final String HEIGHT = "height";
/*     */ 
/*     */       public Thumbnails()
/*     */       {
/* 280 */         throw new RuntimeException("Stub!"); } 
/* 281 */       public static void cancelThumbnailRequest(ContentResolver cr, long origId) { throw new RuntimeException("Stub!"); } 
/* 282 */       public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); } 
/* 283 */       public static Bitmap getThumbnail(ContentResolver cr, long origId, long groupId, int kind, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); } 
/* 284 */       public static void cancelThumbnailRequest(ContentResolver cr, long origId, long groupId) { throw new RuntimeException("Stub!"); } 
/* 285 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Media
/*     */       implements MediaStore.Video.VideoColumns
/*     */     {
/* 275 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/video";
/*     */       public static final String DEFAULT_SORT_ORDER = "title";
/*     */ 
/*     */       public Media()
/*     */       {
/* 269 */         throw new RuntimeException("Stub!"); } 
/* 270 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface VideoColumns extends MediaStore.MediaColumns
/*     */     {
/*     */       public static final String DURATION = "duration";
/*     */       public static final String ARTIST = "artist";
/*     */       public static final String ALBUM = "album";
/*     */       public static final String RESOLUTION = "resolution";
/*     */       public static final String DESCRIPTION = "description";
/*     */       public static final String IS_PRIVATE = "isprivate";
/*     */       public static final String TAGS = "tags";
/*     */       public static final String CATEGORY = "category";
/*     */       public static final String LANGUAGE = "language";
/*     */       public static final String LATITUDE = "latitude";
/*     */       public static final String LONGITUDE = "longitude";
/*     */       public static final String DATE_TAKEN = "datetaken";
/*     */       public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
/*     */       public static final String BUCKET_ID = "bucket_id";
/*     */       public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
/*     */       public static final String BOOKMARK = "bookmark";
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Audio
/*     */   {
/*     */     public Audio()
/*     */     {
/* 241 */       throw new RuntimeException("Stub!"); } 
/* 242 */     public static String keyFor(String name) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static final class Albums
/*     */       implements BaseColumns, MediaStore.Audio.AlbumColumns
/*     */     {
/* 239 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
/*     */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
/*     */       public static final String DEFAULT_SORT_ORDER = "album_key";
/*     */ 
/*     */       public Albums()
/*     */       {
/* 232 */         throw new RuntimeException("Stub!"); } 
/* 233 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface AlbumColumns
/*     */     {
/*     */       public static final String ALBUM_ID = "album_id";
/*     */       public static final String ALBUM = "album";
/*     */       public static final String ARTIST = "artist";
/*     */       public static final String NUMBER_OF_SONGS = "numsongs";
/*     */       public static final String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
/*     */       public static final String FIRST_YEAR = "minyear";
/*     */       public static final String LAST_YEAR = "maxyear";
/*     */       public static final String ALBUM_KEY = "album_key";
/*     */       public static final String ALBUM_ART = "album_art";
/*     */     }
/*     */ 
/*     */     public static final class Artists
/*     */       implements BaseColumns, MediaStore.Audio.ArtistColumns
/*     */     {
/* 215 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
/*     */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
/*     */       public static final String DEFAULT_SORT_ORDER = "artist_key";
/*     */ 
/*     */       public Artists()
/*     */       {
/* 208 */         throw new RuntimeException("Stub!"); } 
/* 209 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */       public static final class Albums
/*     */         implements MediaStore.Audio.AlbumColumns
/*     */       {
/*     */         public Albums()
/*     */         {
/* 205 */           throw new RuntimeException("Stub!"); } 
/* 206 */         public static final Uri getContentUri(String volumeName, long artistId) { throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface ArtistColumns
/*     */     {
/*     */       public static final String ARTIST = "artist";
/*     */       public static final String ARTIST_KEY = "artist_key";
/*     */       public static final String NUMBER_OF_ALBUMS = "number_of_albums";
/*     */       public static final String NUMBER_OF_TRACKS = "number_of_tracks";
/*     */     }
/*     */ 
/*     */     public static final class Playlists
/*     */       implements BaseColumns, MediaStore.Audio.PlaylistsColumns
/*     */     {
/* 190 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
/*     */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
/*     */       public static final String DEFAULT_SORT_ORDER = "name";
/*     */ 
/*     */       public Playlists()
/*     */       {
/* 183 */         throw new RuntimeException("Stub!"); } 
/* 184 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */       public static final class Members
/*     */         implements MediaStore.Audio.AudioColumns
/*     */       {
/*     */         public static final String _ID = "_id";
/*     */         public static final String CONTENT_DIRECTORY = "members";
/*     */         public static final String AUDIO_ID = "audio_id";
/*     */         public static final String PLAYLIST_ID = "playlist_id";
/*     */         public static final String PLAY_ORDER = "play_order";
/*     */         public static final String DEFAULT_SORT_ORDER = "play_order";
/*     */ 
/*     */         public Members()
/*     */         {
/* 173 */           throw new RuntimeException("Stub!"); } 
/* 174 */         public static final Uri getContentUri(String volumeName, long playlistId) { throw new RuntimeException("Stub!"); } 
/* 175 */         public static final boolean moveItem(ContentResolver res, long playlistId, int from, int to) { throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface PlaylistsColumns
/*     */     {
/*     */       public static final String NAME = "name";
/*     */       public static final String DATA = "_data";
/*     */       public static final String DATE_ADDED = "date_added";
/*     */       public static final String DATE_MODIFIED = "date_modified";
/*     */     }
/*     */ 
/*     */     public static final class Genres
/*     */       implements BaseColumns, MediaStore.Audio.GenresColumns
/*     */     {
/* 158 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
/*     */       public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
/*     */       public static final String DEFAULT_SORT_ORDER = "name";
/*     */ 
/*     */       public Genres()
/*     */       {
/* 150 */         throw new RuntimeException("Stub!"); } 
/* 151 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!"); } 
/* 152 */       public static Uri getContentUriForAudioId(String volumeName, int audioId) { throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */       public static final class Members
/*     */         implements MediaStore.Audio.AudioColumns
/*     */       {
/*     */         public static final String CONTENT_DIRECTORY = "members";
/*     */         public static final String DEFAULT_SORT_ORDER = "title_key";
/*     */         public static final String AUDIO_ID = "audio_id";
/*     */         public static final String GENRE_ID = "genre_id";
/*     */ 
/*     */         public Members()
/*     */         {
/* 143 */           throw new RuntimeException("Stub!"); } 
/* 144 */         public static final Uri getContentUri(String volumeName, long genreId) { throw new RuntimeException("Stub!");
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface GenresColumns
/*     */     {
/*     */       public static final String NAME = "name";
/*     */     }
/*     */ 
/*     */     public static final class Media
/*     */       implements MediaStore.Audio.AudioColumns
/*     */     {
/* 131 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
/*     */       public static final String DEFAULT_SORT_ORDER = "title_key";
/*     */       public static final String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
/*     */       public static final String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
/*     */ 
/*     */       public Media()
/*     */       {
/* 122 */         throw new RuntimeException("Stub!"); } 
/* 123 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!"); } 
/* 124 */       public static Uri getContentUriForPath(String path) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface AudioColumns extends MediaStore.MediaColumns
/*     */     {
/*     */       public static final String TITLE_KEY = "title_key";
/*     */       public static final String DURATION = "duration";
/*     */       public static final String BOOKMARK = "bookmark";
/*     */       public static final String ARTIST_ID = "artist_id";
/*     */       public static final String ARTIST = "artist";
/*     */       public static final String ARTIST_KEY = "artist_key";
/*     */       public static final String COMPOSER = "composer";
/*     */       public static final String ALBUM_ID = "album_id";
/*     */       public static final String ALBUM = "album";
/*     */       public static final String ALBUM_KEY = "album_key";
/*     */       public static final String ALBUM_ART = "album_art";
/*     */       public static final String TRACK = "track";
/*     */       public static final String YEAR = "year";
/*     */       public static final String IS_MUSIC = "is_music";
/*     */       public static final String IS_PODCAST = "is_podcast";
/*     */       public static final String IS_RINGTONE = "is_ringtone";
/*     */       public static final String IS_ALARM = "is_alarm";
/*     */       public static final String IS_NOTIFICATION = "is_notification";
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Images
/*     */   {
/*     */     public Images()
/*     */     {
/*  93 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static class Thumbnails
/*     */       implements BaseColumns
/*     */     {
/*  91 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String DEFAULT_SORT_ORDER = "image_id ASC";
/*     */       public static final String DATA = "_data";
/*     */       public static final String IMAGE_ID = "image_id";
/*     */       public static final String KIND = "kind";
/*     */       public static final int MINI_KIND = 1;
/*     */       public static final int FULL_SCREEN_KIND = 2;
/*     */       public static final int MICRO_KIND = 3;
/*     */       public static final String THUMB_DATA = "thumb_data";
/*     */       public static final String WIDTH = "width";
/*     */       public static final String HEIGHT = "height";
/*     */ 
/*     */       public Thumbnails()
/*     */       {
/*  70 */         throw new RuntimeException("Stub!"); } 
/*  71 */       public static final Cursor query(ContentResolver cr, Uri uri, String[] projection) { throw new RuntimeException("Stub!"); } 
/*  72 */       public static final Cursor queryMiniThumbnails(ContentResolver cr, Uri uri, int kind, String[] projection) { throw new RuntimeException("Stub!"); } 
/*  73 */       public static final Cursor queryMiniThumbnail(ContentResolver cr, long origId, int kind, String[] projection) { throw new RuntimeException("Stub!"); } 
/*  74 */       public static void cancelThumbnailRequest(ContentResolver cr, long origId) { throw new RuntimeException("Stub!"); } 
/*  75 */       public static Bitmap getThumbnail(ContentResolver cr, long origId, int kind, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); } 
/*  76 */       public static void cancelThumbnailRequest(ContentResolver cr, long origId, long groupId) { throw new RuntimeException("Stub!"); } 
/*  77 */       public static Bitmap getThumbnail(ContentResolver cr, long origId, long groupId, int kind, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); } 
/*  78 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static final class Media
/*     */       implements MediaStore.Images.ImageColumns
/*     */     {
/*  65 */       public static final Uri INTERNAL_CONTENT_URI = null; public static final Uri EXTERNAL_CONTENT_URI = null;
/*     */       public static final String CONTENT_TYPE = "vnd.android.cursor.dir/image";
/*     */       public static final String DEFAULT_SORT_ORDER = "bucket_display_name";
/*     */ 
/*     */       public Media()
/*     */       {
/*  53 */         throw new RuntimeException("Stub!"); } 
/*  54 */       public static final Cursor query(ContentResolver cr, Uri uri, String[] projection) { throw new RuntimeException("Stub!"); } 
/*  55 */       public static final Cursor query(ContentResolver cr, Uri uri, String[] projection, String where, String orderBy) { throw new RuntimeException("Stub!"); } 
/*  56 */       public static final Cursor query(ContentResolver cr, Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) { throw new RuntimeException("Stub!"); } 
/*  57 */       public static final Bitmap getBitmap(ContentResolver cr, Uri url) throws FileNotFoundException, IOException { throw new RuntimeException("Stub!"); } 
/*  58 */       public static final String insertImage(ContentResolver cr, String imagePath, String name, String description) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  59 */       public static final String insertImage(ContentResolver cr, Bitmap source, String title, String description) { throw new RuntimeException("Stub!"); } 
/*  60 */       public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     public static abstract interface ImageColumns extends MediaStore.MediaColumns
/*     */     {
/*     */       public static final String DESCRIPTION = "description";
/*     */       public static final String PICASA_ID = "picasa_id";
/*     */       public static final String IS_PRIVATE = "isprivate";
/*     */       public static final String LATITUDE = "latitude";
/*     */       public static final String LONGITUDE = "longitude";
/*     */       public static final String DATE_TAKEN = "datetaken";
/*     */       public static final String ORIENTATION = "orientation";
/*     */       public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
/*     */       public static final String BUCKET_ID = "bucket_id";
/*     */       public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
/*     */     }
/*     */   }
/*     */ 
/*     */   public static final class Files
/*     */   {
/*     */     public Files()
/*     */     {
/*  30 */       throw new RuntimeException("Stub!"); } 
/*  31 */     public static Uri getContentUri(String volumeName) { throw new RuntimeException("Stub!"); } 
/*  32 */     public static final Uri getContentUri(String volumeName, long rowId) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     public static abstract interface FileColumns extends MediaStore.MediaColumns
/*     */     {
/*     */       public static final String PARENT = "parent";
/*     */       public static final String MIME_TYPE = "mime_type";
/*     */       public static final String TITLE = "title";
/*     */       public static final String MEDIA_TYPE = "media_type";
/*     */       public static final int MEDIA_TYPE_NONE = 0;
/*     */       public static final int MEDIA_TYPE_IMAGE = 1;
/*     */       public static final int MEDIA_TYPE_AUDIO = 2;
/*     */       public static final int MEDIA_TYPE_VIDEO = 3;
/*     */       public static final int MEDIA_TYPE_PLAYLIST = 4;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface MediaColumns extends BaseColumns
/*     */   {
/*     */     public static final String DATA = "_data";
/*     */     public static final String SIZE = "_size";
/*     */     public static final String DISPLAY_NAME = "_display_name";
/*     */     public static final String TITLE = "title";
/*     */     public static final String DATE_ADDED = "date_added";
/*     */     public static final String DATE_MODIFIED = "date_modified";
/*     */     public static final String MIME_TYPE = "mime_type";
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.MediaStore
 * JD-Core Version:    0.6.0
 */