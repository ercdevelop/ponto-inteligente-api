package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Busca empresa por CNPJ
	 * @param cnpj
	 * @return
	 */
	public Optional<Empresa> buscaPorCnpj(String cnpj);
	
	
	/**
	 * Persiste empresa no banco
	 * 	 * @param empresa
	 * @return
	 */
	public Empresa persistir(Empresa empresa);

}
