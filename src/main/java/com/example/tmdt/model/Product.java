package com.example.tmdt.model;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.model.fkProduct.*;
import com.example.tmdt.security.model.Account;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
@EqualsAndHashCode(callSuper = false)
public class Product extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double quantity;
    private String description;
    private Double price ;
    private Integer promotion ;
    @Column(columnDefinition = "integer default 0")
    private Integer count ;
    @ManyToOne
    private Comment comment ;
    @ManyToOne
    private Brand brand ;
    @ManyToOne
    private Shop shop ;
    @ManyToOne
    private Option option;
    @ManyToOne
    private Category category ;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Image> image;
    @ManyToOne
    private Account account ;
}