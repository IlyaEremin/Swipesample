package com.ilyaeremin.swipesample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;

/**
 * Created by Ilya Eremin on 17.05.2015.
 */
public class CustomView extends FrameLayout implements CanDraw {

    private TextView  textView;
    private ImageView likeView;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    private void init() {
        SwipeLayout swipeLayout = (SwipeLayout) findViewById(R.id.swipe_layout);
        // what is alternative for setDragEdge?
        swipeLayout.setDragEdge(SwipeLayout.DragEdge.Right);
        swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);

        likeView = (ImageView) findViewById(R.id.like);

        textView = (TextView) findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

            }
        });
    }


    @Override public void draw(String string) {
        textView.setText(string);
    }
}
