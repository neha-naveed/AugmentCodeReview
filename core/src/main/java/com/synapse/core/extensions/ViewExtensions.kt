package com.synapse.core.extensions

import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.isVisible(): Boolean = visibility == View.VISIBLE

fun View.isInvisible(): Boolean = visibility == View.INVISIBLE

fun View.isGone(): Boolean = visibility == View.GONE

