package com.example.por16002139.A1MobileTech;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.por16002139.lesson41.R;

import java.util.ArrayList;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {

    private Context mContext;
    private List<Course> mCourseDataset = new ArrayList<>();
    private List<Course> mCourseDatasetCopy = new ArrayList<>();

    // Provide a suitable constructor (depends on the kind of dataset passed in)

    public CourseAdapter(Context context, List<Course> CourseDataset) {
        mContext = context;
        mCourseDataset = CourseDataset;
        this.mCourseDatasetCopy.addAll(mCourseDataset);
    }

    // Create new views (invoked by the LayoutManager)

    @NonNull
    public CourseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_row, parent, false);
        return new CourseAdapter.ViewHolder(itemView);
    }

    // Replace the contents of the View (invoked by the LayoutManager)
    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.ViewHolder holder, int position) {
        // Get element from your dataset at this position
        // Replace the contents of the View with that element
        holder.mCourseImageView.setImageResource(R.drawable.bath_logo);
        holder.mCourseNameTextView.setText(mCourseDataset.get(position).getCourseName());
        holder.mCourseTypeTextView.setText(mCourseDataset.get(position).getCourseType());
    }

// Return the size of your dataset (invoked by the LayoutManager)
//listens from input from the search bar and checks array
    @Override
    public int getItemCount() {
        return mCourseDataset.size();}
        public void filter (String text){
            mCourseDataset.clear();
            if (text.isEmpty()) {
                mCourseDataset.addAll(mCourseDatasetCopy);//makes a copy of original array
            } else {
                text = text.toLowerCase();
                for (Course item : mCourseDatasetCopy) {//sets array accordingly to query input
                    if (item.getCourseName().toLowerCase().contains(text) || item.getCourseType().toLowerCase().contains(text)) {
                        mCourseDataset.add(item);
                    }
                }
            }
            notifyDataSetChanged();
        }


    // Provide a reference to the Views for each data item
    // Complex data items may need more than one View per item, and
    // you provide access to all the Views for a data item in a view holder

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // each data item is just a string in this case
        public ImageView mCourseImageView;
        public TextView mCourseNameTextView;
        public TextView mCourseTypeTextView;

        public ViewHolder(View view) {
            super(view);
            mCourseImageView = view.findViewById(R.id.course_icon);
            mCourseNameTextView = view.findViewById(R.id.coursename);
            mCourseTypeTextView = view.findViewById(R.id.coursetype);
            view.setOnClickListener(this);


        }
//click listener for the course taking the user to CourseDetails
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(mContext, CourseDetailActivity.class);
            intent.putExtra("Course_Name", mCourseDataset.get(getAdapterPosition()).getCourseName());
            intent.putExtra("Course_Type", mCourseDataset.get(getAdapterPosition()).getCourseType());
            intent.putExtra("Course_description", mCourseDataset.get(getAdapterPosition()).getCourseDescription());
            mContext.startActivity(intent);
        }
    }

}