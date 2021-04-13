/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

/**
 *
 * @author Wilber-Zruc
 */
public class Tarea {
    private int id;
    private String tarea;
    private String prioridad;
    
    public Tarea()
    {
        id  = 0;
        tarea = "";
        prioridad = "";
        
    } 
    public Tarea(int id, String tarea, String prioridad){
        this.id = id;
        this.tarea = tarea;
        this.prioridad = prioridad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTarea(){
        return tarea;
    }
    public void setTarea(String tarea){
        this.tarea = tarea;
    }
    public String getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }
}