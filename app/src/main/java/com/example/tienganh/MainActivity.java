package com.example.tienganh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv_thi;
ArrayList<Cacthi> cacthiArrayList;
ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter =new ArrayAdapter(this, R.layout.dong_thi, cacthiArrayList);
        lv_thi.setAdapter(adapter);
        lv_thi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, CacthiInformation.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });

    }

private void Anhxa(){
lv_thi=(ListView)findViewById(R.id.lv_thi);
cacthiArrayList=new ArrayList<>();
cacthiArrayList.add(new Cacthi("Thì Hiện Tại Đơn","Simple Present","S + Vs/es + O (Đối với động từ Tobe) S + do/does + V + O (Đối với động từ thường)","Dấu hiệu nhận biết thì hiện tại đơn: always, every, usually, often, generally, frequently.","Thì hiện tại đơn diễn tả một chân lý , một sự thật hiển nhiên. Ex: The sun ries in the East. Tom comes from England.\n" +
        "Thì hiện tại đơn diễn tả 1 thói quen , một hành động xảy ra thường xuyên ở hiện tại. Ex: Mary often goes to school by bicycle. I get up early every morning.\n" +
        "Lưu ý : ta thêm \"es\" sau các động từ tận cùng là : O, S, X, CH, SH.\n" +
        "Thì hiện tại đơn diễn tả năng lực của con người : Ex : He plays badminton very well\n" +
        "Thì hiện tại đơn còn diễn tả một kế hoạch sắp xếp trước trong tương lai hoặc thời khoá biểu , đặc biệt dùng với các động từ di chuyển."));
cacthiArrayList.add(new Cacthi("Thì hiện tại tiếp diễn","Present Continuous","S + be (am/ is/ are) + V_ing + O","Dấu hiêu:now, right now, at present, at the moment,..........","Thì hiện tại tiếp diễn tả một hành động đang diễn ra và kéo dài dài một thời gian ở hiện tại. Ex: The children are playing football now.\n" +
        "Thì này cũng thường tiếp theo sau câu đề nghị, mệnh lệnh. Ex: Look! the child is crying. Be quiet! The baby is sleeping in the next room.\n" +
        "Thì này còn diễn tả 1 hành động xảy ra lặp đi lặp lại dùng với phó từ ALWAYS: Ex : He is always borrowing our books and then he doesn't remember -\n" +
        "Thì này còn được dùng để diễn tả một hành động sắp xảy ra ( ở tương lai gần) Ex: He is coming tomrow"));
}
}