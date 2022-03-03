package com.ifa.askop.business.Concrete;

import com.ifa.askop.business.Abstract.IParentService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Parent;
import com.ifa.askop.repository.ParentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParentManager implements IParentService {

    private final ParentRepository parentRepository;

    @Override
    public DataResult<List<Parent>> getAll() {
        return new SuccessDataResult<>(parentRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Parent parent) {
        parentRepository.save(parent);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Parent parent) {
        parentRepository.save(parent);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(int id) {
        parentRepository.deleteById(id);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Parent> getById(Integer id) {

        return new SuccessDataResult<Parent>(parentRepository.getById(id), Messages.Listed);

    }
}
