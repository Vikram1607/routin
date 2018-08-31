package exort.routin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class posthome extends AppCompatActivity {
TextView dai,bev,bak,con,bre,bat;
ImageView del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posthome);
        dai=(TextView)findViewById(R.id.textView12);
        bev=(TextView)findViewById(R.id.textView13);
        bak=(TextView)findViewById(R.id.textView14);
        con=(TextView)findViewById(R.id.textView15);
        bre=(TextView)findViewById(R.id.textView16);
        bat=(TextView)findViewById(R.id.textView17);
        del=(ImageView)findViewById(R.id.imageView9);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(posthome.this,delivery.class);
                startActivity(u);
            }
        });

        dai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(posthome.this,dairy.class);
                startActivity(i);
            }
        });

        bev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent (posthome.this,beverage.class);
                startActivity(m);
            }
        });

        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent (posthome.this,bakery.class);startActivity(n);
            }
        });

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent (posthome.this,confect.class);startActivity(p);
            }
        });

        bre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent (posthome.this,breakfast.class);startActivity(y);
            }
        });

        bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent (posthome.this,batters.class);startActivity(b);
            }
        });

        }
}
