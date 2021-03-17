package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtor;
    private String nome;
    private String sexo;
    private String biografia;
    private Date dataNascimento;

    public Ator(){

    }

    public Ator(Long idAtor, String nome, String sexo, String biografia, Date dataNascimento){
        this.idAtor = idAtor;
        this.nome = nome;
        this.sexo = sexo;
        this.biografia = biografia;
        this.dataNascimento = dataNascimento;
    }

    public Long getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(Long idAtor) {
        this.idAtor = idAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}