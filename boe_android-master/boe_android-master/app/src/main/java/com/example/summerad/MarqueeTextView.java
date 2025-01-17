package com.example.summerad;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueeTextView extends androidx.appcompat.widget.AppCompatTextView {

    public MarqueeTextView(Context context) {
        super(context);
        initView(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        this.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.setSingleLine(true);
        this.setMarqueeRepeatLimit(-1);
    }

    //最关键的部分
    public boolean isFocused() {
        return true;
    }
}