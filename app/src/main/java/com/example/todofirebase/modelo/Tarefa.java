package com.example.todofirebase.modelo;

public class Tarefa {

    private String uuid;
    private String nome;
    private String imageSrc = "https://image.flaticon.com/icons/png/512/1632/1632670.png";
    private Boolean status;





    public Tarefa(){

    }

    public Tarefa(String uuid, String nome, Boolean status) {
        this.uuid = uuid;
        this.nome = nome;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Tarefa(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "uuid='" + uuid + '\'' +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }


}
