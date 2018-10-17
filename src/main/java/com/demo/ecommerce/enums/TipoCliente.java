package com.demo.ecommerce.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pesssoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente tp : TipoCliente.values()) {
			if(cod.equals(tp.getCod())) {
				return tp;
			}
		}
		
		throw new IllegalArgumentException("Id invalido:" + cod);
	}
	
}
