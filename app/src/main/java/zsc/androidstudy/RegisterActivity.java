package zsc.androidstudy;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import zsc.androidstudy.R;

import zsc.androidstudy.service.UserService;

public class RegisterActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText age;
    RadioGroup sex;
    Button register;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViews();
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name=username.getText().toString().trim();
                String pass=password.getText().toString().trim();
                Log.i("TAG",name+"_"+pass+"_");
                UserService uService=new UserService(RegisterActivity.this);
                User user=new User();
                user.setUsername(name);
                user.setPassword(pass);
                uService.register(user);
                if(name==" "||pass==" "){
                    Toast.makeText(RegisterActivity.this, "请输入正确格式的账号密码！", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(RegisterActivity.this, "注册成功！", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    private void findViews() {
        username=(EditText) findViewById(R.id.usernameRegister);
        password=(EditText) findViewById(R.id.passwordRegister);
        register=(Button) findViewById(R.id.Register);
    }

}
