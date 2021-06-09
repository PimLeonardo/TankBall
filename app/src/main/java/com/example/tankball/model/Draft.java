package com.example.tankball.model;

import java.io.Serializable;

public class Draft implements Serializable {

    private String nome, posicao, time, idade, pontos, rebotes, assistencias, blocks, roubos, peso, altura, nba, foto, resumo, video;

    public Draft(String nome, String posicao, String time, String idade, String pontos, String rebotes, String assistencias, String blocks, String roubos, String peso, String altura, String nba, String foto, String resumo, String video){
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
        this.idade = idade;
        this.pontos = pontos;
        this.rebotes = rebotes;
        this.assistencias = assistencias;
        this.blocks = blocks;
        this.roubos = roubos;
        this.peso = peso;
        this.altura = altura;
        this.nba = nba;
        this.foto = foto;
        this.resumo = resumo;
        this.video = video;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getRebotes() {
        return rebotes;
    }

    public void setRebotes(String rebotes) {
        this.rebotes = rebotes;
    }

    public String getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(String assistencias) {
        this.assistencias = assistencias;
    }

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public String getRoubos() {
        return roubos;
    }

    public void setRoubos(String roubos) {
        this.roubos = roubos;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getNba() {
        return nba;
    }

    public void setNba(String nba) {
        this.nba = nba;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}