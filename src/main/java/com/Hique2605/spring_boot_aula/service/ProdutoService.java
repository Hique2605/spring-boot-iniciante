package com.Hique2605.spring_boot_aula.service;

import com.Hique2605.spring_boot_aula.exceptions.RecursoNaoEncontradoException;
import com.Hique2605.spring_boot_aula.model.Produto;
import com.Hique2605.spring_boot_aula.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(()-> new RecursoNaoEncontradoException("Produto com ID" +id+ "Não encontrado"));
    }

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){

        if(!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontradoException("Produto com ID" +id+ "Não encontrado");
        }
        produtoRepository.deleteById(id);
    }





}
