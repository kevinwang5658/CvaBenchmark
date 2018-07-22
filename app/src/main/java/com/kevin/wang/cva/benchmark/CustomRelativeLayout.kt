package com.kevin.wang.cva.benchmark

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.kevin.wang.cva.annotations.CustomView

@CustomView
class CustomRelativeLayout @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {
}