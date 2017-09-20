package atividade1909;

import java.util.Calendar;

public class Ocorrencia {
    private float latitude;
    private float longitude;
    private String data;
    private String descricao;
    
    

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Ocorrencia(float latitude, float longitude, String data, String descricao) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.data = data;
        this.descricao = descricao;
    }
    
    public Ocorrencia() {
        this.latitude = 0;
        this.longitude = 0;
        this.data = "";
        this.descricao = "";
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
    
}
