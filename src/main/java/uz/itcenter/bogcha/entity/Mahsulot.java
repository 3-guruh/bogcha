package uz.itcenter.bogcha.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "mahsulot")
public class Mahsulot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mahsulot_id")
    private Long id;
    @Column(nullable = false, length = 50)
    private String nom;
    private int narx;
    private int miqdor;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime kelganVaqt;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime yaroqlilikMuddat;

    private Boolean status;

    @ManyToOne
    private MahsulotTur mahsulotTur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNarx() {
        return narx;
    }

    public void setNarx(int narx) {
        this.narx = narx;
    }

    public int getMiqdor() {
        return miqdor;
    }

    public void setMiqdor(int miqdor) {
        this.miqdor = miqdor;
    }

    public LocalDateTime getKelganVaqt() {
        return kelganVaqt;
    }

    public void setKelganVaqt(LocalDateTime kelganVaqt) {
        this.kelganVaqt = kelganVaqt;
    }

    public LocalDateTime getYaroqlilikMuddat() {
        return yaroqlilikMuddat;
    }

    public void setYaroqlilikMuddat(LocalDateTime yaroqlilikMuddat) {
        this.yaroqlilikMuddat = yaroqlilikMuddat;
    }

    public MahsulotTur getMahsulotTur() {
        return mahsulotTur;
    }

    public void setMahsulotTur(MahsulotTur mahsulotTur) {
        this.mahsulotTur = mahsulotTur;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
