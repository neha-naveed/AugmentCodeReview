package com.synapse.app.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.synapse.app.databinding.ActivitySplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupSplashDelay()
    }

    private fun setupSplashDelay() {
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToOnboarding()
        }, SPLASH_DELAY)
    }

    private fun navigateToOnboarding() {
        // TODO: Navigate to OnboardingActivity when implemented
        // startActivity(Intent(this, OnboardingActivity::class.java))
        // finish()
        
        // For now, just finish the activity
        finish()
    }

    companion object {
        private const val SPLASH_DELAY = 2000L // 2 seconds
    }
}

