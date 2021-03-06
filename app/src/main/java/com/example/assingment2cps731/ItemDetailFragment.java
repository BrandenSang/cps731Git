package com.example.assingment2cps731;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.assingment2cps731.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem.id.equals("Recipe 1")) {
            rootView = inflater.inflate(R.layout.recipe1, container, false);
            ((TextView) rootView.findViewById(R.id.recipe1)).setText(mItem.details);
        }
        if (mItem.id.equals("Recipe 2")) {
            rootView = inflater.inflate(R.layout.recipe2, container, false);
            ((TextView) rootView.findViewById(R.id.recipe2)).setText(mItem.details);
        }
        if (mItem.id.equals("Recipe 3")) {
            rootView = inflater.inflate(R.layout.recipe3, container, false);
            ((TextView) rootView.findViewById(R.id.recipe3)).setText(mItem.details);
        }
        if (mItem.id.equals("Recipe 4")) {
            rootView = inflater.inflate(R.layout.recipe4, container, false);
            ((TextView) rootView.findViewById(R.id.recipe4)).setText(mItem.details);
        }
        if (mItem.id.equals("Recipe 5")) {
            rootView = inflater.inflate(R.layout.recipe5, container, false);
            ((TextView) rootView.findViewById(R.id.recipe5)).setText(mItem.details);
        }




        return rootView;
    }
}