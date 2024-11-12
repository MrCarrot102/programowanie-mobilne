package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.WordViewBinding;

import java.util.ArrayList;

public class WordListAdapter extends RecyclerView.Adapter<WordListViewHolder> {

    private ArrayList<String> wordList;

    public WordListAdapter(ArrayList<String> wordList){
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public WordListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WordListViewHolder(WordViewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull WordListViewHolder holder, int position) {
        String currentItem = wordList.get(position);
        holder.bind(currentItem);
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }
}
