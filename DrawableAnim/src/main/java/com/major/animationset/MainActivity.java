package com.major.animationset;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ExpandingCircleAnimationDrawable mCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.image);
        mCircle = new ExpandingCircleAnimationDrawable(100);
        iv.setImageDrawable(mCircle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCircle.start();
    }

    @Override
    protected void onPause() {
        mCircle.stop();
        super.onPause();
    }
}
