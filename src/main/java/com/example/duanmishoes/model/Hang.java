package com.example.duanmishoes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "hang")
@Data

public class Hang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ma;

    private String ten;

    private Date ngayTao;

    private Date ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int trangThai;
}
