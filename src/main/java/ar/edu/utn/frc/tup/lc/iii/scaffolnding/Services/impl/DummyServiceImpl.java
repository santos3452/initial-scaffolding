package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.impl;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories.DummyRepository;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {

    @Autowired
    private DummyRepository dummyRepository;

    @Override
    public Dummy getDummy(Long id) {
        return null;
    }

    @Override
    public List<Dummy> getDummyList() {
        return List.of();
    }

    @Override
    public Dummy createDummy(Dummy dummy) {
        return null;
    }

    @Override
    public Dummy updateDummy(Dummy dummy) {
        return null;
    }

    @Override
    public void deleteDummy(Dummy dummy) {

    }
}
