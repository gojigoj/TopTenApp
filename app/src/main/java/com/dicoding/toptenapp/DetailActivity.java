package com.dicoding.toptenapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.toptenapp.Model.ProLang;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PROLANG = "extra_prolang";

    Toolbar mToolbar;
    ImageView ivImgDetail;
    TextView tvTitleDetail, tvDescdetail, tvPositionNow, tvPositionThen, tvRating, tvChange, tvDesigner, tvDeveloper, tvReleasedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ivImgDetail = findViewById(R.id.iv_image_detail);
        tvTitleDetail = findViewById(R.id.tv_title_detail);
        tvDescdetail = findViewById(R.id.tv_desc_detail);
        tvPositionNow = findViewById(R.id.tv_position_now);
        tvPositionThen = findViewById(R.id.tv_position_then);
        tvRating = findViewById(R.id.tv_desc_rating);
        tvChange = findViewById(R.id.tv_desc_change);
        tvDesigner = findViewById(R.id.tv_desc_designer);
        tvDeveloper = findViewById(R.id.tv_desc_developer);
        tvReleasedDate = findViewById(R.id.tv_desc_released);

        ProLang proLang = getIntent().getParcelableExtra("EXTRA_PROLANG");

        LoadDetailSelected(proLang);
    }

    private void LoadDetailSelected(ProLang data) {
        Glide.with(this)
                .load(data.getImage())
                .apply(new RequestOptions().fitCenter())
                .into(ivImgDetail);

        tvTitleDetail.setText(data.getName());
        tvDescdetail.setText(data.getDesc());
        tvPositionNow.setText(data.getPositionNow());
        tvPositionThen.setText(data.getPositionThen());
        tvRating.setText(data.getRating());
        tvChange.setText(data.getChangeNumber());
        tvDesigner.setText(data.getDesigner());
        tvDeveloper.setText(data.getDeveloper());
        tvReleasedDate.setText(data.getReleaseDate());

    }
}
