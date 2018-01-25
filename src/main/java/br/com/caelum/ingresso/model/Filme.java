package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nando on 03/03/17.
 */
@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private Duration duracao;
    private String genero;
    private BigDecimal preco = new BigDecimal("0.01");
    
    
    
    /**
     * @deprecated hibernate only
     */
    public Filme() {

    }
    
    public Filme(String nome, Duration duracao, String genero, BigDecimal preco) {
		this.nome = nome;
		this.duracao = duracao;
		this.genero = genero;
	}

	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = Duration.ofMinutes(duracao);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
