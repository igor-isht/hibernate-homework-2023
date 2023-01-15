package ru.hh.school.entity;

import javax.persistence.*;

//TODO: оформите entity
@Entity
@Table(name = "area")
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;
  private String name;

  public Area(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
