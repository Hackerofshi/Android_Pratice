package com.github.vitaviva.hilt.ui.second

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.shixin.jetpack.hilt.di.qualifiers.ActivityScope
import com.shixin.jetpack.hilt.di.qualifiers.AppScope
import com.shixin.jetpack.hilt.repo.Repository
import com.shixin.rxjava.R

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

@AndroidEntryPoint
class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    private val TAG = this.javaClass.toString()

    @AppScope
    @Inject
    lateinit var appHash: String

    @ActivityScope
    @Inject
    lateinit var activityHash: String

    @Singleton
    @Inject
    lateinit var repository: Repository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.w(TAG, "app : $appHash")
        Log.w(TAG, "activity : $activityHash")
        Log.w(TAG, "repo : $repository")

    }
}
