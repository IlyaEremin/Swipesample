package com.ilyaeremin.swipesample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;

import static com.daimajia.swipe.SwipeLayout.*;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private TextView    textView;

    private boolean trueFalse;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(R.id.swipe_layout);
        swipeLayout.setShowMode(ShowMode.PullOut);
        // what is alternative for setDragEdge?
        swipeLayout.setDragEdge(DragEdge.Left);

        textView = (TextView) view.findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                trueFalse = !trueFalse;
                textView.setText(String.valueOf(trueFalse));
                //compound drawable cause closing swipeLayout
            }
        });
    }
}
