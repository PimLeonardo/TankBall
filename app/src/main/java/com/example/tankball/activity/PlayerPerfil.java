package com.example.tankball.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tankball.R;
import com.example.tankball.model.Draft;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class PlayerPerfil extends AppCompatActivity {

    private Draft listadraft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_perfil);

        getSupportActionBar().hide();

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        listadraft = (Draft) bundle.getSerializable("player");

        ImageView foto_jogador = findViewById(R.id.foto_jogador);
        Glide.with(this).load(listadraft.getFoto()).into(foto_jogador);

        TextView resumo = findViewById(R.id.resumo);
        resumo.setText(listadraft.getResumo());

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(listadraft.getVideo(), 0);
            }
        });
    }
}