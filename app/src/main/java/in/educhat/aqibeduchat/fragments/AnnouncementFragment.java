package in.educhat.aqibeduchat.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.educhat.aqibeduchat.R;
import in.educhat.aqibeduchat.adapter.CustomAdapterAnnouncements;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnnouncementFragment extends Fragment {


    public AnnouncementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerViewAnnouncements = (RecyclerView) view.findViewById(R.id.rv_announcements);
        CustomAdapterAnnouncements adapterAnnouncements = new CustomAdapterAnnouncements();
        recyclerViewAnnouncements.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewAnnouncements.setAdapter(adapterAnnouncements);

        super.onViewCreated(view, savedInstanceState);
    }
}
