package phucnguyen.develop.livewallpaper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> implements OnItemClickedListener{
    ArrayList<String> list;
    Context context;

    private OnItemClickedListener onItemClickedListener;

    public CategoriesAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_categories, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
            viewHolder.txtItem.setText(list.get(i));
            viewHolder.txtItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClickedListener != null) {
                    onItemClickedListener.OnItemClick(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void OnItemClick(int position) {
        String data = list.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtItem = itemView.findViewById(R.id.item_categories);
        }
    }


}
