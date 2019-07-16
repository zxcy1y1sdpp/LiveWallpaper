package phucnguyen.develop.livewallpaper;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

public class ListImageAdapter extends RecyclerView.Adapter<ListImageAdapter.ViewHolder> implements OnItemClickedListener{
    ArrayList<Image> arrayList;
    Context context;

    public ListImageAdapter(ArrayList<Image> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    private OnItemClickedListener onItemClickedListener;

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_image, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        Picasso.get().load(arrayList.get(i).getUrl()).error(R.drawable.ic_error_outline_black_24dp).into(viewHolder.imghinh);
            viewHolder.imghinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if(onItemClickedListener != null) {
                    //   Toast.makeText(context, "Vi tri: " + i, Toast.LENGTH_LONG).show();
                       onItemClickedListener.OnItemClick(i);
                   }
                }
            });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void OnItemClick(int position) {
        setWallpaper(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imghinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imghinh = itemView.findViewById(R.id.itemImage);
        }
    }


    private void setWallpaper(int i){
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        WallpaperManager manager = WallpaperManager.getInstance(context);
        try {
            manager.setBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
