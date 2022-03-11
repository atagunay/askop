package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.IAssignmentService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Assignment;
import com.ifa.askop.repository.AssignmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AssignmentManagerService implements IAssignmentService {

    private final AssignmentRepository assignmentRepository;

    @Override
    public DataResult<List<Assignment>> getAll() {
        return new SuccessDataResult<>(assignmentRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Assignment assignment) {
        assignmentRepository.save(assignment);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Assignment assignment)
    {
        assignmentRepository.save(assignment);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Assignment assignment) {
        assignmentRepository.delete(assignment);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Assignment> getById(Integer id)
    {
        return new SuccessDataResult<>(assignmentRepository.getById(id), Messages.Listed);
    }
}
