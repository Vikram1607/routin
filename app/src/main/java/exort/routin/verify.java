package exort.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class verify extends AppCompatActivity {

    ImageButton arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        arrow=(ImageButton)findViewById(R.id.imageButton);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You will receive an OTP",Toast.LENGTH_SHORT).show();
                Intent h=new Intent(verify.this,otp.class);
                startActivity(h);
            }
        });
    }
}
