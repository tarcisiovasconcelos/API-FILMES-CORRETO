package br.edu.cesmac.si.nolapi.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilme;
    private String titulo;
    private Date dataLancamento;
    private String sinopse;

    @OneToMany
    private List<Ator> atores;

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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}