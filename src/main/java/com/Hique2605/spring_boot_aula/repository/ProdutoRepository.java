package com.Hique2605.spring_boot_aula.repository;

import com.Hique2605.spring_boot_aula.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //dentro do JpaRe.. tem os metodos findbyid e outros




}
