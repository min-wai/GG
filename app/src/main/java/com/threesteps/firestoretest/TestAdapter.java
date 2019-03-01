package com.threesteps.firestoretest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestHolder> {



    private ArrayTest test = new ArrayTest();
    private ArrayList<String> haha = test.getMyArrayList();

    TestAdapter() {
    }

    @NonNull
    @Override
    public TestHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items,viewGroup,false);


        return new TestHolder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull final TestHolder testHolder, int i) {
        String current = haha.get(i);
        testHolder.mTextView.setText(current);

    }

    @Override
    public int getItemCount() {
        return haha.size();
    }


    class TestHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        private TestAdapter mTestAdapter;

        TestHolder(@NonNull View itemView, TestAdapter adapter) {
            super(itemView);
            this.mTestAdapter = adapter;
            mTextView = itemView.findViewById(R.id.mTextView);
        }
    }
}
