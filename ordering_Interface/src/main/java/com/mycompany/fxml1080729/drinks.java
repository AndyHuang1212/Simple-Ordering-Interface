/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fxml1080729;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 *
 * @author 70929A01
 */
public class drinks {
    private String drinksName;
    private ComboBox sugarComboBox;
    private ComboBox iceComboBox;
    private ComboBox sizeComboBox;
    
    drinks(String dName){
        this.drinksName=new String(dName);
        this.sugarComboBox=new ComboBox(FXCollections.observableArrayList("無糖","微糖","半糖"));
        this.iceComboBox=new ComboBox(FXCollections.observableArrayList("溫","去冰","少冰","正常冰"));
        this.sizeComboBox=new ComboBox(FXCollections.observableArrayList("中","大"));   
    }
    
    public String getDrinksName() {
        return drinksName;
    }

    public void setDrinksName(String dName) {
        this.drinksName=new String(dName);
    }

    
    public ComboBox getSugarComboBox() {
        return sugarComboBox;
    }

    public void setSugarComboBox(ComboBox sugarComboBox) {
        this.sugarComboBox = sugarComboBox;
    }

    public ComboBox getIceComboBox() {
        return iceComboBox;
    }

    public void setIceComboBox(ComboBox iceComboBox) {
        this.iceComboBox = iceComboBox;
    }

    public ComboBox getSizeComboBox() {
        return sizeComboBox;
    }

    public void setSizeComboBox(ComboBox sizeComboBox) {
        this.sizeComboBox = sizeComboBox;
    }
}
