package uz.itcenter.bogcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.bogcha.entity.Mahsulot;

@Repository
public interface MahsulotRepository extends JpaRepository<Mahsulot, Long> {
}
