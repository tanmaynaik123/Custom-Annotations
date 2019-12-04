package com.annotations.group.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annotations.group.core.Organization;

@Repository
public interface IOrganizationRepo extends JpaRepository<Organization, Long> {

}
