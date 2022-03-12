package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.ITeamService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Team;
import com.ifa.askop.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TeamManager implements ITeamService {

    private final TeamRepository teamRepository;

    @Override
    public DataResult<List<Team>> getAll() {
        return new SuccessDataResult<List<Team>>(teamRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Team team) {
        teamRepository.save(team);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Team team) {
       teamRepository.save(team);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Team team) {
        teamRepository.delete(team);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Team> getById(Integer id) {
        return new SuccessDataResult<Team>(teamRepository.getById(id), Messages.Listed);
    }
}
