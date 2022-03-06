package com.ifa.askop.business.concretes;

import com.ifa.askop.business.abstracts.IDueService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Due;
import com.ifa.askop.repository.DueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DueManager implements IDueService {

    private final DueRepository dueRepository;

    @Override
    public DataResult<List<Due>> getAll() {
        return new SuccessDataResult<>(dueRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Due due) {
        dueRepository.save(due);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Due due) {
        dueRepository.save(due);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Due due) {
        dueRepository.delete(due);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Due> getById(Integer id) {
        return new SuccessDataResult<>(dueRepository.getById(id), Messages.Listed);
    }
}
