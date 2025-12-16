package com.synapse.core.bases.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivityWithVM<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    private var _binding: VB? = null
    protected val binding: VB
        get() = _binding ?: throw IllegalStateException(
            "Binding cannot be accessed before onCreate() or after onDestroy()"
        )

    protected abstract val viewModel: VM

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

