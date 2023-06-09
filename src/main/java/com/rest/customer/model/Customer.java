package com.rest.customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

  @Column(name = "first_name")
  private  String firstName;
  @Column(name = "last_name")
  private  String lastName;
  @Column(name = "address")
  private  String address;
  @Column(name = "budget")
  private BigDecimal budget;
}
