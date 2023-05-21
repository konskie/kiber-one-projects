package com.nikolai.mlkitcameraapp.helpers

import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy

class ImageAnalizer: ImageAnalysis.Analyzer {
    override fun analyze(image: ImageProxy) {
        println("салам")

        image.close()
    }
}