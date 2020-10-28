package com.hendisantika.billingsystem.service;

import com.hendisantika.billingsystem.entity.BaseObject;
import com.hendisantika.billingsystem.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.18
 */
@Component
public class BillingBaseService<T extends BaseObject, ID extends Serializable> {

    @Autowired
    private AbstractBaseRepository<T, ID> repository;

    public BaseObject save(T entity) {
        return repository.save(entity);
    }

    public List<T> findAll() {

        return repository.findAll();
    }

    public Optional<T> findById(ID id) {

        return repository.findById(id);
    }

    public void deleteById(ID id) {

        repository.deleteById(id);
    }

    public void delete(T type) {

        repository.delete(type);
    }

}
