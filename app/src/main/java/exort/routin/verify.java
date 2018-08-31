package exort.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class verify extends AppCompatActivity {

    Button arrow;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        arrow=(Button) findViewById(R.id.button);
        phone=(EditText)findViewById(R.id.editText);


        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int length = phone.getText().toString().length();

                if(length==10){

                    Toast.makeText(getApplicationContext(),"You will receive an OTP",Toast.LENGTH_SHORT).show();
                    Intent h=new Intent(verify.this,otp.class);
                    startActivity(h);
                }else {

                    Toast.makeText(getApplicationContext(),"Phone number is not valid",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
