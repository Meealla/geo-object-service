package com.example.geo;

import com.example.geo.model.Branch;
import com.example.geo.service.BranchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BranchController {

    BranchService branchService;
    public BranchController(BranchService branchService) {}

    @GetMapping(/branches)
    public ResponseEntity<List<Branch>> getAllBranches(
            @RequestParam(value = "branches", required = false) Branch branch) {
        if (branch == null) {
            return ResponseEntity.ok(branchService.getAllBranches());
        } else {
            return ResponseEntity.ok(branchService.getAllBranches(branch));
        }
    }

}
