package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.dio.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

	     public List<Movimentacao>findByIdConta(Integer idConta);


}
