package br.com.elsonsantos.fullstackWeek.domain;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Integer idade;
    private String dataNascimento;
    private Boolean isVacinada;

    @ManyToOne
    @JoinColumn(name="codigo_grupo_prioridade")
    private GruposPrioridades grupo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIsVacinada(Boolean isVacinada){
        this.isVacinada=isVacinada;
    }

    public boolean getIsVacinada(){
        return isVacinada;
    }
}
