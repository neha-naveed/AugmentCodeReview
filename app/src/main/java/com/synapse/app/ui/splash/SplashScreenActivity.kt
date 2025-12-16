package com.synapse.app.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.synapse.app.databinding.ActivitySplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val handler = Handler(Looper.getMainLooper())
    private val navigationRunnable = Runnable {
        navigateToOnboarding()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupSplashDelay()
    }

    private fun setupSplashDelay() {
        handler.postDelayed(navigationRunnable, SPLASH_DELAY)
    }

    private fun navigateToOnboarding() {
        // TODO: Navigate to OnboardingActivity when implemented
        // startActivity(Intent(this, OnboardingActivity::class.java))
        // finish()

        // For now, just finish the activity
        finish()
    }

    override fun onDestroy() {
        handler.removeCallbacks(navigationRunnable)
        super.onDestroy()
    }

    companion object {
        private const val SPLASH_DELAY = 2000L // 2 seconds
    }
}

