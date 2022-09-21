package com.produtos.APIrestSwagger.repository;

import com.produtos.APIrestSwagger.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);
}
