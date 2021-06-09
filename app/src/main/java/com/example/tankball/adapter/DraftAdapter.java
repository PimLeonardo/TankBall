package com.example.tankball.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tankball.R;
import com.example.tankball.model.Draft;

import java.util.List;

public class DraftAdapter extends RecyclerView.Adapter<DraftAdapter.DraftHolder> {

    private List<Draft> listamockdraft;
    private Context context;
    public DraftAdapter(List<Draft> listadraft, Context context) {
        listamockdraft = listadraft;
        this.context = context;
    }

    @NonNull
    @Override
    public DraftHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_mock_draft, parent, false);

        return new DraftHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull DraftHolder holder, int position) {

        Draft jogador = listamockdraft.get(position);
        holder.rank.setText(String.valueOf(position+1));
        holder.nome.setText(jogador.getNome());
        holder.posicao.setText(jogador.getPosicao());
        holder.idade.setText(jogador.getIdade());
        holder.pontos.setText(jogador.getPontos());
        holder.rebotes.setText(jogador.getRebotes());
        holder.assistencias.setText(jogador.getAssistencias());
        holder.blocks.setText(jogador.getBlocks());
        holder.roubos.setText(jogador.getRoubos());
        holder.peso.setText(jogador.getPeso());
        holder.altura.setText(jogador.getAltura());
        holder.time.setText(jogador.getTime());

        Glide.with(context).load(jogador.getNba()).into(holder.nba);
    }

    @Override
    public int getItemCount() {
        return listamockdraft.size();
    }

    public class DraftHolder extends RecyclerView.ViewHolder{

        TextView nome, posicao, idade, pontos, rebotes, assistencias, blocks, roubos, peso, altura, time, rank;
        ImageView nba;

        public DraftHolder(@NonNull View itemView) {
            super(itemView);

            rank = itemView.findViewById(R.id.rank_text);
            nome = itemView.findViewById(R.id.nome_jogador_text);
            posicao = itemView.findViewById(R.id.posicao_text);
            time = itemView.findViewById(R.id.time_text);
            idade = itemView.findViewById(R.id.idade_text);
            pontos = itemView.findViewById(R.id.pontos_text);
            rebotes = itemView.findViewById(R.id.rebote_text);
            assistencias = itemView.findViewById(R.id.assistencia_text);
            blocks = itemView.findViewById(R.id.block_text);
            roubos = itemView.findViewById(R.id.roubos_text);
            peso = itemView.findViewById(R.id.peso_text);
            altura = itemView.findViewById(R.id.altura_text);
            nba = itemView.findViewById(R.id.logo_team);
        }
    }
}