package cn.hx.plugin.junkcode.template

class ResTemplate {
    static final def TEMPLATE = '''<resources>
</resources>'''

    static final def DRAWABLE = ''' <vector 
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="28dp"
    android:height="28dp"
    android:tint="#C20000"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M18.7,12.4c-0.28,-0.16 -0.57,-0.29 -0.86,-0.4 0.29,-0.11 0.58,-0.24 0.86,-0.4 1.92,-1.11 2.99,-3.12 3,-5.19 -1.79,-1.03 -4.07,-1.11 -6,0 -0.28,0.16 -0.54,0.35 -0.78,0.54 0.05,-0.31 0.08,-0.63 0.08,-0.95 0,-2.22 -1.21,-4.15 -3,-5.19C10.21,1.85 9,3.78 9,6c0,0.32 0.03,0.64 0.08,0.95 -0.24,-0.2 -0.5,-0.39 -0.78,-0.55 -1.92,-1.11 -4.2,-1.03 -6,0 0,2.07 1.07,4.08 3,5.19 0.28,0.16 0.57,0.29 0.86,0.4 -0.29,0.11 -0.58,0.24 -0.86,0.4 -1.92,1.11 -2.99,3.12 -3,5.19 1.79,1.03 4.07,1.11 6,0 0.28,-0.16 0.54,-0.35 0.78,-0.54 -0.05,0.32 -0.08,0.64 -0.08,0.96 0,2.22 1.21,4.15 3,5.19 1.79,-1.04 3,-2.97 3,-5.19 0,-0.32 -0.03,-0.64 -0.08,-0.95 0.24,0.2 0.5,0.38 0.78,0.54 1.92,1.11 4.2,1.03 6,0 -0.01,-2.07 -1.08,-4.08 -3,-5.19zM12,16c-2.21,0 -4,-1.79 -4,-4s1.79,-4 4,-4 4,1.79 4,4 -1.79,4 -4,4z" />
</vector>'''


    static final def STRING_NODE = '''    <string name="${stringName}">${stringValue}</string>'''


    static final def LAYOUT_TEMPLATE = '''<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <Button
        android:id="@+id/btn_${id}"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center" />

    <TextView
        android:id="@+id/tv_${id}"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center" />
</LinearLayout>'''
}