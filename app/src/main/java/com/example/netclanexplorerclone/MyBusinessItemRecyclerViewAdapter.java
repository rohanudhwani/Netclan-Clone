package com.example.netclanexplorerclone;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.netclanexplorerclone.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.netclanexplorerclone.databinding.FragmentBusinessItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyBusinessItemRecyclerViewAdapter extends RecyclerView.Adapter<MyBusinessItemRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public MyBusinessItemRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentBusinessItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String[] indianBusinessPeople = {"Rajesh Agarwal", "Neha Bajaj", "Vikram Chawla", "Sneha Dasgupta", "Amit Dutta", "Kavita Gupta", "Rahul Kapoor", "Mukesh Khanna", "Divya Kumar", "Rajiv Malhotra", "Suman Mehra", "Vijay Nair", "Priya Patel", "Sanjay Rajan", "Ritu Sharma", "Amit Singhania", "Naina Verma", "Alok Verma", "Anita Verma", "Amit Gupta", "Ritu Sharma", "Rahul Khanna", "Rakesh Agarwal", "Anu Bansal", "Vishal Chawla", "Rajeev Das", "Mukesh Dutta", "Ritu Ghosh", "Alok Gupta", "Neha Kapoor", "Sarika Khanna", "Vivek Kumar", "Mukesh Malhotra", "Rajiv Nair", "Sanjay Patel", "Divya Rajan", "Vijay Rajput", "Priya Sharma", "Alok Singh", "Neha Verma", "Rahul Agarwal", "Sneha Bajaj", "Vivek Chawla", "Sanjay Dasgupta", "Divya Dutta", "Rakesh Gupta", "Ritu Kapoor", "Vikram Khanna", "Alok Malhotra", "Naina Mehra", "Rahul Nair", "Rajeev Patel", "Mukesh Rajan", "Anita Sharma", "Sarika Verma", "Vivek Verma", "Priya Agarwal", "Neha Chawla", "Rahul Dasgupta", "Vikram Dutta", "Amit Ghosh", "Ritu Gupta", "Rakesh Kapoor", "Anu Khanna", "Vivek Malhotra", "Rajiv Nair", "Divya Patel", "Sanjay Rajan", "Vishal Rajput", "Amit Sharma", "Ritu Singh", "Alok Verma", "Sneha Verma", "Naina Verma", "Rakesh Agarwal", "Rajiv Bajaj", "Vivek Chawla", "Sanjay Das", "Divya Dutta", "Mukesh Gupta", "Ritu Kapoor", "Rahul Khanna", "Vikram Malhotra", "Amit Mehra", "Rakesh Nair", "Vijay Rajan", "Sarika Sharma", "Rajiv Singh", "Priya Verma", "Sanjay Verma", "Alok Agarwal", "Anita Chawla", "Vikram Dasgupta", "Sneha Gupta", "Mukesh Khanna", "Ritu Malhotra"};
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(indianBusinessPeople[Integer.parseInt(mValues.get(position).id)]);
        holder.mContentView.setText(mValues.get(position).content);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentBusinessItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}