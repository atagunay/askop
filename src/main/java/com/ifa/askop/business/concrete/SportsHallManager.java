package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.ISportsHallService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.SportsHall;
import com.ifa.askop.repository.SportsHallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SportsHallManager implements ISportsHallService {

    private final SportsHallRepository sportsHallRepository;

    @Override
    public DataResult<List<SportsHall>> getAll() {
        return new SuccessDataResult<List<SportsHall>>(sportsHallRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(SportsHall sportsHall) {
        sportsHallRepository.save(sportsHall);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(SportsHall sportsHall) {
        sportsHallRepository.save(sportsHall);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(SportsHall sportsHall) {
        sportsHallRepository.delete(sportsHall);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<SportsHall> getById(Integer id) {
       return new SuccessDataResult<SportsHall>(sportsHallRepository.getById(id), Messages.Listed);
    }
}
