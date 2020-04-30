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
public class Volumeinfo
{
    public String title;
    public String[] authors;
    public String publisher;
    public String publishedDate;
    public String description;
    public Industryidentifier[] industryIdentifiers;
    public Readingmodes readingModes;
    public int pageCount;
    public String printType;
    public String[] categories;
    public String maturityRating;
    public boolean allowAnonLogging;
    public String contentVersion;
    public Panelizationsummary panelizationSummary;
    public Imagelinks imageLinks;
    public String language;
    public String previewLink;
    public String infoLink;
    public String canonicalVolumeLink;
    public String subtitle;
}
