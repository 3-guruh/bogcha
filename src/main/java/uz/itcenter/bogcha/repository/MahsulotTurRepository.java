package uz.itcenter.bogcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.bogcha.entity.MahsulotTur;

@Repository
public interface MahsulotTurRepository extends JpaRepository<MahsulotTur, Long> {
}
