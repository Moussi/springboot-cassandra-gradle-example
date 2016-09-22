package com.ioteam.repositories;

import com.ioteam.cassandra.model.Api;
import com.ioteam.model.Greeting;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.UUID;


public interface ApiRepository extends CassandraRepository<Api> {

}