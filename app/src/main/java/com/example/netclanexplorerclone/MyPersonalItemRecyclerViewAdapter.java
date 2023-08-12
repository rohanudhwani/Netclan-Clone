package com.example.netclanexplorerclone;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.netclanexplorerclone.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.netclanexplorerclone.databinding.FragmentItemPersonalBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */



public class MyPersonalItemRecyclerViewAdapter extends RecyclerView.Adapter<MyPersonalItemRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public MyPersonalItemRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemPersonalBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String[] commonIndianNames = {"Ramesh Kumar", "Suresh Patel", "Manoj Sharma", "Amit Verma", "Sandeep Singh", "Ajay Gupta", "Vijay Yadav", "Rajesh Choudhary", "Sanjay Singhania", "Alok Jain", "Anil Kumar", "Prakash Mehta", "Narendra Desai", "Vinod Sharma", "Mukesh Gupta", "Dinesh Tiwari", "Rajendra Verma", "Sunil Yadav", "Ashok Shukla", "Arun Dubey", "Nitin Patel", "Rajiv Trivedi", "Rajeshwar Rao", "Sushil Kumar", "Deepak Chauhan", "Vivek Sharma", "Satish Kumar", "Amar Saxena", "Harish Choudhary", "Kamal Mehta", "Gaurav Singh", "Pankaj Sharma", "Rajeev Singh", "Naresh Gupta", "Rahul Verma", "Vikram Yadav", "Vijay Kumar", "Rakesh Singhania", "Anand Sharma", "Pradeep Patel", "Ashish Jain", "Alok Yadav", "Sanjeev Kumar", "Arvind Gupta", "Amit Yadav", "Ravi Verma", "Sudhir Sharma", "Rajendra Kumar", "Sandeep Verma", "Rajesh Yadav", "Sachin Patel", "Arun Kumar", "Anil Verma", "Mukesh Choudhary", "Vivek Singh", "Rahul Sharma", "Suresh Yadav", "Rajiv Kumar", "Ajay Singhania", "Vikas Sharma", "Amar Kumar", "Sunil Verma", "Deepak Yadav", "Vijay Gupta", "Anand Singh", "Pradeep Chauhan", "Narendra Patel", "Harish Yadav", "Alok Gupta", "Sanjay Choudhary", "Vinod Yadav", "Arun Verma", "Rajeev Sharma", "Satish Singh", "Gaurav Kumar", "Pankaj Yadav", "Naresh Sharma", "Rahul Yadav", "Ashish Verma", "Amit Choudhary", "Ravi Kumar", "Sudhir Yadav", "Rajendra Singh", "Sandeep Kumar", "Rajesh Kumar", "Sachin Singhania", "Arun Yadav", "Mukesh Kumar", "Vivek Verma", "Rahul Verma", "Suresh Singh", "Rajiv Singh", "Ajay Yadav", "Vikas Yadav", "Amar Singh", "Sunil Kumar", "Deepak Verma", "Vijay Singh", "Anand Yadav", "Pradeep Kumar", "Narendra Yadav"};
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(commonIndianNames[Integer.parseInt(mValues.get(position).id)]);
        holder.mContentView.setText("Hi community! We have great deals for you. Check us out!! " + (mValues.get(position).content));
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final TextView mContentView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentItemPersonalBinding binding) {
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