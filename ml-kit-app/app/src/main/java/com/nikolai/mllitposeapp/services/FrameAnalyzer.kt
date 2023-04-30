package com.nikolai.mllitposeapp.services

import androidx.camera.core.ExperimentalGetImage
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.google.android.gms.tasks.Task
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.pose.Pose
import com.google.mlkit.vision.pose.PoseDetection
import com.google.mlkit.vision.pose.PoseLandmark
import com.google.mlkit.vision.pose.defaults.PoseDetectorOptions

@ExperimentalGetImage
class FrameAnalyzer: ImageAnalysis.Analyzer {

    private val options = PoseDetectorOptions.Builder()
        .setDetectorMode(PoseDetectorOptions.STREAM_MODE)
        .build()

    private val detector = PoseDetection.getClient(options)

    override fun analyze(image: ImageProxy) {
        val mediaImage = image.image
        if (mediaImage != null) {
            val imageForDetector = InputImage.fromMediaImage(mediaImage, image.imageInfo.rotationDegrees)
            val result: Task<Pose>  = detector.process(imageForDetector)
                .addOnSuccessListener { results ->
                    val leftShoulder = results.getPoseLandmark(PoseLandmark.LEFT_SHOULDER)
                    println(leftShoulder)
                    image.close()
                }
                .addOnFailureListener { e ->
                    println("Failed to detect : $e")
                    image.close()
                }
        }



    }
}