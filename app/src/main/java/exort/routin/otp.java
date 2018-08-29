package exort.routin;

import android.content.Intent;
import android.os.CountDownTimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class otp extends AppCompatActivity {
 Button verify,resend;
TextView timer;CountDownTimer t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);


timer=(TextView)findViewById(R.id.textView6);

       t= new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText(valueOf(millisUntilFinished / 1000));
            }

            public void onFinish(){
                timer.setText("");
            }
        }.start();


        verify=(Button)findViewById(R.id.button2);
        resend=(Button)findViewById(R.id.resend);






        resend.setVisibility(View.INVISIBLE);
        resend.postDelayed(new Runnable() {
            @Override
            public void run() {
             resend.setVisibility(View.VISIBLE);
            }
        },10000);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(otp.this,prehome.class);
                startActivity(r);

            }
        });
//        timer=(TextView)findViewById(R.id.textView6);
//        new CountDownTimer(10000,1000){
//            public void
//        }

    }
}
