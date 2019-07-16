package phucnguyen.develop.livewallpaper;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class PreviewActivity extends AppCompatActivity {
    ImageView imghinh;
    Toolbar toolbar;
    Button btnSetWallpaper;
    Image anh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_preview);
        anhxa();
        // back ve MainActivity
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Nhận url cua item ma minh click vao ben MainActivity và set background fullscreen
        Intent intent = getIntent();
        anh = intent.getParcelableExtra("hinhanh");
        Picasso.get().load(anh.getUrl()).error(R.drawable.ic_error_outline_black_24dp).fit().into(imghinh);

        btnSetWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });
    }

    private void anhxa(){
        toolbar = findViewById(R.id.toolbar);
        imghinh = findViewById(R.id.imageView);
        btnSetWallpaper = findViewById(R.id.buttonSetWallpaper);
    }

    public void setWallpaper() {
        Bitmap bitmap = ((BitmapDrawable)imghinh.getDrawable()).getBitmap();
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(getApplicationContext(), "Set Wallpapaer Successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Wallpaper not load yet !", Toast.LENGTH_SHORT).show();
        }
    }

   /* public static Bitmap resizeBitmap(Bitmap bm, int newHeight, int newWidth){
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float)newWidth)/width;
        float scaleHeight = ((float)newHeight)/height;
        Matrix matrix = new Matrix();
        matrix.postScale(scaleWidth, scaleHeight);
        Bitmap resized = (Bitmap) Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false);
        return resized;
    }*/
}

