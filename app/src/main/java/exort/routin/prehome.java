package exort.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class prehome extends AppCompatActivity {
Button signup;
RadioGroup gd;
ImageView gend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_prehome);
    signup=(Button)findViewById(R.id.button3);
    gend = (ImageView)findViewById(R.id.imageView2);
    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent d=new Intent(prehome.this,home.class);
            startActivity(d);
        }
    });
        gd=(RadioGroup)findViewById(R.id.gende);
        gd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.Male:
                        gend.setImageResource(R.drawable.pinktie);
                        break;
                    case  R.id.Female:
                        gend.setImageResource(R.drawable.girlbow);
                        break;
                }

            }
        });
    }

}
