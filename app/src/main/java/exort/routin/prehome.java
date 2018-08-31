package exort.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class prehome extends AppCompatActivity {
Button signup;
RadioGroup gd;
ImageView gend;
EditText name,em,rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_prehome);
        name=(EditText)findViewById(R.id.editText3);
        em=(EditText)findViewById(R.id.editText4);
        rc=(EditText)findViewById(R.id.editText5);
    signup=(Button)findViewById(R.id.button3);
    gend = (ImageView)findViewById(R.id.imageView2);
    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int g=name.getText().toString().length();
            int j=em.getText().toString().length();

            if(g<25 &&g>0 &&j>0&& j<255){
                Toast.makeText(getApplicationContext(),"Signed in",Toast.LENGTH_SHORT).show();
                Intent d=new Intent(prehome.this,home.class);
                startActivity(d);
            }

        }
    });
        gd=(RadioGroup)findViewById(R.id.gende);
        gd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case  R.id.Female:
                        gend.setImageResource(R.drawable.girlbow);
                        break;
                    case R.id.Male:
                        gend.setImageResource(R.drawable.pinktie);
                        break;

                }

            }
        });

    }

}
