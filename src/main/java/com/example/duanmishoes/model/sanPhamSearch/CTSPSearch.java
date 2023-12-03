package com.example.duanmishoes.model.sanPhamSearch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CTSPSearch {
    String tenCT;
    String idKT;
    String idMS;
    String idDM;
    String idDC;
    String idCL;
    String idH;
    int trangThaiCT;
    int soluongCT;
    int giaBanCT;
}
