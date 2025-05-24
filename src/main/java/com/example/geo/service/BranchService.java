package com.example.geo.service;

import com.example.geo.model.Branch;
import com.example.geo.repository.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchService {

    BranchRepository branchRepository;
    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }
    public List<Branch> getAllBranches(){
        return branchRepository.findAll();
    }

    public Branch getBranchById(Long id){
        return branchRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Branch not found with id: " + id));
    }

    public Branch createBranch(Branch branch){
        return branchRepository.save(branch);
    };

}
