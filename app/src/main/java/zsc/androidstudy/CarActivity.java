package zsc.androidstudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CarActivity extends AppCompatActivity{
    private Button my1;
    private Button shouye1;
    private Button jiesuan;
//    private TextView txt_value;
//    private TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        findViews();
    }
    private void findViews() {
        my1 = (Button) findViewById(R.id.my2);
        my1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this, MineActivity.class);
                startActivity(intent);
            }
        });
        shouye1 = (Button) findViewById(R.id.shouye2);
        shouye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        jiesuan = (Button) findViewById(R.id.jiesuan);
        jiesuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this, PayActivity.class);
                startActivity(intent);
            }
        });
    }

//    public void showTotalPrice() {
//        txt_value=(TextView)findViewById(R.id.txt_total);
//        float total = getTotalPrice();
//        txt_value.setText(Html.fromHtml("合计 ￥<span style='color:#eb4f38'>" + total + "</span>"),
//                TextView.BufferType.SPANNABLE);
//    }
//    private float getTotalPrice() {
//        num=(TextView)findViewById(R.id.etxt_num);
//        int value = Integer.parseInt(num.getText().toString());
//        float sum = 0;
//        sum = value * 699;
//        return sum;
//    }

}
