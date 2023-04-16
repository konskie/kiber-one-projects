package com.nikolai.quizappevenying.modules

import androidx.core.content.pm.PermissionInfoCompat.Protection
import com.nikolai.quizappevenying.helpers.DataManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class AppModule {
    @Provides
    @ActivityScoped
    fun createDataManager():DataManager {
        return DataManager()
    }
}