package fei.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnPopularMovies;
    private Button mBtnStockHawk;
    private Button mBtnBuildBigger;
    private Button mBtnMakeMaterial;
    private Button mBtnGoUbiquitous;
    private Button mBtnCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        mBtnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        mBtnBuildBigger = (Button) findViewById(R.id.btn_build_bigger);
        mBtnMakeMaterial = (Button) findViewById(R.id.btn_make_material);
        mBtnGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        mBtnCapstone = (Button) findViewById(R.id.btn_capstone);

        mBtnPopularMovies.setOnClickListener(this);
        mBtnStockHawk.setOnClickListener(this);
        mBtnBuildBigger.setOnClickListener(this);
        mBtnMakeMaterial.setOnClickListener(this);
        mBtnGoUbiquitous.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_popular_movies:
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stock_hawk:
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_bigger:
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_make_material:
                Toast.makeText(MainActivity.this, "This button will launch my make material app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_go_ubiquitous:
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
