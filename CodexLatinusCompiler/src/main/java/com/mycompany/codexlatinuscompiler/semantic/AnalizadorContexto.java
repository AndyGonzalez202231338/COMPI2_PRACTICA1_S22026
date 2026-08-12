/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codexlatinuscompiler.semantic;

/**
 *
 * @author andy
 */
public class AnalizadorContexto {
    public boolean dentroDeCiclo = false;
    public boolean dentroDeFuncion = false;
    public String tipoRetornoFuncion = null; // null si es actio
}