/**
package zsc.androidstudy.test;

import android.test.AndroidTestCase;
import android.util.Log;

import com.example.sqlitelogin.User;
import com.example.sqlitelogin.service.DatabaseHelper;
import com.example.sqlitelogin.service.UserService;


public class UserTest extends AndroidTestCase {
	public void datatest() throws Throwable{
		DatabaseHelper dbhepler=new DatabaseHelper(this.getContext());
		dbhepler.getReadableDatabase();
	}
	public void registerTest() throws Throwable{	
		UserService uService=new UserService(this.getContext());
		User user=new User();
		user.setUsername("renhaili");
		user.setPassword("123");
		user.setAge(20);
		user.setSex("Ů");
		uService.register(user);
	}
	public void loginTest() throws Throwable{
		UserService uService=new UserService(this.getContext());
		String username="renhaili";
		String password="123";
		boolean flag=uService.login(username, password);
		if(flag){
			Log.i("TAG","��¼�ɹ�");
		}else{
			Log.i("TAG","��¼ʧ��");
		}
	}
	
}

 */