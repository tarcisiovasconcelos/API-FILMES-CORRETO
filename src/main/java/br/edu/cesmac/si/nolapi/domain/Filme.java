package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilme;
    private String titulo;
    private Date dataLancamento;
    private String sinopse;

    @OneToMany
    private Ator ator;

    @OneToOne
    private Genero genero;

    public Filme(){

    }

    public Filme(Long idFilme,String titulo,String sinopse, Date dataLancamento) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.dataLancamento = dataLancamento;
    }

    public Long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Long idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}