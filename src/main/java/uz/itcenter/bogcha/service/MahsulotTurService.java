package uz.itcenter.bogcha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.itcenter.bogcha.entity.MahsulotTur;
import uz.itcenter.bogcha.repository.MahsulotTurRepository;

import java.util.List;

@Service
public class MahsulotTurService {
    @Autowired
    MahsulotTurRepository mahsulotTurRepository;

    public MahsulotTur getById(Long id){
        return mahsulotTurRepository.findById(id).get();
    }

    public void update(MahsulotTur MahsulotTur){
        mahsulotTurRepository.save(MahsulotTur);
    }

    public List<MahsulotTur> getAll(){
        return mahsulotTurRepository.findAll();
    }

    public MahsulotTur create(MahsulotTur MahsulotTur){
        return mahsulotTurRepository.save(MahsulotTur);
    }
    public void deleteById(Long id){
        mahsulotTurRepository.deleteById(id);
    }


}
