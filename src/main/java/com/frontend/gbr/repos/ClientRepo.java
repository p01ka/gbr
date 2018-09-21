package com.frontend.gbr.repos;

import com.frontend.gbr.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client,Long> {
}
