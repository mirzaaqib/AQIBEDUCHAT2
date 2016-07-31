package in.educhat.aqibeduchat.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import in.educhat.aqibeduchat.R;
import in.educhat.aqibeduchat.adapter.CustomAdapterContacts;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsList extends Fragment {


    public ContactsList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerViewContactList = (RecyclerView) view.findViewById(R.id.rv_contactslist_top);
        RecyclerView recyclerViewContactListLower = (RecyclerView) view.findViewById(R.id.rv_lower_contacts);
        RecyclerView recyclerViewGroups = (RecyclerView) view.findViewById(R.id.rv_groups);
        RecyclerView recyclerViewRecentChats = (RecyclerView) view.findViewById(R.id.rv_recentchats);

        recyclerViewContactList.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewContactListLower.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewGroups.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recyclerViewRecentChats.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        recyclerViewContactList.setAdapter(new CustomAdapterContacts(R.layout.contactitem, 1));
        recyclerViewContactListLower.setAdapter(new CustomAdapterContacts(R.layout.recentcalls, 3));
        recyclerViewGroups.setAdapter(new CustomAdapterContacts(R.layout.groupsitem, 2));
        recyclerViewRecentChats.setAdapter(new CustomAdapterContacts(R.layout.contactitem, 1));


        super.onViewCreated(view, savedInstanceState);
    }


}
