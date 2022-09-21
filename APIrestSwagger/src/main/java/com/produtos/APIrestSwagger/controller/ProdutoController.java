package com.produtos.APIrestSwagger.controller;

import com.produtos.APIrestSwagger.models.Produto;
import com.produtos.APIrestSwagger.repository.IProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="API Rest Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    public IProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value="Returns product list")
    public List<Produto> listaprodutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value="Returns a specific product")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Adds a new product")
    public Produto addProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value="Deletes a product")
    public void delProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value="Updates a specific product")
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
