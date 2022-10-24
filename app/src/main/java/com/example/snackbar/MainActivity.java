package com.example.snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {


    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout);

        // Create the Snackbar
        final Snackbar snackbar = Snackbar.make(layout, "", Snackbar.LENGTH_LONG);
        // Get the Snackbar's layout view
        Snackbar.SnackbarLayout layout = (Snackbar.SnackbarLayout) snackbar.getView();
        // Inflate our custom view
        View snackView = getLayoutInflater().inflate(R.layout.snackbar_layout, null);
        //If the view is not covering the whole snackbar layout, add this line
        layout.addView(snackView, 0);
        // Show the Snackbar
        snackbar.show();

    }
    }

