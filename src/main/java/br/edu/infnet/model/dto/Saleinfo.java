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
public class Saleinfo
{
    public String country;
    public String saleability;
    public boolean isEbook;
    public Listprice listPrice;
    public Retailprice retailPrice;
    public String buyLink;
    public Offer[] offers;
}
