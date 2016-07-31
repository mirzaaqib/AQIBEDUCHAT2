package in.educhat.aqibeduchat.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.educhat.aqibeduchat.R;

public class CustomAdapterContacts extends RecyclerView.Adapter<CustomAdapterContacts.ViewHolder> {
    int layoutId;
    int times;

    public CustomAdapterContacts(int layoutId, int times) {
        this.layoutId = layoutId;
        this.times = times;
    }

    @Override
    public CustomAdapterContacts.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(layoutId, viewGroup, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomAdapterContacts.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return this.times;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
