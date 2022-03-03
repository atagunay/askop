package com.ifa.askop.business.Concrete;

import com.ifa.askop.business.Abstract.IPlayerService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Player;
import com.ifa.askop.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerManager implements IPlayerService {

    private final PlayerRepository playerRepository;

    @Override
    public DataResult<List<Player>> getAll() {
        return new SuccessDataResult<List<Player>>(playerRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Player player) {
        playerRepository.save(player);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Player player) {
        playerRepository.save(player);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Player player) {
        playerRepository.delete(player);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Player> getById(Integer id) {
        return new SuccessDataResult<Player>(playerRepository.getById(id), Messages.Listed);
    }
}
