package com.example.geo.service;

import com.example.geo.model.Branch;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BranchService {

    List<Branch> getAllBranches();

    Branch getBranchById(Long id);

    Branch createBranch(Branch branch);

}
