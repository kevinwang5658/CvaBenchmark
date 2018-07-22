package com.kevin.wang.cva.benchmark

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.kevin.wang.cva.annotations.CustomView

@CustomView
class CustomLinearLayout @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
}