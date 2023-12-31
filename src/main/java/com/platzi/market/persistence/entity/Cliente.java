package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

  private String id;
  private String nombre;
  private String apellidos;
  private Long celular;
  private String direccion;

  @Column(name = "correo_electronico")
  private String correoElectronico;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return this.apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Long getCelular() {
    return this.celular;
  }

  public void setCelular(Long celular) {
    this.celular = celular;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCorreoElectronico() {
    return this.correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

}
