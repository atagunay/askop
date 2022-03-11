package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.IBranchService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Branch;
import com.ifa.askop.repository.BranchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BranchManagerService implements IBranchService {

    private final BranchRepository branchRepository;

    @Override
    public DataResult<List<Branch>> getAll() {
        return new SuccessDataResult<>(branchRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Branch branch) {
        branchRepository.save(branch);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Branch branch) {
        branchRepository.save(branch);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Branch branch) {
        branchRepository.delete(branch);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Branch> getById(Integer id) {
        return new SuccessDataResult<>(branchRepository.getById(id), Messages.Listed);
    }
}
