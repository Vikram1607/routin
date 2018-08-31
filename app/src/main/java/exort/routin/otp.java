package exort.routin;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class otp extends AppCompatActivity {
 Button verify,resend;
TextView timer;CountDownTimer t;EditText tester;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        EditText test;
        verify=(Button)findViewById(R.id.button2);
        resend=(Button)findViewById(R.id.resend);
        timer=(TextView)findViewById(R.id.textView6);
        tester= (EditText)findViewById(R.id.editText2);
       t= new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText(valueOf(millisUntilFinished / 1000));
            }

            public void onFinish(){
                timer.setText("");
            }
        }.start();
       resend.setVisibility(View.INVISIBLE);
        resend.postDelayed(new Runnable() {
            @Override
            public void run() {
             resend.setVisibility(View.VISIBLE);
            }
        },10000);
        resend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                t= new CountDownTimer(10000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        timer.setText(valueOf(millisUntilFinished / 1000));
                    }

                    public void onFinish(){
                        timer.setText("");
                    }
                }.start();
                resend.setVisibility(View.INVISIBLE);
                resend.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resend.setVisibility(View.VISIBLE);
                    }
                },10000);
                Toast.makeText(getApplicationContext(),"Resending OTP",Toast.LENGTH_SHORT).show();
            }
        });
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               final int l=tester.getText().toString().length();
               if(l==6){
                   Toast.makeText(getApplicationContext(),"Verified",Toast.LENGTH_SHORT).show();
                   Intent r=new Intent(otp.this,prehome.class);
                   startActivity(r);
               }
               else{
                   Toast.makeText(getApplicationContext(),"Enter OTP!",Toast.LENGTH_LONG).show();
               }


            }
        });


    }
}




