package com.ifa.askop.business.Concrete;

import com.ifa.askop.business.Abstract.IParentService;
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
        return new SuccessDataResult<>(parentRepository.findAll());
    }

    @Override
    public IResult add(Parent parent) {
        parentRepository.save(parent);
        return new SuccessResult("added");
    }

    @Override
    public IResult update(Parent parent) {
        parentRepository.save(parent);
        return new SuccessResult("updated");
    }

    @Override
    public IResult delete(Parent parent) {
        parentRepository.delete(parent);
        return new SuccessResult("deleted");
    }

    @Override
    public DataResult<Parent> getById(Integer id) {

        return new SuccessDataResult<Parent>(parentRepository.getById(id));

    }
}
