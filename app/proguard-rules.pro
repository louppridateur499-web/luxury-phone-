# Legend Ultra UI ProGuard Rules

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider

-keep class com.legend.ultra.** { *; }
-keepclassmembers class com.legend.ultra.** { *; }

# TensorFlow Lite
-keep class org.tensorflow.** { *; }
-keep interface org.tensorflow.** { *; }

# Jetpack Compose
-keep class androidx.compose.** { *; }

# ML Kit
-keep class com.google.mlkit.** { *; }
-keep interface com.google.mlkit.** { *; }
