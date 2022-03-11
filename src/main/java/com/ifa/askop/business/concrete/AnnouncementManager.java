package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.IAnnouncement;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Announcement;
import com.ifa.askop.repository.AnnouncementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AnnouncementManager implements IAnnouncement {

    private final AnnouncementRepository announcementRepository;

    @Override
    public DataResult<List<Announcement>> getAll() {
       return new SuccessDataResult<List<Announcement>>(announcementRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Announcement announcement) {
        announcementRepository.save(announcement);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Announcement announcement) {
        announcementRepository.save(announcement);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Announcement announcement) {
        announcementRepository.delete(announcement);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Announcement> getById(Integer id) {
        return new SuccessDataResult<Announcement>(announcementRepository.getById(id),Messages.Listed);
    }
}
