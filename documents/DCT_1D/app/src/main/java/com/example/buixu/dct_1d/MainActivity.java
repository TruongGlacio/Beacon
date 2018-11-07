package com.example.buixu.dct_1d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mTextView_F0,mTextView_F1,mTextView_F2,mTextView_F3,mTextView_F4,mTextView_F5,mTextView_F6,mTextView_F7;
    EditText  mEditText_f0,mEditText_f1,mEditText_f2,mEditText_f3,mEditText_f4,mEditText_f5,mEditText_f6,mEditText_f7;
    float f0=0,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,F0=0,F1=0,F2=0,F3=0,F4=0,F5=0,F6=0,F7=0;
    float f[]={f0,f1,f2,f3,f4,f5,f6,f7};
    float F[]={F0,F1,F2,F3,F4,F5,F6,F7};
    Button mButton_ketqua;
    double pi=3.1415;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setGUI();
       mButton_ketqua.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getString_f();
               Cacunator_F();
           }
       });
    }
    public void setGUI(){
        mEditText_f0=(EditText) findViewById(R.id.textView_f0);
        mEditText_f1=(EditText) findViewById(R.id.textView_f1);
        mEditText_f2=(EditText) findViewById(R.id.textView_f2);
        mEditText_f3=(EditText) findViewById(R.id.textView_f3);
        mEditText_f4=(EditText) findViewById(R.id.textView_f4);
        mEditText_f5=(EditText) findViewById(R.id.textView_f5);
        mEditText_f6=(EditText) findViewById(R.id.textView_f6);
        mEditText_f7=(EditText) findViewById(R.id.textView_f7);

        mTextView_F0=(TextView)findViewById(R.id.textView_F0);
        mTextView_F1=(TextView)findViewById(R.id.textView_F1);
        mTextView_F2=(TextView)findViewById(R.id.textView_F2);
        mTextView_F3=(TextView)findViewById(R.id.textView_F3);
        mTextView_F4=(TextView)findViewById(R.id.textView_F4);
        mTextView_F5=(TextView)findViewById(R.id.textView_F5);
        mTextView_F6=(TextView)findViewById(R.id.textView_F6);
        mTextView_F7=(TextView)findViewById(R.id.textView_F7);
        mButton_ketqua=(Button)findViewById(R.id.button_ketqua);
    }
    public void getString_f()
    {
     try
     {
         f[0]=Float.parseFloat(String.valueOf(mEditText_f0.getText()));
         f[1]=Float.parseFloat(String.valueOf(mEditText_f1.getText()));
         f[2]=Float.parseFloat(String.valueOf(mEditText_f2.getText()));
         f[3]=Float.parseFloat(String.valueOf(mEditText_f3.getText()));
         f[4]=Float.parseFloat(String.valueOf(mEditText_f4.getText()));
         f[5]=Float.parseFloat(String.valueOf(mEditText_f5.getText()));
         f[6]=Float.parseFloat(String.valueOf(mEditText_f6.getText()));
         f[7]=Float.parseFloat(String.valueOf(mEditText_f7.getText()));
     }
     catch (Exception e)
     {
         f[0]=0;
         f[1]=0;
         f[2]=0;
         f[3]=0;
         f[4]=0;
         f[5]=0;
         f[6]=0;
         f[7]=0;
         Toast.makeText(getBaseContext(),"Dữ liệu bạn nhập không phải là số, kiểm tra lại",Toast.LENGTH_SHORT).show();
     }
    }
    public void Cacunator_F()
    {

        float F_0=0,F_1=0,F_2=0,F_3=0,F_4=0,F_5=0,F_6=0, F_7=0;

        for (int i=0;i<=7;i++)
        {
            F_0=F_0+f[i];
            F_1= (float) (F_1+f[i]*Math.cos(((2*i+1)*pi)/16));
            F_2= (float) (F_2+f[i]*Math.cos(((2*i+1)*pi*2)/16));
            F_3= (float) (F_3+f[i]*Math.cos(((2*i+1)*pi*3)/16));
            F_4= (float) (F_4+f[i]*Math.cos(((2*i+1)*pi*4)/16));
            F_5= (float) (F_5+f[i]*Math.cos(((2*i+1)*pi*5)/16));
            F_6= (float) (F_6+f[i]*Math.cos(((2*i+1)*pi*6)/16));
            F_7= (float) (F_7+f[i]*Math.cos(((2*i+1)*pi*7)/16));
        }
        F0= (float) (F_0/(2*Math.sqrt(2)));
        F1=F_1/2;
        F2=F_2/2;
        F3=F_3/2;
        F4=F_4/2;
        F5=F_5/2;
        F6=F_6/2;
        F7=F_7/2;
        mTextView_F0.setText(""+F0);
        mTextView_F1.setText(""+F1);
        mTextView_F2.setText(""+F2);
        mTextView_F3.setText(""+F3);
        mTextView_F4.setText(""+F4);
        mTextView_F5.setText(""+F5);
        mTextView_F6.setText(""+F6);
        mTextView_F7.setText(""+F7);

    }
}
