package qthjen_dev.io.mvpexample.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import qthjen_dev.io.mvpexample.Model.LoadList.LoadListModel;
import qthjen_dev.io.mvpexample.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<LoadListModel> list;
    private Context context;

    public MainAdapter(List<LoadListModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName().toString());
        holder.date.setText(list.get(position).getDate() + "");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, date;
        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);
        }
    }
}
