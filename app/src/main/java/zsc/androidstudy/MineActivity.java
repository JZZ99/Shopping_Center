package zsc.androidstudy;


import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MineActivity extends AppCompatActivity{
    //private TextView alipay;
    private Button shouye;
    private Button car1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        findViews();
        TextView a1 =(TextView)findViewById(R.id.alipay);
      a1.setMovementMethod(LinkMovementMethod.getInstance());
      TextView a2 =(TextView)findViewById(R.id.starbucks);
      a2.setMovementMethod(LinkMovementMethod.getInstance());
    }
    private void findViews() {
        shouye=(Button) findViewById(R.id.shouye);
        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MineActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        car1=(Button) findViewById(R.id.gouwuche);
        car1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MineActivity.this, CarActivity.class);
                startActivity(intent);
            }
        });
    }
}
