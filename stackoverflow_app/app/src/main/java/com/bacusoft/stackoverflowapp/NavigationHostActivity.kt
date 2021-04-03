package com.bacusoft.stackoverflowapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.bacusoft.stackoverflowapp.databinding.NavigationHostActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NavigationHostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<NavigationHostActivityBinding>(this, R.layout.navigation_host_activity)
    }
}