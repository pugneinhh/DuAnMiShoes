
package com.example.duanmishoes.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

import lombok.*;


import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "chuc_vu")
@Entity
public class ChucVu {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ma;


    private String ten;

    private String nguoiTao;

    private String nguoiSua;

    @Temporal(TemporalType.DATE)
    private Date ngayTao;

    @Temporal(TemporalType.DATE)
    private Date ngaySua;

    private Integer trangThai;
}
