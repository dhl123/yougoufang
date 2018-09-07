package com.youzufang.youzufang.persistence;

import com.youzufang.youzufang.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountMapper extends JpaRepository<Account, Integer> {
}
