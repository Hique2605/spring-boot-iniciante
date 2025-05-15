package com.Hique2605.spring_boot_aula.controller;

import com.Hique2605.spring_boot_aula.exceptions.RecursoNaoEncontradoException;
import com.Hique2605.spring_boot_aula.model.Produto;
import com.Hique2605.spring_boot_aula.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarProduto(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProduto(@PathVariable Long id){  //? generics pois ou ele rerotna algo ou outro
        Produto produto = produtoService.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }




}
