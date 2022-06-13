package cn.hx.plugin.junkcode.template

class ResTemplate {
    static final def TEMPLATE = '''<resources>
</resources>'''

    static final def DRAWABLE = ''' <vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:height="dimension(6145)"
    android:width="dimension(6145)"
    android:viewportWidth="1103101952.000000"
    android:viewportHeight="1103101952.000000">

    <path
        android:fillColor="argb8(0xff000000)"
        android:pathData="M20,3h-1L19,1h-2v2L7,3L7,1L5,1v2L4,3c-1.1,0 -2,0.9 -2,2v16c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,5c0,-1.1 -0.9,-2 -2,-2zM20,21L4,21L4,8h16v13z" />
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