package ru.aisystem.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author venia
 */
@Entity
public class Part implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    /**
     *  Наименование товара
     */
    private String partName;
    
    /**
     * Характеристика товара
     */
    private String characteristic;
    /**
     * Номер накладной
     */
    private String invoiceNumber;
    
    /**
     * сорт товара
     */
    private String variety;
    
    /**
     * артикул товара
     */
    private String partNumber;
    
    protected Part(){
        
    }
    public Part(Long id, String name){
        this.id = id;
        this.partName = name;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
    
}


