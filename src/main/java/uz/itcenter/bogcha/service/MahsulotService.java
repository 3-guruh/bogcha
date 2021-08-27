package uz.itcenter.bogcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.itcenter.bogcha.entity.Mahsulot;
import uz.itcenter.bogcha.repository.MahsulotRepository;

import java.util.List;

@Service
public class MahsulotService {
    @Autowired
    MahsulotRepository mahsulotRepository;

    public Mahsulot getById(Long id){
        return mahsulotRepository.getOne(id);
    }

    public void update(Mahsulot mahsulot){
        mahsulotRepository.save(mahsulot);
    }

    public List<Mahsulot> getAll(){
        return mahsulotRepository.findAll();
    }

    public Mahsulot create(Mahsulot mahsulot){
        return mahsulotRepository.save(mahsulot);
    }
    public void deleteById(Long id){
        mahsulotRepository.deleteById(id);
    }


}
