package demo.afinalexample.ui;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import demo.afinalexample.R;

/**
 * ע�� ����¼�
 * 1,	����¼������� public���͵�
 * 2,	Fragment ��ʹ�õ���	FinalActivity.initInjectedView(this,mContainer);
 */
public class InnerActivity extends Activity {
	
	@ViewInject(id= R.id.btn_inner_activity,click = "click")
	TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_inner);
		
		FinalActivity.initInjectedView(this);	// ����û�У�������IOCע���ǰ��
	}

	public void click(View v){
		Toast.makeText(this,"this is a  viewInject example ",Toast.LENGTH_LONG).show();
	}
}
