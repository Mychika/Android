package dev.android;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ZoomControls;

public class Map extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

    }

    @Override
    protected void onStart() {
        super.onStart();

        ZoomControls zoom = (ZoomControls) findViewById(R.id.zoomControls);
        final ImageView img = (ImageView) findViewById(R.id.imageView);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX((float) (x + 1));
                img.setScaleY((float) (y + 1));
            }
        });

        zoom.setOnZoomOutClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX((float) (x - 1));
                img.setScaleY((float) (y - 1));
            }
        });
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                float dY = -300;
                float dX = -300;
                switch (event.getActionMasked()) {

                    case MotionEvent.ACTION_DOWN:

                        dX = view.getX() - event.getRawX();
                        dY = view.getY() - event.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:

                        view.animate()
                                .x(event.getRawX() + dX)
                                .y(event.getRawY() + dY)
                                .setDuration(5)
                                .start();
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }
}

