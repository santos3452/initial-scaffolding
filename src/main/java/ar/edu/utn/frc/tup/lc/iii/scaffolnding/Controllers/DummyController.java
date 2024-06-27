package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Controllers;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.dtos.DummyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.DummyService;

import java.util.List;


@RestController
@RequestMapping("/dummy")
public class DummyController {


    @Autowired
    private  DummyService dummyService;

    @GetMapping()
    public ResponseEntity<DummyDto> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummyList(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }

    @PostMapping()
    public ResponseEntity<DummyDto> CreateDummy(DummyDto dummyDto) {
        Dummy dummy = dummyService.createDummy(new Dummy());
        return null;
    }

    @PutMapping()
    public ResponseEntity<DummyDto> putDummy(DummyDto dummyDto) {
        Dummy dummy = dummyService.updateDummy(new Dummy());
        return null;
    }

    @DeleteMapping()
    public ResponseEntity<DummyDto> deleteDummy(DummyDto dummyDto) {

        dummyService.deleteDummy(null);
        return null;
    }
}
