/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.service;

import br.edu.infnet.model.dto.SearchResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Gustavo
 */
@FeignClient(url="https://www.googleapis.com/books/v1/", name = "BookServiceApi")
public interface BookServiceApi {
    @GetMapping("volumes?q={query}")
    SearchResult searchBooks(@PathVariable("query") String query);
}

