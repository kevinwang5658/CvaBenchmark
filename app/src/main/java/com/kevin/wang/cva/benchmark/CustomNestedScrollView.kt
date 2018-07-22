package com.kevin.wang.cva.benchmark

import android.content.Context
import android.util.AttributeSet
import androidx.core.widget.NestedScrollView
import com.kevin.wang.cva.annotations.CustomView

@CustomView
class CustomNestedScrollView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : NestedScrollView(context, attrs, defStyleAttr) {}