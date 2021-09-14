package uz.itcenter.bogcha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.itcenter.bogcha.entity.Mahsulot;
import uz.itcenter.bogcha.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
