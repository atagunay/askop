package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.IDueInfoService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.DueInfo;
import com.ifa.askop.repository.DueInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DueInfoManager implements IDueInfoService {

    private final DueInfoRepository dueInfoRepository;

    @Override
    public DataResult<List<DueInfo>> getAll() {
        return new SuccessDataResult<>(dueInfoRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(DueInfo dueInfo) {
        dueInfoRepository.save(dueInfo);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(DueInfo dueInfo) {
        dueInfoRepository.save(dueInfo);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(DueInfo dueInfo) {
        dueInfoRepository.delete(dueInfo);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<DueInfo> getById(Integer id) {
        return new SuccessDataResult<>(dueInfoRepository.getById(id), Messages.Listed);
    }
}
