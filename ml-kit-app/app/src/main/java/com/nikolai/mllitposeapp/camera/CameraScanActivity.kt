package com.nikolai.mllitposeapp.camera

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import com.nikolai.mllitposeapp.R

class CameraScanActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_scan_camera)
    }
}