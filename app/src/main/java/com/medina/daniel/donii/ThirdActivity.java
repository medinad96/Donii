package com.medina.daniel.donii;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button tbutton = (Button) findViewById(R.id.tbutton_id);
        tbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent tin = new Intent();
                tin.setAction(Intent.ACTION_VIEW);
                tin.addCategory(Intent.CATEGORY_BROWSABLE);
                tin.setData(Uri.parse("http://staging.donii.org/#/nonprofit/shelter-for-the-homeless"));
                startActivity(tin);

            }
        });

        Button tbutton2 = (Button) findViewById(R.id.tbutton2_id);
        tbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                // Perform action on click
                Intent tin2 = new Intent();
                tin2.setAction(Intent.ACTION_VIEW);
                tin2.addCategory(Intent.CATEGORY_BROWSABLE);
                tin2.setData(Uri.parse("http://staging.donii.org/#/nonprofit/employ-to-empower"));
                startActivity(tin2);

            }
        });
    }

}
