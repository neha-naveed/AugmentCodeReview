package com.synapse.core.bases.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private var _binding: VB? = null
    protected val binding: VB
        get() = _binding ?: throw IllegalStateException(
            "Binding cannot be accessed before onCreate() or after onDestroy()"
        )

    abstract fun getViewBinding(): VB
    abstract fun setupViews()
    abstract fun observeData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        setContentView(binding.root)
        setupViews()
        observeData()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

