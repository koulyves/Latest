/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dto;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author n0200797
 */
public class Product {
    private String productType;
    private BigDecimal costPerSqFt;
    private BigDecimal laborCostPerSqFt;
    
//******************************************************************************
    public Product (String productType){
            this.productType = productType;       
    }

//******************************************************************************

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(BigDecimal costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

    public BigDecimal getLaborCostPerSqFt() {
        return laborCostPerSqFt;
    }

    public void setLaborCostPerSqFt(BigDecimal laborCostPerSqFt) {
        this.laborCostPerSqFt = laborCostPerSqFt;
    }
//******************************************************************************

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.productType);
        hash = 23 * hash + Objects.hashCode(this.costPerSqFt);
        hash = 23 * hash + Objects.hashCode(this.laborCostPerSqFt);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.productType, other.productType)) {
            return false;
        }
        if (!Objects.equals(this.costPerSqFt, other.costPerSqFt)) {
            return false;
        }
        if (!Objects.equals(this.laborCostPerSqFt, other.laborCostPerSqFt)) {
            return false;
        }
        return true;
    }
    
    
}
