package com.example.geo.controller;

import com.example.geo.model.Branch;
import com.example.geo.service.BranchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches") // базовый путь
public class BranchController {

    BranchService branchService;
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    // Получить все филиалы
    @GetMapping
    public ResponseEntity<List<Branch>> getAllBranches() {
        return ResponseEntity.ok(branchService.getAllBranches());
    }

    // Получить филиал по ID
    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable Long id) { //← сюда Spring подставит значение из URL @PathVariable
        Branch branch = branchService.getBranchById(id);
        return ResponseEntity.ok(branch);
    }

    // Создать новый филиал
    // @RequestBody говорит Spring: возьми JSON (или XML) из тела запроса,
    // распарси его в объект Branch и передай в метод.
    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {// ← сюда Spring сконвертирует тело запроса
        Branch savedBranch = branchService.createBranch(branch);
        return ResponseEntity.ok(savedBranch);
    }
}


