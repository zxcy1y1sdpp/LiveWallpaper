package phucnguyen.develop.livewallpaper;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v7.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout layout;
    RecyclerView listImage, recyclerView;
    ArrayList<Image> listimage, list;
    ArrayList<String> arrayList;
    int dem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        setSupportActionBar(toolbar);
        // Dung de hien an Navigation ben trai
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dem++;
                if (dem % 2 != 0)
                    layout.openDrawer(GravityCompat.START);
                else
                    layout.closeDrawer(GravityCompat.START);
            }
        });

        //Tạo danh sách các url de load anh tu internet ve
        listImage.setHasFixedSize(true);
        GridLayoutManager layout = new GridLayoutManager(this, 3);
        listImage.setLayoutManager(layout);

        listimage = new ArrayList<>();
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh23.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh16.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh6.jpg", "Hot girl"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh17.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/background2.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/background11.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh1.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh2.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh68684ec97aa1e1b4d.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh26.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh2.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh3.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh4.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh5.jpg", "Khung cảnh"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon2.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon6.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/image_space.png", "Vũ trụ"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh4.jpg", "Vũ trụ"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh3.jpg", "Vũ trụ"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon13.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon12.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city1.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city2.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city3.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city4.jpg", "Neon"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector1.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector2.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector3.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector4.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector5.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/vector_city1.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/vector_city2.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector6.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh1.jpg", "Vector"));
        listimage.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector7.jpg", "Vector"));

        //Tạo mot danh sach clone de duyet và loc cac anh thuoc vao item cua  list catagories
        list = new ArrayList<>();
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh23.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh16.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh6.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh17.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/background2.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/background11.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh1.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh2.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh68684ec97aa1e1b4d.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh26.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh2.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh3.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh4.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh5.jpg", "Khung cảnh"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon2.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon6.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/image_space.png", "Vũ trụ"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh4.jpg", "Vũ trụ"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/khungcanh3.jpg", "Vũ trụ"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon13.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anhneon12.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city1.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city2.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city3.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/neon_city4.jpg", "Neon"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector1.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector2.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector3.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector4.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector5.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/vector_city1.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/vector_city2.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector6.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/phongcanh1.jpg", "Vector"));
        list.add(new Image("https://www.upsieutoc.com/images/2019/07/05/anh_vector7.jpg", "Vector"));

        final ListImageAdapter listImageAdapter = new ListImageAdapter(listimage, getApplicationContext());
        listImage.setAdapter(listImageAdapter);


        listImageAdapter.setOnItemClickedListener(new OnItemClickedListener() {
            @Override
            public void OnItemClick(int position) {
                Image image = listimage.get(position);
                Intent intent = new Intent(getApplicationContext(), PreviewActivity.class);
                intent.putExtra("hinhanh", image);
                startActivity(intent);
            }
        });


        recyclerView.setHasFixedSize(true);
        //Thiet lap che do xem cho recyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        //Tạo danh sách các thể loại ảnh
        arrayList = new ArrayList<>();
        arrayList.add("All");
        arrayList.add("Khung cảnh");
        arrayList.add("Hot girl");
        arrayList.add("Vũ trụ");
        arrayList.add("Vector");
        arrayList.add("Anime");
        arrayList.add("Manga");
        arrayList.add("Neon");
        arrayList.add("Holiday");
        arrayList.add("Food & drink");

        CategoriesAdapter adapter = new CategoriesAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickedListener(new OnItemClickedListener() {
            @Override
            public void OnItemClick(int position) {
                listimage.clear();
                String category = arrayList.get(position);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(category)) {
                        listimage.add(list.get(i));
                    }
                }
                listImageAdapter.notifyDataSetChanged();
            }
        });

        //Xu ly su kien nhan item trong menu cua navigation view
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if(id == R.id.exit) {
                    Toast.makeText(getApplicationContext(), "Tạm biệt bạn !!!", Toast.LENGTH_SHORT).show();
                    finish();
                }
                return false;
            }
        });

    }

    private void anhxa() {
        layout = findViewById(R.id.drawerLayoutLeft);
        toolbar = findViewById(R.id.toolbar);
        listImage = findViewById(R.id.list_image);
        recyclerView = findViewById(R.id.list_categories);
        navigationView = findViewById(R.id.navigation_view);
    }

    private void confirm(){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
        .setMessage("Bạn có muốn thoát khỏi ứng dụng không ?")
        .setPositiveButton("Yes", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
        .setNegativeButton("No", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
         .setIcon(R.mipmap.ic_launcher).show();
    //    alertDialog.show();
    }
}