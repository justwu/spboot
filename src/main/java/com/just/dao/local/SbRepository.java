package com.just.dao.local;

import com.just.entity.Sbman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Service
public interface SbRepository extends JpaRepository<Sbman, Integer> {
}
