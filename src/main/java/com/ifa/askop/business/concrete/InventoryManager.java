package com.ifa.askop.business.concrete;

import com.ifa.askop.business.Abstract.IInventoryService;
import com.ifa.askop.business.utilities.Messages;
import com.ifa.askop.core.business.IServiceBase;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.SuccessDataResult;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Due;
import com.ifa.askop.entity.model.Inventory;
import com.ifa.askop.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryManager implements IInventoryService {

    private final InventoryRepository inventoryRepository;

    @Override
    public DataResult<List<Inventory>> getAll() {
        return new SuccessDataResult<List<Inventory>>(inventoryRepository.findAll(), Messages.Listed);
    }

    @Override
    public IResult add(Inventory inventory) {
        inventoryRepository.save(inventory);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public IResult update(Inventory inventory) {
        inventoryRepository.save(inventory);
        return new SuccessResult(Messages.Updated);
    }

    @Override
    public IResult delete(Inventory inventory) {
        inventoryRepository.delete(inventory);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public DataResult<Inventory> getById(Integer id) {
        return new SuccessDataResult<Inventory>(inventoryRepository.getById(id), Messages.Listed);
    }
}
