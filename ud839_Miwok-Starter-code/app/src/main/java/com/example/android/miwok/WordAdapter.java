package com.example.android.miwok;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private ArrayList<Word> mWordList;

    public WordAdapter(Context context, ArrayList<Word> wordList) {
        super(context, R.layout.list_item, R.id.default_text_view, wordList);
        mWordList = wordList;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            }

        ((TextView) listItemView.findViewById(R.id.miwok_text_view))
                .setText(mWordList.get(position).getMiwokTranslation());
        ((TextView) listItemView.findViewById(R.id.default_text_view))
                .setText(mWordList.get(position).getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (mWordList.get(position).hasImage()) {
            imageView.setImageResource(mWordList.get(position).getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
