package br.com.loja.classeConcretas;

import java.text.DecimalFormat;

import br.com.loja.controller.CodigoProduto;
import br.com.loja.enumpoo.Categoria;

public class Produto {
	
	private String codigo = CodigoProduto.geraCodigo();
	private String descricao;
	private Categoria categoria;
	private int quantidade;
	private double valor;
	private double desconto =0.00;
	public Produto(String descricao, Categoria categoria, int quantidade, double valor) {
		
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.valor = valor;
	
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Produto codigo: " + codigo + ", descricao :" + descricao + ", produto: " + categoria + ", quantidade: "
				+ 1 + ", valor: " + valor + ", desconto: " + df.format(desconto);
	}
	public void setDesconto(double desconto) {
		this.desconto += desconto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public double getValor() {
		return valor;
	}
	public double getDesconto() {
		return desconto;
	}
	

	
}
