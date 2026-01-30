package com.varshu.e_comWebsite.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;
    private String prodCompany;
    private String prodCategory;
    private String prodDescription;
    private int prodQuantity;
    private boolean prodAvailability;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date Release_Date;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;


    public Product(){
    }

}
