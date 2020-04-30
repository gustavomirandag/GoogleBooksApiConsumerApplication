/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.model.dto;


/**
 *
 * @author Gustavo
 */

public class SearchResult
{
    public String kind;
    public Integer totalItems;
    public Item[] items;
    
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for(Item item : items){
            strBuilder.append(item.volumeInfo.title).append("\n");
        }
        return strBuilder.toString();
    }
}


