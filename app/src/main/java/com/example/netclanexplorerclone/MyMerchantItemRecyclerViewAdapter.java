package com.example.netclanexplorerclone;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.netclanexplorerclone.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.netclanexplorerclone.databinding.FragmentMerchantItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyMerchantItemRecyclerViewAdapter extends RecyclerView.Adapter<MyMerchantItemRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public MyMerchantItemRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentMerchantItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String[] indianMerchantNames = {"Ramesh Kumar", "Meena Gupta", "Rajesh Patel", "Shobha Singh", "Amit Shah", "Sunita Verma", "Rajendra Sharma", "Anita Gupta", "Vikram Chawla", "Deepak Jain", "Preeti Singh", "Mukesh Agarwal", "Asha Mehta", "Sanjay Kumar", "Neha Kapoor", "Suresh Shah", "Priya Patel", "Rajiv Verma", "Manoj Agrawal", "Anu Bansal", "Vishal Khanna", "Nandini Singh", "Rakesh Gupta", "Divya Sharma", "Alok Malhotra", "Naina Mehta", "Vivek Kumar", "Sarika Patel", "Vijay Rajan", "Ritu Singh", "Anil Agarwal", "Neha Gupta", "Rohit Patel", "Shalini Shah", "Amit Kumar", "Poonam Sharma", "Rajeev Verma", "Sunita Agrawal", "Vikas Chawla", "Shobha Das", "Rahul Patel", "Sneha Singh", "Mukesh Sharma", "Ramesh Jain", "Ritu Mehta", "Vikram Malhotra", "Rajesh Gupta", "Anjali Patel", "Deepak Singh", "Rashmi Shah", "Amit Verma", "Kavita Sharma", "Rakesh Kumar", "Meena Jain", "Rajendra Agrawal", "Anita Singh", "Vikram Chawla", "Sanjay Mehta", "Ritu Patel", "Sarika Verma", "Vivek Kumar", "Neha Singh", "Rajeev Shah", "Divya Sharma", "Alok Agrawal", "Naina Malhotra", "Ramesh Kumar", "Priya Jain", "Shobha Verma", "Amit Shah", "Sunita Singh", "Rajendra Patel", "Anita Gupta", "Vikram Chawla", "Deepak Jain", "Preeti Singh", "Mukesh Agarwal", "Asha Mehta", "Sanjay Kumar", "Neha Kapoor", "Suresh Shah", "Priya Patel", "Rajiv Verma", "Manoj Agrawal", "Anu Bansal", "Vishal Khanna", "Nandini Singh", "Rakesh Gupta", "Divya Sharma", "Alok Malhotra", "Naina Mehta", "Vivek Kumar", "Sarika Patel", "Vijay Rajan", "Ritu Singh", "Anil Agarwal", "Neha Gupta", "Rohit Patel", "Shalini Shah"};
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(indianMerchantNames[Integer.parseInt(mValues.get(position).id)]);
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

        public ViewHolder(FragmentMerchantItemBinding binding) {
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