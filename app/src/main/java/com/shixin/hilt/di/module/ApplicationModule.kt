package com.shixin.hilt.di.module

import com.shixin.hilt.di.qualifiers.AppScope
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {
    @AppScope
    @Provides
    fun provide(): String {
        return hashCode().toString()
    }
}